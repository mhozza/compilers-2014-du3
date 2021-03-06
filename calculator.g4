grammar calculator;

init: statements;

statements: statement (NEWLINE statement)*;

statement:
     lvalue ASSIGN expression                           # Assign
     | expression                                       # Print
     | BLOCK_START statements BLOCK_END                 # Block
     | IF expression ':' tr=statement (ELSE fa=statement)?  # If
     | WHILE expression statement                       # While
     |                                                  # Emp
     ;

lvalue: STRING;
expression:
     op=('-'|'+') expression                             # Una
     | expression op=EXP<assoc=right> expression         # Exp
     | expression op=(DIV|MUL) expression                # Mul
     | expression op=(ADD|SUB) expression                # Add
     | op=NOT expression                                 # Not
     | expression op=AND expression                      # And
     | expression op=OR expression                       # Or
     | PAREN_OPEN expression PAREN_CLOSE                 # Par
     | STRING                                            # Var
     | INT                                               # Int
     ;

INT: DIGIT+;
FLOAT: DIGIT+ '.' DIGIT*;
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
EXP: '^';
WHITESPACE: [ \t] -> skip;
NEWLINE: '\n';
ASSIGN: '=';
BLOCK_START: '{';
BLOCK_END: '}';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
AND: 'and';
OR: 'or';
NOT: 'not';
PAREN_OPEN: '(';
PAREN_CLOSE: ')';
STRING: [a-zA-Z][a-zA-Z0-9]*;

fragment DIGIT: [0-9];
