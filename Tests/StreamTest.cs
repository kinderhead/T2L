using T2L.Mixins;

namespace Tests
{
    [TestClass]
    public class StreamTest
    {
        [TestMethod]
        public void RWInt()
        {
            Stream stream = new MemoryStream();
            stream.WriteInt(-23098);

            stream.Seek(0, SeekOrigin.Begin);

            Assert.AreEqual(stream.ReadInt(), -23098);
        }

        [TestMethod]
        public void RWString()
        {
            Stream stream = new MemoryStream();
            stream.WriteString("Hello world!");

            stream.Seek(0, SeekOrigin.Begin);

            Assert.AreEqual(stream.ReadString(), "Hello world!");
        }

        [TestMethod]
        public void RWBoolTrue()
        {
            Stream stream = new MemoryStream();
            stream.WriteBool(true);

            stream.Seek(0, SeekOrigin.Begin);

            Assert.IsTrue(stream.ReadBool());
        }

        [TestMethod]
        public void RWBoolFalse()
        {
            Stream stream = new MemoryStream();
            stream.WriteBool(false);

            stream.Seek(0, SeekOrigin.Begin);

            Assert.IsFalse(stream.ReadBool());
        }
    }
}