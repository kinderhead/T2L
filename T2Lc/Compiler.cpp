#include "Compiler.h"

#include <sstream>

#include "antlr4/t2lLexer.h"
#include "antlr4/t2lParser.h"

#include "Visitor.h"

Compiler::Compiler(string code)
{
	stringstream stream(code);

	ANTLRInputStream input(stream);
	t2lLexer lexer(&input);
	CommonTokenStream tokens(&lexer);
	t2lParser parser(&tokens);

	tree::ParseTree* tree = parser.start();
	Visitor visitor;
	visitor.visit(tree);
}
