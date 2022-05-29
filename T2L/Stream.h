#pragma once
#include "utils.h"

#include <type_traits>

class Stream; // Forward declaration

template <typename T>
class Serializeable {
public:
	virtual void Serialize(Stream* stream) = 0;
	virtual void Deserialize(Stream* stream, T& obj) = 0;
};

template <typename T>
struct Serializer {
public:
	virtual void Serialize(Stream* stream, T& obj);
	virtual void Deserialize(Stream* stream, T& obj);
};

class Stream
{
	vector<uint8_t> buf;
public:
	Stream();

	template <typename T>
	Stream& operator<<(const T obj) {
		Write(obj);
		return *this;
	}

	template <typename T>
	Stream& operator>>(const T& obj) {
		Read(obj);
		return *this;
	}

	template <typename T, typename S=Serializer<T>>
	void Write(const T obj) {
		Serializer<T> s = S();
		s.Serialize(this, obj);
	}

	template <typename T, typename S = Serializer<T>>
	void Read(const T& obj) {
		Serializer<T> s = S();
		s.Deserialize(this, obj);
	}

	void Save(string path);
	void Load(string path);

	template<typename T>
	friend struct Serializer;
};

template <typename T>
void Serializer<T>::Serialize(Stream* stream, T& obj) {
	if (is_base_of(Serializeable<T>, T)) {
		Serializeable<T>& s = static_cast<Serializeable<T>&>(obj);
		s.Serialize(stream);
	}
	else {
		uint8_t* pointer = (uint8_t*)&obj;
		for (unsigned int i = 0; i < sizeof(T); i++)
		{
			stream->buf.push_back(pointer[i]);
		}
	}
}

template <typename T>
void Serializer<T>::Deserialize(Stream* stream, T& obj) {
	if (is_base_of(Serializeable, T)) {

	}
	else {
		uint8_t* pointer = (uint8_t*)&obj;
		for (unsigned int i = 0; i < sizeof(T); i++)
		{
			pointer[i] = stream->buf[0];
			stream->buf.erase(stream->buf.begin());
		}
	}
}
