using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T2L.Mixins
{
    public static class StreamMixin
    {
        public static void WriteInt(this Stream stream, int num)
        {
            byte[] arr = BitConverter.GetBytes(num);
            if (!BitConverter.IsLittleEndian)
            {
                Array.Reverse(arr);
            }

            stream.Write(arr);
        }

        public static int ReadInt(this Stream stream)
        {
            byte[] buf = new byte[4];
            stream.Read(buf);
            if (!BitConverter.IsLittleEndian)
            {
                Array.Reverse(buf);
            }

            return BitConverter.ToInt32(buf, 0);
        }

        public static void WriteString(this Stream stream, string txt)
        {
            byte[] buf = Encoding.Unicode.GetBytes(txt);
            stream.WriteInt(buf.Length);
            stream.Write(buf);
        }

        public static string ReadString(this Stream stream)
        {
            int len = stream.ReadInt();
            byte[] buf = new byte[len];

            stream.Read(buf, 0, len);
            return Encoding.Unicode.GetString(buf);
        }

        public static void WriteBool(this Stream stream, bool b)
        {
            stream.Write(BitConverter.GetBytes(b));
        }

        public static bool ReadBool(this Stream stream)
        {
            byte[] buf = new byte[1];
            stream.Read(buf, 0, 1);
            return BitConverter.ToBoolean(buf);
        }
    }
}
