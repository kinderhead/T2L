
// Generated from ..\t2l.g4 by ANTLR 4.10.1


#include "t2lListener.h"
#include "t2lVisitor.h"

#include "t2lParser.h"


using namespace antlrcpp;

using namespace antlr4;

namespace {

struct T2lParserStaticData final {
  T2lParserStaticData(std::vector<std::string> ruleNames,
                        std::vector<std::string> literalNames,
                        std::vector<std::string> symbolicNames)
      : ruleNames(std::move(ruleNames)), literalNames(std::move(literalNames)),
        symbolicNames(std::move(symbolicNames)),
        vocabulary(this->literalNames, this->symbolicNames) {}

  T2lParserStaticData(const T2lParserStaticData&) = delete;
  T2lParserStaticData(T2lParserStaticData&&) = delete;
  T2lParserStaticData& operator=(const T2lParserStaticData&) = delete;
  T2lParserStaticData& operator=(T2lParserStaticData&&) = delete;

  std::vector<antlr4::dfa::DFA> decisionToDFA;
  antlr4::atn::PredictionContextCache sharedContextCache;
  const std::vector<std::string> ruleNames;
  const std::vector<std::string> literalNames;
  const std::vector<std::string> symbolicNames;
  const antlr4::dfa::Vocabulary vocabulary;
  antlr4::atn::SerializedATNView serializedATN;
  std::unique_ptr<antlr4::atn::ATN> atn;
};

std::once_flag t2lParserOnceFlag;
T2lParserStaticData *t2lParserStaticData = nullptr;

void t2lParserInitialize() {
  assert(t2lParserStaticData == nullptr);
  auto staticData = std::make_unique<T2lParserStaticData>(
    std::vector<std::string>{
      "start", "block", "stat", "class_stat_block", "call_stat", "func_stat", 
      "t2l_return", "class_stat", "params", "def_params", "var", "index", 
      "import_stat", "if_stat", "elseIfStat", "elseStat", "cond", "stat_block", 
      "while_stat", "for_loop_stat", "expr", "pair", "atom"
    },
    std::vector<std::string>{
      "", "'.'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", 
      "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "';'", "':'", "'='", 
      "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'if'", "'else'", 
      "'while'", "'for'", "'in'", "'func'", "'return'", "'class'", "'new'", 
      "'import'", "'jimport'"
    },
    std::vector<std::string>{
      "", "", "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", 
      "MINUS", "MULT", "DIV", "MOD", "POW", "NOT", "SCOL", "COL", "ASSIGN", 
      "COMMA", "OPAR", "CPAR", "OBRACE", "CBRACE", "OSQUARE", "CSQUARE", 
      "IF", "ELSE", "WHILE", "FOR", "IN", "FUNC", "T2L_RETURN", "CLASS", 
      "NEW", "IMPORT", "JIMPORT", "ID", "INT", "DOC", "STRING", "COMMENT", 
      "SPACE"
    }
  );
  static const int32_t serializedATNSegment[] = {
  	4,1,43,287,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,
  	7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,7,
  	14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,7,20,2,21,7,
  	21,2,22,7,22,1,0,1,0,1,1,5,1,50,8,1,10,1,12,1,53,9,1,1,2,1,2,1,2,1,2,
  	1,2,1,2,1,2,1,2,1,2,1,2,3,2,65,8,2,1,3,1,3,1,3,3,3,70,8,3,1,4,1,4,1,4,
  	1,4,1,4,1,4,1,5,3,5,79,8,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,
  	6,1,7,1,7,1,7,1,7,1,7,5,7,97,8,7,10,7,12,7,100,9,7,1,7,1,7,3,7,104,8,
  	7,1,7,1,7,5,7,108,8,7,10,7,12,7,111,9,7,1,7,1,7,1,8,1,8,1,8,5,8,118,8,
  	8,10,8,12,8,121,9,8,1,8,3,8,124,8,8,1,9,1,9,5,9,128,8,9,10,9,12,9,131,
  	9,9,1,9,3,9,134,8,9,1,10,1,10,1,10,1,10,1,10,1,10,1,10,3,10,143,8,10,
  	1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,12,1,12,1,12,1,12,1,13,1,13,
  	1,13,5,13,160,8,13,10,13,12,13,163,9,13,1,13,3,13,166,8,13,1,14,1,14,
  	1,14,1,14,1,15,1,15,1,15,1,16,1,16,1,16,1,17,1,17,1,17,1,17,1,17,3,17,
  	183,8,17,1,18,1,18,1,18,1,18,1,19,1,19,1,19,1,19,1,19,1,19,1,20,1,20,
  	1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,5,20,205,8,20,10,20,12,20,208,
  	9,20,1,20,3,20,211,8,20,1,20,1,20,1,20,1,20,1,20,5,20,218,8,20,10,20,
  	12,20,221,9,20,1,20,3,20,224,8,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,
  	1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,3,20,243,8,20,1,20,
  	1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,
  	1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,5,20,269,8,20,10,20,12,20,
  	272,9,20,1,21,1,21,1,21,1,21,1,22,1,22,1,22,1,22,1,22,1,22,1,22,3,22,
  	285,8,22,1,22,0,1,40,23,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,
  	34,36,38,40,42,44,0,4,1,0,12,14,1,0,10,11,1,0,6,9,1,0,4,5,309,0,46,1,
  	0,0,0,2,51,1,0,0,0,4,64,1,0,0,0,6,69,1,0,0,0,8,71,1,0,0,0,10,78,1,0,0,
  	0,12,87,1,0,0,0,14,91,1,0,0,0,16,123,1,0,0,0,18,133,1,0,0,0,20,142,1,
  	0,0,0,22,144,1,0,0,0,24,152,1,0,0,0,26,156,1,0,0,0,28,167,1,0,0,0,30,
  	171,1,0,0,0,32,174,1,0,0,0,34,182,1,0,0,0,36,184,1,0,0,0,38,188,1,0,0,
  	0,40,242,1,0,0,0,42,273,1,0,0,0,44,284,1,0,0,0,46,47,3,2,1,0,47,1,1,0,
  	0,0,48,50,3,4,2,0,49,48,1,0,0,0,50,53,1,0,0,0,51,49,1,0,0,0,51,52,1,0,
  	0,0,52,3,1,0,0,0,53,51,1,0,0,0,54,65,3,20,10,0,55,65,3,26,13,0,56,65,
  	3,36,18,0,57,65,3,8,4,0,58,65,3,10,5,0,59,65,3,14,7,0,60,65,3,12,6,0,
  	61,65,3,22,11,0,62,65,3,38,19,0,63,65,3,24,12,0,64,54,1,0,0,0,64,55,1,
  	0,0,0,64,56,1,0,0,0,64,57,1,0,0,0,64,58,1,0,0,0,64,59,1,0,0,0,64,60,1,
  	0,0,0,64,61,1,0,0,0,64,62,1,0,0,0,64,63,1,0,0,0,65,5,1,0,0,0,66,70,3,
  	20,10,0,67,70,3,14,7,0,68,70,3,10,5,0,69,66,1,0,0,0,69,67,1,0,0,0,69,
  	68,1,0,0,0,70,7,1,0,0,0,71,72,5,38,0,0,72,73,5,21,0,0,73,74,3,16,8,0,
  	74,75,5,22,0,0,75,76,5,17,0,0,76,9,1,0,0,0,77,79,5,40,0,0,78,77,1,0,0,
  	0,78,79,1,0,0,0,79,80,1,0,0,0,80,81,5,32,0,0,81,82,5,38,0,0,82,83,5,21,
  	0,0,83,84,3,18,9,0,84,85,5,22,0,0,85,86,3,34,17,0,86,11,1,0,0,0,87,88,
  	5,33,0,0,88,89,3,40,20,0,89,90,5,17,0,0,90,13,1,0,0,0,91,92,5,34,0,0,
  	92,103,5,38,0,0,93,98,5,21,0,0,94,95,5,38,0,0,95,97,5,20,0,0,96,94,1,
  	0,0,0,97,100,1,0,0,0,98,96,1,0,0,0,98,99,1,0,0,0,99,101,1,0,0,0,100,98,
  	1,0,0,0,101,102,5,38,0,0,102,104,5,22,0,0,103,93,1,0,0,0,103,104,1,0,
  	0,0,104,105,1,0,0,0,105,109,5,23,0,0,106,108,3,6,3,0,107,106,1,0,0,0,
  	108,111,1,0,0,0,109,107,1,0,0,0,109,110,1,0,0,0,110,112,1,0,0,0,111,109,
  	1,0,0,0,112,113,5,24,0,0,113,15,1,0,0,0,114,115,3,40,20,0,115,116,5,20,
  	0,0,116,118,1,0,0,0,117,114,1,0,0,0,118,121,1,0,0,0,119,117,1,0,0,0,119,
  	120,1,0,0,0,120,122,1,0,0,0,121,119,1,0,0,0,122,124,3,40,20,0,123,119,
  	1,0,0,0,123,124,1,0,0,0,124,17,1,0,0,0,125,126,5,38,0,0,126,128,5,20,
  	0,0,127,125,1,0,0,0,128,131,1,0,0,0,129,127,1,0,0,0,129,130,1,0,0,0,130,
  	132,1,0,0,0,131,129,1,0,0,0,132,134,5,38,0,0,133,129,1,0,0,0,133,134,
  	1,0,0,0,134,19,1,0,0,0,135,136,5,38,0,0,136,137,5,19,0,0,137,138,3,40,
  	20,0,138,139,5,17,0,0,139,143,1,0,0,0,140,141,5,38,0,0,141,143,5,17,0,
  	0,142,135,1,0,0,0,142,140,1,0,0,0,143,21,1,0,0,0,144,145,5,38,0,0,145,
  	146,5,25,0,0,146,147,3,40,20,0,147,148,5,26,0,0,148,149,5,19,0,0,149,
  	150,3,40,20,0,150,151,5,17,0,0,151,23,1,0,0,0,152,153,5,36,0,0,153,154,
  	5,38,0,0,154,155,5,17,0,0,155,25,1,0,0,0,156,157,5,27,0,0,157,161,3,32,
  	16,0,158,160,3,28,14,0,159,158,1,0,0,0,160,163,1,0,0,0,161,159,1,0,0,
  	0,161,162,1,0,0,0,162,165,1,0,0,0,163,161,1,0,0,0,164,166,3,30,15,0,165,
  	164,1,0,0,0,165,166,1,0,0,0,166,27,1,0,0,0,167,168,5,28,0,0,168,169,5,
  	27,0,0,169,170,3,32,16,0,170,29,1,0,0,0,171,172,5,28,0,0,172,173,3,34,
  	17,0,173,31,1,0,0,0,174,175,3,40,20,0,175,176,3,34,17,0,176,33,1,0,0,
  	0,177,178,5,23,0,0,178,179,3,2,1,0,179,180,5,24,0,0,180,183,1,0,0,0,181,
  	183,3,4,2,0,182,177,1,0,0,0,182,181,1,0,0,0,183,35,1,0,0,0,184,185,5,
  	29,0,0,185,186,3,40,20,0,186,187,3,34,17,0,187,37,1,0,0,0,188,189,5,30,
  	0,0,189,190,5,38,0,0,190,191,5,31,0,0,191,192,3,40,20,0,192,193,3,34,
  	17,0,193,39,1,0,0,0,194,195,6,20,-1,0,195,196,5,11,0,0,196,243,3,40,20,
  	15,197,198,5,16,0,0,198,243,3,40,20,14,199,243,3,44,22,0,200,210,5,25,
  	0,0,201,202,3,40,20,0,202,203,5,20,0,0,203,205,1,0,0,0,204,201,1,0,0,
  	0,205,208,1,0,0,0,206,204,1,0,0,0,206,207,1,0,0,0,207,209,1,0,0,0,208,
  	206,1,0,0,0,209,211,3,40,20,0,210,206,1,0,0,0,210,211,1,0,0,0,211,212,
  	1,0,0,0,212,243,5,26,0,0,213,223,5,23,0,0,214,215,3,42,21,0,215,216,5,
  	20,0,0,216,218,1,0,0,0,217,214,1,0,0,0,218,221,1,0,0,0,219,217,1,0,0,
  	0,219,220,1,0,0,0,220,222,1,0,0,0,221,219,1,0,0,0,222,224,3,42,21,0,223,
  	219,1,0,0,0,223,224,1,0,0,0,224,225,1,0,0,0,225,243,5,24,0,0,226,227,
  	5,38,0,0,227,228,5,25,0,0,228,229,3,40,20,0,229,230,5,26,0,0,230,243,
  	1,0,0,0,231,232,5,38,0,0,232,233,5,21,0,0,233,234,3,16,8,0,234,235,5,
  	22,0,0,235,243,1,0,0,0,236,237,5,35,0,0,237,238,5,38,0,0,238,239,5,21,
  	0,0,239,240,3,16,8,0,240,241,5,22,0,0,241,243,1,0,0,0,242,194,1,0,0,0,
  	242,197,1,0,0,0,242,199,1,0,0,0,242,200,1,0,0,0,242,213,1,0,0,0,242,226,
  	1,0,0,0,242,231,1,0,0,0,242,236,1,0,0,0,243,270,1,0,0,0,244,245,10,16,
  	0,0,245,246,5,15,0,0,246,269,3,40,20,16,247,248,10,13,0,0,248,249,7,0,
  	0,0,249,269,3,40,20,14,250,251,10,12,0,0,251,252,7,1,0,0,252,269,3,40,
  	20,13,253,254,10,11,0,0,254,255,7,2,0,0,255,269,3,40,20,12,256,257,10,
  	10,0,0,257,258,7,3,0,0,258,269,3,40,20,11,259,260,10,9,0,0,260,261,5,
  	3,0,0,261,269,3,40,20,10,262,263,10,8,0,0,263,264,5,2,0,0,264,269,3,40,
  	20,9,265,266,10,1,0,0,266,267,5,1,0,0,267,269,3,40,20,2,268,244,1,0,0,
  	0,268,247,1,0,0,0,268,250,1,0,0,0,268,253,1,0,0,0,268,256,1,0,0,0,268,
  	259,1,0,0,0,268,262,1,0,0,0,268,265,1,0,0,0,269,272,1,0,0,0,270,268,1,
  	0,0,0,270,271,1,0,0,0,271,41,1,0,0,0,272,270,1,0,0,0,273,274,3,40,20,
  	0,274,275,5,18,0,0,275,276,3,40,20,0,276,43,1,0,0,0,277,278,5,21,0,0,
  	278,279,3,40,20,0,279,280,5,22,0,0,280,285,1,0,0,0,281,285,5,39,0,0,282,
  	285,5,38,0,0,283,285,5,41,0,0,284,277,1,0,0,0,284,281,1,0,0,0,284,282,
  	1,0,0,0,284,283,1,0,0,0,285,45,1,0,0,0,23,51,64,69,78,98,103,109,119,
  	123,129,133,142,161,165,182,206,210,219,223,242,268,270,284
  };
  staticData->serializedATN = antlr4::atn::SerializedATNView(serializedATNSegment, sizeof(serializedATNSegment) / sizeof(serializedATNSegment[0]));

  antlr4::atn::ATNDeserializer deserializer;
  staticData->atn = deserializer.deserialize(staticData->serializedATN);

  const size_t count = staticData->atn->getNumberOfDecisions();
  staticData->decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    staticData->decisionToDFA.emplace_back(staticData->atn->getDecisionState(i), i);
  }
  t2lParserStaticData = staticData.release();
}

}

