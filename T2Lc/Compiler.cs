using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using T2Lc.Antlr;

namespace T2Lc
{
    public class Compiler
    {
        public Compiler(string code)
        {
            ICharStream stream = CharStreams.fromString(code);
            ITokenSource lexer = new t2lLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);

            t2lParser parser = new(tokens);
            parser.BuildParseTree = true;
            IParseTree tree = parser.start();

            Listener listener = new();
            ParseTreeWalker.Default.Walk(listener, tree);
        }
    }
}
