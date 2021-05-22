// Generated from C:/Users/Daniel/Documents/Java/T2L/t2lc/src/main/resources\t2l.g4 by ANTLR 4.9.1
package io.github.kinderhead.T2L.ANTLR;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class t2lParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OR=2, AND=3, EQ=4, NEQ=5, GT=6, LT=7, GTEQ=8, LTEQ=9, PLUS=10, 
		MINUS=11, MULT=12, DIV=13, MOD=14, POW=15, NOT=16, SCOL=17, COL=18, ASSIGN=19, 
		COMMA=20, OPAR=21, CPAR=22, OBRACE=23, CBRACE=24, OSQUARE=25, CSQUARE=26, 
		IF=27, ELSE=28, WHILE=29, FOR=30, IN=31, FUNC=32, T2L_RETURN=33, CLASS=34, 
		NEW=35, IMPORT=36, ID=37, INT=38, STRING=39, COMMENT=40, SPACE=41;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_stat = 2, RULE_class_stat_block = 3, 
		RULE_call_stat = 4, RULE_func_stat = 5, RULE_t2l_return = 6, RULE_class_stat = 7, 
		RULE_params = 8, RULE_def_params = 9, RULE_var = 10, RULE_index = 11, 
		RULE_import_stat = 12, RULE_if_stat = 13, RULE_elseIfStat = 14, RULE_elseStat = 15, 
		RULE_cond = 16, RULE_stat_block = 17, RULE_while_stat = 18, RULE_for_loop_stat = 19, 
		RULE_expr = 20, RULE_pair = 21, RULE_atom = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "stat", "class_stat_block", "call_stat", "func_stat", 
			"t2l_return", "class_stat", "params", "def_params", "var", "index", "import_stat", 
			"if_stat", "elseIfStat", "elseStat", "cond", "stat_block", "while_stat", 
			"for_loop_stat", "expr", "pair", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "';'", "':'", "'='", 
			"','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'if'", "'else'", "'while'", 
			"'for'", "'in'", "'func'", "'return'", "'class'", "'new'", "'import'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", 
			"MINUS", "MULT", "DIV", "MOD", "POW", "NOT", "SCOL", "COL", "ASSIGN", 
			"COMMA", "OPAR", "CPAR", "OBRACE", "CBRACE", "OSQUARE", "CSQUARE", "IF", 
			"ELSE", "WHILE", "FOR", "IN", "FUNC", "T2L_RETURN", "CLASS", "NEW", "IMPORT", 
			"ID", "INT", "STRING", "COMMENT", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "t2l.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public t2lParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << FUNC) | (1L << T2L_RETURN) | (1L << CLASS) | (1L << IMPORT) | (1L << ID))) != 0)) {
				{
				{
				setState(48);
				stat();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Call_statContext call_stat() {
			return getRuleContext(Call_statContext.class,0);
		}
		public Func_statContext func_stat() {
			return getRuleContext(Func_statContext.class,0);
		}
		public Class_statContext class_stat() {
			return getRuleContext(Class_statContext.class,0);
		}
		public T2l_returnContext t2l_return() {
			return getRuleContext(T2l_returnContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public For_loop_statContext for_loop_stat() {
			return getRuleContext(For_loop_statContext.class,0);
		}
		public Import_statContext import_stat() {
			return getRuleContext(Import_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				if_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				while_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				call_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				func_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				class_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				t2l_return();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(61);
				index();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(62);
				for_loop_stat();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(63);
				import_stat();
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

	public static class Class_stat_blockContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Class_statContext class_stat() {
			return getRuleContext(Class_statContext.class,0);
		}
		public Func_statContext func_stat() {
			return getRuleContext(Func_statContext.class,0);
		}
		public Class_stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterClass_stat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitClass_stat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitClass_stat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_stat_blockContext class_stat_block() throws RecognitionException {
		Class_stat_blockContext _localctx = new Class_stat_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_stat_block);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				var();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				class_stat();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				func_stat();
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

	public static class Call_statContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(t2lParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(t2lParser.OPAR, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(t2lParser.CPAR, 0); }
		public TerminalNode SCOL() { return getToken(t2lParser.SCOL, 0); }
		public Call_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterCall_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitCall_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitCall_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_statContext call_stat() throws RecognitionException {
		Call_statContext _localctx = new Call_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_call_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
			setState(72);
			match(OPAR);
			setState(73);
			params();
			setState(74);
			match(CPAR);
			setState(75);
			match(SCOL);
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

	public static class Func_statContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(t2lParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(t2lParser.ID, 0); }
		public Def_paramsContext def_params() {
			return getRuleContext(Def_paramsContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Func_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterFunc_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitFunc_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitFunc_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_statContext func_stat() throws RecognitionException {
		Func_statContext _localctx = new Func_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(FUNC);
			setState(78);
			match(ID);
			setState(79);
			def_params();
			setState(80);
			stat_block();
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

	public static class T2l_returnContext extends ParserRuleContext {
		public TerminalNode T2L_RETURN() { return getToken(t2lParser.T2L_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(t2lParser.SCOL, 0); }
		public T2l_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t2l_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterT2l_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitT2l_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitT2l_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T2l_returnContext t2l_return() throws RecognitionException {
		T2l_returnContext _localctx = new T2l_returnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_t2l_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T2L_RETURN);
			setState(83);
			expr(0);
			setState(84);
			match(SCOL);
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

	public static class Class_statContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(t2lParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(t2lParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(t2lParser.ID, i);
		}
		public TerminalNode OBRACE() { return getToken(t2lParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(t2lParser.CBRACE, 0); }
		public TerminalNode OPAR() { return getToken(t2lParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(t2lParser.CPAR, 0); }
		public List<Class_stat_blockContext> class_stat_block() {
			return getRuleContexts(Class_stat_blockContext.class);
		}
		public Class_stat_blockContext class_stat_block(int i) {
			return getRuleContext(Class_stat_blockContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(t2lParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(t2lParser.COMMA, i);
		}
		public Class_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterClass_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitClass_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitClass_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_statContext class_stat() throws RecognitionException {
		Class_statContext _localctx = new Class_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_class_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(CLASS);
			setState(87);
			match(ID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPAR) {
				{
				setState(88);
				match(OPAR);
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(89);
						match(ID);
						setState(90);
						match(COMMA);
						}
						} 
					}
					setState(95);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(96);
				match(ID);
				setState(97);
				match(CPAR);
				}
			}

			setState(100);
			match(OBRACE);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << CLASS) | (1L << ID))) != 0)) {
				{
				{
				setState(101);
				class_stat_block();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(CBRACE);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(t2lParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(t2lParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << OSQUARE) | (1L << NEW) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(109);
						expr(0);
						setState(110);
						match(COMMA);
						}
						} 
					}
					setState(116);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(117);
				expr(0);
				}
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

	public static class Def_paramsContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(t2lParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(t2lParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(t2lParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(t2lParser.COMMA, i);
		}
		public Def_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterDef_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitDef_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitDef_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_paramsContext def_params() throws RecognitionException {
		Def_paramsContext _localctx = new Def_paramsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_def_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(120);
						match(STRING);
						setState(121);
						match(COMMA);
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(127);
				match(STRING);
				}
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(t2lParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(t2lParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(t2lParser.SCOL, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(ID);
				setState(131);
				match(ASSIGN);
				setState(132);
				expr(0);
				setState(133);
				match(SCOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(ID);
				setState(136);
				match(SCOL);
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(t2lParser.ID, 0); }
		public TerminalNode OSQUARE() { return getToken(t2lParser.OSQUARE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CSQUARE() { return getToken(t2lParser.CSQUARE, 0); }
		public TerminalNode ASSIGN() { return getToken(t2lParser.ASSIGN, 0); }
		public TerminalNode SCOL() { return getToken(t2lParser.SCOL, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ID);
			setState(140);
			match(OSQUARE);
			setState(141);
			expr(0);
			setState(142);
			match(CSQUARE);
			setState(143);
			match(ASSIGN);
			setState(144);
			expr(0);
			setState(145);
			match(SCOL);
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

	public static class Import_statContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(t2lParser.IMPORT, 0); }
		public TerminalNode ID() { return getToken(t2lParser.ID, 0); }
		public TerminalNode SCOL() { return getToken(t2lParser.SCOL, 0); }
		public Import_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterImport_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitImport_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitImport_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_statContext import_stat() throws RecognitionException {
		Import_statContext _localctx = new Import_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_import_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IMPORT);
			setState(148);
			match(ID);
			setState(149);
			match(SCOL);
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

	public static class If_statContext extends ParserRuleContext {
		public ElseIfStatContext ElseIf;
		public ElseStatContext Else;
		public TerminalNode IF() { return getToken(t2lParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<ElseIfStatContext> elseIfStat() {
			return getRuleContexts(ElseIfStatContext.class);
		}
		public ElseIfStatContext elseIfStat(int i) {
			return getRuleContext(ElseIfStatContext.class,i);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IF);
			setState(152);
			cond();
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					((If_statContext)_localctx).ElseIf = elseIfStat();
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(159);
				((If_statContext)_localctx).Else = elseStat();
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

	public static class ElseIfStatContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(t2lParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(t2lParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitElseIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitElseIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ELSE);
			setState(163);
			match(IF);
			setState(164);
			cond();
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

	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(t2lParser.ELSE, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ELSE);
			setState(167);
			stat_block();
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

	public static class CondContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			expr(0);
			setState(170);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(t2lParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(t2lParser.CBRACE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stat_block);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(OBRACE);
				setState(173);
				block();
				setState(174);
				match(CBRACE);
				}
				break;
			case IF:
			case WHILE:
			case FOR:
			case FUNC:
			case T2L_RETURN:
			case CLASS:
			case IMPORT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				stat();
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(t2lParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(WHILE);
			setState(180);
			expr(0);
			setState(181);
			stat_block();
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

	public static class For_loop_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(t2lParser.FOR, 0); }
		public TerminalNode ID() { return getToken(t2lParser.ID, 0); }
		public TerminalNode IN() { return getToken(t2lParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public For_loop_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterFor_loop_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitFor_loop_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitFor_loop_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loop_statContext for_loop_stat() throws RecognitionException {
		For_loop_statContext _localctx = new For_loop_statContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_loop_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(FOR);
			setState(184);
			match(ID);
			setState(185);
			match(IN);
			setState(186);
			expr(0);
			setState(187);
			stat_block();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DictionaryOpContext extends ExprContext {
		public TerminalNode OBRACE() { return getToken(t2lParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(t2lParser.CBRACE, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(t2lParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(t2lParser.COMMA, i);
		}
		public DictionaryOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterDictionaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitDictionaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitDictionaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassOpContext extends ExprContext {
		public TerminalNode NEW() { return getToken(t2lParser.NEW, 0); }
		public TerminalNode ID() { return getToken(t2lParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(t2lParser.OPAR, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(t2lParser.CPAR, 0); }
		public ClassOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterClassOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitClassOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitClassOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListOpContext extends ExprContext {
		public TerminalNode OSQUARE() { return getToken(t2lParser.OSQUARE, 0); }
		public TerminalNode CSQUARE() { return getToken(t2lParser.CSQUARE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(t2lParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(t2lParser.COMMA, i);
		}
		public ListOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterListOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitListOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitListOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncOpContext extends ExprContext {
		public TerminalNode ID() { return getToken(t2lParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(t2lParser.OPAR, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(t2lParser.CPAR, 0); }
		public FuncOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterFuncOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitFuncOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitFuncOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomOpContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterAtomOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitAtomOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitAtomOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterMultiOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitMultiOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitMultiOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOpContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(t2lParser.POW, 0); }
		public TerminalNode MULT() { return getToken(t2lParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(t2lParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(t2lParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(t2lParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(t2lParser.MINUS, 0); }
		public TerminalNode LTEQ() { return getToken(t2lParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(t2lParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(t2lParser.LT, 0); }
		public TerminalNode GT() { return getToken(t2lParser.GT, 0); }
		public TerminalNode EQ() { return getToken(t2lParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(t2lParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(t2lParser.AND, 0); }
		public TerminalNode OR() { return getToken(t2lParser.OR, 0); }
		public ExprOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterExprOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitExprOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitExprOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleOpContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(t2lParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(t2lParser.NOT, 0); }
		public SingleOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterSingleOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitSingleOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitSingleOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexOpContext extends ExprContext {
		public TerminalNode ID() { return getToken(t2lParser.ID, 0); }
		public TerminalNode OSQUARE() { return getToken(t2lParser.OSQUARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CSQUARE() { return getToken(t2lParser.CSQUARE, 0); }
		public IndexOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterIndexOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitIndexOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitIndexOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new SingleOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(190);
				((SingleOpContext)_localctx).op = match(MINUS);
				setState(191);
				expr(15);
				}
				break;
			case 2:
				{
				_localctx = new SingleOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				((SingleOpContext)_localctx).op = match(NOT);
				setState(193);
				expr(14);
				}
				break;
			case 3:
				{
				_localctx = new AtomOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				atom();
				}
				break;
			case 4:
				{
				_localctx = new ListOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(OSQUARE);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << OSQUARE) | (1L << NEW) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					setState(201);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(196);
							expr(0);
							setState(197);
							match(COMMA);
							}
							} 
						}
						setState(203);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					}
					setState(204);
					expr(0);
					}
				}

				setState(207);
				match(CSQUARE);
				}
				break;
			case 5:
				{
				_localctx = new DictionaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(OBRACE);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << OSQUARE) | (1L << NEW) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					setState(214);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(209);
							pair();
							setState(210);
							match(COMMA);
							}
							} 
						}
						setState(216);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					}
					setState(217);
					pair();
					}
				}

				setState(220);
				match(CBRACE);
				}
				break;
			case 6:
				{
				_localctx = new IndexOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(ID);
				setState(222);
				match(OSQUARE);
				setState(223);
				expr(0);
				setState(224);
				match(CSQUARE);
				}
				break;
			case 7:
				{
				_localctx = new FuncOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(ID);
				setState(227);
				match(OPAR);
				setState(228);
				params();
				setState(229);
				match(CPAR);
				}
				break;
			case 8:
				{
				_localctx = new ClassOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				match(NEW);
				setState(232);
				match(ID);
				setState(233);
				match(OPAR);
				setState(234);
				params();
				setState(235);
				match(CPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(263);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(240);
						((ExprOpContext)_localctx).op = match(POW);
						setState(241);
						((ExprOpContext)_localctx).right = expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(243);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(244);
						((ExprOpContext)_localctx).right = expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(246);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(247);
						((ExprOpContext)_localctx).right = expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(249);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(250);
						((ExprOpContext)_localctx).right = expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(252);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(253);
						((ExprOpContext)_localctx).right = expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(255);
						((ExprOpContext)_localctx).op = match(AND);
						setState(256);
						((ExprOpContext)_localctx).right = expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(258);
						((ExprOpContext)_localctx).op = match(OR);
						setState(259);
						((ExprOpContext)_localctx).right = expr(9);
						}
						break;
					case 8:
						{
						_localctx = new MultiOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(261);
						match(T__0);
						setState(262);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public ExprContext key;
		public ExprContext value;
		public TerminalNode COL() { return getToken(t2lParser.COL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			((PairContext)_localctx).key = expr(0);
			setState(269);
			match(COL);
			setState(270);
			((PairContext)_localctx).value = expr(0);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IDAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(t2lParser.ID, 0); }
		public IDAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterIDAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitIDAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitIDAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(t2lParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenAtomContext extends AtomContext {
		public TerminalNode OPAR() { return getToken(t2lParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(t2lParser.CPAR, 0); }
		public ParenAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterParenAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitParenAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitParenAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(t2lParser.INT, 0); }
		public IntAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).enterIntAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof t2lListener ) ((t2lListener)listener).exitIntAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof t2lVisitor ) return ((t2lVisitor<? extends T>)visitor).visitIntAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atom);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				_localctx = new ParenAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(OPAR);
				setState(273);
				expr(0);
				setState(274);
				match(CPAR);
				}
				break;
			case INT:
				_localctx = new IntAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(INT);
				}
				break;
			case ID:
				_localctx = new IDAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				match(STRING);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u011c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\7\3\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4C\n\4\3\5\3\5\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t^\n\t\f\t\16\ta\13\t\3\t\3"+
		"\t\5\te\n\t\3\t\3\t\7\ti\n\t\f\t\16\tl\13\t\3\t\3\t\3\n\3\n\3\n\7\ns\n"+
		"\n\f\n\16\nv\13\n\3\n\5\ny\n\n\3\13\3\13\7\13}\n\13\f\13\16\13\u0080\13"+
		"\13\3\13\5\13\u0083\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u009d"+
		"\n\17\f\17\16\17\u00a0\13\17\3\17\5\17\u00a3\n\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00b4\n\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00ca\n\26\f\26\16\26\u00cd\13\26"+
		"\3\26\5\26\u00d0\n\26\3\26\3\26\3\26\3\26\3\26\7\26\u00d7\n\26\f\26\16"+
		"\26\u00da\13\26\3\26\5\26\u00dd\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f0\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u010a\n\26\f\26\16"+
		"\26\u010d\13\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u011a\n\30\3\30\2\3*\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\2\6\3\2\16\20\3\2\f\r\3\2\b\13\3\2\6\7\2\u0131\2\60\3\2\2\2\4"+
		"\65\3\2\2\2\6B\3\2\2\2\bG\3\2\2\2\nI\3\2\2\2\fO\3\2\2\2\16T\3\2\2\2\20"+
		"X\3\2\2\2\22x\3\2\2\2\24\u0082\3\2\2\2\26\u008b\3\2\2\2\30\u008d\3\2\2"+
		"\2\32\u0095\3\2\2\2\34\u0099\3\2\2\2\36\u00a4\3\2\2\2 \u00a8\3\2\2\2\""+
		"\u00ab\3\2\2\2$\u00b3\3\2\2\2&\u00b5\3\2\2\2(\u00b9\3\2\2\2*\u00ef\3\2"+
		"\2\2,\u010e\3\2\2\2.\u0119\3\2\2\2\60\61\5\4\3\2\61\3\3\2\2\2\62\64\5"+
		"\6\4\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3"+
		"\2\2\2\67\65\3\2\2\28C\5\26\f\29C\5\34\17\2:C\5&\24\2;C\5\n\6\2<C\5\f"+
		"\7\2=C\5\20\t\2>C\5\16\b\2?C\5\30\r\2@C\5(\25\2AC\5\32\16\2B8\3\2\2\2"+
		"B9\3\2\2\2B:\3\2\2\2B;\3\2\2\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2B?\3\2\2\2"+
		"B@\3\2\2\2BA\3\2\2\2C\7\3\2\2\2DH\5\26\f\2EH\5\20\t\2FH\5\f\7\2GD\3\2"+
		"\2\2GE\3\2\2\2GF\3\2\2\2H\t\3\2\2\2IJ\7\'\2\2JK\7\27\2\2KL\5\22\n\2LM"+
		"\7\30\2\2MN\7\23\2\2N\13\3\2\2\2OP\7\"\2\2PQ\7\'\2\2QR\5\24\13\2RS\5$"+
		"\23\2S\r\3\2\2\2TU\7#\2\2UV\5*\26\2VW\7\23\2\2W\17\3\2\2\2XY\7$\2\2Yd"+
		"\7\'\2\2Z_\7\27\2\2[\\\7\'\2\2\\^\7\26\2\2][\3\2\2\2^a\3\2\2\2_]\3\2\2"+
		"\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\'\2\2ce\7\30\2\2dZ\3\2\2\2de\3\2"+
		"\2\2ef\3\2\2\2fj\7\31\2\2gi\5\b\5\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3"+
		"\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\32\2\2n\21\3\2\2\2op\5*\26\2pq\7\26\2\2"+
		"qs\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2"+
		"wy\5*\26\2xt\3\2\2\2xy\3\2\2\2y\23\3\2\2\2z{\7)\2\2{}\7\26\2\2|z\3\2\2"+
		"\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2"+
		"\2\2\u0081\u0083\7)\2\2\u0082~\3\2\2\2\u0082\u0083\3\2\2\2\u0083\25\3"+
		"\2\2\2\u0084\u0085\7\'\2\2\u0085\u0086\7\25\2\2\u0086\u0087\5*\26\2\u0087"+
		"\u0088\7\23\2\2\u0088\u008c\3\2\2\2\u0089\u008a\7\'\2\2\u008a\u008c\7"+
		"\23\2\2\u008b\u0084\3\2\2\2\u008b\u0089\3\2\2\2\u008c\27\3\2\2\2\u008d"+
		"\u008e\7\'\2\2\u008e\u008f\7\33\2\2\u008f\u0090\5*\26\2\u0090\u0091\7"+
		"\34\2\2\u0091\u0092\7\25\2\2\u0092\u0093\5*\26\2\u0093\u0094\7\23\2\2"+
		"\u0094\31\3\2\2\2\u0095\u0096\7&\2\2\u0096\u0097\7\'\2\2\u0097\u0098\7"+
		"\23\2\2\u0098\33\3\2\2\2\u0099\u009a\7\35\2\2\u009a\u009e\5\"\22\2\u009b"+
		"\u009d\5\36\20\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a3\5 \21\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\35\3\2\2"+
		"\2\u00a4\u00a5\7\36\2\2\u00a5\u00a6\7\35\2\2\u00a6\u00a7\5\"\22\2\u00a7"+
		"\37\3\2\2\2\u00a8\u00a9\7\36\2\2\u00a9\u00aa\5$\23\2\u00aa!\3\2\2\2\u00ab"+
		"\u00ac\5*\26\2\u00ac\u00ad\5$\23\2\u00ad#\3\2\2\2\u00ae\u00af\7\31\2\2"+
		"\u00af\u00b0\5\4\3\2\u00b0\u00b1\7\32\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b4"+
		"\5\6\4\2\u00b3\u00ae\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4%\3\2\2\2\u00b5"+
		"\u00b6\7\37\2\2\u00b6\u00b7\5*\26\2\u00b7\u00b8\5$\23\2\u00b8\'\3\2\2"+
		"\2\u00b9\u00ba\7 \2\2\u00ba\u00bb\7\'\2\2\u00bb\u00bc\7!\2\2\u00bc\u00bd"+
		"\5*\26\2\u00bd\u00be\5$\23\2\u00be)\3\2\2\2\u00bf\u00c0\b\26\1\2\u00c0"+
		"\u00c1\7\r\2\2\u00c1\u00f0\5*\26\21\u00c2\u00c3\7\22\2\2\u00c3\u00f0\5"+
		"*\26\20\u00c4\u00f0\5.\30\2\u00c5\u00cf\7\33\2\2\u00c6\u00c7\5*\26\2\u00c7"+
		"\u00c8\7\26\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3"+
		"\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d0\5*\26\2\u00cf\u00cb\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00f0\7\34\2\2\u00d2\u00dc\7\31\2\2\u00d3"+
		"\u00d4\5,\27\2\u00d4\u00d5\7\26\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d3\3"+
		"\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\5,\27\2\u00dc\u00d8\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00f0\7\32\2\2\u00df"+
		"\u00e0\7\'\2\2\u00e0\u00e1\7\33\2\2\u00e1\u00e2\5*\26\2\u00e2\u00e3\7"+
		"\34\2\2\u00e3\u00f0\3\2\2\2\u00e4\u00e5\7\'\2\2\u00e5\u00e6\7\27\2\2\u00e6"+
		"\u00e7\5\22\n\2\u00e7\u00e8\7\30\2\2\u00e8\u00f0\3\2\2\2\u00e9\u00ea\7"+
		"%\2\2\u00ea\u00eb\7\'\2\2\u00eb\u00ec\7\27\2\2\u00ec\u00ed\5\22\n\2\u00ed"+
		"\u00ee\7\30\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00bf\3\2\2\2\u00ef\u00c2\3"+
		"\2\2\2\u00ef\u00c4\3\2\2\2\u00ef\u00c5\3\2\2\2\u00ef\u00d2\3\2\2\2\u00ef"+
		"\u00df\3\2\2\2\u00ef\u00e4\3\2\2\2\u00ef\u00e9\3\2\2\2\u00f0\u010b\3\2"+
		"\2\2\u00f1\u00f2\f\22\2\2\u00f2\u00f3\7\21\2\2\u00f3\u010a\5*\26\22\u00f4"+
		"\u00f5\f\17\2\2\u00f5\u00f6\t\2\2\2\u00f6\u010a\5*\26\20\u00f7\u00f8\f"+
		"\16\2\2\u00f8\u00f9\t\3\2\2\u00f9\u010a\5*\26\17\u00fa\u00fb\f\r\2\2\u00fb"+
		"\u00fc\t\4\2\2\u00fc\u010a\5*\26\16\u00fd\u00fe\f\f\2\2\u00fe\u00ff\t"+
		"\5\2\2\u00ff\u010a\5*\26\r\u0100\u0101\f\13\2\2\u0101\u0102\7\5\2\2\u0102"+
		"\u010a\5*\26\f\u0103\u0104\f\n\2\2\u0104\u0105\7\4\2\2\u0105\u010a\5*"+
		"\26\13\u0106\u0107\f\3\2\2\u0107\u0108\7\3\2\2\u0108\u010a\5*\26\4\u0109"+
		"\u00f1\3\2\2\2\u0109\u00f4\3\2\2\2\u0109\u00f7\3\2\2\2\u0109\u00fa\3\2"+
		"\2\2\u0109\u00fd\3\2\2\2\u0109\u0100\3\2\2\2\u0109\u0103\3\2\2\2\u0109"+
		"\u0106\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c+\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\5*\26\2\u010f\u0110"+
		"\7\24\2\2\u0110\u0111\5*\26\2\u0111-\3\2\2\2\u0112\u0113\7\27\2\2\u0113"+
		"\u0114\5*\26\2\u0114\u0115\7\30\2\2\u0115\u011a\3\2\2\2\u0116\u011a\7"+
		"(\2\2\u0117\u011a\7\'\2\2\u0118\u011a\7)\2\2\u0119\u0112\3\2\2\2\u0119"+
		"\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a/\3\2\2\2"+
		"\30\65BG_djtx~\u0082\u008b\u009e\u00a2\u00b3\u00cb\u00cf\u00d8\u00dc\u00ef"+
		"\u0109\u010b\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}