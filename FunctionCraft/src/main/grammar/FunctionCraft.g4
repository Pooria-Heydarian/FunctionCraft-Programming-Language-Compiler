grammar FunctionCraft;

program:(INLINECOMMENT | MULLINECOMMENT | function | NEWLINE | pattern ) * main blabla;
blabla:(MULLINECOMMENT | INLINECOMMENT | NEWLINE)* ;
function: //check
         DEF name=IDENTIFIER {System.out.println("FuncDec: " + $name.text);}
         LPAR (optional | params (COMMA optional)?)? RPAR body_func END;
lambda: //CHECKED
        MAP {System.out.println("Structure: LAMBDA");}
        LPAR params RPAR LBRACE RETURN {System.out.println("RETURN");} ret_exp SEMICOLON RBRACE (LPAR exp (COMMA exp)* RPAR)? ;
list: //checked
     LBRAK ((list | exp) (COMMA (list | exp))*)? RBRAK;


pattern:
        PATTERN name = IDENTIFIER {System.out.println("PatternDec: " + $name.text);} LPAR params RPAR (NEWLINE CASE LPAR (condi|logic_exp) RPAR ASSIGN exp)+ (NEWLINE)+ SEMICOLON;

main: // checked
     DEF MAIN {System.out.println("MAIN");}
     LPAR RPAR  body_func  END;

params: // checked
       IDENTIFIER (COMMA IDENTIFIER)*;

optional:// checked
         LBRAK IDENTIFIER ASSIGN exp (COMMA IDENTIFIER ASSIGN exp)* RBRAK ;
exp: //CHECKED
    exp name = (MINUS | PLUS | DIV | MULTI | REMAIN) exp {System.out.println("Operator: " + $name.text);}|
    name = MINUS {System.out.println("Operator: " + $name.text);} exp|
    exp name = INC {System.out.println("Operator: " + $name.text);}|
    exp name = DEC {System.out.println("Operator: " + $name.text);}|
    IDENTIFIER (LBRAK exp RBRAK)+| LPAR exp RPAR|
    STRING| TURE| FALSE FLOAT | INT_VAL | function_call | list | IDENTIFIER;
/*operand: //CHECHED
        name = MINUS {System.out.println("Operator: " + $name.text);}|
        name = PLUS {System.out.println("Operator: " + $name.text);}|
        name = DIV {System.out.println("Operator: " + $name.text);}|
        name = MULTI {System.out.println("Operator: " + $name.text);}|
        name = REMAIN {System.out.println("Operator: " + $name.text);};*/
logic_exp: //CHECKED
          exp  compare  exp  | exp;
compare: // CHECKED
        name = EQL {System.out.println("Operator: " + $name.text);}|
        name = NEQ {System.out.println("Operator: " + $name.text);}|
        name = GEQ {System.out.println("Operator: " + $name.text);}|
        name = LEQ {System.out.println("Operator: " + $name.text);}|
        name = LES {System.out.println("Operator: " + $name.text);}|
        name = GTR {System.out.println("Operator: " + $name.text);};

function_call: //checked
              built_in LPAR (ret_exp(COMMA ret_exp)*) RPAR|
              IDENTIFIER {System.out.println("FunctionCall");}LPAR (ret_exp (COMMA ret_exp)*)? RPAR|
              IDENTIFIER DOT MATCH {System.out.println("Bulit-In: MATCH");} LPAR (ret_exp(COMMA ret_exp)*) RPAR;
condi: // CHECKED
      LPAR((logic_exp) | condi)RPAR comp LPAR (logic_exp) RPAR |
      name = NOT {System.out.println("Operator: " + $name.text);} LPAR (condi|logic_exp) RPAR|
       TURE | FALSE;
const: //CHECKED
      STRING | INT_VAL | FLOAT | TURE |FALSE | list | func_ptr;
func_ptr: // CHECKD
         METHOD LPAR COLON IDENTIFIER RPAR;

comp: //CHECKED
     name = AND {System.out.println("Operator: " + $name.text);}|
     name = OR {System.out.println("Operator: " + $name.text);};
body_func://check
          ((function_call | assign | append  ) SEMICOLON  | ifcondi | loop | INLINECOMMENT | MULLINECOMMENT| NEWLINE)* ((RETURN {System.out.println("RETURN");} ret_exp)SEMICOLON)?  blabla ;
ret_exp:// checked
        (condi | logic_exp | exp | lambda|append) | LPAR(condi | logic_exp | exp | lambda|append)RPAR;
