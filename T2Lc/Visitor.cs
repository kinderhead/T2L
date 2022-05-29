using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using T2L;
using T2L.Opcodes;
using T2Lc.Antlr;

namespace T2Lc
{
    public class Visitor : t2lBaseVisitor<IR>
    {
        private Compiler compiler;

        public Visitor(Compiler compiler)
        {
            this.compiler = compiler;
        }

        public override IR VisitVar([NotNull] t2lParser.VarContext context)
        {
            if (context.expr() == null)
            {
                return new Var(context.ID().GetText(), new IRValue());
            }
        }
    }
}
