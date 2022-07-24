using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T2L.AST
{
    public class ASTStatements : IAST
    {
        public readonly List<IAST> Statements = new();
        
        public ASTStatements(List<IAST> statements)
        {
            Statements = statements;
        }
    }
}
