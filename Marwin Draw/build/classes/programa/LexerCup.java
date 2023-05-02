/* The following code was generated by JFlex 1.4.3 on 6/06/22 01:57 PM */

package programa;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 6/06/22 01:57 PM from the specification file
 * <tt>C:/Users/yumar/OneDrive/Documentos/NetBeansProjects/Marwin Draw/src/programa/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  5,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 32,  6,  0,  0, 35, 30,  0, 37, 38, 29, 27,  3, 28,  0,  4, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0, 47, 34, 26, 33,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1, 22,  1,  1,  1,  1,  1,  1,  1, 41,  0, 42,  0,  1, 
     0, 13,  7, 11, 24, 10, 19, 18, 12, 21, 20,  1, 15, 44, 17, 16, 
     1, 43, 14, 23,  9, 36, 46, 25,  1,  8, 45, 39, 31, 40,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\15\2"+
    "\1\7\1\10\1\11\1\12\3\13\2\14\1\1\1\2"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\2\1\23"+
    "\1\4\1\24\22\2\1\25\1\2\1\26\2\2\1\14"+
    "\1\27\1\13\1\2\1\0\13\2\1\30\4\2\1\31"+
    "\2\2\1\32\1\2\1\33\5\2\1\0\3\2\1\34"+
    "\1\35\1\36\1\37\2\2\1\40\10\2\1\41\1\3"+
    "\1\2\1\42\3\2\1\43\1\44\4\2\1\45\1\46"+
    "\1\47\3\2\1\50\1\51\1\2\1\52\1\53\1\54"+
    "\1\55";

  private static int [] zzUnpackAction() {
    int [] result = new int[141];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\60\0\u0120"+
    "\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0"+
    "\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0\0\u0420"+
    "\0\u0450\0\u0480\0\u0390\0\u04b0\0\u04e0\0\u0420\0\u0510\0\u0540"+
    "\0\60\0\60\0\60\0\60\0\60\0\u0570\0\60\0\u05a0"+
    "\0\60\0\u05d0\0\u0600\0\u0630\0\u0660\0\u0690\0\u06c0\0\u06f0"+
    "\0\u0720\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0870"+
    "\0\u08a0\0\u08d0\0\u0900\0\140\0\u0930\0\140\0\u0960\0\u0990"+
    "\0\60\0\60\0\60\0\u09c0\0\u09f0\0\u0a20\0\u0a50\0\u0a80"+
    "\0\u0ab0\0\u0ae0\0\u0b10\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00"+
    "\0\140\0\u0c30\0\u0c60\0\u0c90\0\u0cc0\0\140\0\u0cf0\0\u0d20"+
    "\0\140\0\u0d50\0\140\0\u0d80\0\u0db0\0\u0de0\0\u0e10\0\u0e40"+
    "\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00\0\140\0\140\0\140\0\140"+
    "\0\u0f30\0\u0f60\0\140\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u1050"+
    "\0\u1080\0\u10b0\0\u10e0\0\140\0\60\0\u1110\0\140\0\u1140"+
    "\0\u1170\0\u11a0\0\140\0\140\0\u11d0\0\u1200\0\u1230\0\u1260"+
    "\0\140\0\140\0\140\0\u1290\0\u12c0\0\u12f0\0\140\0\140"+
    "\0\u1320\0\140\0\140\0\140\0\140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[141];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\5\1\7\1\10"+
    "\1\3\1\11\1\12\1\13\1\3\1\14\1\15\1\16"+
    "\1\17\2\3\1\20\1\3\1\21\1\22\1\3\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\3\1\46\2\3\1\47\61\0\2\3"+
    "\4\0\23\3\12\0\1\3\6\0\4\3\3\0\1\4"+
    "\60\0\1\5\1\0\1\5\56\0\1\50\25\0\1\51"+
    "\26\0\2\3\4\0\1\3\1\52\21\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\6\3\1\53\1\54"+
    "\1\3\1\55\11\3\12\0\1\3\6\0\4\3\2\0"+
    "\2\3\4\0\10\3\1\56\7\3\1\57\2\3\12\0"+
    "\1\3\6\0\4\3\2\0\2\3\4\0\5\3\1\60"+
    "\10\3\1\61\4\3\12\0\1\62\6\0\4\3\2\0"+
    "\2\3\4\0\7\3\1\63\13\3\12\0\1\3\6\0"+
    "\4\3\2\0\2\3\4\0\11\3\1\64\11\3\12\0"+
    "\1\3\6\0\4\3\2\0\2\3\4\0\11\3\1\65"+
    "\11\3\12\0\1\3\6\0\4\3\2\0\2\3\4\0"+
    "\1\66\22\3\12\0\1\3\6\0\4\3\2\0\2\3"+
    "\4\0\6\3\1\67\1\3\1\70\1\71\11\3\12\0"+
    "\1\72\6\0\4\3\2\0\2\3\4\0\12\3\1\73"+
    "\1\3\1\74\6\3\12\0\1\3\6\0\4\3\2\0"+
    "\2\3\4\0\2\3\1\75\20\3\12\0\1\3\6\0"+
    "\4\3\2\0\2\3\4\0\11\3\1\76\4\3\1\77"+
    "\4\3\12\0\1\3\6\0\4\3\2\0\2\3\4\0"+
    "\5\3\1\100\15\3\12\0\1\3\6\0\4\3\33\0"+
    "\1\101\57\0\1\51\1\102\56\0\1\51\1\0\1\102"+
    "\55\0\1\51\63\0\1\103\60\0\1\103\52\0\1\101"+
    "\6\0\1\101\50\0\1\101\7\0\1\101\16\0\2\3"+
    "\4\0\12\3\1\104\10\3\12\0\1\3\6\0\4\3"+
    "\35\0\1\105\24\0\2\3\4\0\11\3\1\106\11\3"+
    "\12\0\1\3\6\0\4\3\1\0\5\50\1\0\52\50"+
    "\1\0\2\3\4\0\2\3\1\107\20\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\1\110\22\3\12\0"+
    "\1\3\6\0\4\3\2\0\2\3\4\0\6\3\1\111"+
    "\7\3\1\112\4\3\12\0\1\113\6\0\4\3\2\0"+
    "\2\3\4\0\21\3\1\114\1\3\12\0\1\3\6\0"+
    "\4\3\2\0\2\3\4\0\20\3\1\115\2\3\12\0"+
    "\1\3\6\0\4\3\2\0\2\3\4\0\4\3\1\116"+
    "\16\3\12\0\1\3\6\0\1\117\3\3\2\0\2\3"+
    "\4\0\6\3\1\120\14\3\12\0\1\3\6\0\4\3"+
    "\2\0\2\3\4\0\7\3\1\121\13\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\6\3\1\122\14\3"+
    "\12\0\1\3\6\0\4\3\2\0\2\3\4\0\7\3"+
    "\1\123\13\3\12\0\1\3\6\0\4\3\2\0\2\3"+
    "\4\0\2\3\1\124\20\3\12\0\1\3\6\0\4\3"+
    "\2\0\2\3\4\0\12\3\1\125\10\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\15\3\1\126\5\3"+
    "\12\0\1\3\6\0\4\3\2\0\2\3\4\0\10\3"+
    "\1\127\12\3\12\0\1\3\6\0\4\3\2\0\2\3"+
    "\4\0\11\3\1\130\11\3\12\0\1\3\6\0\4\3"+
    "\2\0\2\3\4\0\7\3\1\131\13\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\12\3\1\132\10\3"+
    "\12\0\1\3\6\0\4\3\2\0\2\3\4\0\2\3"+
    "\1\133\16\3\1\134\1\3\12\0\1\3\6\0\4\3"+
    "\2\0\2\3\4\0\7\3\1\135\13\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\1\136\22\3\12\0"+
    "\1\3\6\0\4\3\2\0\2\3\4\0\16\3\1\137"+
    "\4\3\12\0\1\3\6\0\4\3\2\0\2\3\4\0"+
    "\16\3\1\140\4\3\12\0\1\3\6\0\4\3\3\0"+
    "\1\141\56\0\2\3\4\0\23\3\12\0\1\3\6\0"+
    "\3\3\1\142\2\0\2\3\4\0\3\3\1\126\17\3"+
    "\12\0\1\3\6\0\4\3\2\0\2\3\4\0\10\3"+
    "\1\143\12\3\12\0\1\3\6\0\4\3\2\0\2\3"+
    "\4\0\23\3\12\0\1\3\6\0\2\3\1\144\1\3"+
    "\2\0\2\3\4\0\6\3\1\145\14\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\3\3\1\146\17\3"+
    "\12\0\1\3\6\0\4\3\2\0\2\3\4\0\11\3"+
    "\1\147\11\3\12\0\1\3\6\0\4\3\2\0\2\3"+
    "\4\0\3\3\1\150\17\3\12\0\1\3\6\0\4\3"+
    "\2\0\2\3\4\0\6\3\1\151\14\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\23\3\12\0\1\152"+
    "\6\0\4\3\2\0\2\3\4\0\7\3\1\126\13\3"+
    "\12\0\1\3\6\0\4\3\2\0\2\3\4\0\21\3"+
    "\1\153\1\3\12\0\1\3\6\0\4\3\2\0\2\3"+
    "\4\0\6\3\1\154\14\3\12\0\1\3\6\0\4\3"+
    "\2\0\2\3\4\0\6\3\1\155\14\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\13\3\1\126\7\3"+
    "\12\0\1\3\6\0\4\3\2\0\2\3\4\0\20\3"+
    "\1\113\2\3\12\0\1\3\6\0\4\3\2\0\2\3"+
    "\4\0\6\3\1\156\14\3\12\0\1\3\6\0\4\3"+
    "\2\0\2\3\4\0\4\3\1\157\16\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\16\3\1\160\4\3"+
    "\12\0\1\3\6\0\4\3\2\0\2\3\4\0\16\3"+
    "\1\161\4\3\12\0\1\3\6\0\4\3\2\0\2\3"+
    "\4\0\23\3\12\0\1\162\6\0\4\3\2\0\2\3"+
    "\4\0\10\3\1\163\12\3\12\0\1\3\6\0\4\3"+
    "\2\0\2\3\4\0\7\3\1\164\13\3\12\0\1\3"+
    "\6\0\4\3\3\0\1\141\43\0\1\165\12\0\2\3"+
    "\4\0\3\3\1\166\17\3\12\0\1\3\6\0\4\3"+
    "\2\0\2\3\4\0\6\3\1\167\14\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\6\3\1\170\14\3"+
    "\12\0\1\3\6\0\4\3\2\0\2\3\4\0\10\3"+
    "\1\171\12\3\12\0\1\3\6\0\4\3\2\0\2\3"+
    "\4\0\3\3\1\172\17\3\12\0\1\3\6\0\4\3"+
    "\2\0\2\3\4\0\1\3\1\173\21\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\7\3\1\174\13\3"+
    "\12\0\1\3\6\0\4\3\2\0\2\3\4\0\2\3"+
    "\1\126\20\3\12\0\1\3\6\0\4\3\2\0\2\3"+
    "\4\0\16\3\1\175\4\3\12\0\1\3\6\0\4\3"+
    "\2\0\2\3\4\0\4\3\1\176\16\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\12\3\1\177\10\3"+
    "\12\0\1\3\6\0\4\3\2\0\2\3\4\0\15\3"+
    "\1\200\5\3\12\0\1\3\6\0\4\3\2\0\2\3"+
    "\4\0\3\3\1\201\17\3\12\0\1\3\6\0\4\3"+
    "\2\0\2\3\4\0\7\3\1\202\13\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\7\3\1\203\13\3"+
    "\12\0\1\3\6\0\4\3\2\0\2\3\4\0\6\3"+
    "\1\204\14\3\12\0\1\3\6\0\4\3\2\0\2\3"+
    "\4\0\23\3\12\0\1\3\6\0\1\3\1\205\2\3"+
    "\2\0\2\3\4\0\11\3\1\206\11\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\3\3\1\207\17\3"+
    "\12\0\1\3\6\0\4\3\2\0\2\3\4\0\13\3"+
    "\1\210\7\3\12\0\1\3\6\0\4\3\2\0\2\3"+
    "\4\0\6\3\1\211\14\3\12\0\1\3\6\0\4\3"+
    "\2\0\2\3\4\0\7\3\1\212\13\3\12\0\1\3"+
    "\6\0\4\3\2\0\2\3\4\0\6\3\1\213\14\3"+
    "\12\0\1\3\6\0\4\3\2\0\2\3\4\0\12\3"+
    "\1\214\10\3\12\0\1\3\6\0\4\3\2\0\2\3"+
    "\4\0\7\3\1\215\13\3\12\0\1\3\6\0\4\3"+
    "\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4944];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\31\1\5\11\1\1\1\11"+
    "\1\1\1\11\27\1\3\11\1\1\1\0\33\1\1\0"+
    "\23\1\1\11\30\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[141];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 15: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 46: break;
        case 41: 
          { return new Symbol(sym.Cadena, yychar, yyline, yytext());
          }
        case 47: break;
        case 27: 
          { return new Symbol(sym.Int, yychar, yyline, yytext());
          }
        case 48: break;
        case 20: 
          { return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());
          }
        case 49: break;
        case 31: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 50: break;
        case 11: 
          { return new Symbol(sym.Op_logico, yychar, yyline, yytext());
          }
        case 51: break;
        case 17: 
          { return new Symbol(sym.Corchete_a, yychar, yyline, yytext());
          }
        case 52: break;
        case 5: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 53: break;
        case 38: 
          { return new Symbol(sym.Mover, yychar, yyline, yytext());
          }
        case 54: break;
        case 22: 
          { return new Symbol(sym.Do, yychar, yyline, yytext());
          }
        case 55: break;
        case 44: 
          { return new Symbol(sym.Funcion, yychar, yyline, yytext());
          }
        case 56: break;
        case 6: 
          { return new Symbol(sym.Comillas, yychar, yyline, yytext());
          }
        case 57: break;
        case 26: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 58: break;
        case 25: 
          { return new Symbol(sym.T_dato, yychar, yyline, yytext());
          }
        case 59: break;
        case 13: 
          { return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());
          }
        case 60: break;
        case 40: 
          { return new Symbol(sym.Indice, yychar, yyline, yytext());
          }
        case 61: break;
        case 9: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 62: break;
        case 16: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 63: break;
        case 39: 
          { return new Symbol(sym.Trazar, yychar, yyline, yytext());
          }
        case 64: break;
        case 34: 
          { return new Symbol(sym.Tabla, yychar, yyline, yytext());
          }
        case 65: break;
        case 18: 
          { return new Symbol(sym.Corchete_c, yychar, yyline, yytext());
          }
        case 66: break;
        case 21: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 67: break;
        case 30: 
          { return new Symbol(sym.Todo, yychar, yyline, yytext());
          }
        case 68: break;
        case 23: 
          { return new Symbol(sym.Op_incremento, yychar, yyline, yytext());
          }
        case 69: break;
        case 43: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 70: break;
        case 33: 
          { return new Symbol(sym.Unir, yychar, yyline, yytext());
          }
        case 71: break;
        case 14: 
          { return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());
          }
        case 72: break;
        case 19: 
          { return new Symbol(sym.P_coma, yychar, yyline, yytext());
          }
        case 73: break;
        case 42: 
          { return new Symbol(sym.Escalar, yychar, yyline, yytext());
          }
        case 74: break;
        case 10: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 75: break;
        case 28: 
          { return new Symbol(sym.Tria, yychar, yyline, yytext());
          }
        case 76: break;
        case 8: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 77: break;
        case 35: 
          { return new Symbol(sym.Array, yychar, yyline, yytext());
          }
        case 78: break;
        case 24: 
          { return new Symbol(sym.Cir, yychar, yyline, yytext());
          }
        case 79: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 80: break;
        case 37: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 81: break;
        case 45: 
          { return new Symbol(sym.Dibujar, yychar, yyline, yytext());
          }
        case 82: break;
        case 4: 
          { /*Ignore*/
          }
        case 83: break;
        case 7: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 84: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 85: break;
        case 3: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 86: break;
        case 12: 
          { return new Symbol(sym.Op_relacional, yychar, yyline, yytext());
          }
        case 87: break;
        case 32: 
          { return new Symbol(sym.Cuad, yychar, yyline, yytext());
          }
        case 88: break;
        case 36: 
          { return new Symbol(sym.Rotar, yychar, yyline, yytext());
          }
        case 89: break;
        case 29: 
          { return new Symbol(sym.Op_booleano, yychar, yyline, yytext());
          }
        case 90: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
