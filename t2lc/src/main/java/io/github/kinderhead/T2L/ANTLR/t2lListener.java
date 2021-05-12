// Generated from C:/Users/Daniel/Documents/Java/T2L/t2lc/src/main/resources\t2l.g4 by ANTLR 4.9.1
package io.github.kinderhead.T2L.ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link t2lParser}.
 */
public interface t2lListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link t2lParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(t2lParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(t2lParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(t2lParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(t2lParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(t2lParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(t2lParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#class_stat_block}.
	 * @param ctx the parse tree
	 */
	void enterClass_stat_block(t2lParser.Class_stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#class_stat_block}.
	 * @param ctx the parse tree
	 */
	void exitClass_stat_block(t2lParser.Class_stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#call_stat}.
	 * @param ctx the parse tree
	 */
	void enterCall_stat(t2lParser.Call_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#call_stat}.
	 * @param ctx the parse tree
	 */
	void exitCall_stat(t2lParser.Call_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#func_stat}.
	 * @param ctx the parse tree
	 */
	void enterFunc_stat(t2lParser.Func_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#func_stat}.
	 * @param ctx the parse tree
	 */
	void exitFunc_stat(t2lParser.Func_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#t2l_return}.
	 * @param ctx the parse tree
	 */
	void enterT2l_return(t2lParser.T2l_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#t2l_return}.
	 * @param ctx the parse tree
	 */
	void exitT2l_return(t2lParser.T2l_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#class_stat}.
	 * @param ctx the parse tree
	 */
	void enterClass_stat(t2lParser.Class_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#class_stat}.
	 * @param ctx the parse tree
	 */
	void exitClass_stat(t2lParser.Class_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(t2lParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(t2lParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#def_params}.
	 * @param ctx the parse tree
	 */
	void enterDef_params(t2lParser.Def_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#def_params}.
	 * @param ctx the parse tree
	 */
	void exitDef_params(t2lParser.Def_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(t2lParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(t2lParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(t2lParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(t2lParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#import_stat}.
	 * @param ctx the parse tree
	 */
	void enterImport_stat(t2lParser.Import_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#import_stat}.
	 * @param ctx the parse tree
	 */
	void exitImport_stat(t2lParser.Import_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(t2lParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(t2lParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(t2lParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(t2lParser.ElseIfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(t2lParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(t2lParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(t2lParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(t2lParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(t2lParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(t2lParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(t2lParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(t2lParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#for_loop_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_stat(t2lParser.For_loop_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#for_loop_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_stat(t2lParser.For_loop_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictionaryOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryOp(t2lParser.DictionaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictionaryOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryOp(t2lParser.DictionaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterClassOp(t2lParser.ClassOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitClassOp(t2lParser.ClassOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListOp(t2lParser.ListOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListOp(t2lParser.ListOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncOp(t2lParser.FuncOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncOp(t2lParser.FuncOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomOp(t2lParser.AtomOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomOp(t2lParser.AtomOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOp(t2lParser.ExprOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOp(t2lParser.ExprOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSingleOp(t2lParser.SingleOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSingleOp(t2lParser.SingleOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndexOp(t2lParser.IndexOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexOp}
	 * labeled alternative in {@link t2lParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndexOp(t2lParser.IndexOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2lParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(t2lParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2lParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(t2lParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenAtom}
	 * labeled alternative in {@link t2lParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParenAtom(t2lParser.ParenAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenAtom}
	 * labeled alternative in {@link t2lParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParenAtom(t2lParser.ParenAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntAtom}
	 * labeled alternative in {@link t2lParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIntAtom(t2lParser.IntAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntAtom}
	 * labeled alternative in {@link t2lParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIntAtom(t2lParser.IntAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDAtom}
	 * labeled alternative in {@link t2lParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIDAtom(t2lParser.IDAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDAtom}
	 * labeled alternative in {@link t2lParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIDAtom(t2lParser.IDAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link t2lParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(t2lParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link t2lParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(t2lParser.StringAtomContext ctx);
}