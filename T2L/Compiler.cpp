#include "Compiler.h"

#include "t2lLexer.h"
#include "t2lParser.h"

#include "Listener.h"

Compiler::Compiler(string filepath)
{
	ifstream stream;
	stream.open(filepath);

	ANTLRInputStream input(stream);
	t2lLexer lexer(&input);
	CommonTokenStream tokens(&lexer);
	t2lParser parser(&tokens);

	tree::ParseTree* tree = parser.start();
	Listener listener;
	tree::ParseTreeWalker::DEFAULT.walk(&listener, tree);

	stream.close();
}
