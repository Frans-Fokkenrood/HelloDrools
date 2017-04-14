// Generated from src\main\java\com\fokkenrood\antlr\DomoticaSpraak.g4 by ANTLR 4.6
package com.fokkenrood.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DomoticaSpraakLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLOCKCOMMENT=1, LINECOMMENT=2, TEKST=3, AAN=4, ALS=5, AUTOMAAT=6, BEVAT=7, 
		DAN=8, DE=9, EEN=10, EN=11, GELIJK=12, GESTELD=13, HEEFT=14, HOGER=15, 
		INDIEN=16, INVOER=17, IN=18, IS=19, JA=20, LAGER=21, LAMP=22, LUIDT=23, 
		MET=24, NEE=25, NIET=26, OMVAT=27, OF=28, OP=29, RREGEL=30, REGEL=31, 
		RUBRIEK=32, TTESTCASE=33, TESTGEVALLEN=34, UIT=35, VAN=36, VOLDAAN=37, 
		VOLGENDE=38, VOORWAARDEN=39, VUREN=40, WAARBIJ=41, WAARDOOR=42, WORDT=43, 
		ZAL=44, ZZET=45, DUBBELE_PUNT=46, GETAL_NUL=47, PUNT=48, STREEPJE=49, 
		GETAL=50, WOORD=51, WS=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BLOCKCOMMENT", "LINECOMMENT", "QUOTE", "KOMMA", "LETTER", "CIJFER", "TEKST", 
		"AAN", "ALS", "AUTOMAAT", "BEVAT", "DAN", "DE", "EEN", "EN", "GELIJK", 
		"GESTELD", "HEEFT", "HOGER", "INDIEN", "INVOER", "IN", "IS", "JA", "LAGER", 
		"LAMP", "LUIDT", "MET", "NEE", "NIET", "OMVAT", "OF", "OP", "RREGEL", 
		"REGEL", "RUBRIEK", "TTESTCASE", "TESTGEVALLEN", "UIT", "VAN", "VOLDAAN", 
		"VOLGENDE", "VOORWAARDEN", "VUREN", "WAARBIJ", "WAARDOOR", "WORDT", "ZAL", 
		"ZZET", "DUBBELE_PUNT", "GETAL_NUL", "PUNT", "STREEPJE", "GETAL", "WOORD", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'aan'", "'als'", "'automaat'", "'bevat'", "'dan'", 
		"'de'", "'een'", "'en'", "'gelijk'", "'gesteld'", "'heeft'", "'hoger'", 
		"'indien'", "'invoer'", "'in'", "'is'", "'ja'", "'lager'", "'lamp'", "'luidt'", 
		"'met'", "'nee'", "'niet'", "'omvat'", "'of'", "'op'", "'Regel'", "'regel'", 
		"'rubriek'", "'Testcase'", "'testgevallen'", "'uit'", "'van'", "'voldaan'", 
		"'volgende'", "'voorwaarden'", "'vuren'", "'waarbij'", "'waardoor'", "'wordt'", 
		"'zal'", "'Zet'", "':'", "'0'", "'.'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BLOCKCOMMENT", "LINECOMMENT", "TEKST", "AAN", "ALS", "AUTOMAAT", 
		"BEVAT", "DAN", "DE", "EEN", "EN", "GELIJK", "GESTELD", "HEEFT", "HOGER", 
		"INDIEN", "INVOER", "IN", "IS", "JA", "LAGER", "LAMP", "LUIDT", "MET", 
		"NEE", "NIET", "OMVAT", "OF", "OP", "RREGEL", "REGEL", "RUBRIEK", "TTESTCASE", 
		"TESTGEVALLEN", "UIT", "VAN", "VOLDAAN", "VOLGENDE", "VOORWAARDEN", "VUREN", 
		"WAARBIJ", "WAARDOOR", "WORDT", "ZAL", "ZZET", "DUBBELE_PUNT", "GETAL_NUL", 
		"PUNT", "STREEPJE", "GETAL", "WOORD", "WS"
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


	public DomoticaSpraakLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DomoticaSpraak.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			TEKST_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TEKST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 setText(getText().replaceAll("\"","")); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u01b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\7\2x\n"+
		"\2\f\2\16\2{\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0086\n\3\f"+
		"\3\16\3\u0089\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\5\67\u01a0\n\67"+
		"\3\67\6\67\u01a3\n\67\r\67\16\67\u01a4\38\38\38\78\u01aa\n8\f8\168\u01ad"+
		"\138\39\69\u01b0\n9\r9\169\u01b1\39\39\5y\u0087\u009b\2:\3\3\5\4\7\2\t"+
		"\2\13\2\r\2\17\5\21\6\23\7\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20"+
		"\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37"+
		"E G!I\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/e\60g\61i\62k\63m\64o\65q\66\3\2\5\4"+
		"\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\u01b8\2\3\3\2\2\2\2\5\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5\u0081\3\2\2\2\7\u008f\3\2\2\2\t\u0091\3"+
		"\2\2\2\13\u0093\3\2\2\2\r\u0095\3\2\2\2\17\u0097\3\2\2\2\21\u00a1\3\2"+
		"\2\2\23\u00a5\3\2\2\2\25\u00a9\3\2\2\2\27\u00b2\3\2\2\2\31\u00b8\3\2\2"+
		"\2\33\u00bc\3\2\2\2\35\u00bf\3\2\2\2\37\u00c3\3\2\2\2!\u00c6\3\2\2\2#"+
		"\u00cd\3\2\2\2%\u00d5\3\2\2\2\'\u00db\3\2\2\2)\u00e1\3\2\2\2+\u00e8\3"+
		"\2\2\2-\u00ef\3\2\2\2/\u00f2\3\2\2\2\61\u00f5\3\2\2\2\63\u00f8\3\2\2\2"+
		"\65\u00fe\3\2\2\2\67\u0103\3\2\2\29\u0109\3\2\2\2;\u010d\3\2\2\2=\u0111"+
		"\3\2\2\2?\u0116\3\2\2\2A\u011c\3\2\2\2C\u011f\3\2\2\2E\u0122\3\2\2\2G"+
		"\u0128\3\2\2\2I\u012e\3\2\2\2K\u0136\3\2\2\2M\u013f\3\2\2\2O\u014c\3\2"+
		"\2\2Q\u0150\3\2\2\2S\u0154\3\2\2\2U\u015c\3\2\2\2W\u0165\3\2\2\2Y\u0171"+
		"\3\2\2\2[\u0177\3\2\2\2]\u017f\3\2\2\2_\u0188\3\2\2\2a\u018e\3\2\2\2c"+
		"\u0192\3\2\2\2e\u0196\3\2\2\2g\u0198\3\2\2\2i\u019a\3\2\2\2k\u019c\3\2"+
		"\2\2m\u019f\3\2\2\2o\u01a6\3\2\2\2q\u01af\3\2\2\2st\7\61\2\2tu\7,\2\2"+
		"uy\3\2\2\2vx\13\2\2\2wv\3\2\2\2x{\3\2\2\2yz\3\2\2\2yw\3\2\2\2z|\3\2\2"+
		"\2{y\3\2\2\2|}\7,\2\2}~\7\61\2\2~\177\3\2\2\2\177\u0080\b\2\2\2\u0080"+
		"\4\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\7\61\2\2\u0083\u0087\3\2\2"+
		"\2\u0084\u0086\13\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u008a\u008b\7\17\2\2\u008b\u008c\7\f\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\b\3\2\2\u008e\6\3\2\2\2\u008f\u0090\7$\2\2\u0090\b\3\2\2\2\u0091"+
		"\u0092\7.\2\2\u0092\n\3\2\2\2\u0093\u0094\t\2\2\2\u0094\f\3\2\2\2\u0095"+
		"\u0096\t\3\2\2\u0096\16\3\2\2\2\u0097\u009b\5\7\4\2\u0098\u009a\13\2\2"+
		"\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u009c\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\5\7\4\2\u009f"+
		"\u00a0\b\b\3\2\u00a0\20\3\2\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7c\2\2"+
		"\u00a3\u00a4\7p\2\2\u00a4\22\3\2\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7"+
		"n\2\2\u00a7\u00a8\7u\2\2\u00a8\24\3\2\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab"+
		"\7w\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7o\2\2\u00ae"+
		"\u00af\7c\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7v\2\2\u00b1\26\3\2\2\2\u00b2"+
		"\u00b3\7d\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7x\2\2\u00b5\u00b6\7c\2\2"+
		"\u00b6\u00b7\7v\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7f\2\2\u00b9\u00ba\7"+
		"c\2\2\u00ba\u00bb\7p\2\2\u00bb\32\3\2\2\2\u00bc\u00bd\7f\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\34\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2"+
		"\7p\2\2\u00c2\36\3\2\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7p\2\2\u00c5 "+
		"\3\2\2\2\u00c6\u00c7\7i\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7n\2\2\u00c9"+
		"\u00ca\7k\2\2\u00ca\u00cb\7l\2\2\u00cb\u00cc\7m\2\2\u00cc\"\3\2\2\2\u00cd"+
		"\u00ce\7i\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7v\2\2"+
		"\u00d1\u00d2\7g\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7f\2\2\u00d4$\3\2\2"+
		"\2\u00d5\u00d6\7j\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9"+
		"\7h\2\2\u00d9\u00da\7v\2\2\u00da&\3\2\2\2\u00db\u00dc\7j\2\2\u00dc\u00dd"+
		"\7q\2\2\u00dd\u00de\7i\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7t\2\2\u00e0"+
		"(\3\2\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7f\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7p\2\2\u00e7*\3\2\2\2\u00e8"+
		"\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7x\2\2\u00eb\u00ec\7q\2\2"+
		"\u00ec\u00ed\7g\2\2\u00ed\u00ee\7t\2\2\u00ee,\3\2\2\2\u00ef\u00f0\7k\2"+
		"\2\u00f0\u00f1\7p\2\2\u00f1.\3\2\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7"+
		"u\2\2\u00f4\60\3\2\2\2\u00f5\u00f6\7l\2\2\u00f6\u00f7\7c\2\2\u00f7\62"+
		"\3\2\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7i\2\2\u00fb"+
		"\u00fc\7g\2\2\u00fc\u00fd\7t\2\2\u00fd\64\3\2\2\2\u00fe\u00ff\7n\2\2\u00ff"+
		"\u0100\7c\2\2\u0100\u0101\7o\2\2\u0101\u0102\7r\2\2\u0102\66\3\2\2\2\u0103"+
		"\u0104\7n\2\2\u0104\u0105\7w\2\2\u0105\u0106\7k\2\2\u0106\u0107\7f\2\2"+
		"\u0107\u0108\7v\2\2\u01088\3\2\2\2\u0109\u010a\7o\2\2\u010a\u010b\7g\2"+
		"\2\u010b\u010c\7v\2\2\u010c:\3\2\2\2\u010d\u010e\7p\2\2\u010e\u010f\7"+
		"g\2\2\u010f\u0110\7g\2\2\u0110<\3\2\2\2\u0111\u0112\7p\2\2\u0112\u0113"+
		"\7k\2\2\u0113\u0114\7g\2\2\u0114\u0115\7v\2\2\u0115>\3\2\2\2\u0116\u0117"+
		"\7q\2\2\u0117\u0118\7o\2\2\u0118\u0119\7x\2\2\u0119\u011a\7c\2\2\u011a"+
		"\u011b\7v\2\2\u011b@\3\2\2\2\u011c\u011d\7q\2\2\u011d\u011e\7h\2\2\u011e"+
		"B\3\2\2\2\u011f\u0120\7q\2\2\u0120\u0121\7r\2\2\u0121D\3\2\2\2\u0122\u0123"+
		"\7T\2\2\u0123\u0124\7g\2\2\u0124\u0125\7i\2\2\u0125\u0126\7g\2\2\u0126"+
		"\u0127\7n\2\2\u0127F\3\2\2\2\u0128\u0129\7t\2\2\u0129\u012a\7g\2\2\u012a"+
		"\u012b\7i\2\2\u012b\u012c\7g\2\2\u012c\u012d\7n\2\2\u012dH\3\2\2\2\u012e"+
		"\u012f\7t\2\2\u012f\u0130\7w\2\2\u0130\u0131\7d\2\2\u0131\u0132\7t\2\2"+
		"\u0132\u0133\7k\2\2\u0133\u0134\7g\2\2\u0134\u0135\7m\2\2\u0135J\3\2\2"+
		"\2\u0136\u0137\7V\2\2\u0137\u0138\7g\2\2\u0138\u0139\7u\2\2\u0139\u013a"+
		"\7v\2\2\u013a\u013b\7e\2\2\u013b\u013c\7c\2\2\u013c\u013d\7u\2\2\u013d"+
		"\u013e\7g\2\2\u013eL\3\2\2\2\u013f\u0140\7v\2\2\u0140\u0141\7g\2\2\u0141"+
		"\u0142\7u\2\2\u0142\u0143\7v\2\2\u0143\u0144\7i\2\2\u0144\u0145\7g\2\2"+
		"\u0145\u0146\7x\2\2\u0146\u0147\7c\2\2\u0147\u0148\7n\2\2\u0148\u0149"+
		"\7n\2\2\u0149\u014a\7g\2\2\u014a\u014b\7p\2\2\u014bN\3\2\2\2\u014c\u014d"+
		"\7w\2\2\u014d\u014e\7k\2\2\u014e\u014f\7v\2\2\u014fP\3\2\2\2\u0150\u0151"+
		"\7x\2\2\u0151\u0152\7c\2\2\u0152\u0153\7p\2\2\u0153R\3\2\2\2\u0154\u0155"+
		"\7x\2\2\u0155\u0156\7q\2\2\u0156\u0157\7n\2\2\u0157\u0158\7f\2\2\u0158"+
		"\u0159\7c\2\2\u0159\u015a\7c\2\2\u015a\u015b\7p\2\2\u015bT\3\2\2\2\u015c"+
		"\u015d\7x\2\2\u015d\u015e\7q\2\2\u015e\u015f\7n\2\2\u015f\u0160\7i\2\2"+
		"\u0160\u0161\7g\2\2\u0161\u0162\7p\2\2\u0162\u0163\7f\2\2\u0163\u0164"+
		"\7g\2\2\u0164V\3\2\2\2\u0165\u0166\7x\2\2\u0166\u0167\7q\2\2\u0167\u0168"+
		"\7q\2\2\u0168\u0169\7t\2\2\u0169\u016a\7y\2\2\u016a\u016b\7c\2\2\u016b"+
		"\u016c\7c\2\2\u016c\u016d\7t\2\2\u016d\u016e\7f\2\2\u016e\u016f\7g\2\2"+
		"\u016f\u0170\7p\2\2\u0170X\3\2\2\2\u0171\u0172\7x\2\2\u0172\u0173\7w\2"+
		"\2\u0173\u0174\7t\2\2\u0174\u0175\7g\2\2\u0175\u0176\7p\2\2\u0176Z\3\2"+
		"\2\2\u0177\u0178\7y\2\2\u0178\u0179\7c\2\2\u0179\u017a\7c\2\2\u017a\u017b"+
		"\7t\2\2\u017b\u017c\7d\2\2\u017c\u017d\7k\2\2\u017d\u017e\7l\2\2\u017e"+
		"\\\3\2\2\2\u017f\u0180\7y\2\2\u0180\u0181\7c\2\2\u0181\u0182\7c\2\2\u0182"+
		"\u0183\7t\2\2\u0183\u0184\7f\2\2\u0184\u0185\7q\2\2\u0185\u0186\7q\2\2"+
		"\u0186\u0187\7t\2\2\u0187^\3\2\2\2\u0188\u0189\7y\2\2\u0189\u018a\7q\2"+
		"\2\u018a\u018b\7t\2\2\u018b\u018c\7f\2\2\u018c\u018d\7v\2\2\u018d`\3\2"+
		"\2\2\u018e\u018f\7|\2\2\u018f\u0190\7c\2\2\u0190\u0191\7n\2\2\u0191b\3"+
		"\2\2\2\u0192\u0193\7\\\2\2\u0193\u0194\7g\2\2\u0194\u0195\7v\2\2\u0195"+
		"d\3\2\2\2\u0196\u0197\7<\2\2\u0197f\3\2\2\2\u0198\u0199\7\62\2\2\u0199"+
		"h\3\2\2\2\u019a\u019b\7\60\2\2\u019bj\3\2\2\2\u019c\u019d\7/\2\2\u019d"+
		"l\3\2\2\2\u019e\u01a0\5k\66\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2"+
		"\u01a0\u01a2\3\2\2\2\u01a1\u01a3\5\r\7\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5n\3\2\2\2\u01a6"+
		"\u01ab\5\13\6\2\u01a7\u01aa\5\13\6\2\u01a8\u01aa\5k\66\2\u01a9\u01a7\3"+
		"\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01acp\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b0\t\4\2\2"+
		"\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\b9\2\2\u01b4r\3\2\2\2\13\2y\u0087"+
		"\u009b\u019f\u01a4\u01a9\u01ab\u01b1\4\b\2\2\3\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}