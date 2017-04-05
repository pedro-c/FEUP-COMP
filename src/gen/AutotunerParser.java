// Generated from /home/bernardo/Documents/FEUP-COMP/src/AutotunerParser.g4 by ANTLR 4.6
package gen;
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
		PRAGMA_TUNER=1, EXPLORE=2, MAX_ABS_ERROR=3, NUMBER=4, VARIABLE=5, IDENTIFIER=6, 
		UNIVERSAL_CHAR=7, HEX_QUAD=8, WHITESPACE=9, NEWLINE=10, LEFT_PARENTHESIS=11, 
		RIGHT_PARENTHESIS=12, COMMA=13, NONUMBER=14, HEXADIGIT=15, SU=16, BU=17;
	public static final int
		RULE_pragma = 0, RULE_tuner_id = 1, RULE_explore = 2, RULE_max_abs_error = 3, 
		RULE_start = 4;
	public static final String[] ruleNames = {
		"pragma", "tuner_id", "explore", "max_abs_error", "start"
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

	@Override
	public String getGrammarFileName() { return "AutotunerParser.g4"; }

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
		public Tuner_idContext tuner_id() {
			return getRuleContext(Tuner_idContext.class,0);
		}
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).enterPragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).exitPragma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutotunerParserVisitor ) return ((AutotunerParserVisitor<? extends T>)visitor).visitPragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(PRAGMA_TUNER);
			setState(11);
			tuner_id();
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

	public static class Tuner_idContext extends ParserRuleContext {
		public ExploreContext explore() {
			return getRuleContext(ExploreContext.class,0);
		}
		public Max_abs_errorContext max_abs_error() {
			return getRuleContext(Max_abs_errorContext.class,0);
		}
		public Tuner_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuner_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).enterTuner_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).exitTuner_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutotunerParserVisitor ) return ((AutotunerParserVisitor<? extends T>)visitor).visitTuner_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuner_idContext tuner_id() throws RecognitionException {
		Tuner_idContext _localctx = new Tuner_idContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tuner_id);
		try {
			setState(15);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPLORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				explore();
				}
				break;
			case MAX_ABS_ERROR:
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				max_abs_error();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExploreContext extends ParserRuleContext {
		public TerminalNode EXPLORE() { return getToken(AutotunerParser.EXPLORE, 0); }
		public TerminalNode VARIABLE() { return getToken(AutotunerParser.VARIABLE, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(AutotunerParser.LEFT_PARENTHESIS, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(AutotunerParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AutotunerParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(AutotunerParser.COMMA, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(AutotunerParser.RIGHT_PARENTHESIS, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(AutotunerParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(AutotunerParser.WHITESPACE, i);
		}
		public ExploreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).enterExplore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).exitExplore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutotunerParserVisitor ) return ((AutotunerParserVisitor<? extends T>)visitor).visitExplore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExploreContext explore() throws RecognitionException {
		ExploreContext _localctx = new ExploreContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_explore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(EXPLORE);
			setState(18);
			match(VARIABLE);
			setState(19);
			match(LEFT_PARENTHESIS);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(20);
				match(WHITESPACE);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(NUMBER);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(27);
				match(WHITESPACE);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(COMMA);
			setState(34);
			match(NUMBER);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(35);
				match(WHITESPACE);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(RIGHT_PARENTHESIS);
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

	public static class Max_abs_errorContext extends ParserRuleContext {
		public TerminalNode MAX_ABS_ERROR() { return getToken(AutotunerParser.MAX_ABS_ERROR, 0); }
		public TerminalNode VARIABLE() { return getToken(AutotunerParser.VARIABLE, 0); }
		public TerminalNode NUMBER() { return getToken(AutotunerParser.NUMBER, 0); }
		public Max_abs_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_abs_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).enterMax_abs_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).exitMax_abs_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutotunerParserVisitor ) return ((AutotunerParserVisitor<? extends T>)visitor).visitMax_abs_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Max_abs_errorContext max_abs_error() throws RecognitionException {
		Max_abs_errorContext _localctx = new Max_abs_errorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_max_abs_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(MAX_ABS_ERROR);
			setState(44);
			match(VARIABLE);
			setState(45);
			match(NUMBER);
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

	public static class StartContext extends ParserRuleContext {
		public PragmaContext pragma() {
			return getRuleContext(PragmaContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutotunerParserVisitor ) return ((AutotunerParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			pragma();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\5\3\22\n\3\3\4\3\4\3"+
		"\4\3\4\7\4\30\n\4\f\4\16\4\33\13\4\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4"+
		"\3\4\3\4\3\4\7\4\'\n\4\f\4\16\4*\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\2\2\7\2\4\6\b\n\2\2\62\2\f\3\2\2\2\4\21\3\2\2\2\6\23\3\2\2\2\b-\3"+
		"\2\2\2\n\61\3\2\2\2\f\r\7\3\2\2\r\16\5\4\3\2\16\3\3\2\2\2\17\22\5\6\4"+
		"\2\20\22\5\b\5\2\21\17\3\2\2\2\21\20\3\2\2\2\22\5\3\2\2\2\23\24\7\4\2"+
		"\2\24\25\7\7\2\2\25\31\7\r\2\2\26\30\7\13\2\2\27\26\3\2\2\2\30\33\3\2"+
		"\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34 \7\6\2"+
		"\2\35\37\7\13\2\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3"+
		"\2\2\2\" \3\2\2\2#$\7\17\2\2$(\7\6\2\2%\'\7\13\2\2&%\3\2\2\2\'*\3\2\2"+
		"\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\16\2\2,\7\3\2\2\2-.\7\5"+
		"\2\2./\7\7\2\2/\60\7\6\2\2\60\t\3\2\2\2\61\62\5\2\2\2\62\13\3\2\2\2\6"+
		"\21\31 (";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}