t2lParser::t2lParser(TokenStream *input) : t2lParser(input, antlr4::atn::ParserATNSimulatorOptions()) {}

t2lParser::t2lParser(TokenStream *input, const antlr4::atn::ParserATNSimulatorOptions &options) : Parser(input) {
  t2lParser::initialize();
  _interpreter = new atn::ParserATNSimulator(this, *t2lParserStaticData->atn, t2lParserStaticData->decisionToDFA, t2lParserStaticData->sharedContextCache, options);
}

t2lParser::~t2lParser() {
  delete _interpreter;
}

const atn::ATN& t2lParser::getATN() const {
  return *t2lParserStaticData->atn;
}

std::string t2lParser::getGrammarFileName() const {
  return "t2l.g4";
}

const std::vector<std::string>& t2lParser::getRuleNames() const {
  return t2lParserStaticData->ruleNames;
}

const dfa::Vocabulary& t2lParser::getVocabulary() const {
  return t2lParserStaticData->vocabulary;
}

antlr4::atn::SerializedATNView t2lParser::getSerializedATN() const {
  return t2lParserStaticData->serializedATN;
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


std::any t2lParser::StartContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitStart(this);
  else
    return visitor->visitChildren(this);
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
    setState(46);
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


std::any t2lParser::BlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitBlock(this);
  else
    return visitor->visitChildren(this);
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
    setState(51);
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
      | (1ULL << t2lParser::ID)
      | (1ULL << t2lParser::DOC))) != 0)) {
      setState(48);
      stat();
      setState(53);
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


std::any t2lParser::StatContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitStat(this);
  else
    return visitor->visitChildren(this);
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
    setState(64);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(54);
      var();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(55);
      if_stat();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(56);
      while_stat();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(57);
      call_stat();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(58);
      func_stat();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(59);
      class_stat();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(60);
      t2l_return();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(61);
      index();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(62);
      for_loop_stat();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(63);
      import_stat();
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


std::any t2lParser::Class_stat_blockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitClass_stat_block(this);
  else
    return visitor->visitChildren(this);
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
    setState(69);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case t2lParser::ID: {
        enterOuterAlt(_localctx, 1);
        setState(66);
        var();
        break;
      }

      case t2lParser::CLASS: {
        enterOuterAlt(_localctx, 2);
        setState(67);
        class_stat();
        break;
      }

      case t2lParser::FUNC:
      case t2lParser::DOC: {
        enterOuterAlt(_localctx, 3);
        setState(68);
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


std::any t2lParser::Call_statContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitCall_stat(this);
  else
    return visitor->visitChildren(this);
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
    setState(71);
    match(t2lParser::ID);
    setState(72);
    match(t2lParser::OPAR);
    setState(73);
    params();
    setState(74);
    match(t2lParser::CPAR);
    setState(75);
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

tree::TerminalNode* t2lParser::Func_statContext::OPAR() {
  return getToken(t2lParser::OPAR, 0);
}

t2lParser::Def_paramsContext* t2lParser::Func_statContext::def_params() {
  return getRuleContext<t2lParser::Def_paramsContext>(0);
}

tree::TerminalNode* t2lParser::Func_statContext::CPAR() {
  return getToken(t2lParser::CPAR, 0);
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


std::any t2lParser::Func_statContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitFunc_stat(this);
  else
    return visitor->visitChildren(this);
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
    setState(78);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == t2lParser::DOC) {
      setState(77);
      match(t2lParser::DOC);
    }
    setState(80);
    match(t2lParser::FUNC);
    setState(81);
    match(t2lParser::ID);
    setState(82);
    match(t2lParser::OPAR);
    setState(83);
    def_params();
    setState(84);
    match(t2lParser::CPAR);
    setState(85);
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


std::any t2lParser::T2l_returnContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitT2l_return(this);
  else
    return visitor->visitChildren(this);
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
    setState(87);
    match(t2lParser::T2L_RETURN);
    setState(88);
    expr(0);
    setState(89);
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


std::any t2lParser::Class_statContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitClass_stat(this);
  else
    return visitor->visitChildren(this);
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
    setState(91);
    match(t2lParser::CLASS);
    setState(92);
    match(t2lParser::ID);
    setState(103);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == t2lParser::OPAR) {
      setState(93);
      match(t2lParser::OPAR);
      setState(98);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx);
      while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1) {
          setState(94);
          match(t2lParser::ID);
          setState(95);
          match(t2lParser::COMMA); 
        }
        setState(100);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx);
      }
      setState(101);
      match(t2lParser::ID);
      setState(102);
      match(t2lParser::CPAR);
    }
    setState(105);
    match(t2lParser::OBRACE);
    setState(109);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << t2lParser::FUNC)
      | (1ULL << t2lParser::CLASS)
      | (1ULL << t2lParser::ID)
      | (1ULL << t2lParser::DOC))) != 0)) {
      setState(106);
      class_stat_block();
      setState(111);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(112);
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


std::any t2lParser::ParamsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitParams(this);
  else
    return visitor->visitChildren(this);
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
    setState(123);
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
      setState(119);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx);
      while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1) {
          setState(114);
          expr(0);
          setState(115);
          match(t2lParser::COMMA); 
        }
        setState(121);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx);
      }
      setState(122);
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

