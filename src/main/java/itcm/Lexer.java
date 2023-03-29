// DO NOT EDIT
// Generated by JFlex 1.9.0 http://jflex.de/
// source: src/main/jflex/itcm/Lexer.flex

package itcm;
import static itcm.Tokens.*;


@SuppressWarnings("fallthrough")
public class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u1100\1\u1200\1\u1300\1\u1400\1\u1100\1\u1500\1\u1600"+
    "\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u1c00\1\u1100\1\u1d00"+
    "\1\u1e00\1\u1f00\12\u2000\1\u2100\1\u2200\1\u2300\1\u2000\1\u2400"+
    "\1\u2500\2\u2000\31\u1100\1\u2600\121\u1100\1\u2700\4\u1100\1\u2800"+
    "\1\u1100\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\1\u2e00\53\u1100"+
    "\1\u2f00\10\u3000\31\u2000\1\u1100\1\u3100\1\u3200\1\u1100\1\u3300"+
    "\1\u3400\1\u3500\1\u3600\1\u2000\1\u3700\1\u3800\1\u3900\1\u3a00"+
    "\1\u1100\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000\1\u4100"+
    "\1\u2000\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700\1\u4800"+
    "\1\u4900\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u2000\1\u4e00\1\u4f00"+
    "\1\u5000\1\u2000\3\u1100\1\u5100\1\u5200\1\u5300\12\u2000\4\u1100"+
    "\1\u5400\17\u2000\2\u1100\1\u5500\41\u2000\2\u1100\1\u5600\1\u5700"+
    "\2\u2000\1\u5800\1\u5900\27\u1100\1\u5a00\2\u1100\1\u5b00\45\u2000"+
    "\1\u1100\1\u5c00\1\u5d00\11\u2000\1\u5e00\27\u2000\1\u5f00\1\u6000"+
    "\1\u6100\1\u6200\11\u2000\1\u6300\1\u6400\5\u2000\1\u6500\1\u6600"+
    "\4\u2000\1\u6700\21\u2000\246\u1100\1\u6800\20\u1100\1\u6900\1\u6a00"+
    "\25\u1100\1\u6b00\34\u1100\1\u6c00\14\u2000\2\u1100\1\u6d00\u0e05\u2000";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\4\1\0"+
    "\1\5\2\0\1\6\2\0\2\7\1\10\1\11\1\1"+
    "\1\12\1\13\1\14\12\15\1\0\1\7\1\16\1\17"+
    "\1\20\2\0\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\2\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\32\1\40\1\41\1\42\1\43\5\32\6\0"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\2\32\1\33\1\34\1\35\1\36\1\37\1\32"+
    "\1\40\1\41\1\42\1\43\5\32\1\7\1\0\1\7"+
    "\7\0\1\3\44\0\1\32\12\0\1\32\4\0\1\32"+
    "\5\0\27\32\1\0\37\32\1\0\70\32\2\31\115\32"+
    "\1\41\u0142\32\4\0\14\32\16\0\5\32\7\0\1\32"+
    "\1\0\1\32\201\0\5\32\1\0\2\32\2\0\4\32"+
    "\1\0\1\32\6\0\1\32\1\0\3\32\1\0\1\32"+
    "\1\0\24\32\1\0\123\32\1\0\213\32\10\0\246\32"+
    "\1\0\46\32\2\0\1\32\6\0\51\32\107\0\33\32"+
    "\4\0\4\32\55\0\53\32\25\0\12\15\4\0\2\32"+
    "\1\0\143\32\1\0\1\32\17\0\2\32\7\0\2\32"+
    "\12\15\3\32\2\0\1\32\20\0\1\32\1\0\36\32"+
    "\35\0\131\32\13\0\1\32\16\0\12\15\41\32\11\0"+
    "\2\32\4\0\1\32\5\0\26\32\4\0\1\32\11\0"+
    "\1\32\3\0\1\32\27\0\31\32\7\0\13\32\65\0"+
    "\25\32\1\0\10\32\106\0\66\32\3\0\1\32\22\0"+
    "\1\32\7\0\12\32\4\0\12\15\1\0\20\32\4\0"+
    "\10\32\2\0\2\32\2\0\26\32\1\0\7\32\1\0"+
    "\1\32\3\0\4\32\3\0\1\32\20\0\1\32\15\0"+
    "\2\32\1\0\3\32\4\0\12\15\2\32\12\0\1\32"+
    "\10\0\6\32\4\0\2\32\2\0\26\32\1\0\7\32"+
    "\1\0\2\32\1\0\2\32\1\0\2\32\37\0\4\32"+
    "\1\0\1\32\7\0\12\15\2\0\3\32\20\0\11\32"+
    "\1\0\3\32\1\0\26\32\1\0\7\32\1\0\2\32"+
    "\1\0\5\32\3\0\1\32\22\0\1\32\17\0\2\32"+
    "\4\0\12\15\11\0\1\32\13\0\10\32\2\0\2\32"+
    "\2\0\26\32\1\0\7\32\1\0\2\32\1\0\5\32"+
    "\3\0\1\32\36\0\2\32\1\0\3\32\4\0\12\15"+
    "\1\0\1\32\21\0\1\32\1\0\6\32\3\0\3\32"+
    "\1\0\4\32\3\0\2\32\1\0\1\32\1\0\2\32"+
    "\3\0\2\32\3\0\3\32\3\0\14\32\26\0\1\32"+
    "\25\0\12\15\25\0\10\32\1\0\3\32\1\0\27\32"+
    "\1\0\20\32\3\0\1\32\32\0\3\32\5\0\2\32"+
    "\4\0\12\15\20\0\1\32\4\0\10\32\1\0\3\32"+
    "\1\0\27\32\1\0\12\32\1\0\5\32\3\0\1\32"+
    "\40\0\1\32\1\0\2\32\4\0\12\15\1\0\2\32"+
    "\22\0\10\32\1\0\3\32\1\0\51\32\2\0\1\32"+
    "\20\0\1\32\5\0\3\32\10\0\3\32\4\0\12\15"+
    "\12\0\6\32\5\0\22\32\3\0\30\32\1\0\11\32"+
    "\1\0\1\32\2\0\7\32\37\0\12\15\21\0\60\32"+
    "\1\0\2\32\14\0\7\32\11\0\12\15\47\0\2\32"+
    "\1\0\1\32\1\0\5\32\1\0\30\32\1\0\1\32"+
    "\1\0\12\32\1\0\2\32\11\0\1\32\2\0\5\32"+
    "\1\0\1\32\11\0\12\15\2\0\4\32\40\0\1\32"+
    "\37\0\12\15\26\0\10\32\1\0\44\32\33\0\5\32"+
    "\163\0\53\32\24\0\1\32\12\15\6\0\6\32\4\0"+
    "\4\32\3\0\1\32\3\0\2\32\7\0\3\32\4\0"+
    "\15\32\14\0\1\32\1\0\12\15\6\0\46\32\1\0"+
    "\1\32\5\0\1\32\2\0\53\32\1\0\u014d\32\1\0"+
    "\4\32\2\0\7\32\1\0\1\32\1\0\4\32\2\0"+
    "\51\32\1\0\4\32\2\0\41\32\1\0\4\32\2\0"+
    "\7\32\1\0\1\32\1\0\4\32\2\0\17\32\1\0"+
    "\71\32\1\0\4\32\2\0\103\32\45\0\20\32\20\0"+
    "\126\32\2\0\6\32\3\0\u016c\32\2\0\21\32\1\0"+
    "\32\32\5\0\113\32\6\0\10\32\7\0\15\32\1\0"+
    "\4\32\16\0\22\32\16\0\22\32\16\0\15\32\1\0"+
    "\3\32\17\0\64\32\43\0\1\32\4\0\1\32\3\0"+
    "\12\15\46\0\12\15\6\0\131\32\7\0\5\32\2\0"+
    "\42\32\1\0\1\32\5\0\106\32\12\0\37\32\47\0"+
    "\12\15\36\32\2\0\5\32\13\0\54\32\4\0\32\32"+
    "\6\0\12\15\46\0\27\32\11\0\65\32\53\0\12\15"+
    "\6\0\12\15\15\0\1\32\135\0\57\32\21\0\7\32"+
    "\4\0\12\15\51\0\36\32\15\0\2\32\12\15\54\32"+
    "\32\0\44\32\34\0\12\15\3\0\3\32\12\15\44\32"+
    "\2\0\11\32\7\0\53\32\2\0\3\32\51\0\4\32"+
    "\1\0\6\32\1\0\2\32\3\0\1\32\5\0\300\32"+
    "\100\0\26\32\2\0\6\32\2\0\46\32\2\0\6\32"+
    "\2\0\10\32\1\0\1\32\1\0\1\32\1\0\1\32"+
    "\1\0\37\32\2\0\65\32\1\0\7\32\1\0\1\32"+
    "\3\0\3\32\1\0\7\32\3\0\4\32\2\0\6\32"+
    "\4\0\15\32\5\0\3\32\1\0\7\32\53\0\2\3"+
    "\107\0\1\32\15\0\1\32\20\0\15\32\145\0\1\32"+
    "\4\0\1\32\2\0\12\32\1\0\1\32\3\0\5\32"+
    "\6\0\1\32\1\0\1\32\1\0\1\32\1\0\4\32"+
    "\1\0\13\32\2\0\4\32\5\0\5\32\4\0\1\32"+
    "\64\0\2\32\u017b\0\57\32\1\0\57\32\1\0\205\32"+
    "\6\0\4\32\3\0\2\32\14\0\46\32\1\0\1\32"+
    "\5\0\1\32\2\0\70\32\7\0\1\32\20\0\27\32"+
    "\11\0\7\32\1\0\7\32\1\0\7\32\1\0\7\32"+
    "\1\0\7\32\1\0\7\32\1\0\7\32\1\0\7\32"+
    "\120\0\1\32\325\0\2\32\52\0\5\32\5\0\2\32"+
    "\4\0\126\32\6\0\3\32\1\0\132\32\1\0\4\32"+
    "\5\0\53\32\1\0\136\32\21\0\33\32\65\0\306\32"+
    "\112\0\360\32\20\0\215\32\103\0\56\32\2\0\15\32"+
    "\3\0\20\32\12\15\2\32\24\0\57\32\20\0\37\32"+
    "\2\0\106\32\61\0\11\32\2\0\147\32\2\0\65\32"+
    "\2\0\5\32\60\0\13\32\1\0\3\32\1\0\4\32"+
    "\1\0\27\32\35\0\64\32\16\0\62\32\34\0\12\15"+
    "\30\0\6\32\3\0\1\32\1\0\2\32\1\0\12\15"+
    "\34\32\12\0\27\32\31\0\35\32\7\0\57\32\34\0"+
    "\1\32\12\15\6\0\5\32\1\0\12\32\12\15\5\32"+
    "\1\0\51\32\27\0\3\32\1\0\10\32\4\0\12\15"+
    "\6\0\27\32\3\0\1\32\3\0\62\32\1\0\1\32"+
    "\3\0\2\32\2\0\5\32\2\0\1\32\1\0\1\32"+
    "\30\0\3\32\2\0\13\32\7\0\3\32\14\0\6\32"+
    "\2\0\6\32\2\0\6\32\11\0\7\32\1\0\7\32"+
    "\1\0\53\32\1\0\14\32\10\0\163\32\15\0\12\15"+
    "\6\0\244\32\14\0\27\32\4\0\61\32\4\0\u0100\3"+
    "\156\32\2\0\152\32\46\0\7\32\14\0\5\32\5\0"+
    "\1\32\1\0\12\32\1\0\15\32\1\0\5\32\1\0"+
    "\1\32\1\0\2\32\1\0\2\32\1\0\154\32\41\0"+
    "\153\32\22\0\100\32\2\0\66\32\50\0\14\32\164\0"+
    "\5\32\1\0\207\32\23\0\12\15\7\0\32\32\6\0"+
    "\32\32\13\0\131\32\3\0\6\32\2\0\6\32\2\0"+
    "\6\32\2\0\3\32\43\0\14\32\1\0\32\32\1\0"+
    "\23\32\1\0\2\32\1\0\17\32\2\0\16\32\42\0"+
    "\173\32\205\0\35\32\3\0\61\32\57\0\40\32\15\0"+
    "\24\32\1\0\10\32\6\0\46\32\12\0\36\32\2\0"+
    "\44\32\4\0\10\32\60\0\236\32\2\0\12\15\6\0"+
    "\44\32\4\0\44\32\4\0\50\32\10\0\64\32\234\0"+
    "\67\32\11\0\26\32\12\0\10\32\230\0\6\32\2\0"+
    "\1\32\1\0\54\32\1\0\2\32\3\0\1\32\2\0"+
    "\27\32\12\0\27\32\11\0\37\32\101\0\23\32\1\0"+
    "\2\32\12\0\26\32\12\0\32\32\106\0\70\32\6\0"+
    "\2\32\100\0\1\32\17\0\4\32\1\0\3\32\1\0"+
    "\35\32\52\0\35\32\3\0\35\32\43\0\10\32\1\0"+
    "\34\32\33\0\66\32\12\0\26\32\12\0\23\32\15\0"+
    "\22\32\156\0\111\32\67\0\63\32\15\0\63\32\15\0"+
    "\44\32\14\0\12\15\306\0\35\32\12\0\1\32\10\0"+
    "\26\32\232\0\27\32\14\0\65\32\56\0\12\15\23\0"+
    "\55\32\40\0\31\32\7\0\12\15\11\0\44\32\17\0"+
    "\12\15\4\0\1\32\13\0\43\32\3\0\1\32\14\0"+
    "\60\32\16\0\4\32\13\0\12\15\1\32\1\0\1\32"+
    "\43\0\22\32\1\0\31\32\124\0\7\32\1\0\1\32"+
    "\1\0\4\32\1\0\17\32\1\0\12\32\7\0\57\32"+
    "\21\0\12\15\13\0\10\32\2\0\2\32\2\0\26\32"+
    "\1\0\7\32\1\0\2\32\1\0\5\32\3\0\1\32"+
    "\22\0\1\32\14\0\5\32\236\0\65\32\22\0\4\32"+
    "\5\0\12\15\5\0\1\32\40\0\60\32\24\0\2\32"+
    "\1\0\1\32\10\0\12\15\246\0\57\32\51\0\4\32"+
    "\44\0\60\32\24\0\1\32\13\0\12\15\46\0\53\32"+
    "\15\0\1\32\7\0\12\15\66\0\33\32\25\0\12\15"+
    "\306\0\54\32\164\0\100\32\12\15\25\0\1\32\240\0"+
    "\10\32\2\0\47\32\20\0\1\32\1\0\1\32\34\0"+
    "\1\32\12\0\50\32\7\0\1\32\25\0\1\32\13\0"+
    "\56\32\23\0\1\32\42\0\71\32\7\0\11\32\1\0"+
    "\45\32\21\0\1\32\17\0\12\15\30\0\36\32\160\0"+
    "\7\32\1\0\2\32\1\0\46\32\25\0\1\32\11\0"+
    "\12\15\6\0\6\32\1\0\2\32\1\0\40\32\16\0"+
    "\1\32\7\0\12\15\u0136\0\23\32\15\0\232\32\346\0"+
    "\304\32\274\0\57\32\321\0\107\32\271\0\71\32\7\0"+
    "\37\32\1\0\12\15\146\0\36\32\22\0\60\32\20\0"+
    "\4\32\14\0\12\15\11\0\25\32\5\0\23\32\260\0"+
    "\100\32\200\0\113\32\5\0\1\32\102\0\15\32\100\0"+
    "\2\32\1\0\1\32\34\0\370\32\10\0\363\32\15\0"+
    "\37\32\61\0\3\32\21\0\4\32\10\0\u018c\32\4\0"+
    "\153\32\5\0\15\32\3\0\11\32\7\0\12\32\146\0"+
    "\125\32\1\0\107\32\1\0\2\32\2\0\1\32\2\0"+
    "\2\32\2\0\4\32\1\0\14\32\1\0\1\32\1\0"+
    "\7\32\1\0\101\32\1\0\4\32\2\0\10\32\1\0"+
    "\7\32\1\0\34\32\1\0\4\32\1\0\5\32\1\0"+
    "\1\32\3\0\7\32\1\0\u0154\32\2\0\31\32\1\0"+
    "\31\32\1\0\37\32\1\0\31\32\1\0\37\32\1\0"+
    "\31\32\1\0\37\32\1\0\31\32\1\0\37\32\1\0"+
    "\31\32\1\0\10\32\2\0\62\15\55\32\12\0\7\32"+
    "\2\0\12\15\4\0\1\32\u0171\0\54\32\4\0\12\15"+
    "\6\0\305\32\73\0\104\32\7\0\1\32\4\0\12\15"+
    "\246\0\4\32\1\0\33\32\1\0\2\32\1\0\1\32"+
    "\2\0\1\32\1\0\12\32\1\0\4\32\1\0\1\32"+
    "\1\0\1\32\6\0\1\32\4\0\1\32\1\0\1\32"+
    "\1\0\1\32\1\0\3\32\1\0\2\32\1\0\1\32"+
    "\2\0\1\32\1\0\1\32\1\0\1\32\1\0\1\32"+
    "\1\0\1\32\1\0\2\32\1\0\1\32\2\0\4\32"+
    "\1\0\7\32\1\0\4\32\1\0\4\32\1\0\1\32"+
    "\1\0\12\32\1\0\21\32\5\0\3\32\1\0\5\32"+
    "\1\0\21\32\104\0\327\32\51\0\65\32\13\0\336\32"+
    "\2\0\u0182\32\16\0\u0131\32\37\0\36\32\342\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[28160];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\3\4"+
    "\1\1\1\4\1\6\1\7\1\10\1\7\14\11\1\0"+
    "\1\12\1\10\1\13\1\14\1\0\1\7\6\11\1\15"+
    "\3\11\1\16\3\11\1\17\1\20\1\13\1\21\3\11"+
    "\1\15\1\22\2\11\1\23\3\11\1\0\6\11\1\21"+
    "\2\11\1\24\1\11\1\0\1\25\1\21";

  private static int [] zzUnpackAction() {
    int [] result = new int[79];
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
    "\0\0\0\44\0\110\0\110\0\154\0\44\0\44\0\220"+
    "\0\264\0\330\0\374\0\u0120\0\u0144\0\u0168\0\u018c\0\u018c"+
    "\0\u01b0\0\u01d4\0\u01f8\0\u021c\0\u0240\0\u0264\0\u0288\0\u02ac"+
    "\0\u02d0\0\u02f4\0\u0318\0\u033c\0\u0360\0\44\0\44\0\u0384"+
    "\0\44\0\u03a8\0\44\0\u03cc\0\u03f0\0\u0414\0\u0438\0\u045c"+
    "\0\u0480\0\u0240\0\u04a4\0\u04c8\0\u04ec\0\u0240\0\u0510\0\u0534"+
    "\0\u0558\0\u0360\0\44\0\44\0\u057c\0\u05a0\0\u05c4\0\u05e8"+
    "\0\u060c\0\u0240\0\u0630\0\u0654\0\u0240\0\u0678\0\u069c\0\u06c0"+
    "\0\u06e4\0\u0708\0\u072c\0\u0750\0\u0774\0\u0798\0\u07bc\0\u07e0"+
    "\0\u0804\0\u0828\0\u0240\0\u084c\0\u0870\0\u0240\0\u0870";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[79];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\2\25\1\27"+
    "\3\25\1\30\1\31\1\32\1\33\1\34\2\25\45\0"+
    "\2\3\1\0\1\3\37\0\2\35\2\0\40\35\10\0"+
    "\1\6\44\0\1\36\44\0\1\36\5\0\1\37\36\0"+
    "\1\40\44\0\1\41\42\0\1\42\1\0\1\15\45\0"+
    "\2\43\42\0\1\43\45\0\14\25\1\44\6\25\21\0"+
    "\15\25\1\45\5\25\21\0\7\25\1\46\13\25\21\0"+
    "\15\25\1\47\5\25\21\0\23\25\21\0\15\25\1\50"+
    "\4\25\1\51\21\0\5\25\1\52\5\25\1\53\1\54"+
    "\6\25\21\0\15\25\1\55\5\25\21\0\17\25\1\56"+
    "\3\25\21\0\17\25\1\57\3\25\21\0\4\25\1\60"+
    "\16\25\21\0\21\25\1\61\1\25\2\35\2\0\1\35"+
    "\1\62\36\35\13\0\1\63\3\0\1\64\41\0\1\65"+
    "\47\0\3\25\1\56\17\25\21\0\15\25\1\66\5\25"+
    "\21\0\1\67\22\25\21\0\22\25\1\70\21\0\17\25"+
    "\1\71\3\25\21\0\14\25\1\72\6\25\21\0\16\25"+
    "\1\73\4\25\21\0\16\25\1\74\2\25\1\75\1\25"+
    "\21\0\21\25\1\56\1\25\21\0\10\25\1\76\12\25"+
    "\21\0\21\25\1\77\1\25\21\0\17\25\1\100\3\25"+
    "\13\0\1\101\1\0\1\65\47\0\12\25\1\75\10\25"+
    "\21\0\17\25\1\75\3\25\21\0\1\25\1\102\21\25"+
    "\21\0\10\25\1\103\12\25\21\0\15\25\1\104\5\25"+
    "\21\0\22\25\1\105\21\0\14\25\1\105\6\25\21\0"+
    "\22\25\1\106\21\0\10\25\1\107\12\25\15\0\1\110"+
    "\47\0\12\25\1\111\10\25\21\0\5\25\1\52\15\25"+
    "\21\0\17\25\1\112\3\25\21\0\21\25\1\113\1\25"+
    "\21\0\17\25\1\51\3\25\21\0\14\25\1\114\6\25"+
    "\13\0\1\115\1\0\1\110\47\0\4\25\1\75\16\25"+
    "\21\0\21\25\1\116\1\25\21\0\6\25\1\75\14\25"+
    "\15\0\1\117\26\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[2196];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\2\11\25\1\1\0\2\11\1\1"+
    "\1\11\1\0\1\11\17\1\2\11\14\1\1\0\13\1"+
    "\1\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[79];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    String name;
    int line;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
      yyline = 1;
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
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
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Tokens yylex() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
        // peek one character ahead if it is
        // (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
            { name=yytext(); line=yyline; return ERROR;
            }
          // fall through
          case 22: break;
          case 2:
            { /* Ignore */
            }
          // fall through
          case 23: break;
          case 3:
            { System.out.print("");
            }
          // fall through
          case 24: break;
          case 4:
            { name=yytext(); line=yyline;return Operador_aritmetico;
            }
          // fall through
          case 25: break;
          case 5:
            { name=yytext(); line=yyline;return Delimitador;
            }
          // fall through
          case 26: break;
          case 6:
            { name=yytext(); line=yyline; return Numero;
            }
          // fall through
          case 27: break;
          case 7:
            { name=yytext(); line=yyline;return Operador_relacional;
            }
          // fall through
          case 28: break;
          case 8:
            { name=yytext(); line=yyline; return Operador_general;
            }
          // fall through
          case 29: break;
          case 9:
            { name=yytext(); line=yyline; return Identificador;
            }
          // fall through
          case 30: break;
          case 10:
            { name=yytext(); line=yyline;return Operador_incremento;
            }
          // fall through
          case 31: break;
          case 11:
            { name=yytext(); line=yyline;return Operador_rango;
            }
          // fall through
          case 32: break;
          case 12:
            { System.out.println("//");
            }
          // fall through
          case 33: break;
          case 13:
            { name=yytext(); line=yyline; return Estructuras_control;
            }
          // fall through
          case 34: break;
          case 14:
            { name=yytext(); line=yyline;return Operador_logico;
            }
          // fall through
          case 35: break;
          case 15:
            { name=yytext(); line=yyline; return Texto;
            }
          // fall through
          case 36: break;
          case 16:
            { name=yytext(); line=yyline;return Operador_concatenacion;
            }
          // fall through
          case 37: break;
          case 17:
            { name=yytext(); line=yyline; return Decimal;
            }
          // fall through
          case 38: break;
          case 18:
            { name=yytext(); line=yyline; return Funciones;
            }
          // fall through
          case 39: break;
          case 19:
            { name=yytext(); line=yyline; return TipoDeDato;
            }
          // fall through
          case 40: break;
          case 20:
            { name=yytext(); line=yyline; return Entradas_Salidas;
            }
          // fall through
          case 41: break;
          case 21:
            { name=yytext(); line=yyline; return Libreria;
            }
          // fall through
          case 42: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
