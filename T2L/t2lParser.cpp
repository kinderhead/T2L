
// Generated from t2l.g4 by ANTLR 4.9.3


#include "t2lListener.h"

#include "t2lParser.h"


using namespace antlrcpp;
using namespace antlr4;

t2lParser::t2lParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

t2lParser::~t2lParser() {
  delete _interpreter;
}

std::string t2lParser::getGrammarFileName() const {
  return "t2l.g4";
}

const std::vector<std::string>& t2lParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& t2lParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- StartContext ------------------------------------------------------------------

t2lParser::StartContext::StartContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

t2lParser::BlockContext* t2lParser::StartContext::block() {
  return getRuleContext<t2lParser::BlockContext>(0);
}


size_t t2lParser::StartContext::getRuleIndex() const {
  return t2lParser::RuleStart;
}

void t2lParser::StartContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterStart(this);
}

void t2lParser::StartContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitStart(this);
}

t2lParser::StartContext* t2lParser::start() {
  StartContext *_localctx = _tracker.createInstance<StartContext>(_ctx, getState());
  enterRule(_localctx, 0, t2lParser::RuleStart);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(48);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockContext ------------------------------------------------------------------

t2lParser::BlockContext::BlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<t2lParser::StatContext *> t2lParser::BlockContext::stat() {
  return getRuleContexts<t2lParser::StatContext>();
}

t2lParser::StatContext* t2lParser::BlockContext::stat(size_t i) {
  return getRuleContext<t2lParser::StatContext>(i);
}


size_t t2lParser::BlockContext::getRuleIndex() const {
  return t2lParser::RuleBlock;
}

void t2lParser::BlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlock(this);
}

void t2lParser::BlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlock(this);
}

t2lParser::BlockContext* t2lParser::block() {
  BlockContext *_localctx = _tracker.createInstance<BlockContext>(_ctx, getState());
  enterRule(_localctx, 2, t2lParser::RuleBlock);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(53);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << t2lParser::IF)
      | (1ULL << t2lParser::WHILE)
      | (1ULL << t2lParser::FOR)
      | (1ULL << t2lParser::FUNC)
      | (1ULL << t2lParser::T2L_RETURN)
      | (1ULL << t2lParser::CLASS)
      | (1ULL << t2lParser::IMPORT)
      | (1ULL << t2lParser::JIMPORT)
      | (1ULL << t2lParser::ID)
      | (1ULL << t2lParser::DOC))) != 0)) {
      setState(50);
      stat();
      setState(55);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StatContext ------------------------------------------------------------------

t2lParser::StatContext::StatContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

t2lParser::VarContext* t2lParser::StatContext::var() {
  return getRuleContext<t2lParser::VarContext>(0);
}

t2lParser::If_statContext* t2lParser::StatContext::if_stat() {
  return getRuleContext<t2lParser::If_statContext>(0);
}

t2lParser::While_statContext* t2lParser::StatContext::while_stat() {
  return getRuleContext<t2lParser::While_statContext>(0);
}

t2lParser::Call_statContext* t2lParser::StatContext::call_stat() {
  return getRuleContext<t2lParser::Call_statContext>(0);
}

t2lParser::Func_statContext* t2lParser::StatContext::func_stat() {
  return getRuleContext<t2lParser::Func_statContext>(0);
}

t2lParser::Class_statContext* t2lParser::StatContext::class_stat() {
  return getRuleContext<t2lParser::Class_statContext>(0);
}

t2lParser::T2l_returnContext* t2lParser::StatContext::t2l_return() {
  return getRuleContext<t2lParser::T2l_returnContext>(0);
}

t2lParser::IndexContext* t2lParser::StatContext::index() {
  return getRuleContext<t2lParser::IndexContext>(0);
}

t2lParser::For_loop_statContext* t2lParser::StatContext::for_loop_stat() {
  return getRuleContext<t2lParser::For_loop_statContext>(0);
}

t2lParser::Import_statContext* t2lParser::StatContext::import_stat() {
  return getRuleContext<t2lParser::Import_statContext>(0);
}

t2lParser::Jimport_statContext* t2lParser::StatContext::jimport_stat() {
  return getRuleContext<t2lParser::Jimport_statContext>(0);
}


size_t t2lParser::StatContext::getRuleIndex() const {
  return t2lParser::RuleStat;
}

void t2lParser::StatContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterStat(this);
}

void t2lParser::StatContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitStat(this);
}

t2lParser::StatContext* t2lParser::stat() {
  StatContext *_localctx = _tracker.createInstance<StatContext>(_ctx, getState());
  enterRule(_localctx, 4, t2lParser::RuleStat);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(67);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(56);
      var();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(57);
      if_stat();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(58);
      while_stat();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(59);
      call_stat();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(60);
      func_stat();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(61);
      class_stat();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(62);
      t2l_return();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(63);
      index();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(64);
      for_loop_stat();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(65);
      import_stat();
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(66);
      jimport_stat();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Class_stat_blockContext ------------------------------------------------------------------

t2lParser::Class_stat_blockContext::Class_stat_blockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

t2lParser::VarContext* t2lParser::Class_stat_blockContext::var() {
  return getRuleContext<t2lParser::VarContext>(0);
}

t2lParser::Class_statContext* t2lParser::Class_stat_blockContext::class_stat() {
  return getRuleContext<t2lParser::Class_statContext>(0);
}

t2lParser::Func_statContext* t2lParser::Class_stat_blockContext::func_stat() {
  return getRuleContext<t2lParser::Func_statContext>(0);
}


size_t t2lParser::Class_stat_blockContext::getRuleIndex() const {
  return t2lParser::RuleClass_stat_block;
}

void t2lParser::Class_stat_blockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClass_stat_block(this);
}

void t2lParser::Class_stat_blockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClass_stat_block(this);
}

t2lParser::Class_stat_blockContext* t2lParser::class_stat_block() {
  Class_stat_blockContext *_localctx = _tracker.createInstance<Class_stat_blockContext>(_ctx, getState());
  enterRule(_localctx, 6, t2lParser::RuleClass_stat_block);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(72);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case t2lParser::ID: {
        enterOuterAlt(_localctx, 1);
        setState(69);
        var();
        break;
      }

      case t2lParser::CLASS: {
        enterOuterAlt(_localctx, 2);
        setState(70);
        class_stat();
        break;
      }

      case t2lParser::FUNC:
      case t2lParser::DOC: {
        enterOuterAlt(_localctx, 3);
        setState(71);
        func_stat();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Call_statContext ------------------------------------------------------------------

t2lParser::Call_statContext::Call_statContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::Call_statContext::ID() {
  return getToken(t2lParser::ID, 0);
}

tree::TerminalNode* t2lParser::Call_statContext::OPAR() {
  return getToken(t2lParser::OPAR, 0);
}

t2lParser::ParamsContext* t2lParser::Call_statContext::params() {
  return getRuleContext<t2lParser::ParamsContext>(0);
}

tree::TerminalNode* t2lParser::Call_statContext::CPAR() {
  return getToken(t2lParser::CPAR, 0);
}

tree::TerminalNode* t2lParser::Call_statContext::SCOL() {
  return getToken(t2lParser::SCOL, 0);
}


size_t t2lParser::Call_statContext::getRuleIndex() const {
  return t2lParser::RuleCall_stat;
}

void t2lParser::Call_statContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCall_stat(this);
}

void t2lParser::Call_statContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCall_stat(this);
}

t2lParser::Call_statContext* t2lParser::call_stat() {
  Call_statContext *_localctx = _tracker.createInstance<Call_statContext>(_ctx, getState());
  enterRule(_localctx, 8, t2lParser::RuleCall_stat);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(74);
    match(t2lParser::ID);
    setState(75);
    match(t2lParser::OPAR);
    setState(76);
    params();
    setState(77);
    match(t2lParser::CPAR);
    setState(78);
    match(t2lParser::SCOL);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Func_statContext ------------------------------------------------------------------

t2lParser::Func_statContext::Func_statContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::Func_statContext::FUNC() {
  return getToken(t2lParser::FUNC, 0);
}

tree::TerminalNode* t2lParser::Func_statContext::ID() {
  return getToken(t2lParser::ID, 0);
}

t2lParser::Def_paramsContext* t2lParser::Func_statContext::def_params() {
  return getRuleContext<t2lParser::Def_paramsContext>(0);
}

t2lParser::Stat_blockContext* t2lParser::Func_statContext::stat_block() {
  return getRuleContext<t2lParser::Stat_blockContext>(0);
}

tree::TerminalNode* t2lParser::Func_statContext::DOC() {
  return getToken(t2lParser::DOC, 0);
}


size_t t2lParser::Func_statContext::getRuleIndex() const {
  return t2lParser::RuleFunc_stat;
}

void t2lParser::Func_statContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunc_stat(this);
}

void t2lParser::Func_statContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunc_stat(this);
}

t2lParser::Func_statContext* t2lParser::func_stat() {
  Func_statContext *_localctx = _tracker.createInstance<Func_statContext>(_ctx, getState());
  enterRule(_localctx, 10, t2lParser::RuleFunc_stat);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(81);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == t2lParser::DOC) {
      setState(80);
      match(t2lParser::DOC);
    }
    setState(83);
    match(t2lParser::FUNC);
    setState(84);
    match(t2lParser::ID);
    setState(85);
    def_params();
    setState(86);
    stat_block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- T2l_returnContext ------------------------------------------------------------------

t2lParser::T2l_returnContext::T2l_returnContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::T2l_returnContext::T2L_RETURN() {
  return getToken(t2lParser::T2L_RETURN, 0);
}

t2lParser::ExprContext* t2lParser::T2l_returnContext::expr() {
  return getRuleContext<t2lParser::ExprContext>(0);
}

tree::TerminalNode* t2lParser::T2l_returnContext::SCOL() {
  return getToken(t2lParser::SCOL, 0);
}


size_t t2lParser::T2l_returnContext::getRuleIndex() const {
  return t2lParser::RuleT2l_return;
}

void t2lParser::T2l_returnContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterT2l_return(this);
}

void t2lParser::T2l_returnContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitT2l_return(this);
}

