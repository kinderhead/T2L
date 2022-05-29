
// Generated from ..\t2l.g4 by ANTLR 4.10.1

#pragma once


#include "antlr4-runtime.h"
#include "t2lListener.h"


/**
 * This class provides an empty implementation of t2lListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  t2lBaseListener : public t2lListener {
public:

  virtual void enterStart(t2lParser::StartContext * /*ctx*/) override { }
  virtual void exitStart(t2lParser::StartContext * /*ctx*/) override { }

  virtual void enterBlock(t2lParser::BlockContext * /*ctx*/) override { }
  virtual void exitBlock(t2lParser::BlockContext * /*ctx*/) override { }

  virtual void enterStat(t2lParser::StatContext * /*ctx*/) override { }
  virtual void exitStat(t2lParser::StatContext * /*ctx*/) override { }

  virtual void enterClass_stat_block(t2lParser::Class_stat_blockContext * /*ctx*/) override { }
  virtual void exitClass_stat_block(t2lParser::Class_stat_blockContext * /*ctx*/) override { }

  virtual void enterCall_stat(t2lParser::Call_statContext * /*ctx*/) override { }
  virtual void exitCall_stat(t2lParser::Call_statContext * /*ctx*/) override { }

  virtual void enterFunc_stat(t2lParser::Func_statContext * /*ctx*/) override { }
  virtual void exitFunc_stat(t2lParser::Func_statContext * /*ctx*/) override { }

  virtual void enterT2l_return(t2lParser::T2l_returnContext * /*ctx*/) override { }
  virtual void exitT2l_return(t2lParser::T2l_returnContext * /*ctx*/) override { }

  virtual void enterClass_stat(t2lParser::Class_statContext * /*ctx*/) override { }
  virtual void exitClass_stat(t2lParser::Class_statContext * /*ctx*/) override { }

  virtual void enterParams(t2lParser::ParamsContext * /*ctx*/) override { }
  virtual void exitParams(t2lParser::ParamsContext * /*ctx*/) override { }

  virtual void enterDef_params(t2lParser::Def_paramsContext * /*ctx*/) override { }
  virtual void exitDef_params(t2lParser::Def_paramsContext * /*ctx*/) override { }

  virtual void enterVar(t2lParser::VarContext * /*ctx*/) override { }
  virtual void exitVar(t2lParser::VarContext * /*ctx*/) override { }

  virtual void enterIndex(t2lParser::IndexContext * /*ctx*/) override { }
  virtual void exitIndex(t2lParser::IndexContext * /*ctx*/) override { }

  virtual void enterImport_stat(t2lParser::Import_statContext * /*ctx*/) override { }
  virtual void exitImport_stat(t2lParser::Import_statContext * /*ctx*/) override { }

  virtual void enterIf_stat(t2lParser::If_statContext * /*ctx*/) override { }
  virtual void exitIf_stat(t2lParser::If_statContext * /*ctx*/) override { }

  virtual void enterElseIfStat(t2lParser::ElseIfStatContext * /*ctx*/) override { }
  virtual void exitElseIfStat(t2lParser::ElseIfStatContext * /*ctx*/) override { }

  virtual void enterElseStat(t2lParser::ElseStatContext * /*ctx*/) override { }
  virtual void exitElseStat(t2lParser::ElseStatContext * /*ctx*/) override { }

  virtual void enterCond(t2lParser::CondContext * /*ctx*/) override { }
  virtual void exitCond(t2lParser::CondContext * /*ctx*/) override { }

  virtual void enterStat_block(t2lParser::Stat_blockContext * /*ctx*/) override { }
  virtual void exitStat_block(t2lParser::Stat_blockContext * /*ctx*/) override { }

  virtual void enterWhile_stat(t2lParser::While_statContext * /*ctx*/) override { }
  virtual void exitWhile_stat(t2lParser::While_statContext * /*ctx*/) override { }

  virtual void enterFor_loop_stat(t2lParser::For_loop_statContext * /*ctx*/) override { }
  virtual void exitFor_loop_stat(t2lParser::For_loop_statContext * /*ctx*/) override { }

  virtual void enterDictionaryOp(t2lParser::DictionaryOpContext * /*ctx*/) override { }
  virtual void exitDictionaryOp(t2lParser::DictionaryOpContext * /*ctx*/) override { }

  virtual void enterClassOp(t2lParser::ClassOpContext * /*ctx*/) override { }
  virtual void exitClassOp(t2lParser::ClassOpContext * /*ctx*/) override { }

  virtual void enterListOp(t2lParser::ListOpContext * /*ctx*/) override { }
  virtual void exitListOp(t2lParser::ListOpContext * /*ctx*/) override { }

  virtual void enterFuncOp(t2lParser::FuncOpContext * /*ctx*/) override { }
  virtual void exitFuncOp(t2lParser::FuncOpContext * /*ctx*/) override { }

  virtual void enterAtomOp(t2lParser::AtomOpContext * /*ctx*/) override { }
  virtual void exitAtomOp(t2lParser::AtomOpContext * /*ctx*/) override { }

  virtual void enterMultiOp(t2lParser::MultiOpContext * /*ctx*/) override { }
  virtual void exitMultiOp(t2lParser::MultiOpContext * /*ctx*/) override { }

  virtual void enterExprOp(t2lParser::ExprOpContext * /*ctx*/) override { }
  virtual void exitExprOp(t2lParser::ExprOpContext * /*ctx*/) override { }

  virtual void enterSingleOp(t2lParser::SingleOpContext * /*ctx*/) override { }
  virtual void exitSingleOp(t2lParser::SingleOpContext * /*ctx*/) override { }

  virtual void enterIndexOp(t2lParser::IndexOpContext * /*ctx*/) override { }
  virtual void exitIndexOp(t2lParser::IndexOpContext * /*ctx*/) override { }

  virtual void enterPair(t2lParser::PairContext * /*ctx*/) override { }
  virtual void exitPair(t2lParser::PairContext * /*ctx*/) override { }

  virtual void enterParenAtom(t2lParser::ParenAtomContext * /*ctx*/) override { }
  virtual void exitParenAtom(t2lParser::ParenAtomContext * /*ctx*/) override { }

  virtual void enterIntAtom(t2lParser::IntAtomContext * /*ctx*/) override { }
  virtual void exitIntAtom(t2lParser::IntAtomContext * /*ctx*/) override { }

  virtual void enterIDAtom(t2lParser::IDAtomContext * /*ctx*/) override { }
  virtual void exitIDAtom(t2lParser::IDAtomContext * /*ctx*/) override { }

  virtual void enterStringAtom(t2lParser::StringAtomContext * /*ctx*/) override { }
  virtual void exitStringAtom(t2lParser::StringAtomContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

