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
		T__0=1, INT=2, FLOAT=3, MUL=4, DIV=5, ADD=6, SUB=7, EXP=8, WHITESPACE=9, 
		NEWLINE=10, ASSIGN=11, BLOCK_START=12, BLOCK_END=13, IF=14, ELSE=15, WHILE=16, 
		AND=17, OR=18, NOT=19, PAREN_OPEN=20, PAREN_CLOSE=21, STRING=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
	};
	public static final String[] ruleNames = {
		"T__0", "INT", "FLOAT", "MUL", "DIV", "ADD", "SUB", "EXP", "WHITESPACE", 
		"NEWLINE", "ASSIGN", "BLOCK_START", "BLOCK_END", "IF", "ELSE", "WHILE", 
		"AND", "OR", "NOT", "PAREN_OPEN", "PAREN_CLOSE", "STRING", "DIGIT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\6\3\65\n\3\r\3\16\3\66\3\4\6\4:\n\4\r\4\16\4;\3\4\3\4\7\4@\n"+
		"\4\f\4\16\4C\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\7\27z\n\27\f\27"+
		"\16\27}\13\27\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\3\2"+
		"\6\4\2\13\13\"\"\4\2C\\c|\5\2\62;C\\c|\3\2\62;\u0082\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3\61\3\2\2\2\5\64\3\2\2\2\7"+
		"9\3\2\2\2\tD\3\2\2\2\13F\3\2\2\2\rH\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23"+
		"N\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31V\3\2\2\2\33X\3\2\2\2\35Z\3\2\2\2"+
		"\37]\3\2\2\2!b\3\2\2\2#h\3\2\2\2%l\3\2\2\2\'o\3\2\2\2)s\3\2\2\2+u\3\2"+
		"\2\2-w\3\2\2\2/~\3\2\2\2\61\62\7<\2\2\62\4\3\2\2\2\63\65\5/\30\2\64\63"+
		"\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\6\3\2\2\28:\5/\30"+
		"\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=A\7\60\2\2>@\5/\30"+
		"\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\b\3\2\2\2CA\3\2\2\2DE\7,\2"+
		"\2E\n\3\2\2\2FG\7\61\2\2G\f\3\2\2\2HI\7-\2\2I\16\3\2\2\2JK\7/\2\2K\20"+
		"\3\2\2\2LM\7`\2\2M\22\3\2\2\2NO\t\2\2\2OP\3\2\2\2PQ\b\n\2\2Q\24\3\2\2"+
		"\2RS\7\f\2\2S\26\3\2\2\2TU\7?\2\2U\30\3\2\2\2VW\7}\2\2W\32\3\2\2\2XY\7"+
		"\177\2\2Y\34\3\2\2\2Z[\7k\2\2[\\\7h\2\2\\\36\3\2\2\2]^\7g\2\2^_\7n\2\2"+
		"_`\7u\2\2`a\7g\2\2a \3\2\2\2bc\7y\2\2cd\7j\2\2de\7k\2\2ef\7n\2\2fg\7g"+
		"\2\2g\"\3\2\2\2hi\7c\2\2ij\7p\2\2jk\7f\2\2k$\3\2\2\2lm\7q\2\2mn\7t\2\2"+
		"n&\3\2\2\2op\7p\2\2pq\7q\2\2qr\7v\2\2r(\3\2\2\2st\7*\2\2t*\3\2\2\2uv\7"+
		"+\2\2v,\3\2\2\2w{\t\3\2\2xz\t\4\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3"+
		"\2\2\2|.\3\2\2\2}{\3\2\2\2~\177\t\5\2\2\177\60\3\2\2\2\7\2\66;A{\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}