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
		TUNER=1, EXPLORE=2, MAX_ABS_ERROR=3, REFERENCE=4, OPENPAR=5, CLOSEPAR=6, 
		COMMA=7, ASSIGN=8, SLASH=9, STAR=10, DISCARD=11, WHITESPACE=12, NEWLINE=13, 
		LINE_CMT=14, BLOCK_CMT=15, PRAGMA_TUNER=16, PRAGMA=17, NUMBER=18, VARIABLE=19;
	public static final int
		RULE_start = 0, RULE_pragma = 1, RULE_tunerId = 2, RULE_expression = 3, 
		RULE_step = 4, RULE_reference = 5, RULE_comment = 6;
	public static final String[] ruleNames = {
		"start", "pragma", "tunerId", "expression", "step", "reference", "comment"
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
	public static class StartContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public PragmaContext pragma() {
			return getRuleContext(PragmaContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(AutotunerParser.VARIABLE, 0); }
		public TerminalNode DISCARD() { return getToken(AutotunerParser.DISCARD, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutotunerVisitor ) return ((AutotunerVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE_CMT:
			case BLOCK_CMT:
				{
				setState(14);
				comment();
				}
				break;
			case PRAGMA_TUNER:
				{
				setState(15);
				pragma();
				}
				break;
			case VARIABLE:
				{
				setState(16);
				match(VARIABLE);
				}
				break;
			case DISCARD:
				{
				setState(17);
				match(DISCARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class PragmaContext extends ParserRuleContext {
		public TerminalNode PRAGMA_TUNER() { return getToken(AutotunerParser.PRAGMA_TUNER, 0); }
		public TerminalNode WHITESPACE() { return getToken(AutotunerParser.WHITESPACE, 0); }
		public TunerIdContext tunerId() {
			return getRuleContext(TunerIdContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AutotunerParser.NEWLINE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutotunerVisitor ) return ((AutotunerVisitor<? extends T>)visitor).visitPragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(PRAGMA_TUNER);
			setState(21);
			match(WHITESPACE);
			setState(22);
			tunerId();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(23);
				expression();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
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

	public static class TunerIdContext extends ParserRuleContext {
		public TerminalNode EXPLORE() { return getToken(AutotunerParser.EXPLORE, 0); }
		public TerminalNode MAX_ABS_ERROR() { return getToken(AutotunerParser.MAX_ABS_ERROR, 0); }
		public TunerIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tunerId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).enterTunerId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).exitTunerId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutotunerVisitor ) return ((AutotunerVisitor<? extends T>)visitor).visitTunerId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TunerIdContext tunerId() throws RecognitionException {
		TunerIdContext _localctx = new TunerIdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tunerId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !(_la==EXPLORE || _la==MAX_ABS_ERROR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(AutotunerParser.WHITESPACE, 0); }
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(AutotunerParser.VARIABLE, 0); }
		public TerminalNode NUMBER() { return getToken(AutotunerParser.NUMBER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutotunerVisitor ) return ((AutotunerVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(WHITESPACE);
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(34);
				step();
				}
				break;
			case 2:
				{
				setState(35);
				reference();
				}
				break;
			case 3:
				{
				setState(36);
				match(VARIABLE);
				}
				break;
			case 4:
				{
				setState(37);
				match(NUMBER);
				}
				break;
			}
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

	public static class StepContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(AutotunerParser.VARIABLE, 0); }
		public TerminalNode OPENPAR() { return getToken(AutotunerParser.OPENPAR, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(AutotunerParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AutotunerParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(AutotunerParser.COMMA, 0); }
		public TerminalNode CLOSEPAR() { return getToken(AutotunerParser.CLOSEPAR, 0); }
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutotunerVisitor ) return ((AutotunerVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(VARIABLE);
			setState(41);
			match(OPENPAR);
			setState(42);
			match(NUMBER);
			setState(43);
			match(COMMA);
			setState(44);
			match(NUMBER);
			setState(45);
			match(CLOSEPAR);
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode REFERENCE() { return getToken(AutotunerParser.REFERENCE, 0); }
		public TerminalNode OPENPAR() { return getToken(AutotunerParser.OPENPAR, 0); }
		public TerminalNode VARIABLE() { return getToken(AutotunerParser.VARIABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(AutotunerParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(AutotunerParser.NUMBER, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutotunerVisitor ) return ((AutotunerVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(REFERENCE);
			setState(48);
			match(OPENPAR);
			setState(49);
			match(VARIABLE);
			setState(50);
			match(ASSIGN);
			setState(51);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode LINE_CMT() { return getToken(AutotunerParser.LINE_CMT, 0); }
		public TerminalNode BLOCK_CMT() { return getToken(AutotunerParser.BLOCK_CMT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutotunerVisitor ) return ((AutotunerVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==LINE_CMT || _la==BLOCK_CMT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\5\2\25\n\2"+
		"\3\3\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\5\5)\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\4\3\2\4\5\3\2\20\219\2\24\3\2\2"+
		"\2\4\26\3\2\2\2\6!\3\2\2\2\b#\3\2\2\2\n*\3\2\2\2\f\61\3\2\2\2\16\67\3"+
		"\2\2\2\20\25\5\16\b\2\21\25\5\4\3\2\22\25\7\25\2\2\23\25\7\r\2\2\24\20"+
		"\3\2\2\2\24\21\3\2\2\2\24\22\3\2\2\2\24\23\3\2\2\2\25\3\3\2\2\2\26\27"+
		"\7\22\2\2\27\30\7\16\2\2\30\34\5\6\4\2\31\33\5\b\5\2\32\31\3\2\2\2\33"+
		"\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37"+
		" \7\17\2\2 \5\3\2\2\2!\"\t\2\2\2\"\7\3\2\2\2#(\7\16\2\2$)\5\n\6\2%)\5"+
		"\f\7\2&)\7\25\2\2\')\7\24\2\2($\3\2\2\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2"+
		")\t\3\2\2\2*+\7\25\2\2+,\7\7\2\2,-\7\24\2\2-.\7\t\2\2./\7\24\2\2/\60\7"+
		"\b\2\2\60\13\3\2\2\2\61\62\7\6\2\2\62\63\7\7\2\2\63\64\7\25\2\2\64\65"+
		"\7\n\2\2\65\66\7\24\2\2\66\r\3\2\2\2\678\t\3\2\28\17\3\2\2\2\5\24\34(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}