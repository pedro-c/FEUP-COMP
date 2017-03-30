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
		T__0=1, T__1=2, T__2=3, WHITESPACE=4, NEWLINE=5, EXPLORE=6, MAX_ABS_ERROR=7, 
		REFERENCE=8, OPENPAR=9, CLOSEPAR=10, COMMA=11, ASSIGN=12, NUMBER=13, VARIABLE=14, 
		DigitSequence=15;
	public static final int
		RULE_pragma = 0, RULE_pragmaTuner = 1, RULE_tunerId = 2, RULE_expression = 3, 
		RULE_step = 4, RULE_reference = 5;
	public static final String[] ruleNames = {
		"pragma", "pragmaTuner", "tunerId", "expression", "step", "reference"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'pragma'", "'tuner'", "' '", "'\n'", "'explore'", "'max_abs_error'", 
		"'reference'", "'('", "')'", "','", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WHITESPACE", "NEWLINE", "EXPLORE", "MAX_ABS_ERROR", 
		"REFERENCE", "OPENPAR", "CLOSEPAR", "COMMA", "ASSIGN", "NUMBER", "VARIABLE", 
		"DigitSequence"
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
		public PragmaTunerContext pragmaTuner() {
			return getRuleContext(PragmaTunerContext.class,0);
		}
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
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pragma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			pragmaTuner();
			setState(13);
			tunerId();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << NUMBER) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(14);
				expression();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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

	public static class PragmaTunerContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(AutotunerParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(AutotunerParser.WHITESPACE, i);
		}
		public PragmaTunerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaTuner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).enterPragmaTuner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerListener ) ((AutotunerListener)listener).exitPragmaTuner(this);
		}
	}

	public final PragmaTunerContext pragmaTuner() throws RecognitionException {
		PragmaTunerContext _localctx = new PragmaTunerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaTuner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(23);
				match(WHITESPACE);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(T__1);
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				match(WHITESPACE);
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(35);
			match(T__2);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				match(WHITESPACE);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
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
	}

	public final TunerIdContext tunerId() throws RecognitionException {
		TunerIdContext _localctx = new TunerIdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tunerId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				step();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				reference();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(VARIABLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(NUMBER);
				}
				break;
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
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(VARIABLE);
			setState(50);
			match(OPENPAR);
			setState(51);
			match(NUMBER);
			setState(52);
			match(COMMA);
			setState(53);
			match(NUMBER);
			setState(54);
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
		public TerminalNode DigitSequence() { return getToken(AutotunerParser.DigitSequence, 0); }
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
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(REFERENCE);
			setState(57);
			match(OPENPAR);
			setState(58);
			match(VARIABLE);
			setState(59);
			match(ASSIGN);
			setState(60);
			match(DigitSequence);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21A\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\6\3\"\n\3\r"+
		"\3\16\3#\3\3\3\3\6\3(\n\3\r\3\16\3)\3\4\3\4\3\5\3\5\3\5\3\5\5\5\62\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b"+
		"\n\f\2\3\3\2\b\tA\2\16\3\2\2\2\4\30\3\2\2\2\6+\3\2\2\2\b\61\3\2\2\2\n"+
		"\63\3\2\2\2\f:\3\2\2\2\16\17\5\4\3\2\17\23\5\6\4\2\20\22\5\b\5\2\21\20"+
		"\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23"+
		"\3\2\2\2\26\27\7\7\2\2\27\3\3\2\2\2\30\34\7\3\2\2\31\33\7\6\2\2\32\31"+
		"\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34"+
		"\3\2\2\2\37!\7\4\2\2 \"\7\6\2\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2"+
		"\2$%\3\2\2\2%\'\7\5\2\2&(\7\6\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3"+
		"\2\2\2*\5\3\2\2\2+,\t\2\2\2,\7\3\2\2\2-\62\5\n\6\2.\62\5\f\7\2/\62\7\20"+
		"\2\2\60\62\7\17\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2"+
		"\62\t\3\2\2\2\63\64\7\20\2\2\64\65\7\13\2\2\65\66\7\17\2\2\66\67\7\r\2"+
		"\2\678\7\17\2\289\7\f\2\29\13\3\2\2\2:;\7\n\2\2;<\7\13\2\2<=\7\20\2\2"+
		"=>\7\16\2\2>?\7\21\2\2?\r\3\2\2\2\7\23\34#)\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}