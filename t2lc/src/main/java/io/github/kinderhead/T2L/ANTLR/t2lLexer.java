// Generated from C:/Users/Daniel/Documents/Java/T2L/t2lc/src/main/resources\t2l.g4 by ANTLR 4.9.1
package io.github.kinderhead.T2L.ANTLR;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class t2lLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OR=2, AND=3, EQ=4, NEQ=5, GT=6, LT=7, GTEQ=8, LTEQ=9, PLUS=10, 
		MINUS=11, MULT=12, DIV=13, MOD=14, POW=15, NOT=16, SCOL=17, COL=18, ASSIGN=19, 
		COMMA=20, OPAR=21, CPAR=22, OBRACE=23, CBRACE=24, OSQUARE=25, CSQUARE=26, 
		IF=27, ELSE=28, WHILE=29, FOR=30, IN=31, FUNC=32, T2L_RETURN=33, CLASS=34, 
		NEW=35, IMPORT=36, JIMPORT=37, ID=38, INT=39, DOC=40, STRING=41, COMMENT=42, 
		SPACE=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", 
			"MINUS", "MULT", "DIV", "MOD", "POW", "NOT", "SCOL", "COL", "ASSIGN", 
			"COMMA", "OPAR", "CPAR", "OBRACE", "CBRACE", "OSQUARE", "CSQUARE", "IF", 
			"ELSE", "WHILE", "FOR", "IN", "FUNC", "T2L_RETURN", "CLASS", "NEW", "IMPORT", 
			"JIMPORT", "ID", "INT", "DOC", "STRING", "COMMENT", "SPACE"
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
			"JIMPORT", "ID", "INT", "DOC", "STRING", "COMMENT", "SPACE"
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


	public t2lLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "t2l.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0144\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#"+
		"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\7\'\u00d0\n\'\f\'\16\'\u00d3\13\'\3\'\3\'\7\'\u00d7\n\'\f\'\16\'\u00da"+
		"\13\'\3\'\7\'\u00dd\n\'\f\'\16\'\u00e0\13\'\3\'\3\'\7\'\u00e4\n\'\f\'"+
		"\16\'\u00e7\13\'\5\'\u00e9\n\'\3(\6(\u00ec\n(\r(\16(\u00ed\3(\6(\u00f1"+
		"\n(\r(\16(\u00f2\3(\3(\7(\u00f7\n(\f(\16(\u00fa\13(\3(\3(\6(\u00fe\n("+
		"\r(\16(\u00ff\3(\3(\6(\u0104\n(\r(\16(\u0105\3(\3(\6(\u010a\n(\r(\16("+
		"\u010b\3(\3(\7(\u0110\n(\f(\16(\u0113\13(\3(\3(\3(\3(\6(\u0119\n(\r(\16"+
		"(\u011a\5(\u011d\n(\3)\3)\3)\3)\3)\7)\u0124\n)\f)\16)\u0127\13)\3)\3)"+
		"\3)\3)\3*\3*\3*\3*\7*\u0131\n*\f*\16*\u0134\13*\3*\3*\3+\3+\7+\u013a\n"+
		"+\f+\16+\u013d\13+\3+\3+\3,\3,\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-\3\2\t\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\3\2$$\5\2\f\f\17\17$$\4\2"+
		"\f\f\17\17\5\2\13\f\17\17\"\"\2\u0159\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5"+
		"[\3\2\2\2\7^\3\2\2\2\ta\3\2\2\2\13d\3\2\2\2\rg\3\2\2\2\17i\3\2\2\2\21"+
		"k\3\2\2\2\23n\3\2\2\2\25q\3\2\2\2\27s\3\2\2\2\31u\3\2\2\2\33w\3\2\2\2"+
		"\35y\3\2\2\2\37{\3\2\2\2!}\3\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0083"+
		"\3\2\2\2)\u0085\3\2\2\2+\u0087\3\2\2\2-\u0089\3\2\2\2/\u008b\3\2\2\2\61"+
		"\u008d\3\2\2\2\63\u008f\3\2\2\2\65\u0091\3\2\2\2\67\u0093\3\2\2\29\u0096"+
		"\3\2\2\2;\u009b\3\2\2\2=\u00a1\3\2\2\2?\u00a5\3\2\2\2A\u00a8\3\2\2\2C"+
		"\u00ad\3\2\2\2E\u00b4\3\2\2\2G\u00ba\3\2\2\2I\u00be\3\2\2\2K\u00c5\3\2"+
		"\2\2M\u00e8\3\2\2\2O\u011c\3\2\2\2Q\u011e\3\2\2\2S\u012c\3\2\2\2U\u0137"+
		"\3\2\2\2W\u0140\3\2\2\2YZ\7\60\2\2Z\4\3\2\2\2[\\\7~\2\2\\]\7~\2\2]\6\3"+
		"\2\2\2^_\7(\2\2_`\7(\2\2`\b\3\2\2\2ab\7?\2\2bc\7?\2\2c\n\3\2\2\2de\7#"+
		"\2\2ef\7?\2\2f\f\3\2\2\2gh\7@\2\2h\16\3\2\2\2ij\7>\2\2j\20\3\2\2\2kl\7"+
		"@\2\2lm\7?\2\2m\22\3\2\2\2no\7>\2\2op\7?\2\2p\24\3\2\2\2qr\7-\2\2r\26"+
		"\3\2\2\2st\7/\2\2t\30\3\2\2\2uv\7,\2\2v\32\3\2\2\2wx\7\61\2\2x\34\3\2"+
		"\2\2yz\7\'\2\2z\36\3\2\2\2{|\7`\2\2| \3\2\2\2}~\7#\2\2~\"\3\2\2\2\177"+
		"\u0080\7=\2\2\u0080$\3\2\2\2\u0081\u0082\7<\2\2\u0082&\3\2\2\2\u0083\u0084"+
		"\7?\2\2\u0084(\3\2\2\2\u0085\u0086\7.\2\2\u0086*\3\2\2\2\u0087\u0088\7"+
		"*\2\2\u0088,\3\2\2\2\u0089\u008a\7+\2\2\u008a.\3\2\2\2\u008b\u008c\7}"+
		"\2\2\u008c\60\3\2\2\2\u008d\u008e\7\177\2\2\u008e\62\3\2\2\2\u008f\u0090"+
		"\7]\2\2\u0090\64\3\2\2\2\u0091\u0092\7_\2\2\u0092\66\3\2\2\2\u0093\u0094"+
		"\7k\2\2\u0094\u0095\7h\2\2\u00958\3\2\2\2\u0096\u0097\7g\2\2\u0097\u0098"+
		"\7n\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a:\3\2\2\2\u009b\u009c"+
		"\7y\2\2\u009c\u009d\7j\2\2\u009d\u009e\7k\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0<\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7q\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4>\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7"+
		"@\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7p\2\2\u00ab"+
		"\u00ac\7e\2\2\u00acB\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af"+
		"\u00b0\7v\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7p\2\2"+
		"\u00b3D\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7c\2"+
		"\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7u\2\2\u00b9F\3\2\2\2\u00ba\u00bb\7"+
		"p\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7y\2\2\u00bdH\3\2\2\2\u00be\u00bf"+
		"\7k\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1\7r\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00c3\7t\2\2\u00c3\u00c4\7v\2\2\u00c4J\3\2\2\2\u00c5\u00c6\7l\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7o\2\2\u00c8\u00c9\7r\2\2\u00c9\u00ca\7q\2\2"+
		"\u00ca\u00cb\7t\2\2\u00cb\u00cc\7v\2\2\u00ccL\3\2\2\2\u00cd\u00d1\t\2"+
		"\2\2\u00ce\u00d0\t\3\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00e9\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d8\t\2\2\2\u00d5\u00d7\t\3\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\7\60\2\2\u00dc\u00d4\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e5\t\2\2\2\u00e2\u00e4\t\3\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00cd\3\2\2\2\u00e8"+
		"\u00de\3\2\2\2\u00e9N\3\2\2\2\u00ea\u00ec\t\4\2\2\u00eb\u00ea\3\2\2\2"+
		"\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u011d"+
		"\3\2\2\2\u00ef\u00f1\t\4\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f8\7\60"+
		"\2\2\u00f5\u00f7\t\4\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u011d\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fd\7\60\2\2\u00fc\u00fe\t\4\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u011d\3\2"+
		"\2\2\u0101\u0103\7/\2\2\u0102\u0104\t\4\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u011d\3\2"+
		"\2\2\u0107\u0109\7/\2\2\u0108\u010a\t\4\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u0111\7\60\2\2\u010e\u0110\t\4\2\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u011d\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7/\2\2\u0115\u0116\7\60\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u0119\t\4\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c"+
		"\u00eb\3\2\2\2\u011c\u00f0\3\2\2\2\u011c\u00fb\3\2\2\2\u011c\u0101\3\2"+
		"\2\2\u011c\u0107\3\2\2\2\u011c\u0114\3\2\2\2\u011dP\3\2\2\2\u011e\u011f"+
		"\7$\2\2\u011f\u0120\7$\2\2\u0120\u0121\7$\2\2\u0121\u0125\3\2\2\2\u0122"+
		"\u0124\n\5\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u0129\7$\2\2\u0129\u012a\7$\2\2\u012a\u012b\7$\2\2\u012bR\3\2\2\2\u012c"+
		"\u0132\7$\2\2\u012d\u0131\n\6\2\2\u012e\u012f\7$\2\2\u012f\u0131\7$\2"+
		"\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u0136\7$\2\2\u0136T\3\2\2\2\u0137\u013b\7%\2\2\u0138\u013a\n\7\2\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\b+\2\2\u013f"+
		"V\3\2\2\2\u0140\u0141\t\b\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b,\2\2\u0143"+
		"X\3\2\2\2\25\2\u00d1\u00d8\u00de\u00e5\u00e8\u00ed\u00f2\u00f8\u00ff\u0105"+
		"\u010b\u0111\u011a\u011c\u0125\u0130\u0132\u013b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}