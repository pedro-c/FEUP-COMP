// Generated from /home/pedroc/Documents/FEUP-COMP/src/AutotunerLexer.g4 by ANTLR 4.6
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
		PRAGMA=1, TUNER=2, EXPLORE=3, MAX_ABS_ERROR=4, WHITESPACE=5, NEWLINE=6, 
		LEFT_PARENTHESIS=7, RIGHT_PARENTHESIS=8, COMMA=9, NUMBER=10, NONUMBER=11, 
		HEXADIGIT=12, SU=13, BU=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRAGMA", "TUNER", "EXPLORE", "MAX_ABS_ERROR", "WHITESPACE", "NEWLINE", 
		"LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "COMMA", "NUMBER", "NONUMBER", 
		"HEXADIGIT", "SU", "BU"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#pragma'", "'tuner'", "'explore'", "'max_abs_error'", "' '", "'\n'", 
		"'('", "')'", "','", null, null, null, "'\\u'", "'\\U'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRAGMA", "TUNER", "EXPLORE", "MAX_ABS_ERROR", "WHITESPACE", "NEWLINE", 
		"LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "COMMA", "NUMBER", "NONUMBER", 
		"HEXADIGIT", "SU", "BU"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20]\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\3\2\5\3\2\62;\5\2C\\aac|\5\2\62;CHch\\\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5\'\3\2\2\2\7-\3\2\2\2\t\65"+
		"\3\2\2\2\13C\3\2\2\2\rG\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25"+
		"Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2\35Z\3\2\2\2\37 \7%\2\2 "+
		"!\7r\2\2!\"\7t\2\2\"#\7c\2\2#$\7i\2\2$%\7o\2\2%&\7c\2\2&\4\3\2\2\2\'("+
		"\7v\2\2()\7w\2\2)*\7p\2\2*+\7g\2\2+,\7t\2\2,\6\3\2\2\2-.\7g\2\2./\7z\2"+
		"\2/\60\7r\2\2\60\61\7n\2\2\61\62\7q\2\2\62\63\7t\2\2\63\64\7g\2\2\64\b"+
		"\3\2\2\2\65\66\7o\2\2\66\67\7c\2\2\678\7z\2\289\7a\2\29:\7c\2\2:;\7d\2"+
		"\2;<\7u\2\2<=\7a\2\2=>\7g\2\2>?\7t\2\2?@\7t\2\2@A\7q\2\2AB\7t\2\2B\n\3"+
		"\2\2\2CD\7\"\2\2DE\3\2\2\2EF\b\6\2\2F\f\3\2\2\2GH\7\f\2\2HI\3\2\2\2IJ"+
		"\b\7\2\2J\16\3\2\2\2KL\7*\2\2L\20\3\2\2\2MN\7+\2\2N\22\3\2\2\2OP\7.\2"+
		"\2P\24\3\2\2\2QR\t\2\2\2R\26\3\2\2\2ST\t\3\2\2T\30\3\2\2\2UV\t\4\2\2V"+
		"\32\3\2\2\2WX\7^\2\2XY\7w\2\2Y\34\3\2\2\2Z[\7^\2\2[\\\7W\2\2\\\36\3\2"+
		"\2\2\3\2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}