// Generated from /home/bernardo/Documents/FEUP-COMP/src/AutotunerLexer.g4 by ANTLR 4.6
package gen;
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
		PRAGMA_TUNER=1, EXPLORE=2, MAX_ABS_ERROR=3, NUMBER=4, VARIABLE=5, IDENTIFIER=6, 
		UNIVERSAL_CHAR=7, HEX_QUAD=8, WHITESPACE=9, NEWLINE=10, LEFT_PARENTHESIS=11, 
		RIGHT_PARENTHESIS=12, COMMA=13, NONUMBER=14, HEXADIGIT=15, SU=16, BU=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRAGMA_TUNER", "EXPLORE", "MAX_ABS_ERROR", "NUMBER", "VARIABLE", "IDENTIFIER", 
		"UNIVERSAL_CHAR", "HEX_QUAD", "WHITESPACE", "NEWLINE", "LEFT_PARENTHESIS", 
		"RIGHT_PARENTHESIS", "COMMA", "NONUMBER", "HEXADIGIT", "SU", "BU", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'explore'", "'max_abs_error'", null, null, null, null, null, 
		"' '", "'\n'", "'('", "')'", "','", null, null, "'\\u'", "'\\U'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRAGMA_TUNER", "EXPLORE", "MAX_ABS_ERROR", "NUMBER", "VARIABLE", 
		"IDENTIFIER", "UNIVERSAL_CHAR", "HEX_QUAD", "WHITESPACE", "NEWLINE", "LEFT_PARENTHESIS", 
		"RIGHT_PARENTHESIS", "COMMA", "NONUMBER", "HEXADIGIT", "SU", "BU"
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
	public String getGrammarFileName() { return "AutotunerLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\6\5Y\n\5\r\5\16\5Z\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6\3"+
		"\7\3\7\5\7g\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\2\2\24\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\2\3\2\5\5\2C\\aac|\5\2\62;CHch\3\2\62;\u0095\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3\'\3\2\2\2\5A\3"+
		"\2\2\2\7I\3\2\2\2\tX\3\2\2\2\13\\\3\2\2\2\rf\3\2\2\2\17o\3\2\2\2\21q\3"+
		"\2\2\2\23v\3\2\2\2\25z\3\2\2\2\27~\3\2\2\2\31\u0080\3\2\2\2\33\u0082\3"+
		"\2\2\2\35\u0084\3\2\2\2\37\u0086\3\2\2\2!\u0088\3\2\2\2#\u008b\3\2\2\2"+
		"%\u008e\3\2\2\2\'+\7%\2\2(*\5\23\n\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3"+
		"\2\2\2,.\3\2\2\2-+\3\2\2\2./\7r\2\2/\60\7t\2\2\60\61\7c\2\2\61\62\7i\2"+
		"\2\62\63\7o\2\2\63\64\7c\2\2\648\3\2\2\2\65\67\5\23\n\2\66\65\3\2\2\2"+
		"\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7v\2\2<=\7w\2"+
		"\2=>\7p\2\2>?\7g\2\2?@\7t\2\2@\4\3\2\2\2AB\7g\2\2BC\7z\2\2CD\7r\2\2DE"+
		"\7n\2\2EF\7q\2\2FG\7t\2\2GH\7g\2\2H\6\3\2\2\2IJ\7o\2\2JK\7c\2\2KL\7z\2"+
		"\2LM\7a\2\2MN\7c\2\2NO\7d\2\2OP\7u\2\2PQ\7a\2\2QR\7g\2\2RS\7t\2\2ST\7"+
		"t\2\2TU\7q\2\2UV\7t\2\2V\b\3\2\2\2WY\5%\23\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[\n\3\2\2\2\\a\5\r\7\2]`\5\r\7\2^`\5\t\5\2_]\3\2\2\2_^\3"+
		"\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\f\3\2\2\2ca\3\2\2\2dg\5\35\17\2"+
		"eg\5\17\b\2fd\3\2\2\2fe\3\2\2\2g\16\3\2\2\2hi\5!\21\2ij\5\21\t\2jp\3\2"+
		"\2\2kl\5#\22\2lm\5\21\t\2mn\5\21\t\2np\3\2\2\2oh\3\2\2\2ok\3\2\2\2p\20"+
		"\3\2\2\2qr\5\37\20\2rs\5\37\20\2st\5\37\20\2tu\5\37\20\2u\22\3\2\2\2v"+
		"w\7\"\2\2wx\3\2\2\2xy\b\n\2\2y\24\3\2\2\2z{\7\f\2\2{|\3\2\2\2|}\b\13\2"+
		"\2}\26\3\2\2\2~\177\7*\2\2\177\30\3\2\2\2\u0080\u0081\7+\2\2\u0081\32"+
		"\3\2\2\2\u0082\u0083\7.\2\2\u0083\34\3\2\2\2\u0084\u0085\t\2\2\2\u0085"+
		"\36\3\2\2\2\u0086\u0087\t\3\2\2\u0087 \3\2\2\2\u0088\u0089\7^\2\2\u0089"+
		"\u008a\7w\2\2\u008a\"\3\2\2\2\u008b\u008c\7^\2\2\u008c\u008d\7W\2\2\u008d"+
		"$\3\2\2\2\u008e\u008f\t\4\2\2\u008f&\3\2\2\2\n\2+8Z_afo\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}