t2lParser::T2l_returnContext* t2lParser::t2l_return() {
  T2l_returnContext *_localctx = _tracker.createInstance<T2l_returnContext>(_ctx, getState());
  enterRule(_localctx, 12, t2lParser::RuleT2l_return);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(88);
    match(t2lParser::T2L_RETURN);
    setState(89);
    expr(0);
    setState(90);
    match(t2lParser::SCOL);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Class_statContext ------------------------------------------------------------------

t2lParser::Class_statContext::Class_statContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::Class_statContext::CLASS() {
  return getToken(t2lParser::CLASS, 0);
}

std::vector<tree::TerminalNode *> t2lParser::Class_statContext::ID() {
  return getTokens(t2lParser::ID);
}

tree::TerminalNode* t2lParser::Class_statContext::ID(size_t i) {
  return getToken(t2lParser::ID, i);
}

tree::TerminalNode* t2lParser::Class_statContext::OBRACE() {
  return getToken(t2lParser::OBRACE, 0);
}

tree::TerminalNode* t2lParser::Class_statContext::CBRACE() {
  return getToken(t2lParser::CBRACE, 0);
}

tree::TerminalNode* t2lParser::Class_statContext::OPAR() {
  return getToken(t2lParser::OPAR, 0);
}

tree::TerminalNode* t2lParser::Class_statContext::CPAR() {
  return getToken(t2lParser::CPAR, 0);
}

std::vector<t2lParser::Class_stat_blockContext *> t2lParser::Class_statContext::class_stat_block() {
  return getRuleContexts<t2lParser::Class_stat_blockContext>();
}

t2lParser::Class_stat_blockContext* t2lParser::Class_statContext::class_stat_block(size_t i) {
  return getRuleContext<t2lParser::Class_stat_blockContext>(i);
}

std::vector<tree::TerminalNode *> t2lParser::Class_statContext::COMMA() {
  return getTokens(t2lParser::COMMA);
}

tree::TerminalNode* t2lParser::Class_statContext::COMMA(size_t i) {
  return getToken(t2lParser::COMMA, i);
}


size_t t2lParser::Class_statContext::getRuleIndex() const {
  return t2lParser::RuleClass_stat;
}

void t2lParser::Class_statContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClass_stat(this);
}

void t2lParser::Class_statContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClass_stat(this);
}

t2lParser::Class_statContext* t2lParser::class_stat() {
  Class_statContext *_localctx = _tracker.createInstance<Class_statContext>(_ctx, getState());
  enterRule(_localctx, 14, t2lParser::RuleClass_stat);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(92);
    match(t2lParser::CLASS);
    setState(93);
    match(t2lParser::ID);
    setState(104);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == t2lParser::OPAR) {
      setState(94);
      match(t2lParser::OPAR);
      setState(99);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx);
      while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1) {
          setState(95);
          match(t2lParser::ID);
          setState(96);
          match(t2lParser::COMMA); 
        }
        setState(101);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx);
      }
      setState(102);
      match(t2lParser::ID);
      setState(103);
      match(t2lParser::CPAR);
    }
    setState(106);
    match(t2lParser::OBRACE);
    setState(110);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << t2lParser::FUNC)
      | (1ULL << t2lParser::CLASS)
      | (1ULL << t2lParser::ID)
      | (1ULL << t2lParser::DOC))) != 0)) {
      setState(107);
      class_stat_block();
      setState(112);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(113);
    match(t2lParser::CBRACE);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ParamsContext ------------------------------------------------------------------

t2lParser::ParamsContext::ParamsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<t2lParser::ExprContext *> t2lParser::ParamsContext::expr() {
  return getRuleContexts<t2lParser::ExprContext>();
}

t2lParser::ExprContext* t2lParser::ParamsContext::expr(size_t i) {
  return getRuleContext<t2lParser::ExprContext>(i);
}

std::vector<tree::TerminalNode *> t2lParser::ParamsContext::COMMA() {
  return getTokens(t2lParser::COMMA);
}

tree::TerminalNode* t2lParser::ParamsContext::COMMA(size_t i) {
  return getToken(t2lParser::COMMA, i);
}


size_t t2lParser::ParamsContext::getRuleIndex() const {
  return t2lParser::RuleParams;
}

void t2lParser::ParamsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterParams(this);
}

void t2lParser::ParamsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitParams(this);
}

t2lParser::ParamsContext* t2lParser::params() {
  ParamsContext *_localctx = _tracker.createInstance<ParamsContext>(_ctx, getState());
  enterRule(_localctx, 16, t2lParser::RuleParams);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(124);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << t2lParser::MINUS)
      | (1ULL << t2lParser::NOT)
      | (1ULL << t2lParser::OPAR)
      | (1ULL << t2lParser::OBRACE)
      | (1ULL << t2lParser::OSQUARE)
      | (1ULL << t2lParser::NEW)
      | (1ULL << t2lParser::ID)
      | (1ULL << t2lParser::INT)
      | (1ULL << t2lParser::STRING))) != 0)) {
      setState(120);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx);
      while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1) {
          setState(115);
          expr(0);
          setState(116);
          match(t2lParser::COMMA); 
        }
        setState(122);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx);
      }
      setState(123);
      expr(0);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Def_paramsContext ------------------------------------------------------------------

t2lParser::Def_paramsContext::Def_paramsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> t2lParser::Def_paramsContext::STRING() {
  return getTokens(t2lParser::STRING);
}

tree::TerminalNode* t2lParser::Def_paramsContext::STRING(size_t i) {
  return getToken(t2lParser::STRING, i);
}

std::vector<tree::TerminalNode *> t2lParser::Def_paramsContext::COMMA() {
  return getTokens(t2lParser::COMMA);
}

tree::TerminalNode* t2lParser::Def_paramsContext::COMMA(size_t i) {
  return getToken(t2lParser::COMMA, i);
}


size_t t2lParser::Def_paramsContext::getRuleIndex() const {
  return t2lParser::RuleDef_params;
}

void t2lParser::Def_paramsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterDef_params(this);
}

void t2lParser::Def_paramsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitDef_params(this);
}

t2lParser::Def_paramsContext* t2lParser::def_params() {
  Def_paramsContext *_localctx = _tracker.createInstance<Def_paramsContext>(_ctx, getState());
  enterRule(_localctx, 18, t2lParser::RuleDef_params);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(134);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == t2lParser::STRING) {
      setState(130);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx);
      while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1) {
          setState(126);
          match(t2lParser::STRING);
          setState(127);
          match(t2lParser::COMMA); 
        }
        setState(132);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx);
      }
      setState(133);
      match(t2lParser::STRING);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VarContext ------------------------------------------------------------------

t2lParser::VarContext::VarContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::VarContext::ID() {
  return getToken(t2lParser::ID, 0);
}

tree::TerminalNode* t2lParser::VarContext::ASSIGN() {
  return getToken(t2lParser::ASSIGN, 0);
}

t2lParser::ExprContext* t2lParser::VarContext::expr() {
  return getRuleContext<t2lParser::ExprContext>(0);
}

tree::TerminalNode* t2lParser::VarContext::SCOL() {
  return getToken(t2lParser::SCOL, 0);
}


size_t t2lParser::VarContext::getRuleIndex() const {
  return t2lParser::RuleVar;
}

void t2lParser::VarContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVar(this);
}

void t2lParser::VarContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVar(this);
}

t2lParser::VarContext* t2lParser::var() {
  VarContext *_localctx = _tracker.createInstance<VarContext>(_ctx, getState());
  enterRule(_localctx, 20, t2lParser::RuleVar);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(143);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(136);
      match(t2lParser::ID);
      setState(137);
      match(t2lParser::ASSIGN);
      setState(138);
      expr(0);
      setState(139);
      match(t2lParser::SCOL);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(141);
      match(t2lParser::ID);
      setState(142);
      match(t2lParser::SCOL);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IndexContext ------------------------------------------------------------------

t2lParser::IndexContext::IndexContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::IndexContext::ID() {
  return getToken(t2lParser::ID, 0);
}

tree::TerminalNode* t2lParser::IndexContext::OSQUARE() {
  return getToken(t2lParser::OSQUARE, 0);
}

std::vector<t2lParser::ExprContext *> t2lParser::IndexContext::expr() {
  return getRuleContexts<t2lParser::ExprContext>();
}

t2lParser::ExprContext* t2lParser::IndexContext::expr(size_t i) {
  return getRuleContext<t2lParser::ExprContext>(i);
}

tree::TerminalNode* t2lParser::IndexContext::CSQUARE() {
  return getToken(t2lParser::CSQUARE, 0);
}

tree::TerminalNode* t2lParser::IndexContext::ASSIGN() {
  return getToken(t2lParser::ASSIGN, 0);
}

tree::TerminalNode* t2lParser::IndexContext::SCOL() {
  return getToken(t2lParser::SCOL, 0);
}


size_t t2lParser::IndexContext::getRuleIndex() const {
  return t2lParser::RuleIndex;
}

void t2lParser::IndexContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIndex(this);
}

void t2lParser::IndexContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIndex(this);
}

t2lParser::IndexContext* t2lParser::index() {
  IndexContext *_localctx = _tracker.createInstance<IndexContext>(_ctx, getState());
  enterRule(_localctx, 22, t2lParser::RuleIndex);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(145);
    match(t2lParser::ID);
    setState(146);
    match(t2lParser::OSQUARE);
    setState(147);
    expr(0);
    setState(148);
    match(t2lParser::CSQUARE);
    setState(149);
    match(t2lParser::ASSIGN);
    setState(150);
    expr(0);
    setState(151);
    match(t2lParser::SCOL);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Import_statContext ------------------------------------------------------------------

t2lParser::Import_statContext::Import_statContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::Import_statContext::IMPORT() {
  return getToken(t2lParser::IMPORT, 0);
}

tree::TerminalNode* t2lParser::Import_statContext::ID() {
  return getToken(t2lParser::ID, 0);
}

tree::TerminalNode* t2lParser::Import_statContext::SCOL() {
  return getToken(t2lParser::SCOL, 0);
}


size_t t2lParser::Import_statContext::getRuleIndex() const {
  return t2lParser::RuleImport_stat;
}

void t2lParser::Import_statContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterImport_stat(this);
}

void t2lParser::Import_statContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitImport_stat(this);
}

