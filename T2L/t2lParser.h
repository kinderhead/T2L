
// Generated from t2l.g4 by ANTLR 4.9.3

#pragma once


#include "antlr4-runtime/antlr4-runtime.h"




class  t2lParser : public antlr4::Parser {
public:
  enum {
    T__0 = 1, OR = 2, AND = 3, EQ = 4, NEQ = 5, GT = 6, LT = 7, GTEQ = 8, 
    LTEQ = 9, PLUS = 10, MINUS = 11, MULT = 12, DIV = 13, MOD = 14, POW = 15, 
    NOT = 16, SCOL = 17, COL = 18, ASSIGN = 19, COMMA = 20, OPAR = 21, CPAR = 22, 
    OBRACE = 23, CBRACE = 24, OSQUARE = 25, CSQUARE = 26, IF = 27, ELSE = 28, 
    WHILE = 29, FOR = 30, IN = 31, FUNC = 32, T2L_RETURN = 33, CLASS = 34, 
    NEW = 35, IMPORT = 36, JIMPORT = 37, ID = 38, INT = 39, DOC = 40, STRING = 41, 
    COMMENT = 42, SPACE = 43
  };

  enum {
    RuleStart = 0, RuleBlock = 1, RuleStat = 2, RuleClass_stat_block = 3, 
    RuleCall_stat = 4, RuleFunc_stat = 5, RuleT2l_return = 6, RuleClass_stat = 7, 
    RuleParams = 8, RuleDef_params = 9, RuleVar = 10, RuleIndex = 11, RuleImport_stat = 12, 
    RuleJimport_stat = 13, RuleIf_stat = 14, RuleElseIfStat = 15, RuleElseStat = 16, 
    RuleCond = 17, RuleStat_block = 18, RuleWhile_stat = 19, RuleFor_loop_stat = 20, 
    RuleExpr = 21, RulePair = 22, RuleAtom = 23
  };

  explicit t2lParser(antlr4::TokenStream *input);
  ~t2lParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class StartContext;
  class BlockContext;
  class StatContext;
  class Class_stat_blockContext;
  class Call_statContext;
  class Func_statContext;
  class T2l_returnContext;
  class Class_statContext;
  class ParamsContext;
  class Def_paramsContext;
  class VarContext;
  class IndexContext;
  class Import_statContext;
  class Jimport_statContext;
  class If_statContext;
  class ElseIfStatContext;
  class ElseStatContext;
  class CondContext;
  class Stat_blockContext;
  class While_statContext;
  class For_loop_statContext;
  class ExprContext;
  class PairContext;
  class AtomContext; 

  class  StartContext : public antlr4::ParserRuleContext {
  public:
    StartContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BlockContext *block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  StartContext* start();

