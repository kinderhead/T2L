
// Generated from t2l.g4 by ANTLR 4.9.3

#pragma once


#include "antlr4-runtime/antlr4-runtime.h"
#include "t2lParser.h"


/**
 * This interface defines an abstract listener for a parse tree produced by t2lParser.
 */
class  t2lListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterStart(t2lParser::StartContext *ctx) = 0;
  virtual void exitStart(t2lParser::StartContext *ctx) = 0;

  virtual void enterBlock(t2lParser::BlockContext *ctx) = 0;
  virtual void exitBlock(t2lParser::BlockContext *ctx) = 0;

  virtual void enterStat(t2lParser::StatContext *ctx) = 0;
  virtual void exitStat(t2lParser::StatContext *ctx) = 0;

  virtual void enterClass_stat_block(t2lParser::Class_stat_blockContext *ctx) = 0;
  virtual void exitClass_stat_block(t2lParser::Class_stat_blockContext *ctx) = 0;

  virtual void enterCall_stat(t2lParser::Call_statContext *ctx) = 0;
  virtual void exitCall_stat(t2lParser::Call_statContext *ctx) = 0;

  virtual void enterFunc_stat(t2lParser::Func_statContext *ctx) = 0;
  virtual void exitFunc_stat(t2lParser::Func_statContext *ctx) = 0;

  virtual void enterT2l_return(t2lParser::T2l_returnContext *ctx) = 0;
  virtual void exitT2l_return(t2lParser::T2l_returnContext *ctx) = 0;

  virtual void enterClass_stat(t2lParser::Class_statContext *ctx) = 0;
  virtual void exitClass_stat(t2lParser::Class_statContext *ctx) = 0;

  virtual void enterParams(t2lParser::ParamsContext *ctx) = 0;
  virtual void exitParams(t2lParser::ParamsContext *ctx) = 0;

  virtual void enterDef_params(t2lParser::Def_paramsContext *ctx) = 0;
  virtual void exitDef_params(t2lParser::Def_paramsContext *ctx) = 0;

  virtual void enterVar(t2lParser::VarContext *ctx) = 0;
  virtual void exitVar(t2lParser::VarContext *ctx) = 0;

  virtual void enterIndex(t2lParser::IndexContext *ctx) = 0;
  virtual void exitIndex(t2lParser::IndexContext *ctx) = 0;

  virtual void enterImport_stat(t2lParser::Import_statContext *ctx) = 0;
  virtual void exitImport_stat(t2lParser::Import_statContext *ctx) = 0;

  virtual void enterJimport_stat(t2lParser::Jimport_statContext *ctx) = 0;
  virtual void exitJimport_stat(t2lParser::Jimport_statContext *ctx) = 0;

  virtual void enterIf_stat(t2lParser::If_statContext *ctx) = 0;
  virtual void exitIf_stat(t2lParser::If_statContext *ctx) = 0;

  virtual void enterElseIfStat(t2lParser::ElseIfStatContext *ctx) = 0;
  virtual void exitElseIfStat(t2lParser::ElseIfStatContext *ctx) = 0;

  virtual void enterElseStat(t2lParser::ElseStatContext *ctx) = 0;
  virtual void exitElseStat(t2lParser::ElseStatContext *ctx) = 0;

  virtual void enterCond(t2lParser::CondContext *ctx) = 0;
  virtual void exitCond(t2lParser::CondContext *ctx) = 0;

  virtual void enterStat_block(t2lParser::Stat_blockContext *ctx) = 0;
  virtual void exitStat_block(t2lParser::Stat_blockContext *ctx) = 0;

  virtual void enterWhile_stat(t2lParser::While_statContext *ctx) = 0;
  virtual void exitWhile_stat(t2lParser::While_statContext *ctx) = 0;

  virtual void enterFor_loop_stat(t2lParser::For_loop_statContext *ctx) = 0;
  virtual void exitFor_loop_stat(t2lParser::For_loop_statContext *ctx) = 0;

  virtual void enterDictionaryOp(t2lParser::DictionaryOpContext *ctx) = 0;
  virtual void exitDictionaryOp(t2lParser::DictionaryOpContext *ctx) = 0;

  virtual void enterClassOp(t2lParser::ClassOpContext *ctx) = 0;
  virtual void exitClassOp(t2lParser::ClassOpContext *ctx) = 0;

  virtual void enterListOp(t2lParser::ListOpContext *ctx) = 0;
  virtual void exitListOp(t2lParser::ListOpContext *ctx) = 0;

  virtual void enterFuncOp(t2lParser::FuncOpContext *ctx) = 0;
  virtual void exitFuncOp(t2lParser::FuncOpContext *ctx) = 0;

  virtual void enterAtomOp(t2lParser::AtomOpContext *ctx) = 0;
  virtual void exitAtomOp(t2lParser::AtomOpContext *ctx) = 0;

  virtual void enterMultiOp(t2lParser::MultiOpContext *ctx) = 0;
  virtual void exitMultiOp(t2lParser::MultiOpContext *ctx) = 0;

  virtual void enterExprOp(t2lParser::ExprOpContext *ctx) = 0;
  virtual void exitExprOp(t2lParser::ExprOpContext *ctx) = 0;

  virtual void enterSingleOp(t2lParser::SingleOpContext *ctx) = 0;
  virtual void exitSingleOp(t2lParser::SingleOpContext *ctx) = 0;

  virtual void enterIndexOp(t2lParser::IndexOpContext *ctx) = 0;
  virtual void exitIndexOp(t2lParser::IndexOpContext *ctx) = 0;

  virtual void enterPair(t2lParser::PairContext *ctx) = 0;
  virtual void exitPair(t2lParser::PairContext *ctx) = 0;

  virtual void enterParenAtom(t2lParser::ParenAtomContext *ctx) = 0;
  virtual void exitParenAtom(t2lParser::ParenAtomContext *ctx) = 0;

  virtual void enterIntAtom(t2lParser::IntAtomContext *ctx) = 0;
  virtual void exitIntAtom(t2lParser::IntAtomContext *ctx) = 0;

  virtual void enterIDAtom(t2lParser::IDAtomContext *ctx) = 0;
  virtual void exitIDAtom(t2lParser::IDAtomContext *ctx) = 0;

  virtual void enterStringAtom(t2lParser::StringAtomContext *ctx) = 0;
  virtual void exitStringAtom(t2lParser::StringAtomContext *ctx) = 0;


};