t2lParser::Import_statContext* t2lParser::import_stat() {
  Import_statContext *_localctx = _tracker.createInstance<Import_statContext>(_ctx, getState());
  enterRule(_localctx, 24, t2lParser::RuleImport_stat);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(153);
    match(t2lParser::IMPORT);
    setState(154);
    match(t2lParser::ID);
    setState(155);
    match(t2lParser::SCOL);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Jimport_statContext ------------------------------------------------------------------

t2lParser::Jimport_statContext::Jimport_statContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::Jimport_statContext::JIMPORT() {
  return getToken(t2lParser::JIMPORT, 0);
}

tree::TerminalNode* t2lParser::Jimport_statContext::ID() {
  return getToken(t2lParser::ID, 0);
}

tree::TerminalNode* t2lParser::Jimport_statContext::SCOL() {
  return getToken(t2lParser::SCOL, 0);
}


size_t t2lParser::Jimport_statContext::getRuleIndex() const {
  return t2lParser::RuleJimport_stat;
}

void t2lParser::Jimport_statContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterJimport_stat(this);
}

void t2lParser::Jimport_statContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitJimport_stat(this);
}

t2lParser::Jimport_statContext* t2lParser::jimport_stat() {
  Jimport_statContext *_localctx = _tracker.createInstance<Jimport_statContext>(_ctx, getState());
  enterRule(_localctx, 26, t2lParser::RuleJimport_stat);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(157);
    match(t2lParser::JIMPORT);
    setState(158);
    match(t2lParser::ID);
    setState(159);
    match(t2lParser::SCOL);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- If_statContext ------------------------------------------------------------------

t2lParser::If_statContext::If_statContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::If_statContext::IF() {
  return getToken(t2lParser::IF, 0);
}

t2lParser::CondContext* t2lParser::If_statContext::cond() {
  return getRuleContext<t2lParser::CondContext>(0);
}

std::vector<t2lParser::ElseIfStatContext *> t2lParser::If_statContext::elseIfStat() {
  return getRuleContexts<t2lParser::ElseIfStatContext>();
}

t2lParser::ElseIfStatContext* t2lParser::If_statContext::elseIfStat(size_t i) {
  return getRuleContext<t2lParser::ElseIfStatContext>(i);
}

t2lParser::ElseStatContext* t2lParser::If_statContext::elseStat() {
  return getRuleContext<t2lParser::ElseStatContext>(0);
}


size_t t2lParser::If_statContext::getRuleIndex() const {
  return t2lParser::RuleIf_stat;
}

void t2lParser::If_statContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIf_stat(this);
}

void t2lParser::If_statContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIf_stat(this);
}

t2lParser::If_statContext* t2lParser::if_stat() {
  If_statContext *_localctx = _tracker.createInstance<If_statContext>(_ctx, getState());
  enterRule(_localctx, 28, t2lParser::RuleIf_stat);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(161);
    match(t2lParser::IF);
    setState(162);
    cond();
    setState(166);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(163);
        antlrcpp::downCast<If_statContext *>(_localctx)->ElseIf = elseIfStat(); 
      }
      setState(168);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx);
    }
    setState(170);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx)) {
    case 1: {
      setState(169);
      antlrcpp::downCast<If_statContext *>(_localctx)->Else = elseStat();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ElseIfStatContext ------------------------------------------------------------------

t2lParser::ElseIfStatContext::ElseIfStatContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::ElseIfStatContext::ELSE() {
  return getToken(t2lParser::ELSE, 0);
}

tree::TerminalNode* t2lParser::ElseIfStatContext::IF() {
  return getToken(t2lParser::IF, 0);
}

t2lParser::CondContext* t2lParser::ElseIfStatContext::cond() {
  return getRuleContext<t2lParser::CondContext>(0);
}


size_t t2lParser::ElseIfStatContext::getRuleIndex() const {
  return t2lParser::RuleElseIfStat;
}

void t2lParser::ElseIfStatContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterElseIfStat(this);
}

void t2lParser::ElseIfStatContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitElseIfStat(this);
}

t2lParser::ElseIfStatContext* t2lParser::elseIfStat() {
  ElseIfStatContext *_localctx = _tracker.createInstance<ElseIfStatContext>(_ctx, getState());
  enterRule(_localctx, 30, t2lParser::RuleElseIfStat);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(172);
    match(t2lParser::ELSE);
    setState(173);
    match(t2lParser::IF);
    setState(174);
    cond();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ElseStatContext ------------------------------------------------------------------

t2lParser::ElseStatContext::ElseStatContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::ElseStatContext::ELSE() {
  return getToken(t2lParser::ELSE, 0);
}

t2lParser::Stat_blockContext* t2lParser::ElseStatContext::stat_block() {
  return getRuleContext<t2lParser::Stat_blockContext>(0);
}


size_t t2lParser::ElseStatContext::getRuleIndex() const {
  return t2lParser::RuleElseStat;
}

void t2lParser::ElseStatContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterElseStat(this);
}

void t2lParser::ElseStatContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitElseStat(this);
}

t2lParser::ElseStatContext* t2lParser::elseStat() {
  ElseStatContext *_localctx = _tracker.createInstance<ElseStatContext>(_ctx, getState());
  enterRule(_localctx, 32, t2lParser::RuleElseStat);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(176);
    match(t2lParser::ELSE);
    setState(177);
    stat_block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CondContext ------------------------------------------------------------------

t2lParser::CondContext::CondContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

t2lParser::ExprContext* t2lParser::CondContext::expr() {
  return getRuleContext<t2lParser::ExprContext>(0);
}

t2lParser::Stat_blockContext* t2lParser::CondContext::stat_block() {
  return getRuleContext<t2lParser::Stat_blockContext>(0);
}


size_t t2lParser::CondContext::getRuleIndex() const {
  return t2lParser::RuleCond;
}

void t2lParser::CondContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCond(this);
}

void t2lParser::CondContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCond(this);
}

t2lParser::CondContext* t2lParser::cond() {
  CondContext *_localctx = _tracker.createInstance<CondContext>(_ctx, getState());
  enterRule(_localctx, 34, t2lParser::RuleCond);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(179);
    expr(0);
    setState(180);
    stat_block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Stat_blockContext ------------------------------------------------------------------

t2lParser::Stat_blockContext::Stat_blockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::Stat_blockContext::OBRACE() {
  return getToken(t2lParser::OBRACE, 0);
}

t2lParser::BlockContext* t2lParser::Stat_blockContext::block() {
  return getRuleContext<t2lParser::BlockContext>(0);
}

tree::TerminalNode* t2lParser::Stat_blockContext::CBRACE() {
  return getToken(t2lParser::CBRACE, 0);
}

t2lParser::StatContext* t2lParser::Stat_blockContext::stat() {
  return getRuleContext<t2lParser::StatContext>(0);
}


size_t t2lParser::Stat_blockContext::getRuleIndex() const {
  return t2lParser::RuleStat_block;
}

void t2lParser::Stat_blockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterStat_block(this);
}

void t2lParser::Stat_blockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitStat_block(this);
}

t2lParser::Stat_blockContext* t2lParser::stat_block() {
  Stat_blockContext *_localctx = _tracker.createInstance<Stat_blockContext>(_ctx, getState());
  enterRule(_localctx, 36, t2lParser::RuleStat_block);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(187);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case t2lParser::OBRACE: {
        enterOuterAlt(_localctx, 1);
        setState(182);
        match(t2lParser::OBRACE);
        setState(183);
        block();
        setState(184);
        match(t2lParser::CBRACE);
        break;
      }

      case t2lParser::IF:
      case t2lParser::WHILE:
      case t2lParser::FOR:
      case t2lParser::FUNC:
      case t2lParser::T2L_RETURN:
      case t2lParser::CLASS:
      case t2lParser::IMPORT:
      case t2lParser::JIMPORT:
      case t2lParser::ID:
      case t2lParser::DOC: {
        enterOuterAlt(_localctx, 2);
        setState(186);
        stat();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- While_statContext ------------------------------------------------------------------

t2lParser::While_statContext::While_statContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::While_statContext::WHILE() {
  return getToken(t2lParser::WHILE, 0);
}

t2lParser::ExprContext* t2lParser::While_statContext::expr() {
  return getRuleContext<t2lParser::ExprContext>(0);
}

t2lParser::Stat_blockContext* t2lParser::While_statContext::stat_block() {
  return getRuleContext<t2lParser::Stat_blockContext>(0);
}


size_t t2lParser::While_statContext::getRuleIndex() const {
  return t2lParser::RuleWhile_stat;
}

void t2lParser::While_statContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterWhile_stat(this);
}

void t2lParser::While_statContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitWhile_stat(this);
}

t2lParser::While_statContext* t2lParser::while_stat() {
  While_statContext *_localctx = _tracker.createInstance<While_statContext>(_ctx, getState());
  enterRule(_localctx, 38, t2lParser::RuleWhile_stat);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(189);
    match(t2lParser::WHILE);
    setState(190);
    expr(0);
    setState(191);
    stat_block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- For_loop_statContext ------------------------------------------------------------------

t2lParser::For_loop_statContext::For_loop_statContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::For_loop_statContext::FOR() {
  return getToken(t2lParser::FOR, 0);
}

tree::TerminalNode* t2lParser::For_loop_statContext::ID() {
  return getToken(t2lParser::ID, 0);
}

tree::TerminalNode* t2lParser::For_loop_statContext::IN() {
  return getToken(t2lParser::IN, 0);
}

t2lParser::ExprContext* t2lParser::For_loop_statContext::expr() {
  return getRuleContext<t2lParser::ExprContext>(0);
}

t2lParser::Stat_blockContext* t2lParser::For_loop_statContext::stat_block() {
  return getRuleContext<t2lParser::Stat_blockContext>(0);
}


size_t t2lParser::For_loop_statContext::getRuleIndex() const {
  return t2lParser::RuleFor_loop_stat;
}

void t2lParser::For_loop_statContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFor_loop_stat(this);
}

void t2lParser::For_loop_statContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFor_loop_stat(this);
}

