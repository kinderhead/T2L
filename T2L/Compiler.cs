using sly.parser.generator;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using T2L.AST;

namespace T2L
{
    public class Compiler
    {
        public static void Compile(string code)
        {
            Parser raw_parser = new();
            ParserBuilder<Lexer, IAST> builder = new();
            var parser = builder.BuildParser(raw_parser, ParserType.EBNF_LL_RECURSIVE_DESCENT, "start").Result;

            var result = parser.Parse(code);
            if (result.IsError)
            {
                result.Errors.ForEach(error => Console.WriteLine($"{error.ErrorType}: {error.ErrorMessage}"));
            }
        }
    }
}
