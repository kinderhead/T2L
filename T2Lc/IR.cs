using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T2Lc
{
    public abstract class IR
    {
        public abstract void Serialize(Stream stream);
        public abstract void Deserialize(Stream stream);
    }
}
