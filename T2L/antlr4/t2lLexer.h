
// Generated from ..\t2l.g4 by ANTLR 4.10.1

#pragma once


#include "antlr4-runtime.h"




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

  ~t2lLexer() override;


  std::string getGrammarFileName() const override;

  const std::vector<std::string>& getRuleNames() const override;

  const std::vector<std::string>& getChannelNames() const override;

  const std::vector<std::string>& getModeNames() const override;

  const antlr4::dfa::Vocabulary& getVocabulary() const override;

  antlr4::atn::SerializedATNView getSerializedATN() const override;

  const antlr4::atn::ATN& getATN() const override;

  // By default the static state used to implement the lexer is lazily initialized during the first
  // call to the constructor. You can call this function if you wish to initialize the static state
  // ahead of time.
  static void initialize();

private:

  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

};

