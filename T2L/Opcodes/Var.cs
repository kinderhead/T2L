using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Runtime.Serialization.Formatters.Binary;
using System.Text;
using System.Threading.Tasks;

namespace T2L.Opcodes
{
    public class Var : IR
    {
        public override IRType Type { get => IRType.VAR; }

        public string name;
        public IRValue val;

        public Var(string name, IRValue val)
        {
            this.name = name;
            this.val = val;
        }
        
        public override void Deserialize(Stream stream)
        {
            
        }

        public override void Serialize(Stream stream)
        {
            throw new NotImplementedException();
        }
    }
}
