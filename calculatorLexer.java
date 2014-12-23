// Generated from calculator.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, TYPE_INT=4, TYPE_FLOAT=5, INT=6, FLOAT=7, MUL=8, 
		DIV=9, ADD=10, SUB=11, EXP=12, WHITESPACE=13, NEWLINE=14, ASSIGN=15, BLOCK_START=16, 
		BLOCK_END=17, IF=18, ELSE=19, WHILE=20, AND=21, OR=22, NOT=23, PAREN_OPEN=24, 
		PAREN_CLOSE=25, STRING=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "TYPE_INT", "TYPE_FLOAT", "INT", "FLOAT", "MUL", 
		"DIV", "ADD", "SUB", "EXP", "WHITESPACE", "NEWLINE", "ASSIGN", "BLOCK_START", 
		"BLOCK_END", "IF", "ELSE", "WHILE", "AND", "OR", "NOT", "PAREN_OPEN", 
		"PAREN_CLOSE", "STRING", "DIGIT"
	};


	public calculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\6\7]\n\7\r\7\16\7^\3\b\6\bb\n\b\r"+
		"\b\16\bc\3\b\3\b\7\bh\n\b\f\b\16\bk\13\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\7\33\u00a2\n\33\f\33\16\33\u00a5\13\33\3\34\3\34\2"+
		"\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\2\3\2"+
		"\6\4\2\13\13\"\"\4\2C\\c|\5\2\62;C\\c|\3\2\62;\u00aa\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\39\3\2\2\2\5D\3\2\2\2\7F\3\2\2\2\tQ\3\2\2\2\13U"+
		"\3\2\2\2\r\\\3\2\2\2\17a\3\2\2\2\21l\3\2\2\2\23n\3\2\2\2\25p\3\2\2\2\27"+
		"r\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!~\3\2\2\2#\u0080"+
		"\3\2\2\2%\u0082\3\2\2\2\'\u0085\3\2\2\2)\u008a\3\2\2\2+\u0090\3\2\2\2"+
		"-\u0094\3\2\2\2/\u0097\3\2\2\2\61\u009b\3\2\2\2\63\u009d\3\2\2\2\65\u009f"+
		"\3\2\2\2\67\u00a6\3\2\2\29:\7K\2\2:;\7p\2\2;<\7v\2\2<=\7V\2\2=>\7q\2\2"+
		">?\7H\2\2?@\7n\2\2@A\7q\2\2AB\7c\2\2BC\7v\2\2C\4\3\2\2\2DE\7<\2\2E\6\3"+
		"\2\2\2FG\7H\2\2GH\7n\2\2HI\7q\2\2IJ\7c\2\2JK\7v\2\2KL\7V\2\2LM\7q\2\2"+
		"MN\7K\2\2NO\7p\2\2OP\7v\2\2P\b\3\2\2\2QR\7k\2\2RS\7p\2\2ST\7v\2\2T\n\3"+
		"\2\2\2UV\7h\2\2VW\7n\2\2WX\7q\2\2XY\7c\2\2YZ\7v\2\2Z\f\3\2\2\2[]\5\67"+
		"\34\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\16\3\2\2\2`b\5\67\34"+
		"\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ei\7\60\2\2fh\5\67"+
		"\34\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\20\3\2\2\2ki\3\2\2\2lm"+
		"\7,\2\2m\22\3\2\2\2no\7\61\2\2o\24\3\2\2\2pq\7-\2\2q\26\3\2\2\2rs\7/\2"+
		"\2s\30\3\2\2\2tu\7`\2\2u\32\3\2\2\2vw\t\2\2\2wx\3\2\2\2xy\b\16\2\2y\34"+
		"\3\2\2\2z{\7\f\2\2{\36\3\2\2\2|}\7?\2\2} \3\2\2\2~\177\7}\2\2\177\"\3"+
		"\2\2\2\u0080\u0081\7\177\2\2\u0081$\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7h\2\2\u0084&\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087\7n\2\2\u0087\u0088"+
		"\7u\2\2\u0088\u0089\7g\2\2\u0089(\3\2\2\2\u008a\u008b\7y\2\2\u008b\u008c"+
		"\7j\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f"+
		"*\3\2\2\2\u0090\u0091\7c\2\2\u0091\u0092\7p\2\2\u0092\u0093\7f\2\2\u0093"+
		",\3\2\2\2\u0094\u0095\7q\2\2\u0095\u0096\7t\2\2\u0096.\3\2\2\2\u0097\u0098"+
		"\7p\2\2\u0098\u0099\7q\2\2\u0099\u009a\7v\2\2\u009a\60\3\2\2\2\u009b\u009c"+
		"\7*\2\2\u009c\62\3\2\2\2\u009d\u009e\7+\2\2\u009e\64\3\2\2\2\u009f\u00a3"+
		"\t\3\2\2\u00a0\u00a2\t\4\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\66\3\2\2\2\u00a5\u00a3\3\2\2"+
		"\2\u00a6\u00a7\t\5\2\2\u00a78\3\2\2\2\7\2^ci\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}