std::vector<tree::TerminalNode *> t2lParser::Def_paramsContext::ID() {
  return getTokens(t2lParser::ID);
}

tree::TerminalNode* t2lParser::Def_paramsContext::ID(size_t i) {
  return getToken(t2lParser::ID, i);
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


std::any t2lParser::Def_paramsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitDef_params(this);
  else
    return visitor->visitChildren(this);
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
    setState(133);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == t2lParser::ID) {
      setState(129);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx);
      while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1) {
          setState(125);
          match(t2lParser::ID);
          setState(126);
          match(t2lParser::COMMA); 
        }
        setState(131);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx);
      }
      setState(132);
      match(t2lParser::ID);
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


std::any t2lParser::VarContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitVar(this);
  else
    return visitor->visitChildren(this);
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
    setState(142);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(135);
      match(t2lParser::ID);
      setState(136);
      match(t2lParser::ASSIGN);
      setState(137);
      expr(0);
      setState(138);
      match(t2lParser::SCOL);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(140);
      match(t2lParser::ID);
      setState(141);
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


std::any t2lParser::IndexContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitIndex(this);
  else
    return visitor->visitChildren(this);
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
    setState(144);
    match(t2lParser::ID);
    setState(145);
    match(t2lParser::OSQUARE);
    setState(146);
    expr(0);
    setState(147);
    match(t2lParser::CSQUARE);
    setState(148);
    match(t2lParser::ASSIGN);
    setState(149);
    expr(0);
    setState(150);
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


