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
    }
}