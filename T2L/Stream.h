#pragma once
#include "utils.h"

#include <type_traits>

class Stream; // Forward declaration

template <typename T>
class Serializeable {
public:
	virtual void Serialize(Stream& stream) = 0;
	virtual void Deserialize(Stream& stream, T& obj) = 0;
};

template <typename T>
struct Serializer {
public:
	virtual void Serialize(Stream& stream, T& obj);
	virtual void Deserialize(Stream& stream, T& obj);
};

struct StringSerializer : public Serializer<string> {
public:
	void Serialize(Stream& stream, string& obj) override;
	void Deserialize(Stream& stream, string& obj) override;
};

class Stream
{
	vector<uint8_t> buf;
	unsigned int seek = 0;
public:
	Stream();

	template <typename T>
	Stream& operator<<(T obj) {
		Write(obj);
		return *this;
	}

	template <typename T>
	Stream& operator>>(T& obj) {
		Read(obj);
		return *this;
	}

	void Write(string str) {
		StringSerializer s;
		Write<string>(str, &s);
	}

	void Read(string& str) {
		StringSerializer s;
		Read<string>(str, &s);
	}

	template <typename T>
	void Write(T obj) {
		Serializer<T> s;
		Write(obj, &s);
	}

	template <typename T>
	void Read(T& obj) {
		Serializer<T> s;
		Read(obj, &s);
	}

	template <typename T>
	void Write(T obj, Serializer<T>* s) {
		s->Serialize(*this, obj);
	}

	template <typename T>
	void Read(T& obj, Serializer<T>* s) {
		s->Deserialize(*this, obj);
	}

	void Save(string path);
	void Load(string path);
	void Seek(unsigned int s);

	template<typename T>
	friend struct Serializer;
};

template <typename T>
void Serializer<T>::Serialize(Stream& stream, T& obj) {
	if (is_base_of<Serializeable<T>, T>()) {
		Serializeable<T>& s = (Serializeable<T>&)obj;
		s.Serialize(stream);
	}
	else {
		uint8_t* pointer = (uint8_t*)&obj;
		for (unsigned int i = 0; i < sizeof(T); i++)
		{
			stream.buf.push_back(pointer[i]);
		}
	}
}

template <typename T>
void Serializer<T>::Deserialize(Stream& stream, T& obj) {
	if (is_base_of<Serializeable<T>, T>()) {
		Serializeable<T>& s = (Serializeable<T>&)obj;
		s.Deserialize(stream, obj);
	}
	else {
		uint8_t* pointer = (uint8_t*)&obj;
		for (unsigned int i = 0; i < sizeof(T); i++)
		{
			pointer[i] = stream.buf[stream.seek];
			stream.seek++;
		}
	}
}