assign: //CHECHED
       name = IDENTIFIER {System.out.println("Assignment: " + $name.text);} assignment (exp|func_ptr);

assignment://CHECHED
           ASSIGN | PASSIGN | MASSIGN | OASSIGN | DASSIGN | RASSIGN ;
append:// CHECKED
       (IDENTIFIER (LBRAK exp RBRAK)*| STRING) name = APPEND {System.out.println("Operator: " + $name.text);}
       exp (name = APPEND {System.out.println("Operator: " + $name.text);} exp)*;
ifcondi:
        IF {System.out.println("Decision: IF");} LPAR (condi|logic_exp) RPAR body_func
        (ELSEIF {System.out.println("Decision: ELSE IF");} LPAR (condi|logic_exp) RPAR body_func)*
        (ELSE {System.out.println("Decision: ELSE");} body_func)? END;

loop:
     forin | loopdo ;
loopdo:
       LOOP DO {System.out.println("Loop: DO");} bodyloop END;
bodyloop:
         ((function_call| for_condi | assign | append  ) SEMICOLON  | ifcondi | loop | INLINECOMMENT | MULLINECOMMENT| NEWLINE)+ ;
forin:
      FOR {System.out.println("Loop: FOR");} IDENTIFIER IN range bodyloop END;
range:
      LPAR(INT_VAL DDOT INT_VAL)RPAR | list;
built_in:
         PUTS {System.out.println("Bulit-In: PUTS");}|
         PUSH {System.out.println("Bulit-In: PUSH");}|
         LEN {System.out.println("Bulit-In: LEN");}|
         CHOMP {System.out.println("Bulit-In: CHOMP");}|
         CHOP {System.out.println("Bulit-In: CHOP");};
for_condi:
          (NEXT {System.out.println("Control: NEXT");}|
          BREAK {System.out.println("Control: BREAK");})
           IF LPAR (condi|logic_exp) RPAR|
           NEXT {System.out.println("Control: NEXT");}|
           BREAK {System.out.println("Control: BREAK");};










INT_VAL: [1-9][0-9]* | '0' ;
FLOAT: INT_VAL? DOT '0'* INT_VAL;

// SYMBOLS
LPAR: '(';
RPAR: ')';
LBRAK: '[';
RBRAK: ']';
COMMA: ',';
DOT: '.';
DDOT: '..';
COLON: ':';
SEMICOLON: ';';


// arthimitic operandS
PLUS: '+';
MINUS: '-';
MULTI: '*';
DIV: '/';
INC: '++';
DEC: '--';
REMAIN: '%';

// COMPARING OPERANDS
GEQ: '>=';
LEQ: '<=';
GTR: '>';
LES: '<';
EQL: '==';
NEQ: '!=';

// LOGICAL OPERANDS
AND: '&&';
OR: '||';
NOT: '!';

// APPEND OPERANDS
APPEND: '<<';

// ASSIGNMENT OPERANDS
ASSIGN: '=';
PASSIGN: '+=';
MASSIGN: '-=';
OASSIGN: '*=';
DASSIGN: '/=';
RASSIGN: '%=';

// PATERN MATCHING
CASE: '    |';
PATTERN: 'pattern';
MATCH: 'match';

// FUNCTIONS
DEF: 'def';
END: 'end';
RETURN: 'return';
METHOD:'method';

// DEFINED FUNCTIONAS
MAP: '->';
LEN:'len';
CHOP: 'chop';
CHOMP: 'chomp';
PUSH: 'push';
PUTS:'puts';
MAIN : 'main';
LBRACE: '{';
RBRACE: '}';

// LOOP LEXER
LOOP:'loop';
DO: 'do';
FOR: 'for';
IN: 'in';
NEXT: 'next';
BREAK: 'break';

// CONDITIONAL OPERAND
IF: 'if';
ELSE: 'else';
ELSEIF: 'elseif';
TURE: 'true';
FALSE: 'false';

//NAMING
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*; // remove keyword i don know how ?! search later ( SOLVED)

// COMMENTS
STRING: '"' ~('"')* '"' ;
NEWLINE: [\r\n]+;
INLINECOMMENT: '#' ~[\r\n]* -> skip;
MULLINECOMMENT: '=begin' [\r\n]+ (.)*? [\r\n]+ '=end' -> skip; // not sure
SPACE:  ' ' -> skip;


