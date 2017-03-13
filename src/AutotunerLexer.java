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
		PRAGMA_TUNER=1, TUNER_ID=2, WHITESPACE=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRAGMA_TUNER", "TUNER_ID", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRAGMA_TUNER", "TUNER_ID", "WHITESPACE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\5=\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\38\n\3\3\4\3\4\3\4\3\4\2\2\5\3\3\5\4\7\5\3\2\2?\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\3\t\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t\r\7%\2\2\n"+
		"\f\5\7\4\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\20\3"+
		"\2\2\2\17\r\3\2\2\2\20\21\7r\2\2\21\22\7t\2\2\22\23\7c\2\2\23\24\7i\2"+
		"\2\24\25\7o\2\2\25\26\7c\2\2\26\32\3\2\2\2\27\31\5\7\4\2\30\27\3\2\2\2"+
		"\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\32\3\2\2\2"+
		"\35\36\7v\2\2\36\37\7w\2\2\37 \7p\2\2 !\7g\2\2!\"\7t\2\2\"\4\3\2\2\2#"+
		"$\7g\2\2$%\7z\2\2%&\7r\2\2&\'\7n\2\2\'(\7q\2\2()\7t\2\2)8\7g\2\2*+\7o"+
		"\2\2+,\7c\2\2,-\7z\2\2-.\7a\2\2./\7c\2\2/\60\7d\2\2\60\61\7u\2\2\61\62"+
		"\7a\2\2\62\63\7g\2\2\63\64\7t\2\2\64\65\7t\2\2\65\66\7q\2\2\668\7t\2\2"+
		"\67#\3\2\2\2\67*\3\2\2\28\6\3\2\2\29:\7\"\2\2:;\3\2\2\2;<\b\4\2\2<\b\3"+
		"\2\2\2\6\2\r\32\67\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}