std::any t2lParser::Import_statContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitImport_stat(this);
  else
    return visitor->visitChildren(this);
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
    setState(152);
    match(t2lParser::IMPORT);
    setState(153);
    match(t2lParser::ID);
    setState(154);
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


std::any t2lParser::If_statContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitIf_stat(this);
  else
    return visitor->visitChildren(this);
}

t2lParser::If_statContext* t2lParser::if_stat() {
  If_statContext *_localctx = _tracker.createInstance<If_statContext>(_ctx, getState());
  enterRule(_localctx, 26, t2lParser::RuleIf_stat);

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
    setState(156);
    match(t2lParser::IF);
    setState(157);
    cond();
    setState(161);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(158);
        antlrcpp::downCast<If_statContext *>(_localctx)->ElseIf = elseIfStat(); 
      }
      setState(163);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx);
    }
    setState(165);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx)) {
    case 1: {
      setState(164);
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


std::any t2lParser::ElseIfStatContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitElseIfStat(this);
  else
    return visitor->visitChildren(this);
}

t2lParser::ElseIfStatContext* t2lParser::elseIfStat() {
  ElseIfStatContext *_localctx = _tracker.createInstance<ElseIfStatContext>(_ctx, getState());
  enterRule(_localctx, 28, t2lParser::RuleElseIfStat);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(167);
    match(t2lParser::ELSE);
    setState(168);
    match(t2lParser::IF);
    setState(169);
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


std::any t2lParser::ElseStatContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitElseStat(this);
  else
    return visitor->visitChildren(this);
}

t2lParser::ElseStatContext* t2lParser::elseStat() {
  ElseStatContext *_localctx = _tracker.createInstance<ElseStatContext>(_ctx, getState());
  enterRule(_localctx, 30, t2lParser::RuleElseStat);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(171);
    match(t2lParser::ELSE);
    setState(172);
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


std::any t2lParser::CondContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitCond(this);
  else
    return visitor->visitChildren(this);
}

t2lParser::CondContext* t2lParser::cond() {
  CondContext *_localctx = _tracker.createInstance<CondContext>(_ctx, getState());
  enterRule(_localctx, 32, t2lParser::RuleCond);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(174);
    expr(0);
    setState(175);
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


std::any t2lParser::Stat_blockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitStat_block(this);
  else
    return visitor->visitChildren(this);
}

t2lParser::Stat_blockContext* t2lParser::stat_block() {
  Stat_blockContext *_localctx = _tracker.createInstance<Stat_blockContext>(_ctx, getState());
  enterRule(_localctx, 34, t2lParser::RuleStat_block);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(182);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case t2lParser::OBRACE: {
        enterOuterAlt(_localctx, 1);
        setState(177);
        match(t2lParser::OBRACE);
        setState(178);
        block();
        setState(179);
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
      case t2lParser::ID:
      case t2lParser::DOC: {
        enterOuterAlt(_localctx, 2);
        setState(181);
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


std::any t2lParser::While_statContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitWhile_stat(this);
  else
    return visitor->visitChildren(this);
}

t2lParser::While_statContext* t2lParser::while_stat() {
  While_statContext *_localctx = _tracker.createInstance<While_statContext>(_ctx, getState());
  enterRule(_localctx, 36, t2lParser::RuleWhile_stat);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(184);
    match(t2lParser::WHILE);
    setState(185);
    expr(0);
    setState(186);
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


std::any t2lParser::For_loop_statContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitFor_loop_stat(this);
  else
    return visitor->visitChildren(this);
}

t2lParser::For_loop_statContext* t2lParser::for_loop_stat() {
  For_loop_statContext *_localctx = _tracker.createInstance<For_loop_statContext>(_ctx, getState());
  enterRule(_localctx, 38, t2lParser::RuleFor_loop_stat);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(188);
    match(t2lParser::FOR);
    setState(189);
    match(t2lParser::ID);
    setState(190);
    match(t2lParser::IN);
    setState(191);
    expr(0);
    setState(192);
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

std::any t2lParser::DictionaryOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitDictionaryOp(this);
  else
    return visitor->visitChildren(this);
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

std::any t2lParser::ClassOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitClassOp(this);
  else
    return visitor->visitChildren(this);
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

std::any t2lParser::ListOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitListOp(this);
  else
    return visitor->visitChildren(this);
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

std::any t2lParser::FuncOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitFuncOp(this);
  else
    return visitor->visitChildren(this);
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

std::any t2lParser::AtomOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitAtomOp(this);
  else
    return visitor->visitChildren(this);
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

std::any t2lParser::MultiOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitMultiOp(this);
  else
    return visitor->visitChildren(this);
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

std::any t2lParser::ExprOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitExprOp(this);
  else
    return visitor->visitChildren(this);
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

std::any t2lParser::SingleOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitSingleOp(this);
  else
    return visitor->visitChildren(this);
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

std::any t2lParser::IndexOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitIndexOp(this);
  else
    return visitor->visitChildren(this);
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
  size_t startState = 40;
  enterRecursionRule(_localctx, 40, t2lParser::RuleExpr, precedence);

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
    setState(242);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
    case 1: {
      _localctx = _tracker.createInstance<SingleOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;

      setState(195);
      antlrcpp::downCast<SingleOpContext *>(_localctx)->op = match(t2lParser::MINUS);
      setState(196);
      expr(15);
      break;
    }

    case 2: {
      _localctx = _tracker.createInstance<SingleOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(197);
      antlrcpp::downCast<SingleOpContext *>(_localctx)->op = match(t2lParser::NOT);
      setState(198);
      expr(14);
      break;
    }

    case 3: {
      _localctx = _tracker.createInstance<AtomOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(199);
      atom();
      break;
    }

    case 4: {
      _localctx = _tracker.createInstance<ListOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(200);
      match(t2lParser::OSQUARE);
      setState(210);
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
        setState(206);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx);
        while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
          if (alt == 1) {
            setState(201);
            expr(0);
            setState(202);
            match(t2lParser::COMMA); 
          }
          setState(208);
          _errHandler->sync(this);
          alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx);
        }
        setState(209);
        expr(0);
      }
      setState(212);
      match(t2lParser::CSQUARE);
      break;
    }

    case 5: {
      _localctx = _tracker.createInstance<DictionaryOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(213);
      match(t2lParser::OBRACE);
      setState(223);
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
        setState(219);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx);
        while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
          if (alt == 1) {
            setState(214);
            pair();
            setState(215);
            match(t2lParser::COMMA); 
          }
          setState(221);
          _errHandler->sync(this);
          alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx);
        }
        setState(222);
        pair();
      }
      setState(225);
      match(t2lParser::CBRACE);
      break;
    }

    case 6: {
      _localctx = _tracker.createInstance<IndexOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(226);
      match(t2lParser::ID);
      setState(227);
      match(t2lParser::OSQUARE);
      setState(228);
      expr(0);
      setState(229);
      match(t2lParser::CSQUARE);
      break;
    }

    case 7: {
      _localctx = _tracker.createInstance<FuncOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(231);
      match(t2lParser::ID);
      setState(232);
      match(t2lParser::OPAR);
      setState(233);
      params();
      setState(234);
      match(t2lParser::CPAR);
      break;
    }

    case 8: {
      _localctx = _tracker.createInstance<ClassOpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(236);
      match(t2lParser::NEW);
      setState(237);
      match(t2lParser::ID);
      setState(238);
      match(t2lParser::OPAR);
      setState(239);
      params();
      setState(240);
      match(t2lParser::CPAR);
      break;
    }

    default:
      break;
    }
    _ctx->stop = _input->LT(-1);
    setState(270);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(268);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
        case 1: {
          auto newContext = _tracker.createInstance<ExprOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          newContext->left = previousContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(244);

          if (!(precpred(_ctx, 16))) throw FailedPredicateException(this, "precpred(_ctx, 16)");
          setState(245);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->op = match(t2lParser::POW);
          setState(246);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->right = expr(16);
          break;
        }

        case 2: {
          auto newContext = _tracker.createInstance<ExprOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          newContext->left = previousContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(247);

          if (!(precpred(_ctx, 13))) throw FailedPredicateException(this, "precpred(_ctx, 13)");
          setState(248);
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
          setState(249);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->right = expr(14);
          break;
        }

        case 3: {
          auto newContext = _tracker.createInstance<ExprOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          newContext->left = previousContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(250);

          if (!(precpred(_ctx, 12))) throw FailedPredicateException(this, "precpred(_ctx, 12)");
          setState(251);
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
          setState(252);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->right = expr(13);
          break;
        }

        case 4: {
          auto newContext = _tracker.createInstance<ExprOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          newContext->left = previousContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(253);

          if (!(precpred(_ctx, 11))) throw FailedPredicateException(this, "precpred(_ctx, 11)");
          setState(254);
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
          setState(255);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->right = expr(12);
          break;
        }

        case 5: {
          auto newContext = _tracker.createInstance<ExprOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          newContext->left = previousContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(256);

          if (!(precpred(_ctx, 10))) throw FailedPredicateException(this, "precpred(_ctx, 10)");
          setState(257);
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
          setState(258);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->right = expr(11);
          break;
        }

        case 6: {
          auto newContext = _tracker.createInstance<ExprOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          newContext->left = previousContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(259);

          if (!(precpred(_ctx, 9))) throw FailedPredicateException(this, "precpred(_ctx, 9)");
          setState(260);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->op = match(t2lParser::AND);
          setState(261);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->right = expr(10);
          break;
        }

        case 7: {
          auto newContext = _tracker.createInstance<ExprOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          newContext->left = previousContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(262);

          if (!(precpred(_ctx, 8))) throw FailedPredicateException(this, "precpred(_ctx, 8)");
          setState(263);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->op = match(t2lParser::OR);
          setState(264);
          antlrcpp::downCast<ExprOpContext *>(_localctx)->right = expr(9);
          break;
        }

        case 8: {
          auto newContext = _tracker.createInstance<MultiOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(265);

          if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
          setState(266);
          match(t2lParser::T__0);
          setState(267);
          expr(2);
          break;
        }

        default:
          break;
        } 
      }
      setState(272);
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


