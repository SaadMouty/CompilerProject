// Generated from C:/Users/user/IdeaProjects/Compiler1/src/antlr/ParserFile.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ParserFile extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_JINJA_PRINT=1, OPEN_JINJA_STMT=2, OPEN_STYLE_BLOCK=3, HTML_TAG_OPEN=4, 
		HTML_TAG_CLOSE=5, HTML_TEXT=6, TAG_CLOSE_SYMBOL=7, TAG_SLASH_CLOSE=8, 
		EQUALS=9, TAG_NAME=10, ATTR_NAME=11, ATTR_VALUE=12, WS_TAG=13, CLOSE_STYLE=14, 
		CSS_ID=15, CSS_CLASS=16, LBRACE=17, RBRACE=18, COLON=19, SEMICOLON=20, 
		CSS_PROP=21, CSS_VAL=22, WS_CSS=23, CLOSE_JINJA_PRINT=24, CLOSE_JINJA_STMT=25, 
		IF=26, ELSE=27, ENDIF=28, FOR=29, IN=30, ENDFOR=31, EXTENDS=32, BLOCK=33, 
		ENDBLOCK=34, ASSIGN=35, DOT=36, PIPE=37, EQ=38, NEQ=39, GT=40, LT=41, 
		LPAREN=42, RPAREN=43, ID=44, STRING=45, NUMBER=46, WS_JINJA=47, CLOSE_COMMENT=48, 
		COMMENT_TEXT=49;
	public static final int
		RULE_file = 0, RULE_elements = 1, RULE_element = 2, RULE_htmlTag = 3, 
		RULE_attribute = 4, RULE_cssBlock = 5, RULE_cssRule = 6, RULE_cssSelector = 7, 
		RULE_cssDeclaration = 8, RULE_jinjaPrint = 9, RULE_jinjaStatement = 10, 
		RULE_expression = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "elements", "element", "htmlTag", "attribute", "cssBlock", "cssRule", 
			"cssSelector", "cssDeclaration", "jinjaPrint", "jinjaStatement", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{{'", "'{%'", null, null, "'</'", null, null, "'/>'", null, null, 
			null, null, null, "'</style>'", null, null, "'{'", "'}'", "':'", "';'", 
			null, null, null, "'}}'", "'%}'", "'if'", "'else'", "'endif'", "'for'", 
			"'in'", "'endfor'", "'extends'", "'block'", "'endblock'", null, "'.'", 
			"'|'", "'=='", "'!='", null, null, "'('", "')'", null, null, null, null, 
			"'#}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_JINJA_PRINT", "OPEN_JINJA_STMT", "OPEN_STYLE_BLOCK", "HTML_TAG_OPEN", 
			"HTML_TAG_CLOSE", "HTML_TEXT", "TAG_CLOSE_SYMBOL", "TAG_SLASH_CLOSE", 
			"EQUALS", "TAG_NAME", "ATTR_NAME", "ATTR_VALUE", "WS_TAG", "CLOSE_STYLE", 
			"CSS_ID", "CSS_CLASS", "LBRACE", "RBRACE", "COLON", "SEMICOLON", "CSS_PROP", 
			"CSS_VAL", "WS_CSS", "CLOSE_JINJA_PRINT", "CLOSE_JINJA_STMT", "IF", "ELSE", 
			"ENDIF", "FOR", "IN", "ENDFOR", "EXTENDS", "BLOCK", "ENDBLOCK", "ASSIGN", 
			"DOT", "PIPE", "EQ", "NEQ", "GT", "LT", "LPAREN", "RPAREN", "ID", "STRING", 
			"NUMBER", "WS_JINJA", "CLOSE_COMMENT", "COMMENT_TEXT"
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
	public String getGrammarFileName() { return "ParserFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserFile(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ParserFile.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			elements();
			setState(25);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementsContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_elements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(27);
					element();
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementHtmlTagContext extends ElementContext {
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public ElementHtmlTagContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterElementHtmlTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitElementHtmlTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitElementHtmlTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementCssContext extends ElementContext {
		public CssBlockContext cssBlock() {
			return getRuleContext(CssBlockContext.class,0);
		}
		public ElementCssContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterElementCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitElementCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitElementCss(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementTextContext extends ElementContext {
		public TerminalNode HTML_TEXT() { return getToken(ParserFile.HTML_TEXT, 0); }
		public ElementTextContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterElementText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitElementText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitElementText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementJinjaStmtContext extends ElementContext {
		public JinjaStatementContext jinjaStatement() {
			return getRuleContext(JinjaStatementContext.class,0);
		}
		public ElementJinjaStmtContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterElementJinjaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitElementJinjaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitElementJinjaStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementJinjaPrintContext extends ElementContext {
		public JinjaPrintContext jinjaPrint() {
			return getRuleContext(JinjaPrintContext.class,0);
		}
		public ElementJinjaPrintContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterElementJinjaPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitElementJinjaPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitElementJinjaPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TEXT:
				_localctx = new ElementTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(HTML_TEXT);
				}
				break;
			case HTML_TAG_OPEN:
				_localctx = new ElementHtmlTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				htmlTag();
				}
				break;
			case OPEN_STYLE_BLOCK:
				_localctx = new ElementCssContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				cssBlock();
				}
				break;
			case OPEN_JINJA_STMT:
				_localctx = new ElementJinjaStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				jinjaStatement();
				}
				break;
			case OPEN_JINJA_PRINT:
				_localctx = new ElementJinjaPrintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				jinjaPrint();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagContext extends ParserRuleContext {
		public HtmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTag; }
	 
		public HtmlTagContext() { }
		public void copyFrom(HtmlTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlPairTagContext extends HtmlTagContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(ParserFile.HTML_TAG_OPEN, 0); }
		public List<TerminalNode> TAG_NAME() { return getTokens(ParserFile.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(ParserFile.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE_SYMBOL() { return getTokens(ParserFile.TAG_CLOSE_SYMBOL); }
		public TerminalNode TAG_CLOSE_SYMBOL(int i) {
			return getToken(ParserFile.TAG_CLOSE_SYMBOL, i);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode HTML_TAG_CLOSE() { return getToken(ParserFile.HTML_TAG_CLOSE, 0); }
		public HtmlPairTagContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlPairTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlPairTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlPairTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSelfClosingTagContext extends HtmlTagContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(ParserFile.HTML_TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(ParserFile.TAG_NAME, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(ParserFile.TAG_SLASH_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public HtmlSelfClosingTagContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagContext htmlTag() throws RecognitionException {
		HtmlTagContext _localctx = new HtmlTagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlTag);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new HtmlPairTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(HTML_TAG_OPEN);
				setState(41);
				match(TAG_NAME);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTR_NAME) {
					{
					{
					setState(42);
					attribute();
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(48);
				match(TAG_CLOSE_SYMBOL);
				setState(49);
				elements();
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(50);
					match(HTML_TAG_CLOSE);
					setState(51);
					match(TAG_NAME);
					setState(52);
					match(TAG_CLOSE_SYMBOL);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new HtmlSelfClosingTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(HTML_TAG_OPEN);
				setState(56);
				match(TAG_NAME);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTR_NAME) {
					{
					{
					setState(57);
					attribute();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				match(TAG_SLASH_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	 
		public AttributeContext() { }
		public void copyFrom(AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrStringContext extends AttributeContext {
		public TerminalNode ATTR_NAME() { return getToken(ParserFile.ATTR_NAME, 0); }
		public TerminalNode EQUALS() { return getToken(ParserFile.EQUALS, 0); }
		public TerminalNode ATTR_VALUE() { return getToken(ParserFile.ATTR_VALUE, 0); }
		public AttrStringContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAttrString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAttrString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAttrString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrJinjaContext extends AttributeContext {
		public TerminalNode ATTR_NAME() { return getToken(ParserFile.ATTR_NAME, 0); }
		public TerminalNode EQUALS() { return getToken(ParserFile.EQUALS, 0); }
		public JinjaPrintContext jinjaPrint() {
			return getRuleContext(JinjaPrintContext.class,0);
		}
		public AttrJinjaContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAttrJinja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAttrJinja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAttrJinja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AttrStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(ATTR_NAME);
				setState(67);
				match(EQUALS);
				setState(68);
				match(ATTR_VALUE);
				}
				break;
			case 2:
				_localctx = new AttrJinjaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(ATTR_NAME);
				setState(70);
				match(EQUALS);
				setState(71);
				jinjaPrint();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssBlockContext extends ParserRuleContext {
		public TerminalNode OPEN_STYLE_BLOCK() { return getToken(ParserFile.OPEN_STYLE_BLOCK, 0); }
		public TerminalNode CLOSE_STYLE() { return getToken(ParserFile.CLOSE_STYLE, 0); }
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public CssBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCssBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCssBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCssBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBlockContext cssBlock() throws RecognitionException {
		CssBlockContext _localctx = new CssBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cssBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(OPEN_STYLE_BLOCK);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99328L) != 0)) {
				{
				{
				setState(75);
				cssRule();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(CLOSE_STYLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends ParserRuleContext {
		public CssSelectorContext cssSelector() {
			return getRuleContext(CssSelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ParserFile.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserFile.RBRACE, 0); }
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cssRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			cssSelector();
			setState(84);
			match(LBRACE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_PROP) {
				{
				{
				setState(85);
				cssDeclaration();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorContext extends ParserRuleContext {
		public TerminalNode CSS_ID() { return getToken(ParserFile.CSS_ID, 0); }
		public TerminalNode CSS_CLASS() { return getToken(ParserFile.CSS_CLASS, 0); }
		public TerminalNode TAG_NAME() { return getToken(ParserFile.TAG_NAME, 0); }
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCssSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCssSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cssSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 99328L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationContext extends ParserRuleContext {
		public TerminalNode CSS_PROP() { return getToken(ParserFile.CSS_PROP, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode CSS_VAL() { return getToken(ParserFile.CSS_VAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserFile.SEMICOLON, 0); }
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cssDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(CSS_PROP);
			setState(96);
			match(COLON);
			setState(97);
			match(CSS_VAL);
			setState(98);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaPrintContext extends ParserRuleContext {
		public TerminalNode OPEN_JINJA_PRINT() { return getToken(ParserFile.OPEN_JINJA_PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_JINJA_PRINT() { return getToken(ParserFile.CLOSE_JINJA_PRINT, 0); }
		public JinjaPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterJinjaPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitJinjaPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitJinjaPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaPrintContext jinjaPrint() throws RecognitionException {
		JinjaPrintContext _localctx = new JinjaPrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jinjaPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(OPEN_JINJA_PRINT);
			setState(101);
			expression(0);
			setState(102);
			match(CLOSE_JINJA_PRINT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStatementContext extends ParserRuleContext {
		public JinjaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStatement; }
	 
		public JinjaStatementContext() { }
		public void copyFrom(JinjaStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExtendsContext extends JinjaStatementContext {
		public TerminalNode OPEN_JINJA_STMT() { return getToken(ParserFile.OPEN_JINJA_STMT, 0); }
		public TerminalNode EXTENDS() { return getToken(ParserFile.EXTENDS, 0); }
		public TerminalNode STRING() { return getToken(ParserFile.STRING, 0); }
		public TerminalNode CLOSE_JINJA_STMT() { return getToken(ParserFile.CLOSE_JINJA_STMT, 0); }
		public JinjaExtendsContext(JinjaStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterJinjaExtends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitJinjaExtends(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitJinjaExtends(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfContext extends JinjaStatementContext {
		public List<TerminalNode> OPEN_JINJA_STMT() { return getTokens(ParserFile.OPEN_JINJA_STMT); }
		public TerminalNode OPEN_JINJA_STMT(int i) {
			return getToken(ParserFile.OPEN_JINJA_STMT, i);
		}
		public TerminalNode IF() { return getToken(ParserFile.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> CLOSE_JINJA_STMT() { return getTokens(ParserFile.CLOSE_JINJA_STMT); }
		public TerminalNode CLOSE_JINJA_STMT(int i) {
			return getToken(ParserFile.CLOSE_JINJA_STMT, i);
		}
		public List<ElementsContext> elements() {
			return getRuleContexts(ElementsContext.class);
		}
		public ElementsContext elements(int i) {
			return getRuleContext(ElementsContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(ParserFile.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(ParserFile.ELSE, 0); }
		public JinjaIfContext(JinjaStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterJinjaIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitJinjaIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitJinjaIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockContext extends JinjaStatementContext {
		public List<TerminalNode> OPEN_JINJA_STMT() { return getTokens(ParserFile.OPEN_JINJA_STMT); }
		public TerminalNode OPEN_JINJA_STMT(int i) {
			return getToken(ParserFile.OPEN_JINJA_STMT, i);
		}
		public TerminalNode BLOCK() { return getToken(ParserFile.BLOCK, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public List<TerminalNode> CLOSE_JINJA_STMT() { return getTokens(ParserFile.CLOSE_JINJA_STMT); }
		public TerminalNode CLOSE_JINJA_STMT(int i) {
			return getToken(ParserFile.CLOSE_JINJA_STMT, i);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode ENDBLOCK() { return getToken(ParserFile.ENDBLOCK, 0); }
		public JinjaBlockContext(JinjaStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForContext extends JinjaStatementContext {
		public List<TerminalNode> OPEN_JINJA_STMT() { return getTokens(ParserFile.OPEN_JINJA_STMT); }
		public TerminalNode OPEN_JINJA_STMT(int i) {
			return getToken(ParserFile.OPEN_JINJA_STMT, i);
		}
		public TerminalNode FOR() { return getToken(ParserFile.FOR, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode IN() { return getToken(ParserFile.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> CLOSE_JINJA_STMT() { return getTokens(ParserFile.CLOSE_JINJA_STMT); }
		public TerminalNode CLOSE_JINJA_STMT(int i) {
			return getToken(ParserFile.CLOSE_JINJA_STMT, i);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(ParserFile.ENDFOR, 0); }
		public JinjaForContext(JinjaStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterJinjaFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitJinjaFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitJinjaFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStatementContext jinjaStatement() throws RecognitionException {
		JinjaStatementContext _localctx = new JinjaStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jinjaStatement);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new JinjaForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(OPEN_JINJA_STMT);
				setState(105);
				match(FOR);
				setState(106);
				match(ID);
				setState(107);
				match(IN);
				setState(108);
				expression(0);
				setState(109);
				match(CLOSE_JINJA_STMT);
				setState(110);
				elements();
				setState(111);
				match(OPEN_JINJA_STMT);
				setState(112);
				match(ENDFOR);
				setState(113);
				match(CLOSE_JINJA_STMT);
				}
				break;
			case 2:
				_localctx = new JinjaIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(OPEN_JINJA_STMT);
				setState(116);
				match(IF);
				setState(117);
				expression(0);
				setState(118);
				match(CLOSE_JINJA_STMT);
				setState(119);
				elements();
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(120);
					match(OPEN_JINJA_STMT);
					setState(121);
					match(ELSE);
					setState(122);
					match(CLOSE_JINJA_STMT);
					setState(123);
					elements();
					}
					break;
				}
				setState(126);
				match(OPEN_JINJA_STMT);
				setState(127);
				match(ENDIF);
				setState(128);
				match(CLOSE_JINJA_STMT);
				}
				break;
			case 3:
				_localctx = new JinjaExtendsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(OPEN_JINJA_STMT);
				setState(131);
				match(EXTENDS);
				setState(132);
				match(STRING);
				setState(133);
				match(CLOSE_JINJA_STMT);
				}
				break;
			case 4:
				_localctx = new JinjaBlockContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(OPEN_JINJA_STMT);
				setState(135);
				match(BLOCK);
				setState(136);
				match(ID);
				setState(137);
				match(CLOSE_JINJA_STMT);
				setState(138);
				elements();
				setState(139);
				match(OPEN_JINJA_STMT);
				setState(140);
				match(ENDBLOCK);
				setState(141);
				match(CLOSE_JINJA_STMT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(ParserFile.STRING, 0); }
		public ExprStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMemberAccessContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public ExprMemberAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExprMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExprMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExprMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCompareContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ParserFile.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ParserFile.NEQ, 0); }
		public TerminalNode GT() { return getToken(ParserFile.GT, 0); }
		public TerminalNode LT() { return getToken(ParserFile.LT, 0); }
		public ExprCompareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExprCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExprCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExprCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNumberContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(ParserFile.NUMBER, 0); }
		public ExprNumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExprNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExprNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExprNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFilterContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(ParserFile.PIPE, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public ExprFilterContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExprFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExprFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExprFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIdContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public ExprIdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExprId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExprId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExprId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new ExprIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(146);
				match(ID);
				}
				break;
			case STRING:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(STRING);
				}
				break;
			case NUMBER:
				{
				_localctx = new ExprNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprCompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(152);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(153);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprMemberAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(155);
						match(DOT);
						setState(156);
						match(ID);
						}
						break;
					case 3:
						{
						_localctx = new ExprFilterContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(158);
						match(PIPE);
						setState(159);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u00a6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u001d\b\u0001\n"+
		"\u0001\f\u0001 \t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003,\b\u0003\n\u0003\f\u0003/\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003;\b\u0003\n\u0003\f\u0003>\t\u0003"+
		"\u0001\u0003\u0003\u0003A\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004I\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0005\u0005M\b\u0005\n\u0005\f\u0005P\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006W\b\u0006"+
		"\n\u0006\f\u0006Z\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n}\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0090\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0096\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00a1\b\u000b\n\u000b\f\u000b\u00a4\t\u000b\u0001\u000b"+
		"\u0000\u0001\u0016\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0000\u0002\u0002\u0000\n\n\u000f\u0010\u0001\u0000&)\u00ae\u0000"+
		"\u0018\u0001\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004"+
		"&\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\bH\u0001\u0000"+
		"\u0000\u0000\nJ\u0001\u0000\u0000\u0000\fS\u0001\u0000\u0000\u0000\u000e"+
		"]\u0001\u0000\u0000\u0000\u0010_\u0001\u0000\u0000\u0000\u0012d\u0001"+
		"\u0000\u0000\u0000\u0014\u008f\u0001\u0000\u0000\u0000\u0016\u0095\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u001a\u0005"+
		"\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001d\u0003"+
		"\u0004\u0002\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d \u0001\u0000"+
		"\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f\u0003\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000!\'\u0005\u0006\u0000\u0000\"\'\u0003\u0006\u0003\u0000#\'\u0003"+
		"\n\u0005\u0000$\'\u0003\u0014\n\u0000%\'\u0003\u0012\t\u0000&!\u0001\u0000"+
		"\u0000\u0000&\"\u0001\u0000\u0000\u0000&#\u0001\u0000\u0000\u0000&$\u0001"+
		"\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'\u0005\u0001\u0000\u0000"+
		"\u0000()\u0005\u0004\u0000\u0000)-\u0005\n\u0000\u0000*,\u0003\b\u0004"+
		"\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u000001\u0005\u0007\u0000\u000015\u0003\u0002\u0001\u0000"+
		"23\u0005\u0005\u0000\u000034\u0005\n\u0000\u000046\u0005\u0007\u0000\u0000"+
		"52\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006A\u0001\u0000\u0000"+
		"\u000078\u0005\u0004\u0000\u00008<\u0005\n\u0000\u00009;\u0003\b\u0004"+
		"\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000?A\u0005\b\u0000\u0000@(\u0001\u0000\u0000\u0000@7\u0001"+
		"\u0000\u0000\u0000A\u0007\u0001\u0000\u0000\u0000BC\u0005\u000b\u0000"+
		"\u0000CD\u0005\t\u0000\u0000DI\u0005\f\u0000\u0000EF\u0005\u000b\u0000"+
		"\u0000FG\u0005\t\u0000\u0000GI\u0003\u0012\t\u0000HB\u0001\u0000\u0000"+
		"\u0000HE\u0001\u0000\u0000\u0000I\t\u0001\u0000\u0000\u0000JN\u0005\u0003"+
		"\u0000\u0000KM\u0003\f\u0006\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u000e\u0000\u0000"+
		"R\u000b\u0001\u0000\u0000\u0000ST\u0003\u000e\u0007\u0000TX\u0005\u0011"+
		"\u0000\u0000UW\u0003\u0010\b\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005\u0012\u0000\u0000"+
		"\\\r\u0001\u0000\u0000\u0000]^\u0007\u0000\u0000\u0000^\u000f\u0001\u0000"+
		"\u0000\u0000_`\u0005\u0015\u0000\u0000`a\u0005\u0013\u0000\u0000ab\u0005"+
		"\u0016\u0000\u0000bc\u0005\u0014\u0000\u0000c\u0011\u0001\u0000\u0000"+
		"\u0000de\u0005\u0001\u0000\u0000ef\u0003\u0016\u000b\u0000fg\u0005\u0018"+
		"\u0000\u0000g\u0013\u0001\u0000\u0000\u0000hi\u0005\u0002\u0000\u0000"+
		"ij\u0005\u001d\u0000\u0000jk\u0005,\u0000\u0000kl\u0005\u001e\u0000\u0000"+
		"lm\u0003\u0016\u000b\u0000mn\u0005\u0019\u0000\u0000no\u0003\u0002\u0001"+
		"\u0000op\u0005\u0002\u0000\u0000pq\u0005\u001f\u0000\u0000qr\u0005\u0019"+
		"\u0000\u0000r\u0090\u0001\u0000\u0000\u0000st\u0005\u0002\u0000\u0000"+
		"tu\u0005\u001a\u0000\u0000uv\u0003\u0016\u000b\u0000vw\u0005\u0019\u0000"+
		"\u0000w|\u0003\u0002\u0001\u0000xy\u0005\u0002\u0000\u0000yz\u0005\u001b"+
		"\u0000\u0000z{\u0005\u0019\u0000\u0000{}\u0003\u0002\u0001\u0000|x\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\u0002\u0000\u0000\u007f\u0080\u0005\u001c\u0000\u0000\u0080"+
		"\u0081\u0005\u0019\u0000\u0000\u0081\u0090\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005\u0002\u0000\u0000\u0083\u0084\u0005 \u0000\u0000\u0084\u0085"+
		"\u0005-\u0000\u0000\u0085\u0090\u0005\u0019\u0000\u0000\u0086\u0087\u0005"+
		"\u0002\u0000\u0000\u0087\u0088\u0005!\u0000\u0000\u0088\u0089\u0005,\u0000"+
		"\u0000\u0089\u008a\u0005\u0019\u0000\u0000\u008a\u008b\u0003\u0002\u0001"+
		"\u0000\u008b\u008c\u0005\u0002\u0000\u0000\u008c\u008d\u0005\"\u0000\u0000"+
		"\u008d\u008e\u0005\u0019\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000"+
		"\u008fh\u0001\u0000\u0000\u0000\u008fs\u0001\u0000\u0000\u0000\u008f\u0082"+
		"\u0001\u0000\u0000\u0000\u008f\u0086\u0001\u0000\u0000\u0000\u0090\u0015"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0006\u000b\uffff\uffff\u0000\u0092"+
		"\u0096\u0005,\u0000\u0000\u0093\u0096\u0005-\u0000\u0000\u0094\u0096\u0005"+
		".\u0000\u0000\u0095\u0091\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u00a2\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\n\u0004\u0000\u0000\u0098\u0099\u0007\u0001\u0000"+
		"\u0000\u0099\u00a1\u0003\u0016\u000b\u0005\u009a\u009b\n\u0006\u0000\u0000"+
		"\u009b\u009c\u0005$\u0000\u0000\u009c\u00a1\u0005,\u0000\u0000\u009d\u009e"+
		"\n\u0005\u0000\u0000\u009e\u009f\u0005%\u0000\u0000\u009f\u00a1\u0005"+
		",\u0000\u0000\u00a0\u0097\u0001\u0000\u0000\u0000\u00a0\u009a\u0001\u0000"+
		"\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u0017\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u000e\u001e&-5<@HNX|\u008f\u0095\u00a0\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}