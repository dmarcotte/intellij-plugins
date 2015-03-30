/* The following code was generated by JFlex 1.4.3 on 3/29/15 1:52 PM */

// We base our lexer directly on the official handlebars.l lexer definition,
// making some modifications to account for Jison/JFlex syntax and functionality differences
//
// Revision ported: https://github.com/wycats/handlebars.js/blob/14b7ef9066d107dc83deedc8e6791947811cc764/src/handlebars.l

package com.dmarcotte.handlebars.parsing;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.containers.Stack;

// suppress various warnings/inspections for the generated class
@SuppressWarnings ({"FieldCanBeLocal", "UnusedDeclaration", "UnusedAssignment", "AccessStaticViaInstance", "MismatchedReadAndWriteOfArray", "WeakerAccess", "SameParameterValue", "CanBeFinal", "SameReturnValue", "RedundantThrows", "ConstantConditions"})

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/29/15 1:52 PM from the specification file
 * <tt>handlebars.flex</tt>
 */
final class _HbLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int comment_end = 12;
  public static final int data = 14;
  public static final int comment = 8;
  public static final int par = 6;
  public static final int YYINITIAL = 0;
  public static final int comment_block = 10;
  public static final int raw = 16;
  public static final int emu = 4;
  public static final int mu = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  3,  3, 
     7, 7
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\1\22\1\1\1\1\22\0\1\1\1\16\1\23"+
    "\1\13\1\0\1\37\1\15\1\24\1\6\1\7\3\37\1\17\1\21"+
    "\1\5\12\36\1\0\2\37\1\20\1\12\1\0\1\25\32\0\1\40"+
    "\1\4\1\41\1\14\1\0\1\37\1\35\3\0\1\26\1\34\5\0"+
    "\1\27\5\0\1\32\1\30\1\31\1\33\5\0\1\3\1\37\1\10"+
    "\1\11\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\2\0\1\3\1\4\1\0\2\1\1\5"+
    "\1\2\2\5\1\6\1\7\1\10\3\5\1\11\1\6"+
    "\2\5\1\12\5\5\1\2\1\5\1\13\2\3\1\4"+
    "\2\5\1\1\1\14\1\0\1\15\1\16\1\17\3\0"+
    "\1\20\1\21\2\0\1\22\5\0\1\23\1\15\1\0"+
    "\1\24\1\3\1\25\1\4\1\25\1\0\1\1\1\14"+
    "\1\26\1\27\1\16\1\30\1\31\1\32\1\16\1\33"+
    "\1\34\1\0\1\17\4\0\1\24\2\35\1\4\1\0"+
    "\1\1\1\36\1\26\1\0\1\37\1\34\3\0\1\40"+
    "\1\41\1\1\1\42\1\43\1\44\1\45\1\0\1\40"+
    "\1\46\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[107];
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
    "\0\0\0\42\0\104\0\146\0\210\0\252\0\314\0\356"+
    "\0\u0110\0\u0132\0\u0154\0\u0176\0\u0198\0\u0198\0\u0198\0\u0198"+
    "\0\u01ba\0\u01dc\0\u01fe\0\u0198\0\u0220\0\u0242\0\u0264\0\u0198"+
    "\0\u0286\0\u02a8\0\u02ca\0\u02ec\0\u030e\0\u0330\0\u0352\0\u0198"+
    "\0\u0374\0\u0396\0\u03b8\0\u03da\0\u03fc\0\u041e\0\u0440\0\u0132"+
    "\0\u0198\0\u0462\0\u0484\0\u04a6\0\u04c8\0\u02ec\0\u0198\0\u0198"+
    "\0\u0242\0\u04ea\0\u0198\0\u0264\0\u050c\0\u052e\0\u0550\0\u0572"+
    "\0\u0198\0\u0594\0\u030e\0\u05b6\0\u05d8\0\u05fa\0\u061c\0\u0198"+
    "\0\u063e\0\u0660\0\u0198\0\u0682\0\u0198\0\u06a4\0\u0198\0\u0198"+
    "\0\u0198\0\u0198\0\u06c6\0\u06e8\0\u070a\0\u0198\0\u072c\0\u074e"+
    "\0\u0770\0\u0792\0\u07b4\0\u05fa\0\u0198\0\u07d6\0\u03da\0\u07f8"+
    "\0\u081a\0\u0198\0\u083c\0\u0198\0\u0198\0\u085e\0\u0880\0\u08a2"+
    "\0\u08c4\0\u0198\0\u08e6\0\u0198\0\u0198\0\u0198\0\u0198\0\u0908"+
    "\0\u0198\0\u0198\0\u0198";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[107];
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
    "\3\1\1\11\36\1\1\12\2\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\5\15\1\23\1\24\1\25"+
    "\1\13\1\26\1\27\1\30\1\31\2\12\1\32\2\12"+
    "\1\33\1\12\1\34\1\15\1\35\2\15\2\36\1\37"+
    "\1\40\36\15\2\36\37\15\10\41\1\42\31\41\17\6"+
    "\1\43\22\6\1\15\2\36\5\15\1\44\6\15\1\45"+
    "\22\15\3\10\1\46\36\10\3\1\1\47\36\1\1\50"+
    "\2\51\2\0\1\51\1\0\3\51\5\0\1\50\3\51"+
    "\3\0\11\50\4\0\2\13\17\0\1\13\22\0\1\52"+
    "\110\0\1\53\1\54\40\0\1\55\31\0\1\50\2\51"+
    "\2\0\1\51\1\0\3\51\5\0\1\50\3\51\3\0"+
    "\10\50\1\56\4\0\2\57\5\0\2\57\7\0\1\60"+
    "\1\57\17\0\4\61\1\62\16\61\1\63\16\61\4\64"+
    "\1\65\17\64\1\63\15\64\1\50\2\51\2\0\1\51"+
    "\1\0\3\51\5\0\1\50\3\51\3\0\1\50\1\66"+
    "\7\50\3\0\1\50\2\51\2\0\1\51\1\0\3\51"+
    "\5\0\1\50\3\51\3\0\4\50\1\67\4\50\3\0"+
    "\1\50\2\51\2\0\1\51\1\0\3\51\5\0\1\50"+
    "\3\51\3\0\7\50\1\70\1\50\3\0\1\50\2\71"+
    "\2\0\1\51\1\0\2\71\1\51\5\0\1\50\1\51"+
    "\1\72\1\71\3\0\10\50\1\56\3\0\41\73\1\60"+
    "\1\0\2\36\42\0\1\74\36\0\10\41\1\75\41\41"+
    "\1\76\31\41\17\6\1\77\22\6\10\0\1\100\50\0"+
    "\1\101\22\0\3\10\1\102\36\10\3\0\1\103\41\0"+
    "\1\104\1\0\1\105\3\0\1\106\1\107\1\110\1\111"+
    "\1\112\1\113\33\0\1\114\41\0\1\115\41\0\1\116"+
    "\31\0\2\61\1\0\37\61\2\64\1\0\37\64\1\50"+
    "\2\51\2\0\1\51\1\0\3\51\5\0\1\50\3\51"+
    "\3\0\2\50\1\117\6\50\3\0\1\50\2\51\2\0"+
    "\1\51\1\0\3\51\5\0\1\50\3\51\3\0\5\50"+
    "\1\120\3\50\3\0\1\50\2\51\2\0\1\51\1\0"+
    "\3\51\5\0\1\50\3\51\3\0\1\50\1\121\7\50"+
    "\41\0\1\122\3\0\3\74\1\123\36\74\10\41\1\124"+
    "\31\41\10\0\1\125\31\0\10\6\1\126\6\6\1\77"+
    "\22\6\10\0\1\127\31\0\3\10\1\130\36\10\3\0"+
    "\1\131\41\0\1\132\1\0\1\105\4\0\1\107\1\110"+
    "\1\111\1\112\43\0\1\133\32\0\1\134\41\0\1\135"+
    "\31\0\1\50\2\51\2\0\1\51\1\0\3\51\5\0"+
    "\1\50\3\51\3\0\1\136\10\50\3\0\1\50\2\51"+
    "\2\0\1\51\1\0\3\51\5\0\1\50\3\51\3\0"+
    "\1\137\10\50\3\0\1\50\2\51\2\0\1\51\1\0"+
    "\3\51\5\0\1\50\3\51\3\0\2\50\1\140\6\50"+
    "\4\0\2\71\4\0\2\71\11\0\1\71\13\0\1\122"+
    "\3\0\3\74\1\141\36\74\10\6\1\142\6\6\1\43"+
    "\22\6\3\10\1\143\36\10\5\0\1\144\53\0\1\145"+
    "\22\0\1\50\2\146\2\0\1\51\1\0\2\146\1\51"+
    "\5\0\1\50\2\51\1\146\3\0\11\50\3\0\1\50"+
    "\2\147\2\0\1\51\1\0\2\147\1\51\5\0\1\50"+
    "\2\51\1\147\3\0\11\50\3\0\1\50\2\51\2\0"+
    "\1\51\1\0\3\51\5\0\1\50\3\51\3\0\1\150"+
    "\10\50\6\0\1\151\36\0\3\10\1\143\1\10\1\152"+
    "\34\10\1\50\2\153\2\0\1\51\1\0\2\153\1\51"+
    "\5\0\1\50\2\51\1\153\3\0\11\50\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2346];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

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
    "\2\1\2\0\2\1\1\0\5\1\4\11\3\1\1\11"+
    "\3\1\1\11\7\1\1\11\7\1\1\0\1\11\2\1"+
    "\3\0\2\11\2\0\1\11\5\0\1\11\1\1\1\0"+
    "\4\1\1\11\1\0\1\1\1\11\1\1\1\11\1\1"+
    "\4\11\2\1\1\0\1\11\4\0\2\1\1\11\1\1"+
    "\1\0\2\1\1\11\1\0\2\11\3\0\1\1\1\11"+
    "\1\1\4\11\1\0\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[107];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Stack<Integer> stack = new Stack<Integer>();

    public void yypushState(int newState) {
      stack.push(yystate());
      yybegin(newState);
    }

    public void yypopState() {
      yybegin(stack.pop());
    }


  _HbLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _HbLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 104) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
        case 2: 
          { return HbTokenTypes.WHITE_SPACE;
          }
        case 40: break;
        case 14: 
          { return HbTokenTypes.OPEN;
          }
        case 41: break;
        case 23: 
          { return HbTokenTypes.OPEN_ENDBLOCK;
          }
        case 42: break;
        case 17: 
          { return HbTokenTypes.ID;
          }
        case 43: break;
        case 16: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { return HbTokenTypes.ID;
          }
        case 44: break;
        case 13: 
          // lookahead expression with fixed lookahead length
          yypushback(1);
          { return HbTokenTypes.ID;
          }
        case 45: break;
        case 33: 
          { yypushback(4); yybegin(comment_end); return HbTokenTypes.COMMENT_CONTENT;
          }
        case 46: break;
        case 5: 
          { return HbTokenTypes.INVALID;
          }
        case 47: break;
        case 15: 
          { yypopState(); return HbTokenTypes.CLOSE;
          }
        case 48: break;
        case 22: 
          { return HbTokenTypes.OPEN_UNESCAPED;
          }
        case 49: break;
        case 11: 
          { return HbTokenTypes.ESCAPE_CHAR;
          }
        case 50: break;
        case 3: 
          { return HbTokenTypes.UNCLOSED_COMMENT;
          }
        case 51: break;
        case 25: 
          { return HbTokenTypes.OPEN_BLOCK;
          }
        case 52: break;
        case 19: 
          // lookahead expression with fixed lookahead length
          yypushback(1);
          { return HbTokenTypes.NUMBER;
          }
        case 53: break;
        case 30: 
          { return HbTokenTypes.OPEN_RAW_BLOCK;
          }
        case 54: break;
        case 36: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 4;
          { return HbTokenTypes.ELSE;
          }
        case 55: break;
        case 8: 
          { return HbTokenTypes.CLOSE_SEXPR;
          }
        case 56: break;
        case 4: 
          { yypopState(); return HbTokenTypes.UNCLOSED_COMMENT;
          }
        case 57: break;
        case 31: 
          { yypopState(); yypushState(raw); return HbTokenTypes.CLOSE_RAW_BLOCK;
          }
        case 58: break;
        case 9: 
          { return HbTokenTypes.EQUALS;
          }
        case 59: break;
        case 10: 
          { return HbTokenTypes.DATA_PREFIX;
          }
        case 60: break;
        case 26: 
          { return HbTokenTypes.OPEN_INVERSE;
          }
        case 61: break;
        case 20: 
          { // otherwise, if the remaining text just contains the one escaped mustache, then it's all CONTENT
        return HbTokenTypes.CONTENT;
          }
        case 62: break;
        case 34: 
          { return HbTokenTypes.END_RAW_BLOCK;
          }
        case 63: break;
        case 1: 
          { return HbTokenTypes.CONTENT;
          }
        case 64: break;
        case 28: 
          { yypopState(); return HbTokenTypes.CLOSE_UNESCAPED;
          }
        case 65: break;
        case 35: 
          { yypopState(); yypushState(comment_block); return HbTokenTypes.COMMENT_OPEN;
          }
        case 66: break;
        case 27: 
          { yypopState(); yypushState(comment); return HbTokenTypes.COMMENT_OPEN;
          }
        case 67: break;
        case 21: 
          { yypopState(); return HbTokenTypes.COMMENT_CLOSE;
          }
        case 68: break;
        case 39: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 5;
          { return HbTokenTypes.BOOLEAN;
          }
        case 69: break;
        case 37: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 4;
          { return HbTokenTypes.BOOLEAN;
          }
        case 70: break;
        case 38: 
          { // backtrack over the END_RAW_BLOCK we picked up at the end of this string
             yypushback(5);

             yypopState();

             // we stray from the handlebars.js lexer here since we need our WHITE_SPACE more clearly delineated
             //    and we need to avoid creating extra tokens for empty strings (makes the parser and formatter happier)
             if (!yytext().toString().equals("")) {
                 if (yytext().toString().trim().length() == 0) {
                     return HbTokenTypes.WHITE_SPACE;
                 } else {
                     return HbTokenTypes.CONTENT;
                 }
             }
          }
        case 71: break;
        case 7: 
          { return HbTokenTypes.OPEN_SEXPR;
          }
        case 72: break;
        case 6: 
          { return HbTokenTypes.SEP;
          }
        case 73: break;
        case 12: 
          { // backtrack over any stache characters at the end of this string
          while (yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("{")) {
            yypushback(1);
          }

          // inspect the characters leading up to this mustache for escaped characters
          if (yylength() > 1 && yytext().subSequence(yylength() - 2, yylength()).toString().equals("\\\\")) {
            return HbTokenTypes.CONTENT; // double-slash is just more content
          } else if (yylength() > 0 && yytext().toString().substring(yylength() - 1, yylength()).equals("\\")) {
            yypushback(1); // put the escape char back
            yypushState(emu);
          } else {
            yypushState(mu);
          }

          // we stray from the handlebars.js lexer here since we need our WHITE_SPACE more clearly delineated
          //    and we need to avoid creating extra tokens for empty strings (makes the parser and formatter happier)
          if (!yytext().toString().equals("")) {
              if (yytext().toString().trim().length() == 0) {
                  return HbTokenTypes.WHITE_SPACE;
              } else {
                  return HbTokenTypes.CONTENT;
              }
          }
          }
        case 74: break;
        case 18: 
          { return HbTokenTypes.STRING;
          }
        case 75: break;
        case 29: 
          { // backtrack over any extra stache characters at the end of this string
      while (yylength() > 2 && yytext().subSequence(yylength() - 3, yylength()).toString().equals("}}}")) {
        yypushback(1);
      }

      yypushback(2);
      yybegin(comment_end);
      return HbTokenTypes.COMMENT_CONTENT;
          }
        case 76: break;
        case 32: 
          { // grab everything up to the next open stache
          // backtrack over any stache characters or escape characters at the end of this string
          while (yylength() > 0
                  && (yytext().subSequence(yylength() - 1, yylength()).toString().equals("{")
                      || yytext().subSequence(yylength() - 1, yylength()).toString().equals("\\"))) {
            yypushback(1);
          }

          yypopState();
          return HbTokenTypes.CONTENT;
          }
        case 77: break;
        case 24: 
          { return HbTokenTypes.OPEN_PARTIAL;
          }
        case 78: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
