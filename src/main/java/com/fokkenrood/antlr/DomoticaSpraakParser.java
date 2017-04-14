// Generated from src\main\java\com\fokkenrood\antlr\DomoticaSpraak.g4 by ANTLR 4.6
package com.fokkenrood.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DomoticaSpraakParser extends Parser {
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
	public static final int
		RULE_statements = 0, RULE_regel = 1, RULE_object = 2, RULE_voorwaarde = 3, 
		RULE_testcase = 4, RULE_testgeval = 5, RULE_invoer = 6, RULE_toekennen = 7, 
		RULE_waarde = 8, RULE_vergelijking = 9, RULE_feit = 10;
	public static final String[] ruleNames = {
		"statements", "regel", "object", "voorwaarde", "testcase", "testgeval", 
		"invoer", "toekennen", "waarde", "vergelijking", "feit"
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

	@Override
	public String getGrammarFileName() { return "DomoticaSpraak.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DomoticaSpraakParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementsContext extends ParserRuleContext {
		public List<RegelContext> regel() {
			return getRuleContexts(RegelContext.class);
		}
		public RegelContext regel(int i) {
			return getRuleContext(RegelContext.class,i);
		}
		public List<TestcaseContext> testcase() {
			return getRuleContexts(TestcaseContext.class);
		}
		public TestcaseContext testcase(int i) {
			return getRuleContext(TestcaseContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RREGEL:
					{
					setState(22);
					regel();
					}
					break;
				case TTESTCASE:
					{
					setState(23);
					testcase();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RREGEL || _la==TTESTCASE );
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

	public static class RegelContext extends ParserRuleContext {
		public Token rg;
		public Token rs;
		public Token s;
		public TerminalNode RREGEL() { return getToken(DomoticaSpraakParser.RREGEL, 0); }
		public TerminalNode IN() { return getToken(DomoticaSpraakParser.IN, 0); }
		public TerminalNode LUIDT() { return getToken(DomoticaSpraakParser.LUIDT, 0); }
		public List<TerminalNode> DUBBELE_PUNT() { return getTokens(DomoticaSpraakParser.DUBBELE_PUNT); }
		public TerminalNode DUBBELE_PUNT(int i) {
			return getToken(DomoticaSpraakParser.DUBBELE_PUNT, i);
		}
		public TerminalNode ZZET() { return getToken(DomoticaSpraakParser.ZZET, 0); }
		public List<TerminalNode> DE() { return getTokens(DomoticaSpraakParser.DE); }
		public TerminalNode DE(int i) {
			return getToken(DomoticaSpraakParser.DE, i);
		}
		public TerminalNode LAMP() { return getToken(DomoticaSpraakParser.LAMP, 0); }
		public TerminalNode INDIEN() { return getToken(DomoticaSpraakParser.INDIEN, 0); }
		public List<TerminalNode> AAN() { return getTokens(DomoticaSpraakParser.AAN); }
		public TerminalNode AAN(int i) {
			return getToken(DomoticaSpraakParser.AAN, i);
		}
		public TerminalNode VOLGENDE() { return getToken(DomoticaSpraakParser.VOLGENDE, 0); }
		public TerminalNode VOORWAARDEN() { return getToken(DomoticaSpraakParser.VOORWAARDEN, 0); }
		public TerminalNode WORDT() { return getToken(DomoticaSpraakParser.WORDT, 0); }
		public TerminalNode VOLDAAN() { return getToken(DomoticaSpraakParser.VOLDAAN, 0); }
		public TerminalNode PUNT() { return getToken(DomoticaSpraakParser.PUNT, 0); }
		public List<TerminalNode> TEKST() { return getTokens(DomoticaSpraakParser.TEKST); }
		public TerminalNode TEKST(int i) {
			return getToken(DomoticaSpraakParser.TEKST, i);
		}
		public TerminalNode UIT() { return getToken(DomoticaSpraakParser.UIT, 0); }
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public RegelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).enterRegel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).exitRegel(this);
		}
	}

	public final RegelContext regel() throws RecognitionException {
		RegelContext _localctx = new RegelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_regel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(28);
			match(RREGEL);
			setState(29);
			((RegelContext)_localctx).rg = match(TEKST);
			setState(30);
			match(IN);
			setState(31);
			((RegelContext)_localctx).rs = match(TEKST);
			setState(32);
			match(LUIDT);
			setState(33);
			match(DUBBELE_PUNT);
			setState(34);
			match(ZZET);
			setState(35);
			match(DE);
			setState(36);
			match(LAMP);
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AAN:
				{
				setState(37);
				((RegelContext)_localctx).s = match(AAN);
				}
				break;
			case UIT:
				{
				setState(38);
				((RegelContext)_localctx).s = match(UIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(41);
			match(INDIEN);
			setState(42);
			match(AAN);
			setState(43);
			match(DE);
			setState(44);
			match(VOLGENDE);
			setState(45);
			match(VOORWAARDEN);
			setState(46);
			match(WORDT);
			setState(47);
			match(VOLDAAN);
			setState(48);
			match(DUBBELE_PUNT);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				object((((RegelContext)_localctx).rg!=null?((RegelContext)_localctx).rg.getText():null));
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STREEPJE );
			setState(54);
			match(PUNT);
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

	public static class ObjectContext extends ParserRuleContext {
		public String rg;
		public Token obj;
		public TerminalNode STREEPJE() { return getToken(DomoticaSpraakParser.STREEPJE, 0); }
		public TerminalNode DE() { return getToken(DomoticaSpraakParser.DE, 0); }
		public TerminalNode HEEFT() { return getToken(DomoticaSpraakParser.HEEFT, 0); }
		public TerminalNode RUBRIEK() { return getToken(DomoticaSpraakParser.RUBRIEK, 0); }
		public TerminalNode AUTOMAAT() { return getToken(DomoticaSpraakParser.AUTOMAAT, 0); }
		public List<VoorwaardeContext> voorwaarde() {
			return getRuleContexts(VoorwaardeContext.class);
		}
		public VoorwaardeContext voorwaarde(int i) {
			return getRuleContext(VoorwaardeContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ObjectContext(ParserRuleContext parent, int invokingState, String rg) {
			super(parent, invokingState);
			this.rg = rg;
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object(String rg) throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState(), rg);
		enterRule(_localctx, 4, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			match(STREEPJE);
			setState(57);
			match(DE);
			setState(58);
			((ObjectContext)_localctx).obj = match(AUTOMAAT);
			setState(59);
			match(HEEFT);
			setState(60);
			match(RUBRIEK);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				voorwaarde(rg);
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EN) | (1L << OF) | (1L << WOORD))) != 0) );
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

	public static class VoorwaardeContext extends ParserRuleContext {
		public String rg;
		public Token eo;
		public FeitContext f1;
		public VergelijkingContext v;
		public WaardeContext w1;
		public FeitContext f2;
		public WaardeContext w2;
		public TerminalNode BEVAT() { return getToken(DomoticaSpraakParser.BEVAT, 0); }
		public TerminalNode RUBRIEK() { return getToken(DomoticaSpraakParser.RUBRIEK, 0); }
		public FeitContext feit() {
			return getRuleContext(FeitContext.class,0);
		}
		public VergelijkingContext vergelijking() {
			return getRuleContext(VergelijkingContext.class,0);
		}
		public WaardeContext waarde() {
			return getRuleContext(WaardeContext.class,0);
		}
		public TerminalNode EN() { return getToken(DomoticaSpraakParser.EN, 0); }
		public TerminalNode OF() { return getToken(DomoticaSpraakParser.OF, 0); }
		public VoorwaardeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VoorwaardeContext(ParserRuleContext parent, int invokingState, String rg) {
			super(parent, invokingState);
			this.rg = rg;
		}
		@Override public int getRuleIndex() { return RULE_voorwaarde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).enterVoorwaarde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).exitVoorwaarde(this);
		}
	}

	public final VoorwaardeContext voorwaarde(String rg) throws RecognitionException {
		VoorwaardeContext _localctx = new VoorwaardeContext(_ctx, getState(), rg);
		enterRule(_localctx, 6, RULE_voorwaarde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EN:
				{
				setState(66);
				((VoorwaardeContext)_localctx).eo = match(EN);
				setState(67);
				match(RUBRIEK);
				}
				break;
			case OF:
				{
				setState(68);
				((VoorwaardeContext)_localctx).eo = match(OF);
				setState(69);
				match(RUBRIEK);
				}
				break;
			case WOORD:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(72);
				((VoorwaardeContext)_localctx).f1 = feit();
				setState(73);
				((VoorwaardeContext)_localctx).v = vergelijking();
				setState(74);
				((VoorwaardeContext)_localctx).w1 = waarde();
				}
				break;
			case 2:
				{
				setState(76);
				((VoorwaardeContext)_localctx).f2 = feit();
				setState(77);
				match(BEVAT);
				setState(78);
				((VoorwaardeContext)_localctx).w2 = waarde();
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

	public static class TestcaseContext extends ParserRuleContext {
		public Token tc;
		public Token rs;
		public TerminalNode TTESTCASE() { return getToken(DomoticaSpraakParser.TTESTCASE, 0); }
		public TerminalNode IN() { return getToken(DomoticaSpraakParser.IN, 0); }
		public TerminalNode OMVAT() { return getToken(DomoticaSpraakParser.OMVAT, 0); }
		public TerminalNode DE() { return getToken(DomoticaSpraakParser.DE, 0); }
		public TerminalNode VOLGENDE() { return getToken(DomoticaSpraakParser.VOLGENDE, 0); }
		public TerminalNode TESTGEVALLEN() { return getToken(DomoticaSpraakParser.TESTGEVALLEN, 0); }
		public TerminalNode DUBBELE_PUNT() { return getToken(DomoticaSpraakParser.DUBBELE_PUNT, 0); }
		public TerminalNode PUNT() { return getToken(DomoticaSpraakParser.PUNT, 0); }
		public List<TerminalNode> TEKST() { return getTokens(DomoticaSpraakParser.TEKST); }
		public TerminalNode TEKST(int i) {
			return getToken(DomoticaSpraakParser.TEKST, i);
		}
		public List<TestgevalContext> testgeval() {
			return getRuleContexts(TestgevalContext.class);
		}
		public TestgevalContext testgeval(int i) {
			return getRuleContext(TestgevalContext.class,i);
		}
		public TestcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).enterTestcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).exitTestcase(this);
		}
	}

	public final TestcaseContext testcase() throws RecognitionException {
		TestcaseContext _localctx = new TestcaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_testcase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(82);
			match(TTESTCASE);
			setState(83);
			((TestcaseContext)_localctx).tc = match(TEKST);
			setState(84);
			match(IN);
			setState(85);
			((TestcaseContext)_localctx).rs = match(TEKST);
			setState(86);
			match(OMVAT);
			setState(87);
			match(DE);
			setState(88);
			match(VOLGENDE);
			setState(89);
			match(TESTGEVALLEN);
			setState(90);
			match(DUBBELE_PUNT);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				testgeval();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STREEPJE );
			setState(96);
			match(PUNT);
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

	public static class TestgevalContext extends ParserRuleContext {
		public Token tg;
		public Token not;
		public TerminalNode STREEPJE() { return getToken(DomoticaSpraakParser.STREEPJE, 0); }
		public TerminalNode MET() { return getToken(DomoticaSpraakParser.MET, 0); }
		public TerminalNode ALS() { return getToken(DomoticaSpraakParser.ALS, 0); }
		public TerminalNode INVOER() { return getToken(DomoticaSpraakParser.INVOER, 0); }
		public TerminalNode DUBBELE_PUNT() { return getToken(DomoticaSpraakParser.DUBBELE_PUNT, 0); }
		public TerminalNode WAARDOOR() { return getToken(DomoticaSpraakParser.WAARDOOR, 0); }
		public TerminalNode DE() { return getToken(DomoticaSpraakParser.DE, 0); }
		public TerminalNode REGEL() { return getToken(DomoticaSpraakParser.REGEL, 0); }
		public TerminalNode ZAL() { return getToken(DomoticaSpraakParser.ZAL, 0); }
		public TerminalNode VUREN() { return getToken(DomoticaSpraakParser.VUREN, 0); }
		public TerminalNode TEKST() { return getToken(DomoticaSpraakParser.TEKST, 0); }
		public List<InvoerContext> invoer() {
			return getRuleContexts(InvoerContext.class);
		}
		public InvoerContext invoer(int i) {
			return getRuleContext(InvoerContext.class,i);
		}
		public TerminalNode NIET() { return getToken(DomoticaSpraakParser.NIET, 0); }
		public TestgevalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testgeval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).enterTestgeval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).exitTestgeval(this);
		}
	}

	public final TestgevalContext testgeval() throws RecognitionException {
		TestgevalContext _localctx = new TestgevalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_testgeval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98);
			match(STREEPJE);
			setState(99);
			((TestgevalContext)_localctx).tg = match(TEKST);
			setState(100);
			match(MET);
			setState(101);
			match(ALS);
			setState(102);
			match(INVOER);
			setState(103);
			match(DUBBELE_PUNT);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				invoer();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EEN );
			setState(109);
			match(WAARDOOR);
			setState(110);
			match(DE);
			setState(111);
			match(REGEL);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NIET) {
				{
				setState(112);
				((TestgevalContext)_localctx).not = match(NIET);
				}
			}

			setState(115);
			match(ZAL);
			setState(116);
			match(VUREN);
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

	public static class InvoerContext extends ParserRuleContext {
		public Token obj;
		public TerminalNode EEN() { return getToken(DomoticaSpraakParser.EEN, 0); }
		public TerminalNode AUTOMAAT() { return getToken(DomoticaSpraakParser.AUTOMAAT, 0); }
		public List<ToekennenContext> toekennen() {
			return getRuleContexts(ToekennenContext.class);
		}
		public ToekennenContext toekennen(int i) {
			return getRuleContext(ToekennenContext.class,i);
		}
		public InvoerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).enterInvoer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).exitInvoer(this);
		}
	}

	public final InvoerContext invoer() throws RecognitionException {
		InvoerContext _localctx = new InvoerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_invoer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(118);
			match(EEN);
			{
			setState(119);
			((InvoerContext)_localctx).obj = match(AUTOMAAT);
			}
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				toekennen((((InvoerContext)_localctx).obj!=null?((InvoerContext)_localctx).obj.getText():null));
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WAARBIJ );
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

	public static class ToekennenContext extends ParserRuleContext {
		public String obj;
		public FeitContext f;
		public WaardeContext w;
		public TerminalNode WAARBIJ() { return getToken(DomoticaSpraakParser.WAARBIJ, 0); }
		public TerminalNode WORDT() { return getToken(DomoticaSpraakParser.WORDT, 0); }
		public TerminalNode GESTELD() { return getToken(DomoticaSpraakParser.GESTELD, 0); }
		public TerminalNode OP() { return getToken(DomoticaSpraakParser.OP, 0); }
		public FeitContext feit() {
			return getRuleContext(FeitContext.class,0);
		}
		public WaardeContext waarde() {
			return getRuleContext(WaardeContext.class,0);
		}
		public ToekennenContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ToekennenContext(ParserRuleContext parent, int invokingState, String obj) {
			super(parent, invokingState);
			this.obj = obj;
		}
		@Override public int getRuleIndex() { return RULE_toekennen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).enterToekennen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).exitToekennen(this);
		}
	}

	public final ToekennenContext toekennen(String obj) throws RecognitionException {
		ToekennenContext _localctx = new ToekennenContext(_ctx, getState(), obj);
		enterRule(_localctx, 14, RULE_toekennen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125);
			match(WAARBIJ);
			setState(126);
			((ToekennenContext)_localctx).f = feit();
			setState(127);
			match(WORDT);
			setState(128);
			match(GESTELD);
			setState(129);
			match(OP);
			setState(130);
			((ToekennenContext)_localctx).w = waarde();
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

	public static class WaardeContext extends ParserRuleContext {
		public String value;
		public Token WOORD;
		public Token TEKST;
		public Token GETAL;
		public TerminalNode WOORD() { return getToken(DomoticaSpraakParser.WOORD, 0); }
		public TerminalNode TEKST() { return getToken(DomoticaSpraakParser.TEKST, 0); }
		public TerminalNode GETAL() { return getToken(DomoticaSpraakParser.GETAL, 0); }
		public TerminalNode GETAL_NUL() { return getToken(DomoticaSpraakParser.GETAL_NUL, 0); }
		public TerminalNode NEE() { return getToken(DomoticaSpraakParser.NEE, 0); }
		public TerminalNode JA() { return getToken(DomoticaSpraakParser.JA, 0); }
		public WaardeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waarde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).enterWaarde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).exitWaarde(this);
		}
	}

	public final WaardeContext waarde() throws RecognitionException {
		WaardeContext _localctx = new WaardeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_waarde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WOORD:
				{
				setState(132);
				((WaardeContext)_localctx).WOORD = match(WOORD);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).WOORD!=null?((WaardeContext)_localctx).WOORD.getText():null); 
				}
				break;
			case TEKST:
				{
				setState(134);
				((WaardeContext)_localctx).TEKST = match(TEKST);
				 ((WaardeContext)_localctx).value =  "\"" + (((WaardeContext)_localctx).TEKST!=null?((WaardeContext)_localctx).TEKST.getText():null) + "\""; 
				}
				break;
			case GETAL:
				{
				setState(136);
				((WaardeContext)_localctx).GETAL = match(GETAL);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).GETAL!=null?((WaardeContext)_localctx).GETAL.getText():null); 
				}
				break;
			case GETAL_NUL:
				{
				setState(138);
				match(GETAL_NUL);
				 ((WaardeContext)_localctx).value =  "0"; 
				}
				break;
			case NEE:
				{
				setState(140);
				match(NEE);
				 ((WaardeContext)_localctx).value =  "false"; 
				}
				break;
			case JA:
				{
				setState(142);
				match(JA);
				 ((WaardeContext)_localctx).value =  "true"; 
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

	public static class VergelijkingContext extends ParserRuleContext {
		public String operator;
		public TerminalNode IS() { return getToken(DomoticaSpraakParser.IS, 0); }
		public TerminalNode GELIJK() { return getToken(DomoticaSpraakParser.GELIJK, 0); }
		public TerminalNode AAN() { return getToken(DomoticaSpraakParser.AAN, 0); }
		public TerminalNode NIET() { return getToken(DomoticaSpraakParser.NIET, 0); }
		public TerminalNode HOGER() { return getToken(DomoticaSpraakParser.HOGER, 0); }
		public TerminalNode OF() { return getToken(DomoticaSpraakParser.OF, 0); }
		public TerminalNode DAN() { return getToken(DomoticaSpraakParser.DAN, 0); }
		public TerminalNode LAGER() { return getToken(DomoticaSpraakParser.LAGER, 0); }
		public VergelijkingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vergelijking; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).enterVergelijking(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).exitVergelijking(this);
		}
	}

	public final VergelijkingContext vergelijking() throws RecognitionException {
		VergelijkingContext _localctx = new VergelijkingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vergelijking);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(146);
				match(IS);
				setState(147);
				match(GELIJK);
				setState(148);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "=="; 
				}
				break;
			case 2:
				{
				setState(150);
				match(IS);
				setState(151);
				match(NIET);
				setState(152);
				match(GELIJK);
				setState(153);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "!="; 
				}
				break;
			case 3:
				{
				setState(155);
				match(IS);
				setState(156);
				match(HOGER);
				setState(157);
				match(OF);
				setState(158);
				match(GELIJK);
				setState(159);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  ">="; 
				}
				break;
			case 4:
				{
				setState(161);
				match(IS);
				setState(162);
				match(HOGER);
				setState(163);
				match(DAN);
				 ((VergelijkingContext)_localctx).operator =  ">";  
				}
				break;
			case 5:
				{
				setState(165);
				match(IS);
				setState(166);
				match(LAGER);
				setState(167);
				match(OF);
				setState(168);
				match(GELIJK);
				setState(169);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "<="; 
				}
				break;
			case 6:
				{
				setState(171);
				match(IS);
				setState(172);
				match(LAGER);
				setState(173);
				match(DAN);
				 ((VergelijkingContext)_localctx).operator =  "<";  
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

	public static class FeitContext extends ParserRuleContext {
		public String signifier;
		public Token WOORD;
		public List<TerminalNode> WOORD() { return getTokens(DomoticaSpraakParser.WOORD); }
		public TerminalNode WOORD(int i) {
			return getToken(DomoticaSpraakParser.WOORD, i);
		}
		public FeitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).enterFeit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomoticaSpraakListener ) ((DomoticaSpraakListener)listener).exitFeit(this);
		}
	}

	public final FeitContext feit() throws RecognitionException {
		FeitContext _localctx = new FeitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_feit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(177);
			((FeitContext)_localctx).WOORD = match(WOORD);
			 ((FeitContext)_localctx).signifier =  (((FeitContext)_localctx).WOORD!=null?((FeitContext)_localctx).WOORD.getText():null); 
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WOORD) {
				{
				{
				setState(179);
				((FeitContext)_localctx).WOORD = match(WOORD);
				 _localctx.signifier += (" " + (((FeitContext)_localctx).WOORD!=null?((FeitContext)_localctx).WOORD.getText():null)); 
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u00bd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3*\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\65"+
		"\n\3\r\3\16\3\66\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4A\n\4\r\4\16\4B\3"+
		"\5\3\5\3\5\3\5\5\5I\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6_\n\6\r\6\16\6`\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\6\7l\n\7\r\7\16\7m\3\7\3\7\3\7\3\7\5\7t\n\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\6\b|\n\b\r\b\16\b}\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0093\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b2"+
		"\n\13\3\f\3\f\3\f\3\f\7\f\u00b8\n\f\f\f\16\f\u00bb\13\f\3\f\2\2\r\2\4"+
		"\6\b\n\f\16\20\22\24\26\2\2\u00c8\2\32\3\2\2\2\4\36\3\2\2\2\6:\3\2\2\2"+
		"\bH\3\2\2\2\nT\3\2\2\2\fd\3\2\2\2\16x\3\2\2\2\20\177\3\2\2\2\22\u0092"+
		"\3\2\2\2\24\u00b1\3\2\2\2\26\u00b3\3\2\2\2\30\33\5\4\3\2\31\33\5\n\6\2"+
		"\32\30\3\2\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2"+
		"\35\3\3\2\2\2\36\37\7 \2\2\37 \7\5\2\2 !\7\24\2\2!\"\7\5\2\2\"#\7\31\2"+
		"\2#$\7\60\2\2$%\7/\2\2%&\7\13\2\2&)\7\30\2\2\'*\7\6\2\2(*\7%\2\2)\'\3"+
		"\2\2\2)(\3\2\2\2*+\3\2\2\2+,\7\22\2\2,-\7\6\2\2-.\7\13\2\2./\7(\2\2/\60"+
		"\7)\2\2\60\61\7-\2\2\61\62\7\'\2\2\62\64\7\60\2\2\63\65\5\6\4\2\64\63"+
		"\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\62"+
		"\2\29\5\3\2\2\2:;\7\63\2\2;<\7\13\2\2<=\7\b\2\2=>\7\20\2\2>@\7\"\2\2?"+
		"A\5\b\5\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DE\7\r\2\2"+
		"EI\7\"\2\2FG\7\36\2\2GI\7\"\2\2HD\3\2\2\2HF\3\2\2\2HI\3\2\2\2IR\3\2\2"+
		"\2JK\5\26\f\2KL\5\24\13\2LM\5\22\n\2MS\3\2\2\2NO\5\26\f\2OP\7\t\2\2PQ"+
		"\5\22\n\2QS\3\2\2\2RJ\3\2\2\2RN\3\2\2\2S\t\3\2\2\2TU\7#\2\2UV\7\5\2\2"+
		"VW\7\24\2\2WX\7\5\2\2XY\7\35\2\2YZ\7\13\2\2Z[\7(\2\2[\\\7$\2\2\\^\7\60"+
		"\2\2]_\5\f\7\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\62"+
		"\2\2c\13\3\2\2\2de\7\63\2\2ef\7\5\2\2fg\7\32\2\2gh\7\7\2\2hi\7\23\2\2"+
		"ik\7\60\2\2jl\5\16\b\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2"+
		"\2op\7,\2\2pq\7\13\2\2qs\7!\2\2rt\7\34\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2"+
		"\2uv\7.\2\2vw\7*\2\2w\r\3\2\2\2xy\7\f\2\2y{\7\b\2\2z|\5\20\t\2{z\3\2\2"+
		"\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\17\3\2\2\2\177\u0080\7+\2\2\u0080\u0081"+
		"\5\26\f\2\u0081\u0082\7-\2\2\u0082\u0083\7\17\2\2\u0083\u0084\7\37\2\2"+
		"\u0084\u0085\5\22\n\2\u0085\21\3\2\2\2\u0086\u0087\7\65\2\2\u0087\u0093"+
		"\b\n\1\2\u0088\u0089\7\5\2\2\u0089\u0093\b\n\1\2\u008a\u008b\7\64\2\2"+
		"\u008b\u0093\b\n\1\2\u008c\u008d\7\61\2\2\u008d\u0093\b\n\1\2\u008e\u008f"+
		"\7\33\2\2\u008f\u0093\b\n\1\2\u0090\u0091\7\26\2\2\u0091\u0093\b\n\1\2"+
		"\u0092\u0086\3\2\2\2\u0092\u0088\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008c"+
		"\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u0090\3\2\2\2\u0093\23\3\2\2\2\u0094"+
		"\u0095\7\25\2\2\u0095\u0096\7\16\2\2\u0096\u0097\7\6\2\2\u0097\u00b2\b"+
		"\13\1\2\u0098\u0099\7\25\2\2\u0099\u009a\7\34\2\2\u009a\u009b\7\16\2\2"+
		"\u009b\u009c\7\6\2\2\u009c\u00b2\b\13\1\2\u009d\u009e\7\25\2\2\u009e\u009f"+
		"\7\21\2\2\u009f\u00a0\7\36\2\2\u00a0\u00a1\7\16\2\2\u00a1\u00a2\7\6\2"+
		"\2\u00a2\u00b2\b\13\1\2\u00a3\u00a4\7\25\2\2\u00a4\u00a5\7\21\2\2\u00a5"+
		"\u00a6\7\n\2\2\u00a6\u00b2\b\13\1\2\u00a7\u00a8\7\25\2\2\u00a8\u00a9\7"+
		"\27\2\2\u00a9\u00aa\7\36\2\2\u00aa\u00ab\7\16\2\2\u00ab\u00ac\7\6\2\2"+
		"\u00ac\u00b2\b\13\1\2\u00ad\u00ae\7\25\2\2\u00ae\u00af\7\27\2\2\u00af"+
		"\u00b0\7\n\2\2\u00b0\u00b2\b\13\1\2\u00b1\u0094\3\2\2\2\u00b1\u0098\3"+
		"\2\2\2\u00b1\u009d\3\2\2\2\u00b1\u00a3\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1"+
		"\u00ad\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b4\7\65\2\2\u00b4\u00b9\b\f\1"+
		"\2\u00b5\u00b6\7\65\2\2\u00b6\u00b8\b\f\1\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\27\3\2\2"+
		"\2\u00bb\u00b9\3\2\2\2\20\32\34)\66BHR`ms}\u0092\u00b1\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}