t2lParser::For_loop_statContext* t2lParser::for_loop_stat() {
  For_loop_statContext *_localctx = _tracker.createInstance<For_loop_statContext>(_ctx, getState());
  enterRule(_localctx, 40, t2lParser::RuleFor_loop_stat);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(193);
    match(t2lParser::FOR);
    setState(194);
    match(t2lParser::ID);
    setState(195);
    match(t2lParser::IN);
    setState(196);
    expr(0);
    setState(197);
    stat_block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExprContext ------------------------------------------------------------------

t2lParser::ExprContext::ExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t t2lParser::ExprContext::getRuleIndex() const {
  return t2lParser::RuleExpr;
}

void t2lParser::ExprContext::copyFrom(ExprContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- DictionaryOpContext ------------------------------------------------------------------

tree::TerminalNode* t2lParser::DictionaryOpContext::OBRACE() {
  return getToken(t2lParser::OBRACE, 0);
}

tree::TerminalNode* t2lParser::DictionaryOpContext::CBRACE() {
  return getToken(t2lParser::CBRACE, 0);
}

std::vector<t2lParser::PairContext *> t2lParser::DictionaryOpContext::pair() {
  return getRuleContexts<t2lParser::PairContext>();
}

t2lParser::PairContext* t2lParser::DictionaryOpContext::pair(size_t i) {
  return getRuleContext<t2lParser::PairContext>(i);
}

std::vector<tree::TerminalNode *> t2lParser::DictionaryOpContext::COMMA() {
  return getTokens(t2lParser::COMMA);
}

tree::TerminalNode* t2lParser::DictionaryOpContext::COMMA(size_t i) {
  return getToken(t2lParser::COMMA, i);
}

t2lParser::DictionaryOpContext::DictionaryOpContext(ExprContext *ctx) { copyFrom(ctx); }

void t2lParser::DictionaryOpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterDictionaryOp(this);
}
void t2lParser::DictionaryOpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitDictionaryOp(this);
}
//----------------- ClassOpContext ------------------------------------------------------------------

tree::TerminalNode* t2lParser::ClassOpContext::NEW() {
  return getToken(t2lParser::NEW, 0);
}

tree::TerminalNode* t2lParser::ClassOpContext::ID() {
  return getToken(t2lParser::ID, 0);
}

tree::TerminalNode* t2lParser::ClassOpContext::OPAR() {
  return getToken(t2lParser::OPAR, 0);
}

t2lParser::ParamsContext* t2lParser::ClassOpContext::params() {
  return getRuleContext<t2lParser::ParamsContext>(0);
}

tree::TerminalNode* t2lParser::ClassOpContext::CPAR() {
  return getToken(t2lParser::CPAR, 0);
}

t2lParser::ClassOpContext::ClassOpContext(ExprContext *ctx) { copyFrom(ctx); }

void t2lParser::ClassOpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassOp(this);
}
void t2lParser::ClassOpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassOp(this);
}
//----------------- ListOpContext ------------------------------------------------------------------

tree::TerminalNode* t2lParser::ListOpContext::OSQUARE() {
  return getToken(t2lParser::OSQUARE, 0);
}

tree::TerminalNode* t2lParser::ListOpContext::CSQUARE() {
  return getToken(t2lParser::CSQUARE, 0);
}

std::vector<t2lParser::ExprContext *> t2lParser::ListOpContext::expr() {
  return getRuleContexts<t2lParser::ExprContext>();
}

t2lParser::ExprContext* t2lParser::ListOpContext::expr(size_t i) {
  return getRuleContext<t2lParser::ExprContext>(i);
}

std::vector<tree::TerminalNode *> t2lParser::ListOpContext::COMMA() {
  return getTokens(t2lParser::COMMA);
}

tree::TerminalNode* t2lParser::ListOpContext::COMMA(size_t i) {
  return getToken(t2lParser::COMMA, i);
}

t2lParser::ListOpContext::ListOpContext(ExprContext *ctx) { copyFrom(ctx); }

void t2lParser::ListOpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterListOp(this);
}
void t2lParser::ListOpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitListOp(this);
}
//----------------- FuncOpContext ------------------------------------------------------------------

tree::TerminalNode* t2lParser::FuncOpContext::ID() {
  return getToken(t2lParser::ID, 0);
}

tree::TerminalNode* t2lParser::FuncOpContext::OPAR() {
  return getToken(t2lParser::OPAR, 0);
}

t2lParser::ParamsContext* t2lParser::FuncOpContext::params() {
  return getRuleContext<t2lParser::ParamsContext>(0);
}

tree::TerminalNode* t2lParser::FuncOpContext::CPAR() {
  return getToken(t2lParser::CPAR, 0);
}

t2lParser::FuncOpContext::FuncOpContext(ExprContext *ctx) { copyFrom(ctx); }

void t2lParser::FuncOpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFuncOp(this);
}
void t2lParser::FuncOpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFuncOp(this);
}
//----------------- AtomOpContext ------------------------------------------------------------------

t2lParser::AtomContext* t2lParser::AtomOpContext::atom() {
  return getRuleContext<t2lParser::AtomContext>(0);
}

t2lParser::AtomOpContext::AtomOpContext(ExprContext *ctx) { copyFrom(ctx); }

void t2lParser::AtomOpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAtomOp(this);
}
void t2lParser::AtomOpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAtomOp(this);
}
//----------------- MultiOpContext ------------------------------------------------------------------

std::vector<t2lParser::ExprContext *> t2lParser::MultiOpContext::expr() {
  return getRuleContexts<t2lParser::ExprContext>();
}

t2lParser::ExprContext* t2lParser::MultiOpContext::expr(size_t i) {
  return getRuleContext<t2lParser::ExprContext>(i);
}

t2lParser::MultiOpContext::MultiOpContext(ExprContext *ctx) { copyFrom(ctx); }

void t2lParser::MultiOpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMultiOp(this);
}
void t2lParser::MultiOpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMultiOp(this);
}
//----------------- ExprOpContext ------------------------------------------------------------------

std::vector<t2lParser::ExprContext *> t2lParser::ExprOpContext::expr() {
  return getRuleContexts<t2lParser::ExprContext>();
}

t2lParser::ExprContext* t2lParser::ExprOpContext::expr(size_t i) {
  return getRuleContext<t2lParser::ExprContext>(i);
}

tree::TerminalNode* t2lParser::ExprOpContext::POW() {
  return getToken(t2lParser::POW, 0);
}

tree::TerminalNode* t2lParser::ExprOpContext::MULT() {
  return getToken(t2lParser::MULT, 0);
}

tree::TerminalNode* t2lParser::ExprOpContext::DIV() {
  return getToken(t2lParser::DIV, 0);
}

tree::TerminalNode* t2lParser::ExprOpContext::MOD() {
  return getToken(t2lParser::MOD, 0);
}

tree::TerminalNode* t2lParser::ExprOpContext::PLUS() {
  return getToken(t2lParser::PLUS, 0);
}

tree::TerminalNode* t2lParser::ExprOpContext::MINUS() {
  return getToken(t2lParser::MINUS, 0);
}

tree::TerminalNode* t2lParser::ExprOpContext::LTEQ() {
  return getToken(t2lParser::LTEQ, 0);
}

tree::TerminalNode* t2lParser::ExprOpContext::GTEQ() {
  return getToken(t2lParser::GTEQ, 0);
}

tree::TerminalNode* t2lParser::ExprOpContext::LT() {
  return getToken(t2lParser::LT, 0);
}

tree::TerminalNode* t2lParser::ExprOpContext::GT() {
  return getToken(t2lParser::GT, 0);
}

tree::TerminalNode* t2lParser::ExprOpContext::EQ() {
  return getToken(t2lParser::EQ, 0);
}

tree::TerminalNode* t2lParser::ExprOpContext::NEQ() {
  return getToken(t2lParser::NEQ, 0);
}

tree::TerminalNode* t2lParser::ExprOpContext::AND() {
  return getToken(t2lParser::AND, 0);
}

tree::TerminalNode* t2lParser::ExprOpContext::OR() {
  return getToken(t2lParser::OR, 0);
}

t2lParser::ExprOpContext::ExprOpContext(ExprContext *ctx) { copyFrom(ctx); }

void t2lParser::ExprOpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterExprOp(this);
}
void t2lParser::ExprOpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitExprOp(this);
}
//----------------- SingleOpContext ------------------------------------------------------------------

t2lParser::ExprContext* t2lParser::SingleOpContext::expr() {
  return getRuleContext<t2lParser::ExprContext>(0);
}

tree::TerminalNode* t2lParser::SingleOpContext::MINUS() {
  return getToken(t2lParser::MINUS, 0);
}

tree::TerminalNode* t2lParser::SingleOpContext::NOT() {
  return getToken(t2lParser::NOT, 0);
}

t2lParser::SingleOpContext::SingleOpContext(ExprContext *ctx) { copyFrom(ctx); }

void t2lParser::SingleOpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterSingleOp(this);
}
void t2lParser::SingleOpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitSingleOp(this);
}
//----------------- IndexOpContext ------------------------------------------------------------------

tree::TerminalNode* t2lParser::IndexOpContext::ID() {
  return getToken(t2lParser::ID, 0);
}

tree::TerminalNode* t2lParser::IndexOpContext::OSQUARE() {
  return getToken(t2lParser::OSQUARE, 0);
}

t2lParser::ExprContext* t2lParser::IndexOpContext::expr() {
  return getRuleContext<t2lParser::ExprContext>(0);
}

tree::TerminalNode* t2lParser::IndexOpContext::CSQUARE() {
  return getToken(t2lParser::CSQUARE, 0);
}

t2lParser::IndexOpContext::IndexOpContext(ExprContext *ctx) { copyFrom(ctx); }

void t2lParser::IndexOpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIndexOp(this);
}
void t2lParser::IndexOpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIndexOp(this);
}

t2lParser::ExprContext* t2lParser::expr() {
   return expr(0);
}

