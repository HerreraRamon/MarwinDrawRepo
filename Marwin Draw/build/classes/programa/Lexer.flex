package programa;
import static programa.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexeme=yytext(); return Comillas;}

/* Tipos de datos */
( int|real| "obj"|boolean ) {lexeme=yytext(); return T_dato;}

/* Tipo de dato String */
( String ) {lexeme=yytext(); return Cadena;}

/* Palabra reservada If */
( if ) {lexeme=yytext(); return If;}

/* Palabra reservada Else */
( else ) {lexeme=yytext(); return Else;}


/* Palabra reservada For */
( for ) {lexeme=yytext(); return For;}

/* Operador Igual */
( "=" ) {lexeme=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexeme=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexeme=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexeme=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexeme=yytext(); return Division;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexeme = yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {lexeme = yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexeme=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexeme=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexeme = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexeme = yytext(); return Corchete_c;}

( "," ) {lexeme = yytext(); return Coma;}

/* Marcador de inicio de algoritmo */
( "scheme" ) {lexeme=yytext(); return Main;}


/* funciones de graficación de figuras */
( "squa" ) {lexeme=yytext(); return Squa;}
( "tria" ) {lexeme=yytext(); return Tria;}
( "circ" ) {lexeme=yytext(); return Circ;}
( "trazar" ) {lexeme=yytext(); return Trazar;}

/* funciones de organización */
( "index" ) {lexeme=yytext(); return Index;}

/* funciones de manipulación de figuras */
( "move" ) {lexeme=yytext(); return Move;}
( "rotate" ) {lexeme=yytext(); return Rotate;}
( "resize" ) {lexeme=yytext(); return Resize;}
( "link" ) {lexeme=yytext(); return Link;}
( "draw" ) {lexeme=yytext(); return Draw;}
( "all" ) {lexeme=yytext(); return All;}
("table") {lexeme=yytext(); return Table;}


( "array" ) {lexeme=yytext(); return Array;}

/* Funcion */
( "funcion" ) {lexeme=yytext(); return Funcion;}

/* Punto y coma */
( ";" ) {lexeme=yytext(); return P_coma;}

/* Identificador */
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

/* Numero */
("-"{D}+)|{D}+|("-"{D}+"."{D})|{D}+"."{D} {lexeme=yytext(); return Numero;}



/* Error de analisis */
 . {return ERROR;}