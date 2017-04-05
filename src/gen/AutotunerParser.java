// Generated from /home/pedroc/Documents/FEUP-COMP/src/AutotunerParser.g4 by ANTLR 4.6
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
		PRAGMA=1, TUNER=2, EXPLORE=3, MAX_ABS_ERROR=4, WHITESPACE=5, NEWLINE=6, 
		LEFT_PARENTHESIS=7, RIGHT_PARENTHESIS=8, COMMA=9, NUMBER=10, NONUMBER=11, 
		HEXADIGIT=12, SU=13, BU=14;
	public static final int
		RULE_pragma = 0, RULE_pragma_tuner = 1, RULE_tuner_id = 2, RULE_explore = 3, 
		RULE_max_abs_error = 4, RULE_variable = 5, RULE_identifier = 6, RULE_universal_char = 7, 
		RULE_hex_quad = 8, RULE_startpoint = 9;
	public static final String[] ruleNames = {
		"pragma", "pragma_tuner", "tuner_id", "explore", "max_abs_error", "variable", 
		"identifier", "universal_char", "hex_quad", "startpoint"
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
		public Pragma_tunerContext pragma_tuner() {
			return getRuleContext(Pragma_tunerContext.class,0);
		}
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
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			pragma_tuner();
			setState(21);
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

	public static class Pragma_tunerContext extends ParserRuleContext {
		public TerminalNode PRAGMA() { return getToken(AutotunerParser.PRAGMA, 0); }
		public TerminalNode TUNER() { return getToken(AutotunerParser.TUNER, 0); }
		public Pragma_tunerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_tuner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).enterPragma_tuner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).exitPragma_tuner(this);
		}
	}

	public final Pragma_tunerContext pragma_tuner() throws RecognitionException {
		Pragma_tunerContext _localctx = new Pragma_tunerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragma_tuner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(PRAGMA);
			setState(24);
			match(TUNER);
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
	}

	public final Tuner_idContext tuner_id() throws RecognitionException {
		Tuner_idContext _localctx = new Tuner_idContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tuner_id);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPLORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				explore();
				}
				break;
			case MAX_ABS_ERROR:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(AutotunerParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode COMMA() { return getToken(AutotunerParser.COMMA, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(AutotunerParser.RIGHT_PARENTHESIS, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(AutotunerParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(AutotunerParser.WHITESPACE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(AutotunerParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AutotunerParser.NUMBER, i);
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
	}

	public final ExploreContext explore() throws RecognitionException {
		ExploreContext _localctx = new ExploreContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_explore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(EXPLORE);
			setState(31);
			variable();
			setState(32);
			match(LEFT_PARENTHESIS);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(33);
				match(WHITESPACE);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				match(NUMBER);
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(44);
				match(WHITESPACE);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(COMMA);
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				match(NUMBER);
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(56);
				match(WHITESPACE);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(AutotunerParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AutotunerParser.NUMBER, i);
		}
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
	}

	public final Max_abs_errorContext max_abs_error() throws RecognitionException {
		Max_abs_errorContext _localctx = new Max_abs_errorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_max_abs_error);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(MAX_ABS_ERROR);
			setState(65);
			variable();
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				match(NUMBER);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
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

	public static class VariableContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(AutotunerParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AutotunerParser.NUMBER, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			identifier();
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(74);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NONUMBER:
					case SU:
					case BU:
						{
						setState(72);
						identifier();
						}
						break;
					case NUMBER:
						{
						setState(73);
						match(NUMBER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NONUMBER() { return getToken(AutotunerParser.NONUMBER, 0); }
		public Universal_charContext universal_char() {
			return getRuleContext(Universal_charContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifier);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(NONUMBER);
				}
				break;
			case SU:
			case BU:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				universal_char();
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

	public static class Universal_charContext extends ParserRuleContext {
		public TerminalNode SU() { return getToken(AutotunerParser.SU, 0); }
		public List<Hex_quadContext> hex_quad() {
			return getRuleContexts(Hex_quadContext.class);
		}
		public Hex_quadContext hex_quad(int i) {
			return getRuleContext(Hex_quadContext.class,i);
		}
		public TerminalNode BU() { return getToken(AutotunerParser.BU, 0); }
		public Universal_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universal_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).enterUniversal_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).exitUniversal_char(this);
		}
	}

	public final Universal_charContext universal_char() throws RecognitionException {
		Universal_charContext _localctx = new Universal_charContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_universal_char);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SU:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(83);
				match(SU);
				setState(84);
				hex_quad();
				}
				}
				break;
			case BU:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(85);
				match(BU);
				setState(86);
				hex_quad();
				setState(87);
				hex_quad();
				}
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

	public static class Hex_quadContext extends ParserRuleContext {
		public List<TerminalNode> HEXADIGIT() { return getTokens(AutotunerParser.HEXADIGIT); }
		public TerminalNode HEXADIGIT(int i) {
			return getToken(AutotunerParser.HEXADIGIT, i);
		}
		public Hex_quadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_quad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).enterHex_quad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).exitHex_quad(this);
		}
	}

	public final Hex_quadContext hex_quad() throws RecognitionException {
		Hex_quadContext _localctx = new Hex_quadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hex_quad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(HEXADIGIT);
			setState(92);
			match(HEXADIGIT);
			setState(93);
			match(HEXADIGIT);
			setState(94);
			match(HEXADIGIT);
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

	public static class StartpointContext extends ParserRuleContext {
		public PragmaContext pragma() {
			return getRuleContext(PragmaContext.class,0);
		}
		public StartpointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startpoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).enterStartpoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutotunerParserListener ) ((AutotunerParserListener)listener).exitStartpoint(this);
		}
	}

	public final StartpointContext startpoint() throws RecognitionException {
		StartpointContext _localctx = new StartpointContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_startpoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4\37\n\4\3\5\3\5\3\5\3\5\7\5%\n\5\f\5"+
		"\16\5(\13\5\3\5\6\5+\n\5\r\5\16\5,\3\5\7\5\60\n\5\f\5\16\5\63\13\5\3\5"+
		"\3\5\6\5\67\n\5\r\5\16\58\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\3\6\3\6"+
		"\3\6\6\6F\n\6\r\6\16\6G\3\7\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\b\3\b\5"+
		"\bT\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\\\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2e\2\26\3\2\2\2\4\31\3\2\2\2\6\36"+
		"\3\2\2\2\b \3\2\2\2\nB\3\2\2\2\fI\3\2\2\2\16S\3\2\2\2\20[\3\2\2\2\22]"+
		"\3\2\2\2\24b\3\2\2\2\26\27\5\4\3\2\27\30\5\6\4\2\30\3\3\2\2\2\31\32\7"+
		"\3\2\2\32\33\7\4\2\2\33\5\3\2\2\2\34\37\5\b\5\2\35\37\5\n\6\2\36\34\3"+
		"\2\2\2\36\35\3\2\2\2\37\7\3\2\2\2 !\7\5\2\2!\"\5\f\7\2\"&\7\t\2\2#%\7"+
		"\7\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(&\3\2\2\2)"+
		"+\7\f\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\61\3\2\2\2.\60\7\7"+
		"\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63"+
		"\61\3\2\2\2\64\66\7\13\2\2\65\67\7\f\2\2\66\65\3\2\2\2\678\3\2\2\28\66"+
		"\3\2\2\289\3\2\2\29=\3\2\2\2:<\7\7\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2="+
		">\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\n\2\2A\t\3\2\2\2BC\7\6\2\2CE\5\f\7\2"+
		"DF\7\f\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\13\3\2\2\2IN\5\16"+
		"\b\2JM\5\16\b\2KM\7\f\2\2LJ\3\2\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3"+
		"\2\2\2O\r\3\2\2\2PN\3\2\2\2QT\7\r\2\2RT\5\20\t\2SQ\3\2\2\2SR\3\2\2\2T"+
		"\17\3\2\2\2UV\7\17\2\2V\\\5\22\n\2WX\7\20\2\2XY\5\22\n\2YZ\5\22\n\2Z\\"+
		"\3\2\2\2[U\3\2\2\2[W\3\2\2\2\\\21\3\2\2\2]^\7\16\2\2^_\7\16\2\2_`\7\16"+
		"\2\2`a\7\16\2\2a\23\3\2\2\2bc\5\2\2\2c\25\3\2\2\2\r\36&,\618=GLNS[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}