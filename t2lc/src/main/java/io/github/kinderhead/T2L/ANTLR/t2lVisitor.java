// Generated from C:/Users/Daniel/Documents/Java/T2L/t2lc/src/main/resources\t2l.g4 by ANTLR 4.9.1
package io.github.kinderhead.T2L.ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link t2lParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface t2lVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link t2lParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(t2lParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(t2lParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(t2lParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#class_stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_stat_block(t2lParser.Class_stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#call_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stat(t2lParser.Call_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#func_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_stat(t2lParser.Func_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#t2l_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT2l_return(t2lParser.T2l_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#class_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_stat(t2lParser.Class_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(t2lParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#def_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_params(t2lParser.Def_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(t2lParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(t2lParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#import_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stat(t2lParser.Import_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(t2lParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#elseIfStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStat(t2lParser.ElseIfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(t2lParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(t2lParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(t2lParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(t2lParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#for_loop_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_stat(t2lParser.For_loop_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictionaryOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryOp(t2lParser.DictionaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOp(t2lParser.ClassOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOp(t2lParser.ListOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncOp(t2lParser.FuncOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomOp(t2lParser.AtomOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOp(t2lParser.ExprOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleOp(t2lParser.SingleOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOp(t2lParser.IndexOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link t2lParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(t2lParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenAtom}
	 * labeled alternative in {@link t2lParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenAtom(t2lParser.ParenAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntAtom}
	 * labeled alternative in {@link t2lParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtom(t2lParser.IntAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDAtom}
	 * labeled alternative in {@link t2lParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDAtom(t2lParser.IDAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link t2lParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(t2lParser.StringAtomContext ctx);
}