#include "Stream.h"

Stream::Stream()
{
}

void Stream::Save(string path)
{
}

void Stream::Load(string path)
{
}

void Stream::Seek(unsigned int s)
{
	seek = s;
}

void StringSerializer::Serialize(Stream& stream, string& obj)
{
	stream << obj.length();
	for (size_t i = 0; i < obj.length(); i++)
	{
		stream << obj[i];
	}
}

void StringSerializer::Deserialize(Stream& stream, string& obj)
{
	size_t len;
	stream >> len;

	for (size_t i = 0; i < len; i++)
	{
		char c;
		stream >> c;
		obj += c;
	}
}