std::any t2lParser::PairContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitPair(this);
  else
    return visitor->visitChildren(this);
}

t2lParser::PairContext* t2lParser::pair() {
  PairContext *_localctx = _tracker.createInstance<PairContext>(_ctx, getState());
  enterRule(_localctx, 42, t2lParser::RulePair);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(273);
    antlrcpp::downCast<PairContext *>(_localctx)->key = expr(0);
    setState(274);
    match(t2lParser::COL);
    setState(275);
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

std::any t2lParser::IDAtomContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitIDAtom(this);
  else
    return visitor->visitChildren(this);
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

std::any t2lParser::StringAtomContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitStringAtom(this);
  else
    return visitor->visitChildren(this);
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

std::any t2lParser::ParenAtomContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitParenAtom(this);
  else
    return visitor->visitChildren(this);
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

std::any t2lParser::IntAtomContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<t2lVisitor*>(visitor))
    return parserVisitor->visitIntAtom(this);
  else
    return visitor->visitChildren(this);
}
t2lParser::AtomContext* t2lParser::atom() {
  AtomContext *_localctx = _tracker.createInstance<AtomContext>(_ctx, getState());
  enterRule(_localctx, 44, t2lParser::RuleAtom);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(284);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case t2lParser::OPAR: {
        _localctx = _tracker.createInstance<t2lParser::ParenAtomContext>(_localctx);
        enterOuterAlt(_localctx, 1);
        setState(277);
        match(t2lParser::OPAR);
        setState(278);
        expr(0);
        setState(279);
        match(t2lParser::CPAR);
        break;
      }

      case t2lParser::INT: {
        _localctx = _tracker.createInstance<t2lParser::IntAtomContext>(_localctx);
        enterOuterAlt(_localctx, 2);
        setState(281);
        match(t2lParser::INT);
        break;
      }

      case t2lParser::ID: {
        _localctx = _tracker.createInstance<t2lParser::IDAtomContext>(_localctx);
        enterOuterAlt(_localctx, 3);
        setState(282);
        match(t2lParser::ID);
        break;
      }

      case t2lParser::STRING: {
        _localctx = _tracker.createInstance<t2lParser::StringAtomContext>(_localctx);
        enterOuterAlt(_localctx, 4);
        setState(283);
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
    case 20: return exprSempred(antlrcpp::downCast<ExprContext *>(context), predicateIndex);

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

void t2lParser::initialize() {
  std::call_once(t2lParserOnceFlag, t2lParserInitialize);
}
