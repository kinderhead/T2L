
// Generated from ..\t2l.g4 by ANTLR 4.10.1

#pragma once


#include "antlr4-runtime.h"
#include "t2lParser.h"



/**
 * This class defines an abstract visitor for a parse tree
 * produced by t2lParser.
 */
class  t2lVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by t2lParser.
   */
    virtual std::any visitStart(t2lParser::StartContext *context) = 0;

    virtual std::any visitBlock(t2lParser::BlockContext *context) = 0;

    virtual std::any visitStat(t2lParser::StatContext *context) = 0;

    virtual std::any visitClass_stat_block(t2lParser::Class_stat_blockContext *context) = 0;

    virtual std::any visitCall_stat(t2lParser::Call_statContext *context) = 0;

    virtual std::any visitFunc_stat(t2lParser::Func_statContext *context) = 0;

    virtual std::any visitT2l_return(t2lParser::T2l_returnContext *context) = 0;

    virtual std::any visitClass_stat(t2lParser::Class_statContext *context) = 0;

    virtual std::any visitParams(t2lParser::ParamsContext *context) = 0;

    virtual std::any visitDef_params(t2lParser::Def_paramsContext *context) = 0;

    virtual std::any visitVar(t2lParser::VarContext *context) = 0;

    virtual std::any visitIndex(t2lParser::IndexContext *context) = 0;

    virtual std::any visitImport_stat(t2lParser::Import_statContext *context) = 0;

    virtual std::any visitIf_stat(t2lParser::If_statContext *context) = 0;

    virtual std::any visitElseIfStat(t2lParser::ElseIfStatContext *context) = 0;

    virtual std::any visitElseStat(t2lParser::ElseStatContext *context) = 0;

    virtual std::any visitCond(t2lParser::CondContext *context) = 0;

    virtual std::any visitStat_block(t2lParser::Stat_blockContext *context) = 0;

    virtual std::any visitWhile_stat(t2lParser::While_statContext *context) = 0;

    virtual std::any visitFor_loop_stat(t2lParser::For_loop_statContext *context) = 0;

    virtual std::any visitDictionaryOp(t2lParser::DictionaryOpContext *context) = 0;

    virtual std::any visitClassOp(t2lParser::ClassOpContext *context) = 0;

    virtual std::any visitListOp(t2lParser::ListOpContext *context) = 0;

    virtual std::any visitFuncOp(t2lParser::FuncOpContext *context) = 0;

    virtual std::any visitAtomOp(t2lParser::AtomOpContext *context) = 0;

    virtual std::any visitMultiOp(t2lParser::MultiOpContext *context) = 0;

    virtual std::any visitExprOp(t2lParser::ExprOpContext *context) = 0;

    virtual std::any visitSingleOp(t2lParser::SingleOpContext *context) = 0;

    virtual std::any visitIndexOp(t2lParser::IndexOpContext *context) = 0;

    virtual std::any visitPair(t2lParser::PairContext *context) = 0;

    virtual std::any visitParenAtom(t2lParser::ParenAtomContext *context) = 0;

    virtual std::any visitIntAtom(t2lParser::IntAtomContext *context) = 0;

    virtual std::any visitIDAtom(t2lParser::IDAtomContext *context) = 0;

    virtual std::any visitStringAtom(t2lParser::StringAtomContext *context) = 0;


};

