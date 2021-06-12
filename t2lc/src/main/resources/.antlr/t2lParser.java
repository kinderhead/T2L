// Generated from c:\Users\Daniel\Documents\Java\T2L\t2lc\src\main\resources\t2l.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OR=2, AND=3, EQ=4, NEQ=5, GT=6, LT=7, GTEQ=8, LTEQ=9, PLUS=10, 
		MINUS=11, MULT=12, DIV=13, MOD=14, POW=15, NOT=16, SCOL=17, COL=18, ASSIGN=19, 
		COMMA=20, OPAR=21, CPAR=22, OBRACE=23, CBRACE=24, OSQUARE=25, CSQUARE=26, 
		IF=27, ELSE=28, WHILE=29, FOR=30, IN=31, FUNC=32, T2L_RETURN=33, CLASS=34, 
		NEW=35, IMPORT=36, JIMPORT=37, ID=38, INT=39, STRING=40, COMMENT=41, SPACE=42;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_stat = 2, RULE_class_stat_block = 3, 
		RULE_call_stat = 4, RULE_func_stat = 5, RULE_t2l_return = 6, RULE_class_stat = 7, 
		RULE_params = 8, RULE_def_params = 9, RULE_var = 10, RULE_index = 11, 
		RULE_import_stat = 12, RULE_jimport_stat = 13, RULE_if_stat = 14, RULE_elseIfStat = 15, 
		RULE_elseStat = 16, RULE_cond = 17, RULE_stat_block = 18, RULE_while_stat = 19, 
		RULE_for_loop_stat = 20, RULE_expr = 21, RULE_pair = 22, RULE_atom = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "stat", "class_stat_block", "call_stat", "func_stat", 
			"t2l_return", "class_stat", "params", "def_params", "var", "index", "import_stat", 
			"jimport_stat", "if_stat", "elseIfStat", "elseStat", "cond", "stat_block", 
			"while_stat", "for_loop_stat", "expr", "pair", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "';'", "':'", "'='", 
			"','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'if'", "'else'", "'while'", 
			"'for'", "'in'", "'func'", "'return'", "'class'", "'new'", "'import'", 
			"'jimport'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", 
			"MINUS", "MULT", "DIV", "MOD", "POW", "NOT", "SCOL", "COL", "ASSIGN", 
			"COMMA", "OPAR", "CPAR", "OBRACE", "CBRACE", "OSQUARE", "CSQUARE", "IF", 
			"ELSE", "WHILE", "FOR", "IN", "FUNC", "T2L_RETURN", "CLASS", "NEW", "IMPORT", 
			"JIMPORT", "ID", "INT", "STRING", "COMMENT", "SPACE"
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
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << FUNC) | (1L << T2L_RETURN) | (1L << CLASS) | (1L << IMPORT) | (1L << JIMPORT) | (1L << ID))) != 0)) {
				{
				{
				setState(50);
				stat();
				}
				}
				setState(55);
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
		public Jimport_statContext jimport_stat() {
			return getRuleContext(Jimport_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				if_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				while_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				call_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				func_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				class_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(62);
				t2l_return();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				index();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(64);
				for_loop_stat();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(65);
				import_stat();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(66);
				jimport_stat();
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
	}

	public final Class_stat_blockContext class_stat_block() throws RecognitionException {
		Class_stat_blockContext _localctx = new Class_stat_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_stat_block);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				var();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				class_stat();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
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
	}

	public final Call_statContext call_stat() throws RecognitionException {
		Call_statContext _localctx = new Call_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_call_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ID);
			setState(75);
			match(OPAR);
			setState(76);
			params();
			setState(77);
			match(CPAR);
			setState(78);
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
	}

	public final Func_statContext func_stat() throws RecognitionException {
		Func_statContext _localctx = new Func_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(FUNC);
			setState(81);
			match(ID);
			setState(82);
			def_params();
			setState(83);
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
	}

	public final T2l_returnContext t2l_return() throws RecognitionException {
		T2l_returnContext _localctx = new T2l_returnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_t2l_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T2L_RETURN);
			setState(86);
			expr(0);
			setState(87);
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
	}

	public final Class_statContext class_stat() throws RecognitionException {
		Class_statContext _localctx = new Class_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_class_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(CLASS);
			setState(90);
			match(ID);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPAR) {
				{
				setState(91);
				match(OPAR);
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(92);
						match(ID);
						setState(93);
						match(COMMA);
						}
						} 
					}
					setState(98);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(99);
				match(ID);
				setState(100);
				match(CPAR);
				}
			}

			setState(103);
			match(OBRACE);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << CLASS) | (1L << ID))) != 0)) {
				{
				{
				setState(104);
				class_stat_block();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << OSQUARE) | (1L << NEW) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(112);
						expr(0);
						setState(113);
						match(COMMA);
						}
						} 
					}
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(120);
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
	}

	public final Def_paramsContext def_params() throws RecognitionException {
		Def_paramsContext _localctx = new Def_paramsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_def_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(123);
						match(STRING);
						setState(124);
						match(COMMA);
						}
						} 
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(130);
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
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(ID);
				setState(134);
				match(ASSIGN);
				setState(135);
				expr(0);
				setState(136);
				match(SCOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(ID);
				setState(139);
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
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ID);
			setState(143);
			match(OSQUARE);
			setState(144);
			expr(0);
			setState(145);
			match(CSQUARE);
			setState(146);
			match(ASSIGN);
			setState(147);
			expr(0);
			setState(148);
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
	}

	public final Import_statContext import_stat() throws RecognitionException {
		Import_statContext _localctx = new Import_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_import_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IMPORT);
			setState(151);
			match(ID);
			setState(152);
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

	public static class Jimport_statContext extends ParserRuleContext {
		public TerminalNode JIMPORT() { return getToken(t2lParser.JIMPORT, 0); }
		public TerminalNode ID() { return getToken(t2lParser.ID, 0); }
		public TerminalNode SCOL() { return getToken(t2lParser.SCOL, 0); }
		public Jimport_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jimport_stat; }
	}

	public final Jimport_statContext jimport_stat() throws RecognitionException {
		Jimport_statContext _localctx = new Jimport_statContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jimport_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(JIMPORT);
			setState(155);
			match(ID);
			setState(156);
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
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(IF);
			setState(159);
			cond();
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(160);
					((If_statContext)_localctx).ElseIf = elseIfStat();
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(166);
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
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ELSE);
			setState(170);
			match(IF);
			setState(171);
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
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ELSE);
			setState(174);
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
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			expr(0);
			setState(177);
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
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stat_block);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(OBRACE);
				setState(180);
				block();
				setState(181);
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
			case JIMPORT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
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
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(WHILE);
			setState(187);
			expr(0);
			setState(188);
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
	}

	public final For_loop_statContext for_loop_stat() throws RecognitionException {
		For_loop_statContext _localctx = new For_loop_statContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for_loop_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(FOR);
			setState(191);
			match(ID);
			setState(192);
			match(IN);
			setState(193);
			expr(0);
			setState(194);
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
	}
	public static class FuncOpContext extends ExprContext {
		public TerminalNode ID() { return getToken(t2lParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(t2lParser.OPAR, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(t2lParser.CPAR, 0); }
		public FuncOpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AtomOpContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomOpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultiOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiOpContext(ExprContext ctx) { copyFrom(ctx); }
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
	}
	public static class SingleOpContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(t2lParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(t2lParser.NOT, 0); }
		public SingleOpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IndexOpContext extends ExprContext {
		public TerminalNode ID() { return getToken(t2lParser.ID, 0); }
		public TerminalNode OSQUARE() { return getToken(t2lParser.OSQUARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CSQUARE() { return getToken(t2lParser.CSQUARE, 0); }
		public IndexOpContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new SingleOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(197);
				((SingleOpContext)_localctx).op = match(MINUS);
				setState(198);
				expr(15);
				}
				break;
			case 2:
				{
				_localctx = new SingleOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				((SingleOpContext)_localctx).op = match(NOT);
				setState(200);
				expr(14);
				}
				break;
			case 3:
				{
				_localctx = new AtomOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				atom();
				}
				break;
			case 4:
				{
				_localctx = new ListOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				match(OSQUARE);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << OSQUARE) | (1L << NEW) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					setState(208);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(203);
							expr(0);
							setState(204);
							match(COMMA);
							}
							} 
						}
						setState(210);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					}
					setState(211);
					expr(0);
					}
				}

				setState(214);
				match(CSQUARE);
				}
				break;
			case 5:
				{
				_localctx = new DictionaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(OBRACE);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << OSQUARE) | (1L << NEW) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					setState(221);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(216);
							pair();
							setState(217);
							match(COMMA);
							}
							} 
						}
						setState(223);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					}
					setState(224);
					pair();
					}
				}

				setState(227);
				match(CBRACE);
				}
				break;
			case 6:
				{
				_localctx = new IndexOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				match(ID);
				setState(229);
				match(OSQUARE);
				setState(230);
				expr(0);
				setState(231);
				match(CSQUARE);
				}
				break;
			case 7:
				{
				_localctx = new FuncOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(ID);
				setState(234);
				match(OPAR);
				setState(235);
				params();
				setState(236);
				match(CPAR);
				}
				break;
			case 8:
				{
				_localctx = new ClassOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(NEW);
				setState(239);
				match(ID);
				setState(240);
				match(OPAR);
				setState(241);
				params();
				setState(242);
				match(CPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(247);
						((ExprOpContext)_localctx).op = match(POW);
						setState(248);
						((ExprOpContext)_localctx).right = expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(250);
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
						setState(251);
						((ExprOpContext)_localctx).right = expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(253);
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
						setState(254);
						((ExprOpContext)_localctx).right = expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(256);
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
						setState(257);
						((ExprOpContext)_localctx).right = expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(258);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(259);
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
						setState(260);
						((ExprOpContext)_localctx).right = expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(261);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(262);
						((ExprOpContext)_localctx).op = match(AND);
						setState(263);
						((ExprOpContext)_localctx).right = expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(265);
						((ExprOpContext)_localctx).op = match(OR);
						setState(266);
						((ExprOpContext)_localctx).right = expr(9);
						}
						break;
					case 8:
						{
						_localctx = new MultiOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(268);
						match(T__0);
						setState(269);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(274);
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
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			((PairContext)_localctx).key = expr(0);
			setState(276);
			match(COL);
			setState(277);
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
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(t2lParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class ParenAtomContext extends AtomContext {
		public TerminalNode OPAR() { return getToken(t2lParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(t2lParser.CPAR, 0); }
		public ParenAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class IntAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(t2lParser.INT, 0); }
		public IntAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atom);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				_localctx = new ParenAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(OPAR);
				setState(280);
				expr(0);
				setState(281);
				match(CPAR);
				}
				break;
			case INT:
				_localctx = new IntAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(INT);
				}
				break;
			case ID:
				_localctx = new IDAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
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
		case 21:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0123\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\ta\n\t\f\t\16\t"+
		"d\13\t\3\t\3\t\5\th\n\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\t\3\t\3\n\3"+
		"\n\3\n\7\nv\n\n\f\n\16\ny\13\n\3\n\5\n|\n\n\3\13\3\13\7\13\u0080\n\13"+
		"\f\13\16\13\u0083\13\13\3\13\5\13\u0086\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u008f\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u00a4\n\20\f\20\16\20\u00a7\13"+
		"\20\3\20\5\20\u00aa\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00bb\n\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u00d1\n\27\f\27\16\27\u00d4\13\27\3\27\5\27\u00d7\n\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u00de\n\27\f\27\16\27\u00e1\13\27\3\27\5\27"+
		"\u00e4\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00f7\n\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0111\n\27\f\27\16\27\u0114\13\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0121\n\31\3\31\2\3"+
		",\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\6\3\2\16\20"+
		"\3\2\f\r\3\2\b\13\3\2\6\7\2\u0138\2\62\3\2\2\2\4\67\3\2\2\2\6E\3\2\2\2"+
		"\bJ\3\2\2\2\nL\3\2\2\2\fR\3\2\2\2\16W\3\2\2\2\20[\3\2\2\2\22{\3\2\2\2"+
		"\24\u0085\3\2\2\2\26\u008e\3\2\2\2\30\u0090\3\2\2\2\32\u0098\3\2\2\2\34"+
		"\u009c\3\2\2\2\36\u00a0\3\2\2\2 \u00ab\3\2\2\2\"\u00af\3\2\2\2$\u00b2"+
		"\3\2\2\2&\u00ba\3\2\2\2(\u00bc\3\2\2\2*\u00c0\3\2\2\2,\u00f6\3\2\2\2."+
		"\u0115\3\2\2\2\60\u0120\3\2\2\2\62\63\5\4\3\2\63\3\3\2\2\2\64\66\5\6\4"+
		"\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\5\3\2\2\29\67"+
		"\3\2\2\2:F\5\26\f\2;F\5\36\20\2<F\5(\25\2=F\5\n\6\2>F\5\f\7\2?F\5\20\t"+
		"\2@F\5\16\b\2AF\5\30\r\2BF\5*\26\2CF\5\32\16\2DF\5\34\17\2E:\3\2\2\2E"+
		";\3\2\2\2E<\3\2\2\2E=\3\2\2\2E>\3\2\2\2E?\3\2\2\2E@\3\2\2\2EA\3\2\2\2"+
		"EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\7\3\2\2\2GK\5\26\f\2HK\5\20\t\2IK\5\f"+
		"\7\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\t\3\2\2\2LM\7(\2\2MN\7\27\2\2NO\5"+
		"\22\n\2OP\7\30\2\2PQ\7\23\2\2Q\13\3\2\2\2RS\7\"\2\2ST\7(\2\2TU\5\24\13"+
		"\2UV\5&\24\2V\r\3\2\2\2WX\7#\2\2XY\5,\27\2YZ\7\23\2\2Z\17\3\2\2\2[\\\7"+
		"$\2\2\\g\7(\2\2]b\7\27\2\2^_\7(\2\2_a\7\26\2\2`^\3\2\2\2ad\3\2\2\2b`\3"+
		"\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7(\2\2fh\7\30\2\2g]\3\2\2\2gh\3"+
		"\2\2\2hi\3\2\2\2im\7\31\2\2jl\5\b\5\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn"+
		"\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\32\2\2q\21\3\2\2\2rs\5,\27\2st\7\26\2"+
		"\2tv\3\2\2\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2"+
		"\2z|\5,\27\2{w\3\2\2\2{|\3\2\2\2|\23\3\2\2\2}~\7*\2\2~\u0080\7\26\2\2"+
		"\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\7*\2\2\u0085\u0081"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\25\3\2\2\2\u0087\u0088\7(\2\2\u0088"+
		"\u0089\7\25\2\2\u0089\u008a\5,\27\2\u008a\u008b\7\23\2\2\u008b\u008f\3"+
		"\2\2\2\u008c\u008d\7(\2\2\u008d\u008f\7\23\2\2\u008e\u0087\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\27\3\2\2\2\u0090\u0091\7(\2\2\u0091\u0092\7\33\2"+
		"\2\u0092\u0093\5,\27\2\u0093\u0094\7\34\2\2\u0094\u0095\7\25\2\2\u0095"+
		"\u0096\5,\27\2\u0096\u0097\7\23\2\2\u0097\31\3\2\2\2\u0098\u0099\7&\2"+
		"\2\u0099\u009a\7(\2\2\u009a\u009b\7\23\2\2\u009b\33\3\2\2\2\u009c\u009d"+
		"\7\'\2\2\u009d\u009e\7(\2\2\u009e\u009f\7\23\2\2\u009f\35\3\2\2\2\u00a0"+
		"\u00a1\7\35\2\2\u00a1\u00a5\5$\23\2\u00a2\u00a4\5 \21\2\u00a3\u00a2\3"+
		"\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\5\"\22\2\u00a9\u00a8\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\37\3\2\2\2\u00ab\u00ac\7\36\2\2\u00ac"+
		"\u00ad\7\35\2\2\u00ad\u00ae\5$\23\2\u00ae!\3\2\2\2\u00af\u00b0\7\36\2"+
		"\2\u00b0\u00b1\5&\24\2\u00b1#\3\2\2\2\u00b2\u00b3\5,\27\2\u00b3\u00b4"+
		"\5&\24\2\u00b4%\3\2\2\2\u00b5\u00b6\7\31\2\2\u00b6\u00b7\5\4\3\2\u00b7"+
		"\u00b8\7\32\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00bb\5\6\4\2\u00ba\u00b5\3"+
		"\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\'\3\2\2\2\u00bc\u00bd\7\37\2\2\u00bd"+
		"\u00be\5,\27\2\u00be\u00bf\5&\24\2\u00bf)\3\2\2\2\u00c0\u00c1\7 \2\2\u00c1"+
		"\u00c2\7(\2\2\u00c2\u00c3\7!\2\2\u00c3\u00c4\5,\27\2\u00c4\u00c5\5&\24"+
		"\2\u00c5+\3\2\2\2\u00c6\u00c7\b\27\1\2\u00c7\u00c8\7\r\2\2\u00c8\u00f7"+
		"\5,\27\21\u00c9\u00ca\7\22\2\2\u00ca\u00f7\5,\27\20\u00cb\u00f7\5\60\31"+
		"\2\u00cc\u00d6\7\33\2\2\u00cd\u00ce\5,\27\2\u00ce\u00cf\7\26\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d7\5,\27\2\u00d6\u00d2\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00f7\7\34\2\2\u00d9\u00e3\7\31\2\2\u00da\u00db\5.\30\2\u00db"+
		"\u00dc\7\26\2\2\u00dc\u00de\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00e1\3"+
		"\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e4\5.\30\2\u00e3\u00df\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00f7\7\32\2\2\u00e6\u00e7\7(\2\2\u00e7"+
		"\u00e8\7\33\2\2\u00e8\u00e9\5,\27\2\u00e9\u00ea\7\34\2\2\u00ea\u00f7\3"+
		"\2\2\2\u00eb\u00ec\7(\2\2\u00ec\u00ed\7\27\2\2\u00ed\u00ee\5\22\n\2\u00ee"+
		"\u00ef\7\30\2\2\u00ef\u00f7\3\2\2\2\u00f0\u00f1\7%\2\2\u00f1\u00f2\7("+
		"\2\2\u00f2\u00f3\7\27\2\2\u00f3\u00f4\5\22\n\2\u00f4\u00f5\7\30\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00c6\3\2\2\2\u00f6\u00c9\3\2\2\2\u00f6\u00cb\3\2"+
		"\2\2\u00f6\u00cc\3\2\2\2\u00f6\u00d9\3\2\2\2\u00f6\u00e6\3\2\2\2\u00f6"+
		"\u00eb\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f7\u0112\3\2\2\2\u00f8\u00f9\f\22"+
		"\2\2\u00f9\u00fa\7\21\2\2\u00fa\u0111\5,\27\22\u00fb\u00fc\f\17\2\2\u00fc"+
		"\u00fd\t\2\2\2\u00fd\u0111\5,\27\20\u00fe\u00ff\f\16\2\2\u00ff\u0100\t"+
		"\3\2\2\u0100\u0111\5,\27\17\u0101\u0102\f\r\2\2\u0102\u0103\t\4\2\2\u0103"+
		"\u0111\5,\27\16\u0104\u0105\f\f\2\2\u0105\u0106\t\5\2\2\u0106\u0111\5"+
		",\27\r\u0107\u0108\f\13\2\2\u0108\u0109\7\5\2\2\u0109\u0111\5,\27\f\u010a"+
		"\u010b\f\n\2\2\u010b\u010c\7\4\2\2\u010c\u0111\5,\27\13\u010d\u010e\f"+
		"\3\2\2\u010e\u010f\7\3\2\2\u010f\u0111\5,\27\4\u0110\u00f8\3\2\2\2\u0110"+
		"\u00fb\3\2\2\2\u0110\u00fe\3\2\2\2\u0110\u0101\3\2\2\2\u0110\u0104\3\2"+
		"\2\2\u0110\u0107\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010d\3\2\2\2\u0111"+
		"\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113-\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0115\u0116\5,\27\2\u0116\u0117\7\24\2\2\u0117\u0118"+
		"\5,\27\2\u0118/\3\2\2\2\u0119\u011a\7\27\2\2\u011a\u011b\5,\27\2\u011b"+
		"\u011c\7\30\2\2\u011c\u0121\3\2\2\2\u011d\u0121\7)\2\2\u011e\u0121\7("+
		"\2\2\u011f\u0121\7*\2\2\u0120\u0119\3\2\2\2\u0120\u011d\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\61\3\2\2\2\30\67EJbgmw{\u0081"+
		"\u0085\u008e\u00a5\u00a9\u00ba\u00d2\u00d6\u00df\u00e3\u00f6\u0110\u0112"+
		"\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}