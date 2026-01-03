parser grammar ParserFile;
options { tokenVocab = LexerFile; }

file : elements EOF;

elements : element* ;

element
    : HTML_TEXT                 #ElementText
    | htmlTag                   #ElementHtmlTag
    | cssBlock                  #ElementCss
    | jinjaStatement            #ElementJinjaStmt
    | jinjaPrint                #ElementJinjaPrint
    ;

// تم تبسيط القواعد لتسهيل عمل Visitor وتجنب الأخطاء
htmlTag
    : HTML_TAG_OPEN TAG_NAME attribute* TAG_CLOSE_SYMBOL elements (HTML_TAG_CLOSE TAG_NAME TAG_CLOSE_SYMBOL)? #HtmlPairTag
    | HTML_TAG_OPEN TAG_NAME attribute* TAG_SLASH_CLOSE #HtmlSelfClosingTag
    ;

attribute
    : ATTR_NAME EQUALS ATTR_VALUE       #AttrString
    | ATTR_NAME EQUALS jinjaPrint       #AttrJinja
    ;

cssBlock
    // استخدام الرمز الجديد الذي يلتقط <style> أو <style type="...">
    : OPEN_STYLE_BLOCK cssRule* CLOSE_STYLE
    ;

cssRule
    : cssSelector LBRACE cssDeclaration* RBRACE
    ;

cssSelector
    : CSS_ID | CSS_CLASS | TAG_NAME
    ;

cssDeclaration
    : CSS_PROP COLON CSS_VAL SEMICOLON
    ;

jinjaPrint
    : OPEN_JINJA_PRINT expression CLOSE_JINJA_PRINT
    ;

jinjaStatement
    : OPEN_JINJA_STMT FOR ID IN expression CLOSE_JINJA_STMT elements OPEN_JINJA_STMT ENDFOR CLOSE_JINJA_STMT #JinjaFor
    | OPEN_JINJA_STMT IF expression CLOSE_JINJA_STMT elements (OPEN_JINJA_STMT ELSE CLOSE_JINJA_STMT elements)? OPEN_JINJA_STMT ENDIF CLOSE_JINJA_STMT #JinjaIf
    | OPEN_JINJA_STMT EXTENDS STRING CLOSE_JINJA_STMT #JinjaExtends
    | OPEN_JINJA_STMT BLOCK ID CLOSE_JINJA_STMT elements OPEN_JINJA_STMT ENDBLOCK CLOSE_JINJA_STMT #JinjaBlock
    ;

expression
    : expression DOT ID                  #ExprMemberAccess
    | expression PIPE ID                 #ExprFilter
    | expression (EQ | NEQ | GT | LT) expression #ExprCompare
    | ID                                 #ExprId
    | STRING                             #ExprString
    | NUMBER                             #ExprNumber
    ;