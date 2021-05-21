grammar t2l;

start: block;

block: stat*;

stat
    : var
    | if_stat
    | while_stat
    | call_stat
    | func_stat
    | class_stat
    | t2l_return
    | index
    | for_loop_stat
    | import_stat
    ;

class_stat_block
    : var
    | class_stat
    | func_stat
    ;

call_stat
    : ID OPAR params CPAR SCOL
    ;

func_stat
    : FUNC ID def_params stat_block
    ;

t2l_return
    : T2L_RETURN expr SCOL
    ;

class_stat
    : CLASS ID (OPAR (ID COMMA)* ID CPAR)? OBRACE class_stat_block* CBRACE
    ;

params
    : ((expr COMMA)* expr)?
    ;

def_params
    : ((STRING COMMA)* STRING)?
    ;

var
    : ID ASSIGN expr SCOL
    | ID SCOL
    ;

index
    : ID OSQUARE expr CSQUARE ASSIGN expr SCOL
    ;

import_stat
    : IMPORT ID SCOL
    ;

if_stat
    : IF cond (ElseIf=elseIfStat)* (Else=elseStat)?
    ;

elseIfStat
    : ELSE IF cond
    ;

elseStat
    : ELSE stat_block
    ;

cond
    : expr stat_block
    ;

stat_block
    : OBRACE block CBRACE
    | stat
    ;

while_stat
    : WHILE expr stat_block
    ;

for_loop_stat
    : FOR ID IN expr stat_block
    ;

expr
    : <assoc=right> left=expr op=POW right=expr       #ExprOp
    | op=MINUS expr                                   #SingleOp
    | op=NOT expr                                     #SingleOp
    | left=expr op=(MULT | DIV | MOD) right=expr      #ExprOp
    | left=expr op=(PLUS | MINUS) right=expr          #ExprOp
    | left=expr op=(LTEQ | GTEQ | LT | GT) right=expr #ExprOp
    | left=expr op=(EQ | NEQ) right=expr              #ExprOp
    | left=expr op=AND right=expr                     #ExprOp
    | left=expr op=OR right=expr                      #ExprOp
    | atom                                            #AtomOp
    | OSQUARE ((expr COMMA)* expr)? CSQUARE           #ListOp
    | OBRACE ((pair COMMA)* pair)? CBRACE             #DictionaryOp
    | ID OSQUARE expr CSQUARE                         #IndexOp
    | ID OPAR params CPAR                             #FuncOp
    | NEW ID OPAR params CPAR                         #ClassOp
    ;

pair
    : key=expr COL value=expr
    ;

atom
    : OPAR expr CPAR #ParenAtom
    | INT            #IntAtom
    | ID             #IDAtom
    | STRING         #StringAtom
    ;

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
NOT : '!';

SCOL : ';';
COL : ':';
ASSIGN : '=';
COMMA : ',';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';
OSQUARE : '[';
CSQUARE : ']';

IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
IN : 'in';
FUNC : 'func';
T2L_RETURN : 'return';
CLASS : 'class';
NEW : 'new';
IMPORT : 'import';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 | (([a-zA-Z_] [a-zA-Z_0-9]*) '.')* [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 | [0-9]+ '.' [0-9]* 
 | '.' [0-9]+
 | '-'[0-9]+
 | '-'[0-9]+ '.' [0-9]* 
 | '-.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '#' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;