t2lParser::ExprContext* t2lParser::expr(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  t2lParser::ExprContext *_localctx = _tracker.createInstance<ExprContext>(_ctx, parentState);
  t2lParser::ExprContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 42;
  enterRecursionRule(_localctx, 42, t2lParser::RuleExpr, precedence);

    size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(247);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
    case 1: {
      _localctx = _tracker.createInstance<SingleOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;

      setState(200);
      antlrcpp::downCast<SingleOpContext *>(_localctx)->op = match(t2lParser::MINUS);
      setState(201);
      expr(15);
      break;
    }

    case 2: {
      _localctx = _tracker.createInstance<SingleOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(202);
      antlrcpp::downCast<SingleOpContext *>(_localctx)->op = match(t2lParser::NOT);
      setState(203);
      expr(14);
      break;
    }

    case 3: {
      _localctx = _tracker.createInstance<AtomOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(204);
      atom();
      break;
    }

    case 4: {
      _localctx = _tracker.createInstance<ListOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(205);
      match(t2lParser::OSQUARE);
      setState(215);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << t2lParser::MINUS)
        | (1ULL << t2lParser::NOT)
        | (1ULL << t2lParser::OPAR)
        | (1ULL << t2lParser::OBRACE)
        | (1ULL << t2lParser::OSQUARE)
        | (1ULL << t2lParser::NEW)
        | (1ULL << t2lParser::ID)
        | (1ULL << t2lParser::INT)
        | (1ULL << t2lParser::STRING))) != 0)) {
        setState(211);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx);
        while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
          if (alt == 1) {
            setState(206);
            expr(0);
            setState(207);
            match(t2lParser::COMMA); 
          }
          setState(213);
          _errHandler->sync(this);
          alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx);
        }
        setState(214);
        expr(0);
      }
      setState(217);
      match(t2lParser::CSQUARE);
      break;
    }

    case 5: {
      _localctx = _tracker.createInstance<DictionaryOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(218);
      match(t2lParser::OBRACE);
      setState(228);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << t2lParser::MINUS)
        | (1ULL << t2lParser::NOT)
        | (1ULL << t2lParser::OPAR)
        | (1ULL << t2lParser::OBRACE)
        | (1ULL << t2lParser::OSQUARE)
        | (1ULL << t2lParser::NEW)
        | (1ULL << t2lParser::ID)
        | (1ULL << t2lParser::INT)
        | (1ULL << t2lParser::STRING))) != 0)) {
        setState(224);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx);
        while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
          if (alt == 1) {
            setState(219);
            pair();
            setState(220);
            match(t2lParser::COMMA); 
          }
          setState(226);
          _errHandler->sync(this);
          alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx);
        }
        setState(227);
        pair();
      }
      setState(230);
      match(t2lParser::CBRACE);
      break;
    }

    case 6: {
      _localctx = _tracker.createInstance<IndexOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(231);
      match(t2lParser::ID);
      setState(232);
      match(t2lParser::OSQUARE);
      setState(233);
      expr(0);
      setState(234);
      match(t2lParser::CSQUARE);
      break;
    }

    case 7: {
      _localctx = _tracker.createInstance<FuncOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(236);
      match(t2lParser::ID);
      setState(237);
      match(t2lParser::OPAR);
      setState(238);
      params();
      setState(239);
      match(t2lParser::CPAR);
      break;
    }

    case 8: {
      _localctx = _tracker.createInstance<ClassOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(241);
      match(t2lParser::NEW);
      setState(242);
      match(t2lParser::ID);
      setState(243);
      match(t2lParser::OPAR);
      setState(244);
      params();
      setState(245);
      match(t2lParser::CPAR);
      break;
    }

    default:
      break;
    }
    _ctx->stop = _input->LT(-1);
    setState(275);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(273);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
        case 1: {
          auto newContext = _tracker.createInstance<ExprOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          newContext->left = previousContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(249);

          if (!(precpred(_ctx, 16))) throw FailedPredicateException(this, "precpred(_ctx, 16)");
          setState(250);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->op = match(t2lParser::POW);
          setState(251);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->right = expr(16);
          break;
        }

        case 2: {
          auto newContext = _tracker.createInstance<ExprOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          newContext->left = previousContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(252);

          if (!(precpred(_ctx, 13))) throw FailedPredicateException(this, "precpred(_ctx, 13)");
          setState(253);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->op = _input->LT(1);
          _la = _input->LA(1);
          if (!((((_la & ~ 0x3fULL) == 0) &&
            ((1ULL << _la) & ((1ULL << t2lParser::MULT)
            | (1ULL << t2lParser::DIV)
            | (1ULL << t2lParser::MOD))) != 0))) {
            antlrcpp::downCast<ExprOpContext *>(_localctx)->op = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(254);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->right = expr(14);
          break;
        }

        case 3: {
          auto newContext = _tracker.createInstance<ExprOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          newContext->left = previousContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(255);

          if (!(precpred(_ctx, 12))) throw FailedPredicateException(this, "precpred(_ctx, 12)");
          setState(256);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->op = _input->LT(1);
          _la = _input->LA(1);
          if (!(_la == t2lParser::PLUS

          || _la == t2lParser::MINUS)) {
            antlrcpp::downCast<ExprOpContext *>(_localctx)->op = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(257);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->right = expr(13);
          break;
        }

        case 4: {
          auto newContext = _tracker.createInstance<ExprOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          newContext->left = previousContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(258);

          if (!(precpred(_ctx, 11))) throw FailedPredicateException(this, "precpred(_ctx, 11)");
          setState(259);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->op = _input->LT(1);
          _la = _input->LA(1);
          if (!((((_la & ~ 0x3fULL) == 0) &&
            ((1ULL << _la) & ((1ULL << t2lParser::GT)
            | (1ULL << t2lParser::LT)
            | (1ULL << t2lParser::GTEQ)
            | (1ULL << t2lParser::LTEQ))) != 0))) {
            antlrcpp::downCast<ExprOpContext *>(_localctx)->op = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(260);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->right = expr(12);
          break;
        }

        case 5: {
          auto newContext = _tracker.createInstance<ExprOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          newContext->left = previousContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(261);

          if (!(precpred(_ctx, 10))) throw FailedPredicateException(this, "precpred(_ctx, 10)");
          setState(262);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->op = _input->LT(1);
          _la = _input->LA(1);
          if (!(_la == t2lParser::EQ

          || _la == t2lParser::NEQ)) {
            antlrcpp::downCast<ExprOpContext *>(_localctx)->op = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(263);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->right = expr(11);
          break;
        }

        case 6: {
          auto newContext = _tracker.createInstance<ExprOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          newContext->left = previousContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(264);

          if (!(precpred(_ctx, 9))) throw FailedPredicateException(this, "precpred(_ctx, 9)");
          setState(265);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->op = match(t2lParser::AND);
          setState(266);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->right = expr(10);
          break;
        }

        case 7: {
          auto newContext = _tracker.createInstance<ExprOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          newContext->left = previousContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(267);

          if (!(precpred(_ctx, 8))) throw FailedPredicateException(this, "precpred(_ctx, 8)");
          setState(268);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->op = match(t2lParser::OR);
          setState(269);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->right = expr(9);
          break;
        }

        case 8: {
          auto newContext = _tracker.createInstance<MultiOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(270);

          if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
          setState(271);
          match(t2lParser::T__0);
          setState(272);
          expr(2);
          break;
        }

        default:
          break;
        } 
      }
      setState(277);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- PairContext ------------------------------------------------------------------

t2lParser::PairContext::PairContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* t2lParser::PairContext::COL() {
  return getToken(t2lParser::COL, 0);
}

std::vector<t2lParser::ExprContext *> t2lParser::PairContext::expr() {
  return getRuleContexts<t2lParser::ExprContext>();
}

t2lParser::ExprContext* t2lParser::PairContext::expr(size_t i) {
  return getRuleContext<t2lParser::ExprContext>(i);
}


size_t t2lParser::PairContext::getRuleIndex() const {
  return t2lParser::RulePair;
}

void t2lParser::PairContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterPair(this);
}

void t2lParser::PairContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitPair(this);
}

t2lParser::PairContext* t2lParser::pair() {
  PairContext *_localctx = _tracker.createInstance<PairContext>(_ctx, getState());
  enterRule(_localctx, 44, t2lParser::RulePair);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(278);
    antlrcpp::downCast<PairContext *>(_localctx)->key = expr(0);
    setState(279);
    match(t2lParser::COL);
    setState(280);
    antlrcpp::downCast<PairContext *>(_localctx)->value = expr(0);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AtomContext ------------------------------------------------------------------

t2lParser::AtomContext::AtomContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t t2lParser::AtomContext::getRuleIndex() const {
  return t2lParser::RuleAtom;
}

void t2lParser::AtomContext::copyFrom(AtomContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- IDAtomContext ------------------------------------------------------------------

tree::TerminalNode* t2lParser::IDAtomContext::ID() {
  return getToken(t2lParser::ID, 0);
}

t2lParser::IDAtomContext::IDAtomContext(AtomContext *ctx) { copyFrom(ctx); }

void t2lParser::IDAtomContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIDAtom(this);
}
void t2lParser::IDAtomContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIDAtom(this);
}
//----------------- StringAtomContext ------------------------------------------------------------------

tree::TerminalNode* t2lParser::StringAtomContext::STRING() {
  return getToken(t2lParser::STRING, 0);
}

t2lParser::StringAtomContext::StringAtomContext(AtomContext *ctx) { copyFrom(ctx); }

void t2lParser::StringAtomContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterStringAtom(this);
}
void t2lParser::StringAtomContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitStringAtom(this);
}
//----------------- ParenAtomContext ------------------------------------------------------------------

tree::TerminalNode* t2lParser::ParenAtomContext::OPAR() {
  return getToken(t2lParser::OPAR, 0);
}

t2lParser::ExprContext* t2lParser::ParenAtomContext::expr() {
  return getRuleContext<t2lParser::ExprContext>(0);
}

tree::TerminalNode* t2lParser::ParenAtomContext::CPAR() {
  return getToken(t2lParser::CPAR, 0);
}

t2lParser::ParenAtomContext::ParenAtomContext(AtomContext *ctx) { copyFrom(ctx); }

void t2lParser::ParenAtomContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterParenAtom(this);
}
void t2lParser::ParenAtomContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitParenAtom(this);
}
//----------------- IntAtomContext ------------------------------------------------------------------

tree::TerminalNode* t2lParser::IntAtomContext::INT() {
  return getToken(t2lParser::INT, 0);
}

t2lParser::IntAtomContext::IntAtomContext(AtomContext *ctx) { copyFrom(ctx); }

