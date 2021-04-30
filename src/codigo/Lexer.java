/* The following code was generated by JFlex 1.6.1 */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/renat/OneDrive/Documentos/NetBeansProjects/AnalizadorLexico/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int Coment = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\17\1\16\1\100\1\100\1\15\22\0\1\77\1\0\1\6"+
    "\3\0\1\76\1\7\1\3\1\5\1\14\1\13\1\75\1\4\1\67"+
    "\1\14\12\2\2\0\1\10\1\12\1\11\2\0\1\53\1\51\1\65"+
    "\1\37\1\50\1\32\1\1\1\46\1\20\2\1\1\47\1\56\1\55"+
    "\1\33\1\66\1\1\1\34\1\62\1\57\1\64\1\1\1\45\1\61"+
    "\2\1\1\73\1\0\1\74\1\0\1\70\1\0\1\52\1\41\1\63"+
    "\1\54\1\24\1\31\1\36\1\44\1\26\2\1\1\42\1\21\1\30"+
    "\1\27\1\22\1\1\1\23\1\25\1\35\1\40\1\1\1\43\1\60"+
    "\2\1\1\71\1\14\1\72\7\0\1\100\u1fa2\0\1\100\1\100\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\3\11\1\12\2\13\1\14\32\2\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\2\26"+
    "\2\0\1\27\2\2\1\30\11\2\1\31\1\2\1\32"+
    "\3\2\2\33\10\2\1\34\10\2\1\0\3\2\1\35"+
    "\1\2\1\36\1\37\1\2\1\40\5\2\1\41\10\2"+
    "\1\42\5\2\1\36\1\2\1\3\2\2\1\43\1\44"+
    "\1\0\1\45\4\2\1\46\1\2\1\47\11\2\1\0"+
    "\5\2\1\50\7\2\1\0\2\2\1\51\1\2\1\52"+
    "\2\2\1\53\3\2\1\54\1\0\4\2\1\55\1\2"+
    "\1\56\1\2\1\57\1\60\1\61\2\2\1\62\1\63"+
    "\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[193];
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
    "\0\0\0\101\0\202\0\303\0\u0104\0\u0145\0\202\0\202"+
    "\0\u0186\0\202\0\u01c7\0\u0208\0\202\0\202\0\u0249\0\202"+
    "\0\u028a\0\u02cb\0\u030c\0\u034d\0\u038e\0\u03cf\0\u0410\0\u0451"+
    "\0\u0492\0\u04d3\0\u0514\0\u0555\0\u0596\0\u05d7\0\u0618\0\u0659"+
    "\0\u069a\0\u06db\0\u071c\0\u075d\0\u079e\0\u07df\0\u0820\0\u0861"+
    "\0\u08a2\0\u08e3\0\u0924\0\202\0\303\0\202\0\202\0\202"+
    "\0\202\0\202\0\202\0\202\0\u0965\0\202\0\u09a6\0\u0186"+
    "\0\202\0\u09e7\0\u0a28\0\303\0\u0a69\0\u0aaa\0\u0aeb\0\u0b2c"+
    "\0\u0b6d\0\u0bae\0\u0bef\0\u0c30\0\u0c71\0\303\0\u0cb2\0\303"+
    "\0\u0cf3\0\u0d34\0\u0d75\0\u0db6\0\303\0\u0df7\0\u0e38\0\u0e79"+
    "\0\u0eba\0\u0efb\0\u0f3c\0\u0f7d\0\u0fbe\0\303\0\u0fff\0\u1040"+
    "\0\u1081\0\u10c2\0\u1103\0\u1144\0\u1185\0\u11c6\0\u1207\0\u1248"+
    "\0\u1289\0\u12ca\0\303\0\u130b\0\u134c\0\303\0\u138d\0\303"+
    "\0\u13ce\0\u140f\0\u1450\0\u1491\0\u14d2\0\303\0\u1513\0\u1554"+
    "\0\u1595\0\u15d6\0\u1617\0\u1658\0\u1699\0\u16da\0\303\0\u171b"+
    "\0\u175c\0\u179d\0\u17de\0\u181f\0\303\0\u1860\0\202\0\u18a1"+
    "\0\u18e2\0\303\0\303\0\u1923\0\303\0\u1964\0\u19a5\0\u19e6"+
    "\0\u1a27\0\303\0\u1a68\0\303\0\u1aa9\0\u1aea\0\u1b2b\0\u1b6c"+
    "\0\u1bad\0\u1bee\0\u1c2f\0\u1c70\0\u1cb1\0\u1cf2\0\u1d33\0\u1d74"+
    "\0\u1db5\0\u1df6\0\u1e37\0\303\0\u1e78\0\u1eb9\0\u1efa\0\u1f3b"+
    "\0\u1f7c\0\u1fbd\0\u1ffe\0\u203f\0\u2080\0\u20c1\0\303\0\u2102"+
    "\0\303\0\u2143\0\u2184\0\303\0\u21c5\0\u2206\0\u2247\0\303"+
    "\0\u2288\0\u22c9\0\u230a\0\u234b\0\u238c\0\303\0\u23cd\0\303"+
    "\0\u240e\0\202\0\303\0\303\0\u244f\0\u2490\0\303\0\303"+
    "\0\303";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[193];
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
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\7\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\2\4\1\24\1\25\1\26\1\4\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\4\1\35\2\4"+
    "\1\36\1\37\1\4\1\40\1\4\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\2\4\1\52"+
    "\2\4\1\53\1\4\1\54\1\55\1\56\1\57\1\60"+
    "\1\61\1\62\1\63\1\21\1\0\15\64\1\65\1\66"+
    "\61\64\103\0\2\4\15\0\47\4\1\0\1\4\12\0"+
    "\1\5\102\0\1\67\74\0\6\70\1\71\72\70\11\0"+
    "\2\15\100\0\1\15\104\0\1\20\101\0\1\21\57\0"+
    "\1\21\2\0\2\4\15\0\1\4\1\72\6\4\1\73"+
    "\2\74\34\4\1\0\1\4\11\0\2\4\15\0\32\4"+
    "\1\75\14\4\1\0\1\4\11\0\2\4\15\0\10\4"+
    "\1\76\11\4\1\77\24\4\1\0\1\4\11\0\2\4"+
    "\15\0\20\4\1\100\26\4\1\0\1\4\11\0\2\4"+
    "\15\0\11\4\1\74\35\4\1\0\1\4\11\0\2\4"+
    "\15\0\4\4\1\101\42\4\1\0\1\4\11\0\2\4"+
    "\15\0\7\4\1\102\10\4\1\103\26\4\1\0\1\4"+
    "\11\0\2\4\15\0\7\4\1\102\3\4\1\104\4\4"+
    "\1\103\23\4\1\105\2\4\1\0\1\4\11\0\2\4"+
    "\15\0\3\4\1\106\43\4\1\0\1\4\11\0\2\4"+
    "\15\0\4\4\1\107\42\4\1\0\1\4\11\0\2\4"+
    "\15\0\7\4\1\110\14\4\1\111\22\4\1\0\1\4"+
    "\11\0\2\4\15\0\1\112\5\4\1\113\1\114\3\4"+
    "\1\115\33\4\1\0\1\4\11\0\2\4\15\0\7\4"+
    "\1\116\37\4\1\0\1\4\11\0\2\4\15\0\24\4"+
    "\1\117\22\4\1\0\1\4\11\0\2\4\15\0\3\4"+
    "\1\120\20\4\1\117\1\4\1\121\20\4\1\0\1\4"+
    "\11\0\2\4\15\0\7\4\1\116\3\4\1\122\33\4"+
    "\1\0\1\4\11\0\2\4\15\0\10\4\1\76\11\4"+
    "\1\77\4\4\1\123\5\4\1\124\11\4\1\0\1\4"+
    "\11\0\2\4\15\0\7\4\1\125\37\4\1\0\1\4"+
    "\11\0\2\4\15\0\5\4\1\126\41\4\1\0\1\4"+
    "\11\0\2\4\15\0\5\4\1\126\2\4\1\127\31\4"+
    "\1\126\4\4\1\0\1\4\11\0\2\4\15\0\6\4"+
    "\1\113\1\115\37\4\1\0\1\4\11\0\2\4\15\0"+
    "\4\4\1\101\23\4\1\130\16\4\1\0\1\4\11\0"+
    "\2\4\15\0\7\4\1\131\22\4\1\75\1\132\13\4"+
    "\1\0\1\4\11\0\2\4\15\0\7\4\1\110\3\4"+
    "\1\110\10\4\1\111\1\4\1\133\20\4\1\0\1\4"+
    "\11\0\2\4\15\0\15\4\1\134\2\4\1\100\23\4"+
    "\1\135\2\4\1\0\1\4\11\0\2\4\15\0\7\4"+
    "\1\136\37\4\1\0\1\4\26\0\1\66\64\0\1\137"+
    "\77\0\2\4\15\0\2\4\1\140\44\4\1\0\1\4"+
    "\11\0\2\4\15\0\15\4\1\141\31\4\1\0\1\4"+
    "\11\0\2\4\15\0\6\4\1\142\40\4\1\0\1\4"+
    "\11\0\2\4\15\0\34\4\1\143\12\4\1\0\1\4"+
    "\11\0\2\4\15\0\5\4\1\144\41\4\1\0\1\4"+
    "\11\0\2\4\15\0\21\4\1\145\25\4\1\0\1\4"+
    "\11\0\2\4\15\0\23\4\1\146\14\4\1\147\6\4"+
    "\1\0\1\4\11\0\2\4\15\0\3\4\1\150\43\4"+
    "\1\0\1\4\11\0\2\4\15\0\10\4\1\151\36\4"+
    "\1\0\1\4\11\0\2\4\15\0\14\4\1\150\32\4"+
    "\1\0\1\4\11\0\2\4\15\0\35\4\1\152\11\4"+
    "\1\0\1\4\11\0\2\4\15\0\15\4\1\153\14\4"+
    "\1\154\14\4\1\0\1\4\11\0\2\4\15\0\4\4"+
    "\1\155\42\4\1\0\1\4\11\0\2\4\15\0\36\4"+
    "\1\156\10\4\1\0\1\4\11\0\2\4\15\0\1\4"+
    "\1\156\45\4\1\0\1\4\11\0\2\4\15\0\20\4"+
    "\1\157\26\4\1\0\1\4\11\0\2\4\15\0\7\4"+
    "\1\160\37\4\1\0\1\4\11\0\2\4\15\0\6\4"+
    "\1\161\40\4\1\0\1\4\11\0\2\4\15\0\6\4"+
    "\1\162\40\4\1\0\1\4\11\0\2\4\15\0\1\163"+
    "\46\4\1\0\1\4\11\0\2\4\15\0\13\4\1\164"+
    "\33\4\1\0\1\4\11\0\2\4\15\0\42\4\1\165"+
    "\4\4\1\0\1\4\11\0\2\4\15\0\17\4\1\143"+
    "\27\4\1\0\1\4\11\0\2\4\15\0\7\4\1\166"+
    "\37\4\1\0\1\4\11\0\2\4\15\0\34\4\1\167"+
    "\12\4\1\0\1\4\11\0\2\4\15\0\25\4\1\146"+
    "\13\4\1\170\5\4\1\0\1\4\11\0\2\4\15\0"+
    "\34\4\1\171\12\4\1\0\1\4\11\0\2\4\15\0"+
    "\1\172\46\4\1\0\1\4\11\0\2\4\15\0\30\4"+
    "\1\173\16\4\1\0\1\4\11\0\2\4\15\0\3\4"+
    "\1\174\43\4\1\0\1\4\11\0\2\4\15\0\31\4"+
    "\1\175\15\4\1\0\1\4\11\0\2\4\15\0\10\4"+
    "\1\176\36\4\1\0\1\4\12\0\1\137\2\0\1\177"+
    "\74\0\2\4\15\0\3\4\1\200\43\4\1\0\1\4"+
    "\11\0\2\4\15\0\4\4\1\201\42\4\1\0\1\4"+
    "\11\0\2\4\15\0\10\4\1\202\36\4\1\0\1\4"+
    "\11\0\2\4\15\0\4\4\1\203\42\4\1\0\1\4"+
    "\11\0\2\4\15\0\47\4\1\0\1\4\6\0\1\204"+
    "\2\0\2\4\15\0\15\4\1\205\31\4\1\0\1\4"+
    "\11\0\2\4\15\0\43\4\1\206\3\4\1\0\1\4"+
    "\11\0\2\4\15\0\45\4\1\207\1\4\1\0\1\4"+
    "\11\0\2\4\15\0\20\4\1\210\26\4\1\0\1\4"+
    "\11\0\2\4\15\0\34\4\1\211\12\4\1\0\1\4"+
    "\11\0\2\4\15\0\10\4\1\212\36\4\1\0\1\4"+
    "\11\0\2\4\15\0\21\4\1\213\25\4\1\0\1\4"+
    "\11\0\2\4\15\0\2\4\1\214\44\4\1\0\1\4"+
    "\11\0\2\4\15\0\22\4\1\215\24\4\1\0\1\4"+
    "\11\0\2\4\15\0\15\4\1\216\31\4\1\0\1\4"+
    "\11\0\2\4\15\0\27\4\1\217\17\4\1\0\1\4"+
    "\11\0\2\4\15\0\46\4\1\214\1\0\1\4\11\0"+
    "\2\4\15\0\30\4\1\203\16\4\1\0\1\4\11\0"+
    "\2\4\15\0\22\4\1\220\24\4\1\0\1\4\11\0"+
    "\2\4\15\0\37\4\1\205\7\4\1\0\1\4\11\0"+
    "\2\4\15\0\20\4\1\221\26\4\1\0\1\4\11\0"+
    "\2\4\15\0\35\4\1\202\11\4\1\0\1\4\11\0"+
    "\2\4\15\0\35\4\1\212\11\4\1\0\1\4\11\0"+
    "\2\4\15\0\20\4\1\222\26\4\1\0\1\4\11\0"+
    "\2\4\15\0\5\4\1\223\41\4\1\0\1\4\11\0"+
    "\2\4\15\0\4\4\1\224\42\4\1\0\1\4\11\0"+
    "\2\4\15\0\16\4\1\225\30\4\1\0\1\4\31\0"+
    "\1\226\34\0\1\226\23\0\2\4\15\0\15\4\1\227"+
    "\31\4\1\0\1\4\11\0\2\4\15\0\37\4\1\230"+
    "\7\4\1\0\1\4\11\0\2\4\15\0\3\4\1\231"+
    "\43\4\1\0\1\4\11\0\2\4\15\0\27\4\1\232"+
    "\17\4\1\0\1\4\11\0\2\4\15\0\22\4\1\233"+
    "\24\4\1\0\1\4\11\0\2\4\15\0\4\4\1\234"+
    "\42\4\1\0\1\4\11\0\2\4\15\0\4\4\1\235"+
    "\42\4\1\0\1\4\11\0\2\4\15\0\30\4\1\234"+
    "\16\4\1\0\1\4\11\0\2\4\15\0\4\4\1\236"+
    "\42\4\1\0\1\4\11\0\2\4\15\0\22\4\1\237"+
    "\24\4\1\0\1\4\11\0\2\4\15\0\43\4\1\240"+
    "\3\4\1\0\1\4\11\0\2\4\15\0\7\4\1\241"+
    "\37\4\1\0\1\4\11\0\2\4\15\0\5\4\1\242"+
    "\41\4\1\0\1\4\11\0\2\4\15\0\4\4\1\243"+
    "\42\4\1\0\1\4\62\0\1\244\27\0\2\4\15\0"+
    "\6\4\1\245\40\4\1\0\1\4\11\0\2\4\15\0"+
    "\1\246\46\4\1\0\1\4\11\0\2\4\15\0\10\4"+
    "\1\247\36\4\1\0\1\4\11\0\2\4\15\0\6\4"+
    "\1\250\40\4\1\0\1\4\11\0\2\4\15\0\4\4"+
    "\1\251\42\4\1\0\1\4\11\0\2\4\15\0\27\4"+
    "\1\252\17\4\1\0\1\4\11\0\2\4\15\0\32\4"+
    "\1\253\14\4\1\0\1\4\11\0\2\4\15\0\4\4"+
    "\1\254\42\4\1\0\1\4\11\0\2\4\15\0\15\4"+
    "\1\255\31\4\1\0\1\4\11\0\2\4\15\0\22\4"+
    "\1\256\24\4\1\0\1\4\11\0\2\4\15\0\6\4"+
    "\1\257\40\4\1\0\1\4\11\0\2\4\15\0\3\4"+
    "\1\260\43\4\1\0\1\4\36\0\1\261\53\0\2\4"+
    "\15\0\7\4\1\262\37\4\1\0\1\4\11\0\2\4"+
    "\15\0\13\4\1\263\33\4\1\0\1\4\11\0\2\4"+
    "\15\0\10\4\1\264\36\4\1\0\1\4\11\0\2\4"+
    "\15\0\6\4\1\265\40\4\1\0\1\4\11\0\2\4"+
    "\15\0\10\4\1\266\36\4\1\0\1\4\11\0\2\4"+
    "\15\0\20\4\1\267\26\4\1\0\1\4\11\0\2\4"+
    "\15\0\4\4\1\270\42\4\1\0\1\4\11\0\2\4"+
    "\15\0\7\4\1\271\37\4\1\0\1\4\40\0\1\272"+
    "\51\0\2\4\15\0\10\4\1\273\36\4\1\0\1\4"+
    "\11\0\2\4\15\0\35\4\1\273\11\4\1\0\1\4"+
    "\11\0\2\4\15\0\4\4\1\274\42\4\1\0\1\4"+
    "\11\0\2\4\15\0\10\4\1\275\36\4\1\0\1\4"+
    "\11\0\2\4\15\0\3\4\1\276\43\4\1\0\1\4"+
    "\11\0\2\4\15\0\10\4\1\277\36\4\1\0\1\4"+
    "\11\0\2\4\15\0\4\4\1\300\42\4\1\0\1\4"+
    "\11\0\2\4\15\0\4\4\1\301\42\4\1\0\1\4"+
    "\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9425];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\3\1\2\11\1\1\1\11\2\1\2\11"+
    "\1\1\1\11\33\1\1\11\1\1\7\11\1\1\1\11"+
    "\2\0\1\11\45\1\1\0\37\1\1\11\4\1\1\0"+
    "\21\1\1\0\15\1\1\0\14\1\1\0\10\1\1\11"+
    "\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[193];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */


    public String lexeme;
    public int linea;
    public int columna;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 212) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { lexeme=yytext();linea = yyline;columna = yycolumn ;return ERROR;
            }
          case 53: break;
          case 2: 
            { lexeme=yytext(); return Identificador;
            }
          case 54: break;
          case 3: 
            { lexeme=yytext(); return Numero;
            }
          case 55: break;
          case 4: 
            { lexeme=yytext();return parentesisE;
            }
          case 56: break;
          case 5: 
            { lexeme=yytext();return OPRestSuma;
            }
          case 57: break;
          case 6: 
            { lexeme=yytext();return parentesisC;
            }
          case 58: break;
          case 7: 
            { return Comilla;
            }
          case 59: break;
          case 8: 
            { yybegin(Coment);
            }
          case 60: break;
          case 9: 
            { lexeme=yytext();return OperadorRelacional;
            }
          case 61: break;
          case 10: 
            { lexeme=yytext();return OPMultDiv;
            }
          case 62: break;
          case 11: 
            { return Enter;
            }
          case 63: break;
          case 12: 
            { 
            }
          case 64: break;
          case 13: 
            { lexeme=yytext();return Punto;
            }
          case 65: break;
          case 14: 
            { lexeme=yytext();return ContinuacionLinea;
            }
          case 66: break;
          case 15: 
            { lexeme=yytext();return llaveE;
            }
          case 67: break;
          case 16: 
            { lexeme=yytext();return llaveC;
            }
          case 68: break;
          case 17: 
            { lexeme=yytext();return corcheteE;
            }
          case 69: break;
          case 18: 
            { lexeme=yytext();return corcheteC;
            }
          case 70: break;
          case 19: 
            { lexeme=yytext();return coma;
            }
          case 71: break;
          case 20: 
            { lexeme=yytext();return concatenacion;
            }
          case 72: break;
          case 21: 
            { lexeme=yytext(); return Comentario;
            }
          case 73: break;
          case 22: 
            { yybegin(YYINITIAL);
            }
          case 74: break;
          case 23: 
            { lexeme=yytext(); return Cadena;
            }
          case 75: break;
          case 24: 
            { lexeme=yytext();return IF;
            }
          case 76: break;
          case 25: 
            { lexeme=yytext();return OR;
            }
          case 77: break;
          case 26: 
            { lexeme=yytext();return TO;
            }
          case 78: break;
          case 27: 
            { lexeme=yytext();return Do;
            }
          case 79: break;
          case 28: 
            { lexeme=yytext();return AS;
            }
          case 80: break;
          case 29: 
            { lexeme=yytext();return End;
            }
          case 81: break;
          case 30: 
            { lexeme=yytext(); return Sub;
            }
          case 82: break;
          case 31: 
            { lexeme=yytext();return New;
            }
          case 83: break;
          case 32: 
            { lexeme=yytext();return For;
            }
          case 84: break;
          case 33: 
            { lexeme=yytext();return Dim;
            }
          case 85: break;
          case 34: 
            { lexeme=yytext();return And;
            }
          case 86: break;
          case 35: 
            { lexeme=yytext(); return RMain;
            }
          case 87: break;
          case 36: 
            { lexeme=yytext(); return Else;
            }
          case 88: break;
          case 37: 
            { lexeme=yytext();return Next;
            }
          case 89: break;
          case 38: 
            { lexeme=yytext();return then;
            }
          case 90: break;
          case 39: 
            { lexeme=yytext();return Loop;
            }
          case 91: break;
          case 40: 
            { lexeme=yytext(); return While;
            }
          case 92: break;
          case 41: 
            { lexeme=yytext();return Return;
            }
          case 93: break;
          case 42: 
            { lexeme=yytext(); return Double;
            }
          case 94: break;
          case 43: 
            { lexeme=yytext(); return SentenciaModulo;
            }
          case 95: break;
          case 44: 
            { lexeme=yytext(); return Integer;
            }
          case 96: break;
          case 45: 
            { lexeme=yytext(); return Boolean;
            }
          case 97: break;
          case 46: 
            { lexeme=yytext();return Console;
            }
          case 98: break;
          case 47: 
            { lexeme=yytext(); return Main;
            }
          case 99: break;
          case 48: 
            { lexeme=yytext();return Function;
            }
          case 100: break;
          case 49: 
            { lexeme=yytext();return ReadLine;
            }
          case 101: break;
          case 50: 
            { lexeme=yytext(); return Impresion;
            }
          case 102: break;
          case 51: 
            { lexeme=yytext();return WriteLine;
            }
          case 103: break;
          case 52: 
            { lexeme=yytext();return struct;
            }
          case 104: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}