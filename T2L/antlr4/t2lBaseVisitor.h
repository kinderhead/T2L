
// Generated from ..\t2l.g4 by ANTLR 4.10.1

#pragma once


#include "antlr4-runtime.h"
#include "t2lVisitor.h"


/**
 * This class provides an empty implementation of t2lVisitor, which can be
 * extended to create a visitor which only needs to handle a subset of the available methods.
 */
class  t2lBaseVisitor : public t2lVisitor {
public:

  virtual std::any visitStart(t2lParser::StartContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitBlock(t2lParser::BlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitStat(t2lParser::StatContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitClass_stat_block(t2lParser::Class_stat_blockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitCall_stat(t2lParser::Call_statContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitFunc_stat(t2lParser::Func_statContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitT2l_return(t2lParser::T2l_returnContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitClass_stat(t2lParser::Class_statContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitParams(t2lParser::ParamsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitDef_params(t2lParser::Def_paramsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitVar(t2lParser::VarContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitIndex(t2lParser::IndexContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitImport_stat(t2lParser::Import_statContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitIf_stat(t2lParser::If_statContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitElseIfStat(t2lParser::ElseIfStatContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitElseStat(t2lParser::ElseStatContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitCond(t2lParser::CondContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitStat_block(t2lParser::Stat_blockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitWhile_stat(t2lParser::While_statContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitFor_loop_stat(t2lParser::For_loop_statContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitDictionaryOp(t2lParser::DictionaryOpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitClassOp(t2lParser::ClassOpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitListOp(t2lParser::ListOpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitFuncOp(t2lParser::FuncOpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitAtomOp(t2lParser::AtomOpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitMultiOp(t2lParser::MultiOpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitExprOp(t2lParser::ExprOpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitSingleOp(t2lParser::SingleOpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitIndexOp(t2lParser::IndexOpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitPair(t2lParser::PairContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitParenAtom(t2lParser::ParenAtomContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitIntAtom(t2lParser::IntAtomContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitIDAtom(t2lParser::IDAtomContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual std::any visitStringAtom(t2lParser::StringAtomContext *ctx) override {
    return visitChildren(ctx);
  }


};