  class  BlockContext : public antlr4::ParserRuleContext {
  public:
    BlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<StatContext *> stat();
    StatContext* stat(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  BlockContext* block();

  class  StatContext : public antlr4::ParserRuleContext {
  public:
    StatContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VarContext *var();
    If_statContext *if_stat();
    While_statContext *while_stat();
    Call_statContext *call_stat();
    Func_statContext *func_stat();
    Class_statContext *class_stat();
    T2l_returnContext *t2l_return();
    IndexContext *index();
    For_loop_statContext *for_loop_stat();
    Import_statContext *import_stat();
    Jimport_statContext *jimport_stat();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  StatContext* stat();

  class  Class_stat_blockContext : public antlr4::ParserRuleContext {
  public:
    Class_stat_blockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VarContext *var();
    Class_statContext *class_stat();
    Func_statContext *func_stat();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Class_stat_blockContext* class_stat_block();

  class  Call_statContext : public antlr4::ParserRuleContext {
  public:
    Call_statContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *OPAR();
    ParamsContext *params();
    antlr4::tree::TerminalNode *CPAR();
    antlr4::tree::TerminalNode *SCOL();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Call_statContext* call_stat();

  class  Func_statContext : public antlr4::ParserRuleContext {
  public:
    Func_statContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FUNC();
    antlr4::tree::TerminalNode *ID();
    Def_paramsContext *def_params();
    Stat_blockContext *stat_block();
    antlr4::tree::TerminalNode *DOC();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Func_statContext* func_stat();

  class  T2l_returnContext : public antlr4::ParserRuleContext {
  public:
    T2l_returnContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *T2L_RETURN();
    ExprContext *expr();
    antlr4::tree::TerminalNode *SCOL();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  T2l_returnContext* t2l_return();

  class  Class_statContext : public antlr4::ParserRuleContext {
  public:
    Class_statContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *CLASS();
    std::vector<antlr4::tree::TerminalNode *> ID();
    antlr4::tree::TerminalNode* ID(size_t i);
    antlr4::tree::TerminalNode *OBRACE();
    antlr4::tree::TerminalNode *CBRACE();
    antlr4::tree::TerminalNode *OPAR();
    antlr4::tree::TerminalNode *CPAR();
    std::vector<Class_stat_blockContext *> class_stat_block();
    Class_stat_blockContext* class_stat_block(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Class_statContext* class_stat();

  class  ParamsContext : public antlr4::ParserRuleContext {
  public:
    ParamsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  ParamsContext* params();

  class  Def_paramsContext : public antlr4::ParserRuleContext {
  public:
    Def_paramsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> STRING();
    antlr4::tree::TerminalNode* STRING(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Def_paramsContext* def_params();

  class  VarContext : public antlr4::ParserRuleContext {
  public:
    VarContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *ASSIGN();
    ExprContext *expr();
    antlr4::tree::TerminalNode *SCOL();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  VarContext* var();

  class  IndexContext : public antlr4::ParserRuleContext {
  public:
    IndexContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *OSQUARE();
    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);
    antlr4::tree::TerminalNode *CSQUARE();
    antlr4::tree::TerminalNode *ASSIGN();
    antlr4::tree::TerminalNode *SCOL();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  IndexContext* index();

  class  Import_statContext : public antlr4::ParserRuleContext {
  public:
    Import_statContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IMPORT();
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *SCOL();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Import_statContext* import_stat();

  class  Jimport_statContext : public antlr4::ParserRuleContext {
  public:
    Jimport_statContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *JIMPORT();
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *SCOL();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Jimport_statContext* jimport_stat();

  class  If_statContext : public antlr4::ParserRuleContext {
  public:
    t2lParser::ElseIfStatContext *ElseIf = nullptr;
    t2lParser::ElseStatContext *Else = nullptr;
    If_statContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IF();
    CondContext *cond();
    std::vector<ElseIfStatContext *> elseIfStat();
    ElseIfStatContext* elseIfStat(size_t i);
    ElseStatContext *elseStat();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  If_statContext* if_stat();

  class  ElseIfStatContext : public antlr4::ParserRuleContext {
  public:
    ElseIfStatContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ELSE();
    antlr4::tree::TerminalNode *IF();
    CondContext *cond();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  ElseIfStatContext* elseIfStat();

  class  ElseStatContext : public antlr4::ParserRuleContext {
  public:
    ElseStatContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ELSE();
    Stat_blockContext *stat_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  ElseStatContext* elseStat();

  class  CondContext : public antlr4::ParserRuleContext {
  public:
    CondContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExprContext *expr();
    Stat_blockContext *stat_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  CondContext* cond();

  class  Stat_blockContext : public antlr4::ParserRuleContext {
  public:
    Stat_blockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OBRACE();
    BlockContext *block();
    antlr4::tree::TerminalNode *CBRACE();
    StatContext *stat();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Stat_blockContext* stat_block();

  class  While_statContext : public antlr4::ParserRuleContext {
  public:
    While_statContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *WHILE();
    ExprContext *expr();
    Stat_blockContext *stat_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  While_statContext* while_stat();

  class  For_loop_statContext : public antlr4::ParserRuleContext {
  public:
    For_loop_statContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FOR();
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *IN();
    ExprContext *expr();
    Stat_blockContext *stat_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  For_loop_statContext* for_loop_stat();

  class  ExprContext : public antlr4::ParserRuleContext {
  public:
    ExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    ExprContext() = default;
    void copyFrom(ExprContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  DictionaryOpContext : public ExprContext {
  public:
    DictionaryOpContext(ExprContext *ctx);

    antlr4::tree::TerminalNode *OBRACE();
    antlr4::tree::TerminalNode *CBRACE();
    std::vector<PairContext *> pair();
    PairContext* pair(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  ClassOpContext : public ExprContext {
  public:
    ClassOpContext(ExprContext *ctx);

    antlr4::tree::TerminalNode *NEW();
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *OPAR();
    ParamsContext *params();
    antlr4::tree::TerminalNode *CPAR();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  ListOpContext : public ExprContext {
  public:
    ListOpContext(ExprContext *ctx);

    antlr4::tree::TerminalNode *OSQUARE();
    antlr4::tree::TerminalNode *CSQUARE();
    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  FuncOpContext : public ExprContext {
  public:
    FuncOpContext(ExprContext *ctx);

    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *OPAR();
    ParamsContext *params();
    antlr4::tree::TerminalNode *CPAR();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  AtomOpContext : public ExprContext {
  public:
    AtomOpContext(ExprContext *ctx);

    AtomContext *atom();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  MultiOpContext : public ExprContext {
  public:
    MultiOpContext(ExprContext *ctx);

    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  ExprOpContext : public ExprContext {
  public:
    ExprOpContext(ExprContext *ctx);

    t2lParser::ExprContext *left = nullptr;
    antlr4::Token *op = nullptr;
    t2lParser::ExprContext *right = nullptr;
    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);
    antlr4::tree::TerminalNode *POW();
    antlr4::tree::TerminalNode *MULT();
    antlr4::tree::TerminalNode *DIV();
    antlr4::tree::TerminalNode *MOD();
    antlr4::tree::TerminalNode *PLUS();
    antlr4::tree::TerminalNode *MINUS();
    antlr4::tree::TerminalNode *LTEQ();
    antlr4::tree::TerminalNode *GTEQ();
    antlr4::tree::TerminalNode *LT();
    antlr4::tree::TerminalNode *GT();
    antlr4::tree::TerminalNode *EQ();
    antlr4::tree::TerminalNode *NEQ();
    antlr4::tree::TerminalNode *AND();
    antlr4::tree::TerminalNode *OR();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  SingleOpContext : public ExprContext {
  public:
    SingleOpContext(ExprContext *ctx);

    antlr4::Token *op = nullptr;
    ExprContext *expr();
    antlr4::tree::TerminalNode *MINUS();
    antlr4::tree::TerminalNode *NOT();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  IndexOpContext : public ExprContext {
  public:
    IndexOpContext(ExprContext *ctx);

    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *OSQUARE();
    ExprContext *expr();
    antlr4::tree::TerminalNode *CSQUARE();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  ExprContext* expr();
  ExprContext* expr(int precedence);
  class  PairContext : public antlr4::ParserRuleContext {
  public:
    t2lParser::ExprContext *key = nullptr;
    t2lParser::ExprContext *value = nullptr;
    PairContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *COL();
    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  PairContext* pair();

  class  AtomContext : public antlr4::ParserRuleContext {
  public:
    AtomContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    AtomContext() = default;
    void copyFrom(AtomContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  IDAtomContext : public AtomContext {
  public:
    IDAtomContext(AtomContext *ctx);

    antlr4::tree::TerminalNode *ID();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  StringAtomContext : public AtomContext {
  public:
    StringAtomContext(AtomContext *ctx);

    antlr4::tree::TerminalNode *STRING();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  ParenAtomContext : public AtomContext {
  public:
    ParenAtomContext(AtomContext *ctx);

    antlr4::tree::TerminalNode *OPAR();
    ExprContext *expr();
    antlr4::tree::TerminalNode *CPAR();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  IntAtomContext : public AtomContext {
  public:
    IntAtomContext(AtomContext *ctx);

    antlr4::tree::TerminalNode *INT();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  AtomContext* atom();


  virtual bool sempred(antlr4::RuleContext *_localctx, size_t ruleIndex, size_t predicateIndex) override;
  bool exprSempred(ExprContext *_localctx, size_t predicateIndex);

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

