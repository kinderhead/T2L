#pragma once

#include "utils.h"
#include "antlr4/t2lBaseVisitor.h"

class Visitor : public t2lBaseVisitor
{
public:
	any visitVar(t2lParser::VarContext* ctx) override;
};

