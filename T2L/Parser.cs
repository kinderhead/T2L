using sly.parser.generator;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using T2L.AST;

namespace T2L
{
    public class Parser
    {
        [Production("start: statements*")]
        public IAST Start(List<IAST> statements)
        {
            return new ASTStatements(statements);
        }
    }
}
