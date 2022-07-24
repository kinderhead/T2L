using sly.lexer;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T2L
{
    public enum Lexer
    {
        [Keyword("if")]
        IF,

        [Double]
        NUMBER,

        [AlphaNumDashId]
        ID,

        [String("\"", "\\")]
        [String("'", "\\")]
        DOUBLE_STRING,

        [Comment("//", "/*", "*/")]
        COMMENT,

        [Sugar("(")]
        LPAREN,

        [Sugar(")")]
        RPAREN,

        [Sugar("{")]
        LCBRACKET,

        [Sugar("}")]
        RCBRACKET,

        [Sugar("[")]
        LSBRACKET,

        [Sugar("]")]
        RSBRACKET,

        [Sugar("+")]
        PLUS,

        [Sugar("-")]
        MINUS,

        [Sugar("*")]
        MUL,

        [Sugar("/")]
        DIV,

        [Sugar("%")]
        MOD,

        [Sugar("=")]
        ASSIGN,

        [Sugar("==")]
        EQ,

        [Sugar("!=")]
        NEQ,

        [Sugar("<")]
        LT,

        [Sugar(">")]
        GT,

        [Sugar("<=")]
        LTE,

        [Sugar(">=")]
        GTE,

        [Sugar(";")]
        SEMICOLON,
    }
}
