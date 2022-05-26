
// Generated from t2l.g4 by ANTLR 4.9.3

#pragma once


#include "antlr4-runtime/antlr4-runtime.h"




class  t2lLexer : public antlr4::Lexer {
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

  explicit t2lLexer(antlr4::CharStream *input);
  ~t2lLexer();

  virtual std::string getGrammarFileName() const override;
  virtual const std::vector<std::string>& getRuleNames() const override;

  virtual const std::vector<std::string>& getChannelNames() const override;
  virtual const std::vector<std::string>& getModeNames() const override;
  virtual const std::vector<std::string>& getTokenNames() const override; // deprecated, use vocabulary instead
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;

  virtual const std::vector<uint16_t> getSerializedATN() const override;
  virtual const antlr4::atn::ATN& getATN() const override;

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;
  static std::vector<std::string> _channelNames;
  static std::vector<std::string> _modeNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

