package io.github.kinderhead.T2L;

import io.github.kinderhead.T2L.ANTLR.t2lBaseVisitor;
import io.github.kinderhead.T2L.ANTLR.t2lParser;
import io.github.kinderhead.T2L.ast.ClassInitStat;
import io.github.kinderhead.T2L.ast.ClassStat;
import io.github.kinderhead.T2L.ast.DictionaryAST;
import io.github.kinderhead.T2L.ast.ElseIfStat;
import io.github.kinderhead.T2L.ast.ExprAST;
import io.github.kinderhead.T2L.ast.ExprCodes;
import io.github.kinderhead.T2L.ast.ForLoopStat;
import io.github.kinderhead.T2L.ast.FunctionCallStat;
import io.github.kinderhead.T2L.ast.FunctionDefStat;
import io.github.kinderhead.T2L.ast.ID;
import io.github.kinderhead.T2L.ast.IVisitorAST;
import io.github.kinderhead.T2L.ast.IfStatement;
import io.github.kinderhead.T2L.ast.IndexSetStat;
import io.github.kinderhead.T2L.ast.IntAST;
import io.github.kinderhead.T2L.ast.ListAST;
import io.github.kinderhead.T2L.ast.NameUtils;
import io.github.kinderhead.T2L.ast.PairAST;
import io.github.kinderhead.T2L.ast.ParameterGroup;
import io.github.kinderhead.T2L.ast.PropertyAST;
import io.github.kinderhead.T2L.ast.ReturnStat;
import io.github.kinderhead.T2L.ast.Statement;
import io.github.kinderhead.T2L.ast.StatementGroup;
import io.github.kinderhead.T2L.ast.StringAST;
import io.github.kinderhead.T2L.ast.VarStatement;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Visitor extends t2lBaseVisitor<IVisitorAST> {
    public static int LINE = 0;

    @Override
    public IVisitorAST visitBlock(t2lParser.BlockContext ctx) {
        ArrayList<Statement> stmts = new ArrayList<>();
        for (t2lParser.StatContext i: ctx.stat()) {
            LINE = i.getStart().getLine();
            stmts.add((Statement) visit(i));
        }
        return new StatementGroup(stmts);
    }

    @Override
    public IVisitorAST visitClass_stat_block(t2lParser.Class_stat_blockContext ctx) {
        LINE = ctx.getStart().getLine();
        return visit(ctx.children.get(0));
    }

    @Override
    public IVisitorAST visitClass_stat(t2lParser.Class_statContext ctx) {
        ArrayList<Statement> objs = new ArrayList<>();

        for (t2lParser.Class_stat_blockContext i : ctx.class_stat_block()) {
            LINE = i.getStart().getLine();
            objs.add(((Statement) visit(i)));
        }

        ArrayList<String> inheritance = new ArrayList<>();

        int idex = 0;
        for (TerminalNode i : ctx.ID()) {
            if (idex == 0) {
                idex++;
                continue;
            }

            inheritance.add(i.getText());

            idex++;
        }

        return new ClassStat(ctx.getStart().getLine(), ctx.ID(0).getText(), objs, inheritance);
    }

    @Override
    public IVisitorAST visitClassOp(t2lParser.ClassOpContext ctx) {
        return new ClassInitStat(ctx.getStart().getLine(), ctx.ID().getText(), ((ParameterGroup) visit(ctx.params())).PARAMETERS);
    }

    @Override
    public IVisitorAST visitCall_stat(t2lParser.Call_statContext ctx) {
        return new FunctionCallStat(ctx.getStart().getLine(), new ID(ctx.ID().getSymbol().getLine(), ctx.ID().getText()), ((ParameterGroup) visit(ctx.params())).PARAMETERS, false);
    }

    @Override
    public IVisitorAST visitFuncOp(t2lParser.FuncOpContext ctx) {
        return new FunctionCallStat(ctx.getStart().getLine(), new ID(ctx.ID().getSymbol().getLine(), ctx.ID().getText()), ((ParameterGroup) visit(ctx.params())).PARAMETERS, true);
    }

    @Override
    public IVisitorAST visitParams(t2lParser.ParamsContext ctx) {
        ArrayList<IVisitorAST> objs = new ArrayList<>();
        for (t2lParser.ExprContext i : ctx.expr()) {
            LINE = i.getStart().getLine();
            objs.add(visit(i));
        }
        return new ParameterGroup(objs);
    }

    @Override
    public IVisitorAST visitDef_params(t2lParser.Def_paramsContext ctx) {
        ArrayList<IVisitorAST> objs = new ArrayList<>();
        for (TerminalNode i : ctx.STRING()) {
            NameUtils.throwIfInvalid(i.getText());
            objs.add(new StringAST(i.getSymbol().getLine(), i.getText()));
        }
        return new ParameterGroup(objs);
    }

    @Override
    public IVisitorAST visitFunc_stat(t2lParser.Func_statContext ctx) {
        if (ctx.DOC() == null) {
            return new FunctionDefStat(ctx.getStart().getLine(), new ID(ctx.ID().getSymbol().getLine(), ctx.ID().getText()), ((ParameterGroup) visit(ctx.def_params())), ((StatementGroup) visit(ctx.stat_block())));
        } else {
            return new FunctionDefStat(ctx.getStart().getLine(), new ID(ctx.ID().getSymbol().getLine(), ctx.ID().getText()), ((ParameterGroup) visit(ctx.def_params())), ((StatementGroup) visit(ctx.stat_block())), ctx.DOC().getText().substring(3, ctx.DOC().getText().length()-3));
        }
    }

    @Override
    public IVisitorAST visitT2l_return(t2lParser.T2l_returnContext ctx) {
        return new ReturnStat(ctx.getStart().getLine(), visit(ctx.expr()));
    }

    @Override
    public IVisitorAST visitVar(t2lParser.VarContext ctx) {
        if (ctx.expr() != null) {
            return new VarStatement(ctx.getStart().getLine(), new ID(ctx.ID().getSymbol().getLine(), ctx.ID().getText()), visit(ctx.expr()));
        }
        return new VarStatement(ctx.getStart().getLine(), new ID(ctx.ID().getSymbol().getLine(), ctx.ID().getText()), new ID(ctx.getStart().getLine(), "null"));
    }

    @Override
    public IVisitorAST visitIndex(t2lParser.IndexContext ctx) {
        return new IndexSetStat(ctx.getStart().getLine(), new ID(ctx.ID().getSymbol().getLine(), ctx.ID().getText()), visit(ctx.expr(0)), visit(ctx.expr(1)));
    }

    @Override
    public IVisitorAST visitIndexOp(t2lParser.IndexOpContext ctx) {
        return new FunctionCallStat(ctx.getStart().getLine(), new ID(ctx.ID().getSymbol().getLine(), ctx.ID().getText() + ".__get"), new ArrayList<>(Collections.singletonList(visit(ctx.expr()))), true);
    }

    @Override
    public IVisitorAST visitListOp(t2lParser.ListOpContext ctx) {
        ArrayList<IVisitorAST> params = new ArrayList<>();

        for (t2lParser.ExprContext i : ctx.expr()) {
            params.add(visit(i));
        }

        return new ListAST(ctx.getStart().getLine(), params);
    }

    @Override
    public IVisitorAST visitDictionaryOp(t2lParser.DictionaryOpContext ctx) {
        HashMap<IVisitorAST, IVisitorAST> data = new HashMap<>();

        for (t2lParser.PairContext i : ctx.pair()) {
            PairAST pair = (PairAST) visit(i);
            data.put(pair.KEY, pair.VALUE);
        }

        return new DictionaryAST(ctx.getStart().getLine(), data);
    }

    @Override
    public IVisitorAST visitPair(t2lParser.PairContext ctx) {
        return new PairAST(ctx.getStart().getLine(), visit(ctx.key), visit(ctx.value));
    }

    @Override
    public IVisitorAST visitImport_stat(t2lParser.Import_statContext ctx) {
        return new FunctionCallStat(ctx.getStart().getLine(), new ID(ctx.getStart().getLine(), "__import"),
                new ArrayList<>(Collections.singletonList(new StringAST(ctx.ID().getSymbol().getLine(), ctx.ID().getText()))), false);
    }

    @Override
    public IVisitorAST visitJimport_stat(t2lParser.Jimport_statContext ctx) {
        return new FunctionCallStat(ctx.getStart().getLine(), new ID(ctx.getStart().getLine(), "__jimport"),
                new ArrayList<>(Collections.singletonList(new StringAST(ctx.ID().getSymbol().getLine(), ctx.ID().getText()))), false);
    }

    @Override
    public IVisitorAST visitFor_loop_stat(t2lParser.For_loop_statContext ctx) {
        return new ForLoopStat(ctx.getStart().getLine(), ctx.ID().getText(), visit(ctx.expr()), ((StatementGroup) visit(ctx.stat_block())).STATEMENTS);
    }

    @Override
    public IVisitorAST visitAtomOp(t2lParser.AtomOpContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public IVisitorAST visitMultiOp(t2lParser.MultiOpContext ctx) {
        return new PropertyAST(ctx.getStart().getLine(), visit(ctx.expr(0)), visit(ctx.expr(1)));
    }

    @Override
    public IVisitorAST visitIDAtom(t2lParser.IDAtomContext ctx) {
        return new ID(ctx.getStart().getLine(), ctx.getText());
    }

    @Override
    public IVisitorAST visitStringAtom(t2lParser.StringAtomContext ctx) {
        return new StringAST(ctx.getStart().getLine(), ctx.getText());
    }

    @Override
    public IVisitorAST visitIntAtom(t2lParser.IntAtomContext ctx) {
        return new IntAST(ctx.getStart().getLine(), Double.parseDouble(ctx.getText()));
    }

    @Override
    public IVisitorAST visitParenAtom(t2lParser.ParenAtomContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public IVisitorAST visitExprOp(t2lParser.ExprOpContext ctx) {
        ExprCodes op;
        String text = ctx.op.getText();

        op = switch (text) {
            case ("==") -> ExprCodes.EQ;
            case ("!=") -> ExprCodes.NEQ;
            case ("&&") -> ExprCodes.AND;
            case ("||") -> ExprCodes.OR;
            case (">") -> ExprCodes.GT;
            case ("<") -> ExprCodes.LT;
            case (">=") -> ExprCodes.GTEQ;
            case ("<=") -> ExprCodes.LTEQ;
            case ("+") -> ExprCodes.ADD;
            case ("-") -> ExprCodes.SUB;
            case ("*") -> ExprCodes.MUL;
            case ("/") -> ExprCodes.DIV;
            case ("%") -> ExprCodes.MOD;
            case ("^") -> ExprCodes.POW;
            default -> throw new IllegalStateException("Unexpected value: " + text);
        };

        return new ExprAST(ctx.getStart().getLine(), visit(ctx.left), visit(ctx.right), op);
    }

    @Override
    public IVisitorAST visitIf_stat(t2lParser.If_statContext ctx) {
        ArrayList<Statement> else_stat = null;
        if (ctx.elseStat() != null) {
            else_stat = ((StatementGroup) visit(ctx.elseStat())).STATEMENTS;
        }

        ArrayList<ElseIfStat> elseif = new ArrayList<>();
        if (ctx.elseIfStat() != null) {
            for (t2lParser.ElseIfStatContext i : ctx.elseIfStat()) {
                elseif.add((ElseIfStat) visit(i));
            }
        }

        return new IfStatement(ctx.getStart().getLine(), visit(ctx.cond().expr()), ((StatementGroup) visit(ctx.cond().stat_block())).STATEMENTS, else_stat, elseif);
    }

    @Override
    public IVisitorAST visitElseStat(t2lParser.ElseStatContext ctx) {
        return visit(ctx.stat_block());
    }

    @Override
    public IVisitorAST visitElseIfStat(t2lParser.ElseIfStatContext ctx) {
        return new ElseIfStat(ctx.getStart().getLine(), ((StatementGroup) visit(ctx.cond().stat_block())).STATEMENTS, visit(ctx.cond().expr()));
    }

    @Override
    public IVisitorAST visitStat_block(t2lParser.Stat_blockContext ctx) {
        if (ctx.block() != null) {
            LINE = ctx.block().getStart().getLine();
            return visit(ctx.block());
        } else {
            return new StatementGroup(new ArrayList<>(Collections.singletonList((Statement) visit(ctx.stat()))));
        }
    }
}
