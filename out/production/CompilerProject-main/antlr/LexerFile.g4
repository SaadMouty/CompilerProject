lexer grammar LexerFile;


/* Keywords */
PRODUCT     : 'product';
IMAGE       : 'image';
NAME        : 'name';
PRICE       : 'price';
DETAILS     : 'details';

/* Symbols */
LBRACE      : '{';
RBRACE      : '}';
EQUALS      : '=';

/* Literals */
STRING      : '"' (~["\r\n])* '"';
NUMBER      : [0-9]+;

/* Ignore */
WS          : [ \t\r\n]+ -> skip;
