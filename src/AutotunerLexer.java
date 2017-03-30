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
		T__0=1, T__1=2, T__2=3, WHITESPACE=4, NEWLINE=5, EXPLORE=6, MAX_ABS_ERROR=7, 
		REFERENCE=8, OPENPAR=9, CLOSEPAR=10, COMMA=11, ASSIGN=12, NUMBER=13, VARIABLE=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "WHITESPACE", "NEWLINE", "EXPLORE", "MAX_ABS_ERROR", 
		"REFERENCE", "OPENPAR", "CLOSEPAR", "COMMA", "ASSIGN", "NUMBER", "VARIABLE", 
		"DigitSequence", "IdentifierNondigit", "Nondigit", "Digit", "UniversalCharacterName", 
		"HexQuad", "HexadecimalDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'pragma'", "'tuner'", "' '", "'\n'", "'explore'", "'max_abs_error'", 
		"'reference'", "'('", "')'", "','", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WHITESPACE", "NEWLINE", "EXPLORE", "MAX_ABS_ERROR", 
		"REFERENCE", "OPENPAR", "CLOSEPAR", "COMMA", "ASSIGN", "NUMBER", "VARIABLE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\7\17r\n\17\f\17\16\17u"+
		"\13\17\3\20\6\20x\n\20\r\20\16\20y\3\21\3\21\5\21~\n\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u008e\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2#\2%\2\'\2)\2+\2\3\2"+
		"\5\5\2C\\aac|\3\2\62;\5\2\62;CHch\u0093\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\66\3\2\2\2\t<\3\2\2\2\13@\3\2\2\2\rD"+
		"\3\2\2\2\17L\3\2\2\2\21Z\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31"+
		"j\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37w\3\2\2\2!}\3\2\2\2#\177\3\2\2\2%"+
		"\u0081\3\2\2\2\'\u008d\3\2\2\2)\u008f\3\2\2\2+\u0094\3\2\2\2-.\7%\2\2"+
		".\4\3\2\2\2/\60\7r\2\2\60\61\7t\2\2\61\62\7c\2\2\62\63\7i\2\2\63\64\7"+
		"o\2\2\64\65\7c\2\2\65\6\3\2\2\2\66\67\7v\2\2\678\7w\2\289\7p\2\29:\7g"+
		"\2\2:;\7t\2\2;\b\3\2\2\2<=\7\"\2\2=>\3\2\2\2>?\b\5\2\2?\n\3\2\2\2@A\7"+
		"\f\2\2AB\3\2\2\2BC\b\6\2\2C\f\3\2\2\2DE\7g\2\2EF\7z\2\2FG\7r\2\2GH\7n"+
		"\2\2HI\7q\2\2IJ\7t\2\2JK\7g\2\2K\16\3\2\2\2LM\7o\2\2MN\7c\2\2NO\7z\2\2"+
		"OP\7a\2\2PQ\7c\2\2QR\7d\2\2RS\7u\2\2ST\7a\2\2TU\7g\2\2UV\7t\2\2VW\7t\2"+
		"\2WX\7q\2\2XY\7t\2\2Y\20\3\2\2\2Z[\7t\2\2[\\\7g\2\2\\]\7h\2\2]^\7g\2\2"+
		"^_\7t\2\2_`\7g\2\2`a\7p\2\2ab\7e\2\2bc\7g\2\2c\22\3\2\2\2de\7*\2\2e\24"+
		"\3\2\2\2fg\7+\2\2g\26\3\2\2\2hi\7.\2\2i\30\3\2\2\2jk\7?\2\2k\32\3\2\2"+
		"\2lm\5\37\20\2m\34\3\2\2\2ns\5!\21\2or\5!\21\2pr\5%\23\2qo\3\2\2\2qp\3"+
		"\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\36\3\2\2\2us\3\2\2\2vx\5%\23\2w"+
		"v\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z \3\2\2\2{~\5#\22\2|~\5\'\24\2"+
		"}{\3\2\2\2}|\3\2\2\2~\"\3\2\2\2\177\u0080\t\2\2\2\u0080$\3\2\2\2\u0081"+
		"\u0082\t\3\2\2\u0082&\3\2\2\2\u0083\u0084\7^\2\2\u0084\u0085\7w\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u008e\5)\25\2\u0087\u0088\7^\2\2\u0088\u0089\7W\2"+
		"\2\u0089\u008a\3\2\2\2\u008a\u008b\5)\25\2\u008b\u008c\5)\25\2\u008c\u008e"+
		"\3\2\2\2\u008d\u0083\3\2\2\2\u008d\u0087\3\2\2\2\u008e(\3\2\2\2\u008f"+
		"\u0090\5+\26\2\u0090\u0091\5+\26\2\u0091\u0092\5+\26\2\u0092\u0093\5+"+
		"\26\2\u0093*\3\2\2\2\u0094\u0095\t\4\2\2\u0095,\3\2\2\2\b\2qsy}\u008d"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}