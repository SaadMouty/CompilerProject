lexer grammar LexerFile;

// --- Default Mode (HTML Content) ---
OPEN_JINJA_PRINT : '{{' -> pushMode(JINJA_MODE);
OPEN_JINJA_STMT  : '{%' -> pushMode(JINJA_MODE);

// حل مشكلة الستايل: التقاط الوسم كاملاً مع خصائصه ثم الانتقال لوضع CSS مباشرة
// هذا يمنع التداخل مع وضع التاج العادي
OPEN_STYLE_BLOCK : '<style' ~[>]* '>' -> pushMode(CSS_MODE);

HTML_TAG_OPEN    : '<' -> pushMode(HTML_TAG_MODE);
HTML_TAG_CLOSE   : '</' -> pushMode(HTML_TAG_MODE);

// تخطي المسافات في الوضع العادي ضروري أحياناً لكن في HTML نحتاج النص
HTML_TEXT        : ~[<{]+;

// --- HTML Tag Mode (Inside <...>) ---
mode HTML_TAG_MODE;
TAG_CLOSE_SYMBOL : '>' -> popMode;
TAG_SLASH_CLOSE  : '/>' -> popMode;
EQUALS           : '=';
TAG_NAME         : [a-zA-Z0-9]+;
ATTR_NAME        : [a-zA-Z-]+;
ATTR_VALUE       : '"' .*? '"' | '\'' .*? '\'';
// [هام جداً] هذا السطر يحل مشكلة <divclass لأنه يمسح المسافات داخل التاج
WS_TAG           : [ \t\r\n]+ -> skip;

// --- CSS Mode (Inside <style>...</style>) ---
mode CSS_MODE;
CLOSE_STYLE      : '</style>' -> popMode;
CSS_ID           : '#' [a-zA-Z0-9_-]+;
CSS_CLASS        : '.' [a-zA-Z0-9_-]+;
LBRACE           : '{';
RBRACE           : '}';
COLON            : ':';
SEMICOLON        : ';';
CSS_PROP         : [a-zA-Z-]+;
// تعديل لاستيعاب القيم التي تحتوي مسافات أو أرقام وألوان
CSS_VAL          : ~[;{}<]+;
// [هام جداً] هذا السطر يحل مشكلة token error at {
WS_CSS           : [ \t\r\n]+ -> skip;

// --- Jinja Mode ---
mode JINJA_MODE;
CLOSE_JINJA_PRINT : '}}' -> popMode;
CLOSE_JINJA_STMT  : '%}' -> popMode;

IF      : 'if';
ELSE    : 'else';
ENDIF   : 'endif';
FOR     : 'for';
IN      : 'in';
ENDFOR  : 'endfor';
EXTENDS : 'extends';
BLOCK   : 'block';
ENDBLOCK: 'endblock';

// Operators & Punctuation
ASSIGN  : '=';
DOT     : '.';
PIPE    : '|';
EQ      : '==';
NEQ     : '!=';
GT      : '>';
LT      : '<';
LPAREN  : '(';
RPAREN  : ')';

ID      : [a-zA-Z_][a-zA-Z0-9_]*;
STRING  : '"' .*? '"' | '\'' .*? '\'';
NUMBER  : [0-9]+;
WS_JINJA: [ \t\r\n]+ -> skip;

mode JINJA_COMMENT_MODE;
CLOSE_COMMENT : '#}' -> popMode;
COMMENT_TEXT  : . -> skip;