using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T2L.Opcodes
{
    public class IRValue : IR
    {
        public bool IsNone;

        public override IRType Type { get => IRType.VALUE; }

        public IRValue()
        {
            IsNone = true;
        }

        public override void Deserialize(Stream stream)
        {
            throw new NotImplementedException();
        }

        public override void Serialize(Stream stream)
        {
            
        }
    }
}