void t2lParser::IntAtomContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIntAtom(this);
}
void t2lParser::IntAtomContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<t2lListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIntAtom(this);
}
t2lParser::AtomContext* t2lParser::atom() {
  AtomContext *_localctx = _tracker.createInstance<AtomContext>(_ctx, getState());
  enterRule(_localctx, 46, t2lParser::RuleAtom);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(289);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case t2lParser::OPAR: {
        _localctx = _tracker.createInstance<t2lParser::ParenAtomContext>(_localctx);
        enterOuterAlt(_localctx, 1);
        setState(282);
        match(t2lParser::OPAR);
        setState(283);
        expr(0);
        setState(284);
        match(t2lParser::CPAR);
        break;
      }

      case t2lParser::INT: {
        _localctx = _tracker.createInstance<t2lParser::IntAtomContext>(_localctx);
        enterOuterAlt(_localctx, 2);
        setState(286);
        match(t2lParser::INT);
        break;
      }

      case t2lParser::ID: {
        _localctx = _tracker.createInstance<t2lParser::IDAtomContext>(_localctx);
        enterOuterAlt(_localctx, 3);
        setState(287);
        match(t2lParser::ID);
        break;
      }

      case t2lParser::STRING: {
        _localctx = _tracker.createInstance<t2lParser::StringAtomContext>(_localctx);
        enterOuterAlt(_localctx, 4);
        setState(288);
        match(t2lParser::STRING);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

bool t2lParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 21: return exprSempred(antlrcpp::downCast<ExprContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool t2lParser::exprSempred(ExprContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 16);
    case 1: return precpred(_ctx, 13);
    case 2: return precpred(_ctx, 12);
    case 3: return precpred(_ctx, 11);
    case 4: return precpred(_ctx, 10);
    case 5: return precpred(_ctx, 9);
    case 6: return precpred(_ctx, 8);
    case 7: return precpred(_ctx, 1);

  default:
    break;
  }
  return true;
}

// Static vars and initialization.
std::vector<dfa::DFA> t2lParser::_decisionToDFA;
atn::PredictionContextCache t2lParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN t2lParser::_atn;
std::vector<uint16_t> t2lParser::_serializedATN;

std::vector<std::string> t2lParser::_ruleNames = {
  "start", "block", "stat", "class_stat_block", "call_stat", "func_stat", 
  "t2l_return", "class_stat", "params", "def_params", "var", "index", "import_stat", 
  "jimport_stat", "if_stat", "elseIfStat", "elseStat", "cond", "stat_block", 
  "while_stat", "for_loop_stat", "expr", "pair", "atom"
};

std::vector<std::string> t2lParser::_literalNames = {
  "", "'.'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", 
  "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "';'", "':'", "'='", 
  "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'if'", "'else'", "'while'", 
  "'for'", "'in'", "'func'", "'return'", "'class'", "'new'", "'import'", 
  "'jimport'"
};

std::vector<std::string> t2lParser::_symbolicNames = {
  "", "", "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", 
  "MINUS", "MULT", "DIV", "MOD", "POW", "NOT", "SCOL", "COL", "ASSIGN", 
  "COMMA", "OPAR", "CPAR", "OBRACE", "CBRACE", "OSQUARE", "CSQUARE", "IF", 
  "ELSE", "WHILE", "FOR", "IN", "FUNC", "T2L_RETURN", "CLASS", "NEW", "IMPORT", 
  "JIMPORT", "ID", "INT", "DOC", "STRING", "COMMENT", "SPACE"
};

dfa::Vocabulary t2lParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> t2lParser::_tokenNames;

t2lParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  static const uint16_t serializedATNSegment0[] = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
       0x3, 0x2d, 0x126, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
       0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 
       0x7, 0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 
       0x4, 0xb, 0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 
       0xe, 0x9, 0xe, 0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 
       0x9, 0x11, 0x4, 0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 
       0x9, 0x14, 0x4, 0x15, 0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x4, 0x17, 
       0x9, 0x17, 0x4, 0x18, 0x9, 0x18, 0x4, 0x19, 0x9, 0x19, 0x3, 0x2, 
       0x3, 0x2, 0x3, 0x3, 0x7, 0x3, 0x36, 0xa, 0x3, 0xc, 0x3, 0xe, 0x3, 
       0x39, 0xb, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 
       0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x5, 
       0x4, 0x46, 0xa, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x5, 0x5, 0x4b, 
       0xa, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 
       0x6, 0x3, 0x7, 0x5, 0x7, 0x54, 0xa, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 
       0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 
       0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x7, 0x9, 0x64, 
       0xa, 0x9, 0xc, 0x9, 0xe, 0x9, 0x67, 0xb, 0x9, 0x3, 0x9, 0x3, 0x9, 
       0x5, 0x9, 0x6b, 0xa, 0x9, 0x3, 0x9, 0x3, 0x9, 0x7, 0x9, 0x6f, 0xa, 
       0x9, 0xc, 0x9, 0xe, 0x9, 0x72, 0xb, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x7, 0xa, 0x79, 0xa, 0xa, 0xc, 0xa, 0xe, 
       0xa, 0x7c, 0xb, 0xa, 0x3, 0xa, 0x5, 0xa, 0x7f, 0xa, 0xa, 0x3, 0xb, 
       0x3, 0xb, 0x7, 0xb, 0x83, 0xa, 0xb, 0xc, 0xb, 0xe, 0xb, 0x86, 0xb, 
       0xb, 0x3, 0xb, 0x5, 0xb, 0x89, 0xa, 0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 
       0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0x92, 0xa, 
       0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
       0x3, 0xd, 0x3, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 
       0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 
       0x7, 0x10, 0xa7, 0xa, 0x10, 0xc, 0x10, 0xe, 0x10, 0xaa, 0xb, 0x10, 
       0x3, 0x10, 0x5, 0x10, 0xad, 0xa, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 
       0x11, 0x3, 0x11, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x5, 0x14, 0xbe, 0xa, 0x14, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 
       0x3, 0x15, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 
       0x3, 0x16, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 
       0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x7, 0x17, 
       0xd4, 0xa, 0x17, 0xc, 0x17, 0xe, 0x17, 0xd7, 0xb, 0x17, 0x3, 0x17, 
       0x5, 0x17, 0xda, 0xa, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x7, 0x17, 0xe1, 0xa, 0x17, 0xc, 0x17, 0xe, 0x17, 
       0xe4, 0xb, 0x17, 0x3, 0x17, 0x5, 0x17, 0xe7, 0xa, 0x17, 0x3, 0x17, 
       0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 
       0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 
       0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x5, 0x17, 0xfa, 0xa, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
       0x17, 0x7, 0x17, 0x114, 0xa, 0x17, 0xc, 0x17, 0xe, 0x17, 0x117, 0xb, 
       0x17, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x19, 0x3, 
       0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x5, 
       0x19, 0x124, 0xa, 0x19, 0x3, 0x19, 0x2, 0x3, 0x2c, 0x1a, 0x2, 0x4, 
       0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 
       0x1e, 0x20, 0x22, 0x24, 0x26, 0x28, 0x2a, 0x2c, 0x2e, 0x30, 0x2, 
       0x6, 0x3, 0x2, 0xe, 0x10, 0x3, 0x2, 0xc, 0xd, 0x3, 0x2, 0x8, 0xb, 
       0x3, 0x2, 0x6, 0x7, 0x2, 0x13c, 0x2, 0x32, 0x3, 0x2, 0x2, 0x2, 0x4, 
       0x37, 0x3, 0x2, 0x2, 0x2, 0x6, 0x45, 0x3, 0x2, 0x2, 0x2, 0x8, 0x4a, 
       0x3, 0x2, 0x2, 0x2, 0xa, 0x4c, 0x3, 0x2, 0x2, 0x2, 0xc, 0x53, 0x3, 
       0x2, 0x2, 0x2, 0xe, 0x5a, 0x3, 0x2, 0x2, 0x2, 0x10, 0x5e, 0x3, 0x2, 
       0x2, 0x2, 0x12, 0x7e, 0x3, 0x2, 0x2, 0x2, 0x14, 0x88, 0x3, 0x2, 0x2, 
       0x2, 0x16, 0x91, 0x3, 0x2, 0x2, 0x2, 0x18, 0x93, 0x3, 0x2, 0x2, 0x2, 
       0x1a, 0x9b, 0x3, 0x2, 0x2, 0x2, 0x1c, 0x9f, 0x3, 0x2, 0x2, 0x2, 0x1e, 
       0xa3, 0x3, 0x2, 0x2, 0x2, 0x20, 0xae, 0x3, 0x2, 0x2, 0x2, 0x22, 0xb2, 
       0x3, 0x2, 0x2, 0x2, 0x24, 0xb5, 0x3, 0x2, 0x2, 0x2, 0x26, 0xbd, 0x3, 
       0x2, 0x2, 0x2, 0x28, 0xbf, 0x3, 0x2, 0x2, 0x2, 0x2a, 0xc3, 0x3, 0x2, 
       0x2, 0x2, 0x2c, 0xf9, 0x3, 0x2, 0x2, 0x2, 0x2e, 0x118, 0x3, 0x2, 
       0x2, 0x2, 0x30, 0x123, 0x3, 0x2, 0x2, 0x2, 0x32, 0x33, 0x5, 0x4, 
       0x3, 0x2, 0x33, 0x3, 0x3, 0x2, 0x2, 0x2, 0x34, 0x36, 0x5, 0x6, 0x4, 
       0x2, 0x35, 0x34, 0x3, 0x2, 0x2, 0x2, 0x36, 0x39, 0x3, 0x2, 0x2, 0x2, 
       0x37, 0x35, 0x3, 0x2, 0x2, 0x2, 0x37, 0x38, 0x3, 0x2, 0x2, 0x2, 0x38, 
       0x5, 0x3, 0x2, 0x2, 0x2, 0x39, 0x37, 0x3, 0x2, 0x2, 0x2, 0x3a, 0x46, 
       0x5, 0x16, 0xc, 0x2, 0x3b, 0x46, 0x5, 0x1e, 0x10, 0x2, 0x3c, 0x46, 
       0x5, 0x28, 0x15, 0x2, 0x3d, 0x46, 0x5, 0xa, 0x6, 0x2, 0x3e, 0x46, 
       0x5, 0xc, 0x7, 0x2, 0x3f, 0x46, 0x5, 0x10, 0x9, 0x2, 0x40, 0x46, 
       0x5, 0xe, 0x8, 0x2, 0x41, 0x46, 0x5, 0x18, 0xd, 0x2, 0x42, 0x46, 
       0x5, 0x2a, 0x16, 0x2, 0x43, 0x46, 0x5, 0x1a, 0xe, 0x2, 0x44, 0x46, 
       0x5, 0x1c, 0xf, 0x2, 0x45, 0x3a, 0x3, 0x2, 0x2, 0x2, 0x45, 0x3b, 
       0x3, 0x2, 0x2, 0x2, 0x45, 0x3c, 0x3, 0x2, 0x2, 0x2, 0x45, 0x3d, 0x3, 
       0x2, 0x2, 0x2, 0x45, 0x3e, 0x3, 0x2, 0x2, 0x2, 0x45, 0x3f, 0x3, 0x2, 
       0x2, 0x2, 0x45, 0x40, 0x3, 0x2, 0x2, 0x2, 0x45, 0x41, 0x3, 0x2, 0x2, 
       0x2, 0x45, 0x42, 0x3, 0x2, 0x2, 0x2, 0x45, 0x43, 0x3, 0x2, 0x2, 0x2, 
       0x45, 0x44, 0x3, 0x2, 0x2, 0x2, 0x46, 0x7, 0x3, 0x2, 0x2, 0x2, 0x47, 
       0x4b, 0x5, 0x16, 0xc, 0x2, 0x48, 0x4b, 0x5, 0x10, 0x9, 0x2, 0x49, 
       0x4b, 0x5, 0xc, 0x7, 0x2, 0x4a, 0x47, 0x3, 0x2, 0x2, 0x2, 0x4a, 0x48, 
       0x3, 0x2, 0x2, 0x2, 0x4a, 0x49, 0x3, 0x2, 0x2, 0x2, 0x4b, 0x9, 0x3, 
       0x2, 0x2, 0x2, 0x4c, 0x4d, 0x7, 0x28, 0x2, 0x2, 0x4d, 0x4e, 0x7, 
       0x17, 0x2, 0x2, 0x4e, 0x4f, 0x5, 0x12, 0xa, 0x2, 0x4f, 0x50, 0x7, 
       0x18, 0x2, 0x2, 0x50, 0x51, 0x7, 0x13, 0x2, 0x2, 0x51, 0xb, 0x3, 
       0x2, 0x2, 0x2, 0x52, 0x54, 0x7, 0x2a, 0x2, 0x2, 0x53, 0x52, 0x3, 
       0x2, 0x2, 0x2, 0x53, 0x54, 0x3, 0x2, 0x2, 0x2, 0x54, 0x55, 0x3, 0x2, 
       0x2, 0x2, 0x55, 0x56, 0x7, 0x22, 0x2, 0x2, 0x56, 0x57, 0x7, 0x28, 
       0x2, 0x2, 0x57, 0x58, 0x5, 0x14, 0xb, 0x2, 0x58, 0x59, 0x5, 0x26, 
       0x14, 0x2, 0x59, 0xd, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x5b, 0x7, 0x23, 
       0x2, 0x2, 0x5b, 0x5c, 0x5, 0x2c, 0x17, 0x2, 0x5c, 0x5d, 0x7, 0x13, 
       0x2, 0x2, 0x5d, 0xf, 0x3, 0x2, 0x2, 0x2, 0x5e, 0x5f, 0x7, 0x24, 0x2, 
       0x2, 0x5f, 0x6a, 0x7, 0x28, 0x2, 0x2, 0x60, 0x65, 0x7, 0x17, 0x2, 
       0x2, 0x61, 0x62, 0x7, 0x28, 0x2, 0x2, 0x62, 0x64, 0x7, 0x16, 0x2, 
       0x2, 0x63, 0x61, 0x3, 0x2, 0x2, 0x2, 0x64, 0x67, 0x3, 0x2, 0x2, 0x2, 
       0x65, 0x63, 0x3, 0x2, 0x2, 0x2, 0x65, 0x66, 0x3, 0x2, 0x2, 0x2, 0x66, 
       0x68, 0x3, 0x2, 0x2, 0x2, 0x67, 0x65, 0x3, 0x2, 0x2, 0x2, 0x68, 0x69, 
       0x7, 0x28, 0x2, 0x2, 0x69, 0x6b, 0x7, 0x18, 0x2, 0x2, 0x6a, 0x60, 
       0x3, 0x2, 0x2, 0x2, 0x6a, 0x6b, 0x3, 0x2, 0x2, 0x2, 0x6b, 0x6c, 0x3, 
       0x2, 0x2, 0x2, 0x6c, 0x70, 0x7, 0x19, 0x2, 0x2, 0x6d, 0x6f, 0x5, 
       0x8, 0x5, 0x2, 0x6e, 0x6d, 0x3, 0x2, 0x2, 0x2, 0x6f, 0x72, 0x3, 0x2, 
       0x2, 0x2, 0x70, 0x6e, 0x3, 0x2, 0x2, 0x2, 0x70, 0x71, 0x3, 0x2, 0x2, 
       0x2, 0x71, 0x73, 0x3, 0x2, 0x2, 0x2, 0x72, 0x70, 0x3, 0x2, 0x2, 0x2, 
       0x73, 0x74, 0x7, 0x1a, 0x2, 0x2, 0x74, 0x11, 0x3, 0x2, 0x2, 0x2, 
       0x75, 0x76, 0x5, 0x2c, 0x17, 0x2, 0x76, 0x77, 0x7, 0x16, 0x2, 0x2, 
       0x77, 0x79, 0x3, 0x2, 0x2, 0x2, 0x78, 0x75, 0x3, 0x2, 0x2, 0x2, 0x79, 
       0x7c, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x78, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x7b, 
       0x3, 0x2, 0x2, 0x2, 0x7b, 0x7d, 0x3, 0x2, 0x2, 0x2, 0x7c, 0x7a, 0x3, 
       0x2, 0x2, 0x2, 0x7d, 0x7f, 0x5, 0x2c, 0x17, 0x2, 0x7e, 0x7a, 0x3, 
       0x2, 0x2, 0x2, 0x7e, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x7f, 0x13, 0x3, 0x2, 
       0x2, 0x2, 0x80, 0x81, 0x7, 0x2b, 0x2, 0x2, 0x81, 0x83, 0x7, 0x16, 
       0x2, 0x2, 0x82, 0x80, 0x3, 0x2, 0x2, 0x2, 0x83, 0x86, 0x3, 0x2, 0x2, 
       0x2, 0x84, 0x82, 0x3, 0x2, 0x2, 0x2, 0x84, 0x85, 0x3, 0x2, 0x2, 0x2, 
       0x85, 0x87, 0x3, 0x2, 0x2, 0x2, 0x86, 0x84, 0x3, 0x2, 0x2, 0x2, 0x87, 
       0x89, 0x7, 0x2b, 0x2, 0x2, 0x88, 0x84, 0x3, 0x2, 0x2, 0x2, 0x88, 
       0x89, 0x3, 0x2, 0x2, 0x2, 0x89, 0x15, 0x3, 0x2, 0x2, 0x2, 0x8a, 0x8b, 
       0x7, 0x28, 0x2, 0x2, 0x8b, 0x8c, 0x7, 0x15, 0x2, 0x2, 0x8c, 0x8d, 
       0x5, 0x2c, 0x17, 0x2, 0x8d, 0x8e, 0x7, 0x13, 0x2, 0x2, 0x8e, 0x92, 
       0x3, 0x2, 0x2, 0x2, 0x8f, 0x90, 0x7, 0x28, 0x2, 0x2, 0x90, 0x92, 
       0x7, 0x13, 0x2, 0x2, 0x91, 0x8a, 0x3, 0x2, 0x2, 0x2, 0x91, 0x8f, 
       0x3, 0x2, 0x2, 0x2, 0x92, 0x17, 0x3, 0x2, 0x2, 0x2, 0x93, 0x94, 0x7, 
       0x28, 0x2, 0x2, 0x94, 0x95, 0x7, 0x1b, 0x2, 0x2, 0x95, 0x96, 0x5, 
       0x2c, 0x17, 0x2, 0x96, 0x97, 0x7, 0x1c, 0x2, 0x2, 0x97, 0x98, 0x7, 
       0x15, 0x2, 0x2, 0x98, 0x99, 0x5, 0x2c, 0x17, 0x2, 0x99, 0x9a, 0x7, 
       0x13, 0x2, 0x2, 0x9a, 0x19, 0x3, 0x2, 0x2, 0x2, 0x9b, 0x9c, 0x7, 
       0x26, 0x2, 0x2, 0x9c, 0x9d, 0x7, 0x28, 0x2, 0x2, 0x9d, 0x9e, 0x7, 
       0x13, 0x2, 0x2, 0x9e, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x9f, 0xa0, 0x7, 
       0x27, 0x2, 0x2, 0xa0, 0xa1, 0x7, 0x28, 0x2, 0x2, 0xa1, 0xa2, 0x7, 
       0x13, 0x2, 0x2, 0xa2, 0x1d, 0x3, 0x2, 0x2, 0x2, 0xa3, 0xa4, 0x7, 
       0x1d, 0x2, 0x2, 0xa4, 0xa8, 0x5, 0x24, 0x13, 0x2, 0xa5, 0xa7, 0x5, 
       0x20, 0x11, 0x2, 0xa6, 0xa5, 0x3, 0x2, 0x2, 0x2, 0xa7, 0xaa, 0x3, 
       0x2, 0x2, 0x2, 0xa8, 0xa6, 0x3, 0x2, 0x2, 0x2, 0xa8, 0xa9, 0x3, 0x2, 
       0x2, 0x2, 0xa9, 0xac, 0x3, 0x2, 0x2, 0x2, 0xaa, 0xa8, 0x3, 0x2, 0x2, 
       0x2, 0xab, 0xad, 0x5, 0x22, 0x12, 0x2, 0xac, 0xab, 0x3, 0x2, 0x2, 
       0x2, 0xac, 0xad, 0x3, 0x2, 0x2, 0x2, 0xad, 0x1f, 0x3, 0x2, 0x2, 0x2, 
       0xae, 0xaf, 0x7, 0x1e, 0x2, 0x2, 0xaf, 0xb0, 0x7, 0x1d, 0x2, 0x2, 
       0xb0, 0xb1, 0x5, 0x24, 0x13, 0x2, 0xb1, 0x21, 0x3, 0x2, 0x2, 0x2, 
       0xb2, 0xb3, 0x7, 0x1e, 0x2, 0x2, 0xb3, 0xb4, 0x5, 0x26, 0x14, 0x2, 
       0xb4, 0x23, 0x3, 0x2, 0x2, 0x2, 0xb5, 0xb6, 0x5, 0x2c, 0x17, 0x2, 
       0xb6, 0xb7, 0x5, 0x26, 0x14, 0x2, 0xb7, 0x25, 0x3, 0x2, 0x2, 0x2, 
       0xb8, 0xb9, 0x7, 0x19, 0x2, 0x2, 0xb9, 0xba, 0x5, 0x4, 0x3, 0x2, 
       0xba, 0xbb, 0x7, 0x1a, 0x2, 0x2, 0xbb, 0xbe, 0x3, 0x2, 0x2, 0x2, 
       0xbc, 0xbe, 0x5, 0x6, 0x4, 0x2, 0xbd, 0xb8, 0x3, 0x2, 0x2, 0x2, 0xbd, 
       0xbc, 0x3, 0x2, 0x2, 0x2, 0xbe, 0x27, 0x3, 0x2, 0x2, 0x2, 0xbf, 0xc0, 
       0x7, 0x1f, 0x2, 0x2, 0xc0, 0xc1, 0x5, 0x2c, 0x17, 0x2, 0xc1, 0xc2, 
       0x5, 0x26, 0x14, 0x2, 0xc2, 0x29, 0x3, 0x2, 0x2, 0x2, 0xc3, 0xc4, 
       0x7, 0x20, 0x2, 0x2, 0xc4, 0xc5, 0x7, 0x28, 0x2, 0x2, 0xc5, 0xc6, 
       0x7, 0x21, 0x2, 0x2, 0xc6, 0xc7, 0x5, 0x2c, 0x17, 0x2, 0xc7, 0xc8, 
       0x5, 0x26, 0x14, 0x2, 0xc8, 0x2b, 0x3, 0x2, 0x2, 0x2, 0xc9, 0xca, 
       0x8, 0x17, 0x1, 0x2, 0xca, 0xcb, 0x7, 0xd, 0x2, 0x2, 0xcb, 0xfa, 
       0x5, 0x2c, 0x17, 0x11, 0xcc, 0xcd, 0x7, 0x12, 0x2, 0x2, 0xcd, 0xfa, 
       0x5, 0x2c, 0x17, 0x10, 0xce, 0xfa, 0x5, 0x30, 0x19, 0x2, 0xcf, 0xd9, 
       0x7, 0x1b, 0x2, 0x2, 0xd0, 0xd1, 0x5, 0x2c, 0x17, 0x2, 0xd1, 0xd2, 
       0x7, 0x16, 0x2, 0x2, 0xd2, 0xd4, 0x3, 0x2, 0x2, 0x2, 0xd3, 0xd0, 
       0x3, 0x2, 0x2, 0x2, 0xd4, 0xd7, 0x3, 0x2, 0x2, 0x2, 0xd5, 0xd3, 0x3, 
       0x2, 0x2, 0x2, 0xd5, 0xd6, 0x3, 0x2, 0x2, 0x2, 0xd6, 0xd8, 0x3, 0x2, 
       0x2, 0x2, 0xd7, 0xd5, 0x3, 0x2, 0x2, 0x2, 0xd8, 0xda, 0x5, 0x2c, 
       0x17, 0x2, 0xd9, 0xd5, 0x3, 0x2, 0x2, 0x2, 0xd9, 0xda, 0x3, 0x2, 
       0x2, 0x2, 0xda, 0xdb, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xfa, 0x7, 0x1c, 
       0x2, 0x2, 0xdc, 0xe6, 0x7, 0x19, 0x2, 0x2, 0xdd, 0xde, 0x5, 0x2e, 
       0x18, 0x2, 0xde, 0xdf, 0x7, 0x16, 0x2, 0x2, 0xdf, 0xe1, 0x3, 0x2, 
       0x2, 0x2, 0xe0, 0xdd, 0x3, 0x2, 0x2, 0x2, 0xe1, 0xe4, 0x3, 0x2, 0x2, 
       0x2, 0xe2, 0xe0, 0x3, 0x2, 0x2, 0x2, 0xe2, 0xe3, 0x3, 0x2, 0x2, 0x2, 
       0xe3, 0xe5, 0x3, 0x2, 0x2, 0x2, 0xe4, 0xe2, 0x3, 0x2, 0x2, 0x2, 0xe5, 
       0xe7, 0x5, 0x2e, 0x18, 0x2, 0xe6, 0xe2, 0x3, 0x2, 0x2, 0x2, 0xe6, 
       0xe7, 0x3, 0x2, 0x2, 0x2, 0xe7, 0xe8, 0x3, 0x2, 0x2, 0x2, 0xe8, 0xfa, 
       0x7, 0x1a, 0x2, 0x2, 0xe9, 0xea, 0x7, 0x28, 0x2, 0x2, 0xea, 0xeb, 
       0x7, 0x1b, 0x2, 0x2, 0xeb, 0xec, 0x5, 0x2c, 0x17, 0x2, 0xec, 0xed, 
       0x7, 0x1c, 0x2, 0x2, 0xed, 0xfa, 0x3, 0x2, 0x2, 0x2, 0xee, 0xef, 
       0x7, 0x28, 0x2, 0x2, 0xef, 0xf0, 0x7, 0x17, 0x2, 0x2, 0xf0, 0xf1, 
       0x5, 0x12, 0xa, 0x2, 0xf1, 0xf2, 0x7, 0x18, 0x2, 0x2, 0xf2, 0xfa, 
       0x3, 0x2, 0x2, 0x2, 0xf3, 0xf4, 0x7, 0x25, 0x2, 0x2, 0xf4, 0xf5, 
       0x7, 0x28, 0x2, 0x2, 0xf5, 0xf6, 0x7, 0x17, 0x2, 0x2, 0xf6, 0xf7, 
       0x5, 0x12, 0xa, 0x2, 0xf7, 0xf8, 0x7, 0x18, 0x2, 0x2, 0xf8, 0xfa, 
       0x3, 0x2, 0x2, 0x2, 0xf9, 0xc9, 0x3, 0x2, 0x2, 0x2, 0xf9, 0xcc, 0x3, 
       0x2, 0x2, 0x2, 0xf9, 0xce, 0x3, 0x2, 0x2, 0x2, 0xf9, 0xcf, 0x3, 0x2, 
       0x2, 0x2, 0xf9, 0xdc, 0x3, 0x2, 0x2, 0x2, 0xf9, 0xe9, 0x3, 0x2, 0x2, 
       0x2, 0xf9, 0xee, 0x3, 0x2, 0x2, 0x2, 0xf9, 0xf3, 0x3, 0x2, 0x2, 0x2, 
       0xfa, 0x115, 0x3, 0x2, 0x2, 0x2, 0xfb, 0xfc, 0xc, 0x12, 0x2, 0x2, 
       0xfc, 0xfd, 0x7, 0x11, 0x2, 0x2, 0xfd, 0x114, 0x5, 0x2c, 0x17, 0x12, 
       0xfe, 0xff, 0xc, 0xf, 0x2, 0x2, 0xff, 0x100, 0x9, 0x2, 0x2, 0x2, 
       0x100, 0x114, 0x5, 0x2c, 0x17, 0x10, 0x101, 0x102, 0xc, 0xe, 0x2, 
       0x2, 0x102, 0x103, 0x9, 0x3, 0x2, 0x2, 0x103, 0x114, 0x5, 0x2c, 0x17, 
       0xf, 0x104, 0x105, 0xc, 0xd, 0x2, 0x2, 0x105, 0x106, 0x9, 0x4, 0x2, 
       0x2, 0x106, 0x114, 0x5, 0x2c, 0x17, 0xe, 0x107, 0x108, 0xc, 0xc, 
       0x2, 0x2, 0x108, 0x109, 0x9, 0x5, 0x2, 0x2, 0x109, 0x114, 0x5, 0x2c, 
       0x17, 0xd, 0x10a, 0x10b, 0xc, 0xb, 0x2, 0x2, 0x10b, 0x10c, 0x7, 0x5, 
       0x2, 0x2, 0x10c, 0x114, 0x5, 0x2c, 0x17, 0xc, 0x10d, 0x10e, 0xc, 
       0xa, 0x2, 0x2, 0x10e, 0x10f, 0x7, 0x4, 0x2, 0x2, 0x10f, 0x114, 0x5, 
       0x2c, 0x17, 0xb, 0x110, 0x111, 0xc, 0x3, 0x2, 0x2, 0x111, 0x112, 
       0x7, 0x3, 0x2, 0x2, 0x112, 0x114, 0x5, 0x2c, 0x17, 0x4, 0x113, 0xfb, 
       0x3, 0x2, 0x2, 0x2, 0x113, 0xfe, 0x3, 0x2, 0x2, 0x2, 0x113, 0x101, 
       0x3, 0x2, 0x2, 0x2, 0x113, 0x104, 0x3, 0x2, 0x2, 0x2, 0x113, 0x107, 
       0x3, 0x2, 0x2, 0x2, 0x113, 0x10a, 0x3, 0x2, 0x2, 0x2, 0x113, 0x10d, 
       0x3, 0x2, 0x2, 0x2, 0x113, 0x110, 0x3, 0x2, 0x2, 0x2, 0x114, 0x117, 
       0x3, 0x2, 0x2, 0x2, 0x115, 0x113, 0x3, 0x2, 0x2, 0x2, 0x115, 0x116, 
       0x3, 0x2, 0x2, 0x2, 0x116, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x117, 0x115, 
       0x3, 0x2, 0x2, 0x2, 0x118, 0x119, 0x5, 0x2c, 0x17, 0x2, 0x119, 0x11a, 
       0x7, 0x14, 0x2, 0x2, 0x11a, 0x11b, 0x5, 0x2c, 0x17, 0x2, 0x11b, 0x2f, 
       0x3, 0x2, 0x2, 0x2, 0x11c, 0x11d, 0x7, 0x17, 0x2, 0x2, 0x11d, 0x11e, 
       0x5, 0x2c, 0x17, 0x2, 0x11e, 0x11f, 0x7, 0x18, 0x2, 0x2, 0x11f, 0x124, 
       0x3, 0x2, 0x2, 0x2, 0x120, 0x124, 0x7, 0x29, 0x2, 0x2, 0x121, 0x124, 
       0x7, 0x28, 0x2, 0x2, 0x122, 0x124, 0x7, 0x2b, 0x2, 0x2, 0x123, 0x11c, 
       0x3, 0x2, 0x2, 0x2, 0x123, 0x120, 0x3, 0x2, 0x2, 0x2, 0x123, 0x121, 
       0x3, 0x2, 0x2, 0x2, 0x123, 0x122, 0x3, 0x2, 0x2, 0x2, 0x124, 0x31, 
       0x3, 0x2, 0x2, 0x2, 0x19, 0x37, 0x45, 0x4a, 0x53, 0x65, 0x6a, 0x70, 
       0x7a, 0x7e, 0x84, 0x88, 0x91, 0xa8, 0xac, 0xbd, 0xd5, 0xd9, 0xe2, 
       0xe6, 0xf9, 0x113, 0x115, 0x123, 
  };

  _serializedATN.insert(_serializedATN.end(), serializedATNSegment0,
    serializedATNSegment0 + sizeof(serializedATNSegment0) / sizeof(serializedATNSegment0[0]));


  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

t2lParser::Initializer t2lParser::_init;
