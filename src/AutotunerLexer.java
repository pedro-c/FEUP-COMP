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
		PRAGMA_TUNER=1, TUNER_ID=2, EXPLORE=3, MAX_ABS_ERROR=4, WHITESPACE=5, 
		NEWLINE=6, VARIABLE=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRAGMA_TUNER", "TUNER_ID", "EXPLORE", "MAX_ABS_ERROR", "WHITESPACE", 
		"NEWLINE", "VARIABLE", "DigitSequence", "IdentifierNondigit", "Nondigit", 
		"Digit", "UniversalCharacterName", "HexQuad", "HexadecimalDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "' '", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRAGMA_TUNER", "TUNER_ID", "EXPLORE", "MAX_ABS_ERROR", "WHITESPACE", 
		"NEWLINE", "VARIABLE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t\u00be\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2\"\n\2\f\2\16\2%"+
		"\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2/\n\2\r\2\16\2\60\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\6\2:\n\2\r\2\16\2;\3\3\3\3\5\3@\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\6\4K\n\4\r\4\16\4L\3\4\3\4\7\4Q\n\4\f\4\16\4T\13\4"+
		"\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\7\4_\n\4\f\4\16\4b\13\4\3\4\3"+
		"\4\7\4f\n\4\f\4\16\4i\13\4\3\4\3\4\7\4m\n\4\f\4\16\4p\13\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u0083\n\5"+
		"\r\5\16\5\u0084\3\5\3\5\6\5\u0089\n\5\r\5\16\5\u008a\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3"+
		"\t\6\t\u00a0\n\t\r\t\16\t\u00a1\3\n\3\n\5\n\u00a6\n\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25"+
		"\2\27\2\31\2\33\2\35\2\3\2\5\5\2C\\aac|\3\2\62;\5\2\62;CHch\u00c7\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\3\37\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\ts\3\2\2\2\13\u008e\3"+
		"\2\2\2\r\u0092\3\2\2\2\17\u0096\3\2\2\2\21\u009f\3\2\2\2\23\u00a5\3\2"+
		"\2\2\25\u00a7\3\2\2\2\27\u00a9\3\2\2\2\31\u00b5\3\2\2\2\33\u00b7\3\2\2"+
		"\2\35\u00bc\3\2\2\2\37#\7%\2\2 \"\5\13\6\2! \3\2\2\2\"%\3\2\2\2#!\3\2"+
		"\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7r\2\2\'(\7t\2\2()\7c\2\2)*\7i\2"+
		"\2*+\7o\2\2+,\7c\2\2,.\3\2\2\2-/\5\13\6\2.-\3\2\2\2/\60\3\2\2\2\60.\3"+
		"\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7v\2\2\63\64\7w\2\2\64\65\7p"+
		"\2\2\65\66\7g\2\2\66\67\7t\2\2\679\3\2\2\28:\5\13\6\298\3\2\2\2:;\3\2"+
		"\2\2;9\3\2\2\2;<\3\2\2\2<\4\3\2\2\2=@\5\7\4\2>@\5\t\5\2?=\3\2\2\2?>\3"+
		"\2\2\2@\6\3\2\2\2AB\7g\2\2BC\7z\2\2CD\7r\2\2DE\7n\2\2EF\7q\2\2FG\7t\2"+
		"\2GH\7g\2\2HJ\3\2\2\2IK\5\13\6\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2"+
		"\2MN\3\2\2\2NR\5\17\b\2OQ\5\13\6\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2SU\3\2\2\2TR\3\2\2\2UY\7*\2\2VX\5\13\6\2WV\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\`\5\21\t\2]_\5\13\6\2^]\3\2\2\2_"+
		"b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cg\7.\2\2df\5\13\6\2"+
		"ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jn\5\21\t"+
		"\2km\5\13\6\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2"+
		"\2\2qr\7+\2\2r\b\3\2\2\2st\7o\2\2tu\7c\2\2uv\7z\2\2vw\7a\2\2wx\7c\2\2"+
		"xy\7d\2\2yz\7u\2\2z{\7a\2\2{|\7g\2\2|}\7t\2\2}~\7t\2\2~\177\7q\2\2\177"+
		"\u0080\7t\2\2\u0080\u0082\3\2\2\2\u0081\u0083\5\13\6\2\u0082\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0088\5\17\b\2\u0087\u0089\5\13\6\2\u0088\u0087\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\5\21\t\2\u008d\n\3\2\2\2\u008e\u008f\7\"\2"+
		"\2\u008f\u0090\3\2\2\2\u0090\u0091\b\6\2\2\u0091\f\3\2\2\2\u0092\u0093"+
		"\7\f\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\7\2\2\u0095\16\3\2\2\2\u0096"+
		"\u009b\5\23\n\2\u0097\u009a\5\23\n\2\u0098\u009a\5\27\f\2\u0099\u0097"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\20\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\5\27\f"+
		"\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\22\3\2\2\2\u00a3\u00a6\5\25\13\2\u00a4\u00a6\5\31\r\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\24\3\2\2\2\u00a7\u00a8\t\2\2"+
		"\2\u00a8\26\3\2\2\2\u00a9\u00aa\t\3\2\2\u00aa\30\3\2\2\2\u00ab\u00ac\7"+
		"^\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b6\5\33\16\2\u00af"+
		"\u00b0\7^\2\2\u00b0\u00b1\7W\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\5\33"+
		"\16\2\u00b3\u00b4\5\33\16\2\u00b4\u00b6\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b5"+
		"\u00af\3\2\2\2\u00b6\32\3\2\2\2\u00b7\u00b8\5\35\17\2\u00b8\u00b9\5\35"+
		"\17\2\u00b9\u00ba\5\35\17\2\u00ba\u00bb\5\35\17\2\u00bb\34\3\2\2\2\u00bc"+
		"\u00bd\t\4\2\2\u00bd\36\3\2\2\2\24\2#\60;?LRY`gn\u0084\u008a\u0099\u009b"+
		"\u00a1\u00a5\u00b5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}