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
		REFERENCE=8, OPENPAR=9, CLOSEPAR=10, COMMA=11, ASSIGN=12, VARIABLE=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "WHITESPACE", "NEWLINE", "EXPLORE", "MAX_ABS_ERROR", 
		"REFERENCE", "OPENPAR", "CLOSEPAR", "COMMA", "ASSIGN", "VARIABLE", "DigitSequence", 
		"IdentifierNondigit", "Nondigit", "Digit", "UniversalCharacterName", "HexQuad", 
		"HexadecimalDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'pragma'", "'tuner'", "' '", "'\n'", "'explore'", "'max_abs_error'", 
		"'reference'", "'('", "')'", "','", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WHITESPACE", "NEWLINE", "EXPLORE", "MAX_ABS_ERROR", 
		"REFERENCE", "OPENPAR", "CLOSEPAR", "COMMA", "ASSIGN", "VARIABLE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\16\7\16n\n\16\f\16\16\16q\13\16\3\17\6\17t\n\17"+
		"\r\17\16\17u\3\20\3\20\5\20z\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u008a\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\2\37\2!\2#\2%\2\'\2)\2\3\2\5\5\2C\\aac|\3\2\62;\5\2"+
		"\62;CHch\u008f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7\64\3\2"+
		"\2\2\t:\3\2\2\2\13>\3\2\2\2\rB\3\2\2\2\17J\3\2\2\2\21X\3\2\2\2\23b\3\2"+
		"\2\2\25d\3\2\2\2\27f\3\2\2\2\31h\3\2\2\2\33j\3\2\2\2\35s\3\2\2\2\37y\3"+
		"\2\2\2!{\3\2\2\2#}\3\2\2\2%\u0089\3\2\2\2\'\u008b\3\2\2\2)\u0090\3\2\2"+
		"\2+,\7%\2\2,\4\3\2\2\2-.\7r\2\2./\7t\2\2/\60\7c\2\2\60\61\7i\2\2\61\62"+
		"\7o\2\2\62\63\7c\2\2\63\6\3\2\2\2\64\65\7v\2\2\65\66\7w\2\2\66\67\7p\2"+
		"\2\678\7g\2\289\7t\2\29\b\3\2\2\2:;\7\"\2\2;<\3\2\2\2<=\b\5\2\2=\n\3\2"+
		"\2\2>?\7\f\2\2?@\3\2\2\2@A\b\6\2\2A\f\3\2\2\2BC\7g\2\2CD\7z\2\2DE\7r\2"+
		"\2EF\7n\2\2FG\7q\2\2GH\7t\2\2HI\7g\2\2I\16\3\2\2\2JK\7o\2\2KL\7c\2\2L"+
		"M\7z\2\2MN\7a\2\2NO\7c\2\2OP\7d\2\2PQ\7u\2\2QR\7a\2\2RS\7g\2\2ST\7t\2"+
		"\2TU\7t\2\2UV\7q\2\2VW\7t\2\2W\20\3\2\2\2XY\7t\2\2YZ\7g\2\2Z[\7h\2\2["+
		"\\\7g\2\2\\]\7t\2\2]^\7g\2\2^_\7p\2\2_`\7e\2\2`a\7g\2\2a\22\3\2\2\2bc"+
		"\7*\2\2c\24\3\2\2\2de\7+\2\2e\26\3\2\2\2fg\7.\2\2g\30\3\2\2\2hi\7?\2\2"+
		"i\32\3\2\2\2jo\5\37\20\2kn\5\37\20\2ln\5#\22\2mk\3\2\2\2ml\3\2\2\2nq\3"+
		"\2\2\2om\3\2\2\2op\3\2\2\2p\34\3\2\2\2qo\3\2\2\2rt\5#\22\2sr\3\2\2\2t"+
		"u\3\2\2\2us\3\2\2\2uv\3\2\2\2v\36\3\2\2\2wz\5!\21\2xz\5%\23\2yw\3\2\2"+
		"\2yx\3\2\2\2z \3\2\2\2{|\t\2\2\2|\"\3\2\2\2}~\t\3\2\2~$\3\2\2\2\177\u0080"+
		"\7^\2\2\u0080\u0081\7w\2\2\u0081\u0082\3\2\2\2\u0082\u008a\5\'\24\2\u0083"+
		"\u0084\7^\2\2\u0084\u0085\7W\2\2\u0085\u0086\3\2\2\2\u0086\u0087\5\'\24"+
		"\2\u0087\u0088\5\'\24\2\u0088\u008a\3\2\2\2\u0089\177\3\2\2\2\u0089\u0083"+
		"\3\2\2\2\u008a&\3\2\2\2\u008b\u008c\5)\25\2\u008c\u008d\5)\25\2\u008d"+
		"\u008e\5)\25\2\u008e\u008f\5)\25\2\u008f(\3\2\2\2\u0090\u0091\t\4\2\2"+
		"\u0091*\3\2\2\2\b\2mouy\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}