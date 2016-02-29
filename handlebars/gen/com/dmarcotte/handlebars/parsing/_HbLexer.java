/* The following code was generated by JFlex 1.4.3 on 2/28/16 5:45 PM */

// We base our lexer directly on the official handlebars.l lexer definition,
// making some modifications to account for Jison/JFlex syntax and functionality differences
//
// Revision ported: https://github.com/wycats/handlebars.js/blob/b8a9f7264d3b6ac48514272bf35291736cedad00/src/handlebars.l

package com.dmarcotte.handlebars.parsing;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.containers.Stack;

// suppress various warnings/inspections for the generated class
@SuppressWarnings ({"FieldCanBeLocal", "UnusedDeclaration", "UnusedAssignment", "AccessStaticViaInstance", "MismatchedReadAndWriteOfArray", "WeakerAccess", "SameParameterValue", "CanBeFinal", "SameReturnValue", "RedundantThrows", "ConstantConditions"})

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2/28/16 5:45 PM from the specification file
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
    "\11\0\1\1\1\2\1\23\1\1\1\1\22\0\1\1\1\16\1\24"+
    "\1\13\1\0\1\40\1\15\1\25\1\6\1\7\3\40\1\17\1\21"+
    "\1\5\12\37\1\0\2\40\1\20\1\12\1\0\1\26\32\0\1\41"+
    "\1\4\1\42\1\14\1\0\1\40\1\36\3\0\1\27\1\35\5\0"+
    "\1\30\5\0\1\33\1\31\1\32\1\34\5\0\1\3\1\22\1\10"+
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
    "\1\12\2\5\1\13\6\5\1\2\1\5\1\14\2\3"+
    "\1\4\2\5\1\1\1\15\1\0\1\16\1\17\1\20"+
    "\3\0\1\21\1\22\2\0\1\23\6\0\1\24\1\16"+
    "\1\0\1\25\1\3\1\26\1\4\1\26\1\0\1\1"+
    "\1\15\1\27\1\30\1\17\1\31\1\32\1\33\1\17"+
    "\1\34\1\35\1\0\1\20\3\0\1\16\1\0\1\25"+
    "\2\36\1\4\1\0\1\1\1\37\1\27\1\40\1\0"+
    "\1\41\1\35\4\0\1\42\1\43\1\44\1\1\1\45"+
    "\1\46\1\47\1\50\1\0\1\43\1\51\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[114];
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
    "\0\0\0\43\0\106\0\151\0\214\0\257\0\322\0\365"+
    "\0\u0118\0\u013b\0\u015e\0\u0181\0\u01a4\0\u01a4\0\u01a4\0\u01a4"+
    "\0\u01c7\0\u01ea\0\u020d\0\u01a4\0\u0230\0\u01a4\0\u0253\0\u0276"+
    "\0\u01a4\0\u0299\0\u02bc\0\u02df\0\u0302\0\u0325\0\u0348\0\u036b"+
    "\0\u038e\0\u01a4\0\u03b1\0\u03d4\0\u03f7\0\u041a\0\u043d\0\u0460"+
    "\0\u0483\0\u013b\0\u01a4\0\u04a6\0\u04c9\0\u04ec\0\u050f\0\u0325"+
    "\0\u01a4\0\u01a4\0\u0253\0\u0532\0\u01a4\0\u0276\0\u0555\0\u0578"+
    "\0\u059b\0\u05be\0\u05e1\0\u01a4\0\u0604\0\u0348\0\u0627\0\u064a"+
    "\0\u066d\0\u0690\0\u01a4\0\u06b3\0\u06d6\0\u01a4\0\u06f9\0\u01a4"+
    "\0\u071c\0\u01a4\0\u073f\0\u01a4\0\u01a4\0\u0762\0\u0785\0\u07a8"+
    "\0\u01a4\0\u07cb\0\u07ee\0\u0811\0\u0834\0\u0857\0\u087a\0\u066d"+
    "\0\u01a4\0\u089d\0\u041a\0\u08c0\0\u08e3\0\u01a4\0\u01a4\0\u0906"+
    "\0\u01a4\0\u01a4\0\u0929\0\u094c\0\u096f\0\u0834\0\u01a4\0\u0992"+
    "\0\u01a4\0\u09b5\0\u01a4\0\u01a4\0\u01a4\0\u01a4\0\u09d8\0\u01a4"+
    "\0\u01a4\0\u01a4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[114];
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
    "\3\1\1\11\37\1\1\12\2\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\5\15\1\23\1\24\1\25"+
    "\1\26\1\13\1\27\1\30\1\31\1\32\2\12\1\33"+
    "\2\12\1\34\1\35\1\36\1\15\1\37\2\15\2\40"+
    "\1\41\1\42\37\15\2\40\40\15\10\43\1\44\32\43"+
    "\17\6\1\45\23\6\1\15\2\40\5\15\1\46\6\15"+
    "\1\47\23\15\3\10\1\50\37\10\3\1\1\51\37\1"+
    "\1\52\2\53\2\0\1\53\1\0\3\53\5\0\1\52"+
    "\4\53\3\0\11\52\4\0\2\13\20\0\1\13\22\0"+
    "\1\54\112\0\1\55\1\56\41\0\1\57\32\0\1\52"+
    "\2\53\2\0\1\53\1\0\3\53\5\0\1\52\4\53"+
    "\3\0\10\52\1\60\4\0\2\61\5\0\2\61\7\0"+
    "\1\62\2\61\17\0\4\63\1\64\17\63\1\65\16\63"+
    "\4\66\1\67\20\66\1\65\15\66\1\52\2\53\2\0"+
    "\1\53\1\0\3\53\5\0\1\52\4\53\3\0\1\52"+
    "\1\70\7\52\3\0\1\52\2\53\2\0\1\53\1\0"+
    "\3\53\5\0\1\52\4\53\3\0\4\52\1\71\4\52"+
    "\3\0\1\52\2\53\2\0\1\53\1\0\3\53\5\0"+
    "\1\52\4\53\3\0\7\52\1\72\1\52\3\0\1\52"+
    "\2\53\2\0\1\53\1\0\3\53\5\0\1\52\4\53"+
    "\3\0\2\52\1\73\6\52\3\0\1\52\2\74\2\0"+
    "\1\53\1\0\2\74\1\53\5\0\1\52\1\53\1\75"+
    "\1\53\1\74\3\0\10\52\1\60\3\0\42\76\1\62"+
    "\1\0\2\40\43\0\1\77\37\0\10\43\1\100\42\43"+
    "\1\101\32\43\17\6\1\102\23\6\10\0\1\103\51\0"+
    "\1\104\23\0\3\10\1\105\37\10\3\0\1\106\42\0"+
    "\1\107\1\0\1\110\3\0\1\111\1\112\1\113\1\114"+
    "\1\115\1\116\34\0\1\117\42\0\1\120\42\0\1\121"+
    "\32\0\2\63\1\0\40\63\2\66\1\0\40\66\1\52"+
    "\2\53\2\0\1\53\1\0\3\53\5\0\1\52\4\53"+
    "\3\0\2\52\1\122\6\52\3\0\1\52\2\53\2\0"+
    "\1\53\1\0\3\53\5\0\1\52\4\53\3\0\5\52"+
    "\1\123\3\52\3\0\1\52\2\53\2\0\1\53\1\0"+
    "\3\53\5\0\1\52\4\53\3\0\1\52\1\124\7\52"+
    "\3\0\1\52\2\125\2\0\1\53\1\0\3\53\5\0"+
    "\1\52\3\53\1\125\3\0\11\52\42\0\1\126\3\0"+
    "\3\77\1\127\37\77\10\43\1\130\32\43\10\0\1\131"+
    "\32\0\10\6\1\132\6\6\1\102\23\6\10\0\1\133"+
    "\32\0\3\10\1\134\37\10\3\0\1\135\42\0\1\136"+
    "\1\0\1\110\4\0\1\112\1\113\1\114\1\115\37\0"+
    "\1\137\47\0\1\140\33\0\1\141\42\0\1\142\32\0"+
    "\1\52\2\53\2\0\1\53\1\0\3\53\5\0\1\52"+
    "\4\53\3\0\1\143\10\52\3\0\1\52\2\53\2\0"+
    "\1\53\1\0\3\53\5\0\1\52\4\53\3\0\1\144"+
    "\10\52\3\0\1\52\2\53\2\0\1\53\1\0\3\53"+
    "\5\0\1\52\4\53\3\0\2\52\1\145\6\52\4\0"+
    "\2\146\17\0\1\147\1\146\20\0\2\74\4\0\2\74"+
    "\12\0\1\74\13\0\1\126\3\0\3\77\1\150\37\77"+
    "\10\6\1\151\6\6\1\45\23\6\3\10\1\152\37\10"+
    "\5\0\1\153\54\0\1\154\23\0\1\52\2\155\2\0"+
    "\1\53\1\0\2\155\1\53\5\0\1\52\3\53\1\155"+
    "\3\0\11\52\3\0\1\52\2\156\2\0\1\53\1\0"+
    "\2\156\1\53\5\0\1\52\3\53\1\156\3\0\11\52"+
    "\3\0\1\52\2\53\2\0\1\53\1\0\3\53\5\0"+
    "\1\52\4\53\3\0\1\157\10\52\6\0\1\160\37\0"+
    "\3\10\1\152\1\10\1\161\35\10\1\52\2\162\2\0"+
    "\1\53\1\0\2\162\1\53\5\0\1\52\3\53\1\162"+
    "\3\0\11\52\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2555];
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
    "\1\1\1\11\2\1\1\11\10\1\1\11\7\1\1\0"+
    "\1\11\2\1\3\0\2\11\2\0\1\11\6\0\1\11"+
    "\1\1\1\0\4\1\1\11\1\0\1\1\1\11\1\1"+
    "\1\11\1\1\1\11\1\1\2\11\2\1\1\0\1\11"+
    "\3\0\1\1\1\0\2\1\1\11\1\1\1\0\2\1"+
    "\2\11\1\0\2\11\4\0\1\11\1\1\1\11\1\1"+
    "\4\11\1\0\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[114];
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
        case 43: break;
        case 15: 
          { return HbTokenTypes.OPEN;
          }
        case 44: break;
        case 24: 
          { return HbTokenTypes.OPEN_ENDBLOCK;
          }
        case 45: break;
        case 17: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { return HbTokenTypes.ID;
          }
        case 46: break;
        case 14: 
          // lookahead expression with fixed lookahead length
          yypushback(1);
          { return HbTokenTypes.ID;
          }
        case 47: break;
        case 18: 
          { return HbTokenTypes.ID;
          }
        case 48: break;
        case 36: 
          { yypushback(4); yybegin(comment_end); return HbTokenTypes.COMMENT_CONTENT;
          }
        case 49: break;
        case 5: 
          { return HbTokenTypes.INVALID;
          }
        case 50: break;
        case 16: 
          { yypopState(); return HbTokenTypes.CLOSE;
          }
        case 51: break;
        case 23: 
          { return HbTokenTypes.OPEN_UNESCAPED;
          }
        case 52: break;
        case 12: 
          { return HbTokenTypes.ESCAPE_CHAR;
          }
        case 53: break;
        case 3: 
          { return HbTokenTypes.UNCLOSED_COMMENT;
          }
        case 54: break;
        case 26: 
          { return HbTokenTypes.OPEN_BLOCK;
          }
        case 55: break;
        case 20: 
          // lookahead expression with fixed lookahead length
          yypushback(1);
          { return HbTokenTypes.NUMBER;
          }
        case 56: break;
        case 31: 
          { return HbTokenTypes.OPEN_RAW_BLOCK;
          }
        case 57: break;
        case 39: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 4;
          { return HbTokenTypes.ELSE;
          }
        case 58: break;
        case 34: 
          { return HbTokenTypes.OPEN_BLOCK_PARAMS;
          }
        case 59: break;
        case 8: 
          { return HbTokenTypes.CLOSE_SEXPR;
          }
        case 60: break;
        case 32: 
          { return HbTokenTypes.OPEN_PARTIAL_BLOCK;
          }
        case 61: break;
        case 4: 
          { yypopState(); return HbTokenTypes.UNCLOSED_COMMENT;
          }
        case 62: break;
        case 33: 
          { yypopState(); yypushState(raw); return HbTokenTypes.CLOSE_RAW_BLOCK;
          }
        case 63: break;
        case 9: 
          { return HbTokenTypes.EQUALS;
          }
        case 64: break;
        case 11: 
          { return HbTokenTypes.DATA_PREFIX;
          }
        case 65: break;
        case 27: 
          { return HbTokenTypes.OPEN_INVERSE;
          }
        case 66: break;
        case 21: 
          { // otherwise, if the remaining text just contains the one escaped mustache, then it's all CONTENT
        return HbTokenTypes.CONTENT;
          }
        case 67: break;
        case 37: 
          { return HbTokenTypes.END_RAW_BLOCK;
          }
        case 68: break;
        case 10: 
          { return HbTokenTypes.CLOSE_BLOCK_PARAMS;
          }
        case 69: break;
        case 1: 
          { return HbTokenTypes.CONTENT;
          }
        case 70: break;
        case 38: 
          { yypopState(); yypushState(comment_block); return HbTokenTypes.COMMENT_OPEN;
          }
        case 71: break;
        case 29: 
          { yypopState(); return HbTokenTypes.CLOSE_UNESCAPED;
          }
        case 72: break;
        case 28: 
          { yypopState(); yypushState(comment); return HbTokenTypes.COMMENT_OPEN;
          }
        case 73: break;
        case 22: 
          { yypopState(); return HbTokenTypes.COMMENT_CLOSE;
          }
        case 74: break;
        case 42: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 5;
          { return HbTokenTypes.BOOLEAN;
          }
        case 75: break;
        case 40: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 4;
          { return HbTokenTypes.BOOLEAN;
          }
        case 76: break;
        case 41: 
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
        case 77: break;
        case 7: 
          { return HbTokenTypes.OPEN_SEXPR;
          }
        case 78: break;
        case 6: 
          { return HbTokenTypes.SEP;
          }
        case 79: break;
        case 13: 
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
        case 80: break;
        case 19: 
          { return HbTokenTypes.STRING;
          }
        case 81: break;
        case 30: 
          { // backtrack over any extra stache characters at the end of this string
      while (yylength() > 2 && yytext().subSequence(yylength() - 3, yylength()).toString().equals("}}}")) {
        yypushback(1);
      }

      yypushback(2);
      yybegin(comment_end);
      return HbTokenTypes.COMMENT_CONTENT;
          }
        case 82: break;
        case 35: 
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
        case 83: break;
        case 25: 
          { return HbTokenTypes.OPEN_PARTIAL;
          }
        case 84: break;
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
