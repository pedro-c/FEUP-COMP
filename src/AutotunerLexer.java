// Generated from /home/bernardo/Documents/FEUP-COMP/src/Autotuner.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AutotunerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TUNER=1, EXPLORE=2, MAX_ABS_ERROR=3, REFERENCE=4, OPENPAR=5, CLOSEPAR=6, 
		COMMA=7, ASSIGN=8, SLASH=9, STAR=10, DISCARD=11, WHITESPACE=12, NEWLINE=13, 
		LINE_CMT=14, BLOCK_CMT=15, PRAGMA_TUNER=16, PRAGMA=17, NUMBER=18, VARIABLE=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TUNER", "EXPLORE", "MAX_ABS_ERROR", "REFERENCE", "OPENPAR", "CLOSEPAR", 
		"COMMA", "ASSIGN", "SLASH", "STAR", "DISCARD", "WHITESPACE", "NEWLINE", 
		"LINE_CMT", "BLOCK_CMT", "PRAGMA_TUNER", "PRAGMA", "NUMBER", "VARIABLE", 
		"DigitSequence", "IdentifierNondigit", "Nondigit", "Digit", "UniversalCharacterName", 
		"HexQuad", "HexadecimalDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'tuner'", "'explore'", "'max_abs_error'", "'reference'", "'('", 
		"')'", "','", "'='", "'/'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TUNER", "EXPLORE", "MAX_ABS_ERROR", "REFERENCE", "OPENPAR", "CLOSEPAR", 
		"COMMA", "ASSIGN", "SLASH", "STAR", "DISCARD", "WHITESPACE", "NEWLINE", 
		"LINE_CMT", "BLOCK_CMT", "PRAGMA_TUNER", "PRAGMA", "NUMBER", "VARIABLE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AutotunerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Autotuner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\6\fk\n\f\r\f\16\fl\3\f\3\f\3\r\6\rr\n\r\r\r\16"+
		"\rs\3\r\3\r\3\16\6\16y\n\16\r\16\16\16z\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\7\24\u009c\n\24"+
		"\f\24\16\24\u009f\13\24\3\25\6\25\u00a2\n\25\r\25\16\25\u00a3\3\26\3\26"+
		"\5\26\u00a8\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u00b8\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3l"+
		"\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\2\61\2\63\2\65\2\3\2\7\4\2\13\13"+
		"\"\"\3\2\f\f\5\2C\\aac|\3\2\62;\5\2\62;CHch\u00c0\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\3\67\3\2\2\2\5=\3\2\2\2\7E\3\2\2\2\tS\3\2\2\2\13]\3\2\2\2\r_\3"+
		"\2\2\2\17a\3\2\2\2\21c\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27j\3\2\2\2\31"+
		"q\3\2\2\2\33x\3\2\2\2\35~\3\2\2\2\37\u0083\3\2\2\2!\u0089\3\2\2\2#\u008d"+
		"\3\2\2\2%\u0096\3\2\2\2\'\u0098\3\2\2\2)\u00a1\3\2\2\2+\u00a7\3\2\2\2"+
		"-\u00a9\3\2\2\2/\u00ab\3\2\2\2\61\u00b7\3\2\2\2\63\u00b9\3\2\2\2\65\u00be"+
		"\3\2\2\2\678\7v\2\289\7w\2\29:\7p\2\2:;\7g\2\2;<\7t\2\2<\4\3\2\2\2=>\7"+
		"g\2\2>?\7z\2\2?@\7r\2\2@A\7n\2\2AB\7q\2\2BC\7t\2\2CD\7g\2\2D\6\3\2\2\2"+
		"EF\7o\2\2FG\7c\2\2GH\7z\2\2HI\7a\2\2IJ\7c\2\2JK\7d\2\2KL\7u\2\2LM\7a\2"+
		"\2MN\7g\2\2NO\7t\2\2OP\7t\2\2PQ\7q\2\2QR\7t\2\2R\b\3\2\2\2ST\7t\2\2TU"+
		"\7g\2\2UV\7h\2\2VW\7g\2\2WX\7t\2\2XY\7g\2\2YZ\7p\2\2Z[\7e\2\2[\\\7g\2"+
		"\2\\\n\3\2\2\2]^\7*\2\2^\f\3\2\2\2_`\7+\2\2`\16\3\2\2\2ab\7.\2\2b\20\3"+
		"\2\2\2cd\7?\2\2d\22\3\2\2\2ef\7\61\2\2f\24\3\2\2\2gh\7,\2\2h\26\3\2\2"+
		"\2ik\13\2\2\2ji\3\2\2\2kl\3\2\2\2lm\3\2\2\2lj\3\2\2\2mn\3\2\2\2no\b\f"+
		"\2\2o\30\3\2\2\2pr\t\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3"+
		"\2\2\2uv\b\r\2\2v\32\3\2\2\2wy\t\3\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z"+
		"{\3\2\2\2{|\3\2\2\2|}\b\16\2\2}\34\3\2\2\2~\177\5\23\n\2\177\u0080\5\23"+
		"\n\2\u0080\u0081\5\27\f\2\u0081\u0082\5\33\16\2\u0082\36\3\2\2\2\u0083"+
		"\u0084\5\23\n\2\u0084\u0085\5\25\13\2\u0085\u0086\5\27\f\2\u0086\u0087"+
		"\5\25\13\2\u0087\u0088\5\23\n\2\u0088 \3\2\2\2\u0089\u008a\5#\22\2\u008a"+
		"\u008b\5\31\r\2\u008b\u008c\5\3\2\2\u008c\"\3\2\2\2\u008d\u008e\7%\2\2"+
		"\u008e\u008f\5\31\r\2\u008f\u0090\7r\2\2\u0090\u0091\7t\2\2\u0091\u0092"+
		"\7c\2\2\u0092\u0093\7i\2\2\u0093\u0094\7o\2\2\u0094\u0095\7c\2\2\u0095"+
		"$\3\2\2\2\u0096\u0097\5)\25\2\u0097&\3\2\2\2\u0098\u009d\5+\26\2\u0099"+
		"\u009c\5+\26\2\u009a\u009c\5/\30\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"(\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\5/\30\2\u00a1\u00a0\3\2\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4*\3"+
		"\2\2\2\u00a5\u00a8\5-\27\2\u00a6\u00a8\5\61\31\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8,\3\2\2\2\u00a9\u00aa\t\4\2\2\u00aa.\3\2\2\2\u00ab"+
		"\u00ac\t\5\2\2\u00ac\60\3\2\2\2\u00ad\u00ae\7^\2\2\u00ae\u00af\7w\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\u00b8\5\63\32\2\u00b1\u00b2\7^\2\2\u00b2\u00b3"+
		"\7W\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\5\63\32\2\u00b5\u00b6\5\63\32"+
		"\2\u00b6\u00b8\3\2\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b8\62"+
		"\3\2\2\2\u00b9\u00ba\5\65\33\2\u00ba\u00bb\5\65\33\2\u00bb\u00bc\5\65"+
		"\33\2\u00bc\u00bd\5\65\33\2\u00bd\64\3\2\2\2\u00be\u00bf\t\6\2\2\u00bf"+
		"\66\3\2\2\2\13\2lsz\u009b\u009d\u00a3\u00a7\u00b7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}