parser grammar ProductParser;



options { tokenVocab=ProductLexer; }

/* القاعدة الأساسية */
program
    : products+=product* EOF
    ;

/* تعريف المنتج */
product
    : PRODUCT LBRACE fields+=field* RBRACE
    ;

/* الحقول داخل المنتج */
field
    : IMAGE   EQUALS value=STRING   #ImageField
    | NAME    EQUALS value=STRING   #NameField
    | PRICE   EQUALS value=NUMBER   #PriceField
    | DETAILS EQUALS value=STRING   #DetailsField
    ;
