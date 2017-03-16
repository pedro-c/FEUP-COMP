// Generated from /home/bernardo/Documents/FEUP-COMP/src/Autotuner.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AutotunerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRAGMA_TUNER=1, TUNER_ID=2, EXPLORE=3, MAX_ABS_ERROR=4, WHITESPACE=5, 
		NEWLINE=6, VARIABLE=7;
	public static final int
		RULE_pragma = 0;
	public static final String[] ruleNames = {
		"pragma"
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

	@Override
	public String getGrammarFileName() { return "Autotuner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AutotunerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PragmaContext extends ParserRuleContext {
		public TerminalNode PRAGMA_TUNER() { return getToken(AutotunerParser.PRAGMA_TUNER, 0); }
		public TerminalNode TUNER_ID() { return getToken(AutotunerParser.TUNER_ID, 0); }
		public TerminalNode NEWLINE() { return getToken(AutotunerParser.NEWLINE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(AutotunerParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(AutotunerParser.WHITESPACE, i);
		}
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).enterPragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).exitPragma(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pragma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(PRAGMA_TUNER);
			setState(3);
			match(TUNER_ID);
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(4);
				match(WHITESPACE);
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(10);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t\17\4\2\t\2\3\2"+
		"\3\2\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\2\3\2\3\2\2\2\3\2\2\2\16\2\4\3\2"+
		"\2\2\4\5\7\3\2\2\5\t\7\4\2\2\6\b\7\7\2\2\7\6\3\2\2\2\b\13\3\2\2\2\t\7"+
		"\3\2\2\2\t\n\3\2\2\2\n\f\3\2\2\2\13\t\3\2\2\2\f\r\7\b\2\2\r\3\3\2\2\2"+
		"\3\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}