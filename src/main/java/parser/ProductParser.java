// Generated from C:/Users/ASUSD/CompilerCourse/tryingggggggggggg/src/main/antlr/ProductParser.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ProductParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRODUCT=1, IMAGE=2, NAME=3, PRICE=4, DETAILS=5, LBRACE=6, RBRACE=7, EQUALS=8, 
		STRING=9, NUMBER=10, WS=11;
	public static final int
		RULE_program = 0, RULE_product = 1, RULE_field = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "product", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'product'", "'image'", "'name'", "'price'", "'details'", "'{'", 
			"'}'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRODUCT", "IMAGE", "NAME", "PRICE", "DETAILS", "LBRACE", "RBRACE", 
			"EQUALS", "STRING", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "ProductParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProductParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProductContext product;
		public List<ProductContext> products = new ArrayList<ProductContext>();
		public TerminalNode EOF() { return getToken(ProductParser.EOF, 0); }
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProductParserListener ) ((ProductParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProductParserListener ) ((ProductParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProductParserVisitor ) return ((ProductParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRODUCT) {
				{
				{
				setState(6);
				((ProgramContext)_localctx).product = product();
				((ProgramContext)_localctx).products.add(((ProgramContext)_localctx).product);
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
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
	public static class ProductContext extends ParserRuleContext {
		public FieldContext field;
		public List<FieldContext> fields = new ArrayList<FieldContext>();
		public TerminalNode PRODUCT() { return getToken(ProductParser.PRODUCT, 0); }
		public TerminalNode LBRACE() { return getToken(ProductParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProductParser.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProductParserListener ) ((ProductParserListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProductParserListener ) ((ProductParserListener)listener).exitProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProductParserVisitor ) return ((ProductParserVisitor<? extends T>)visitor).visitProduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_product);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(PRODUCT);
			setState(15);
			match(LBRACE);
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0)) {
				{
				{
				setState(16);
				((ProductContext)_localctx).field = field();
				((ProductContext)_localctx).fields.add(((ProductContext)_localctx).field);
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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
	public static class FieldContext extends ParserRuleContext {
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	 
		public FieldContext() { }
		public void copyFrom(FieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImageFieldContext extends FieldContext {
		public Token value;
		public TerminalNode IMAGE() { return getToken(ProductParser.IMAGE, 0); }
		public TerminalNode EQUALS() { return getToken(ProductParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(ProductParser.STRING, 0); }
		public ImageFieldContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProductParserListener ) ((ProductParserListener)listener).enterImageField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProductParserListener ) ((ProductParserListener)listener).exitImageField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProductParserVisitor ) return ((ProductParserVisitor<? extends T>)visitor).visitImageField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameFieldContext extends FieldContext {
		public Token value;
		public TerminalNode NAME() { return getToken(ProductParser.NAME, 0); }
		public TerminalNode EQUALS() { return getToken(ProductParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(ProductParser.STRING, 0); }
		public NameFieldContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProductParserListener ) ((ProductParserListener)listener).enterNameField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProductParserListener ) ((ProductParserListener)listener).exitNameField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProductParserVisitor ) return ((ProductParserVisitor<? extends T>)visitor).visitNameField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PriceFieldContext extends FieldContext {
		public Token value;
		public TerminalNode PRICE() { return getToken(ProductParser.PRICE, 0); }
		public TerminalNode EQUALS() { return getToken(ProductParser.EQUALS, 0); }
		public TerminalNode NUMBER() { return getToken(ProductParser.NUMBER, 0); }
		public PriceFieldContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProductParserListener ) ((ProductParserListener)listener).enterPriceField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProductParserListener ) ((ProductParserListener)listener).exitPriceField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProductParserVisitor ) return ((ProductParserVisitor<? extends T>)visitor).visitPriceField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DetailsFieldContext extends FieldContext {
		public Token value;
		public TerminalNode DETAILS() { return getToken(ProductParser.DETAILS, 0); }
		public TerminalNode EQUALS() { return getToken(ProductParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(ProductParser.STRING, 0); }
		public DetailsFieldContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProductParserListener ) ((ProductParserListener)listener).enterDetailsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProductParserListener ) ((ProductParserListener)listener).exitDetailsField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProductParserVisitor ) return ((ProductParserVisitor<? extends T>)visitor).visitDetailsField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMAGE:
				_localctx = new ImageFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(IMAGE);
				setState(25);
				match(EQUALS);
				setState(26);
				((ImageFieldContext)_localctx).value = match(STRING);
				}
				break;
			case NAME:
				_localctx = new NameFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(NAME);
				setState(28);
				match(EQUALS);
				setState(29);
				((NameFieldContext)_localctx).value = match(STRING);
				}
				break;
			case PRICE:
				_localctx = new PriceFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(PRICE);
				setState(31);
				match(EQUALS);
				setState(32);
				((PriceFieldContext)_localctx).value = match(NUMBER);
				}
				break;
			case DETAILS:
				_localctx = new DetailsFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(DETAILS);
				setState(34);
				match(EQUALS);
				setState(35);
				((DetailsFieldContext)_localctx).value = match(STRING);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000b\'\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0005\u0000\b\b\u0000\n\u0000\f\u0000\u000b"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0012\b\u0001\n\u0001\f\u0001\u0015\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002%\b\u0002\u0001\u0002\u0000\u0000\u0003\u0000\u0002\u0004"+
		"\u0000\u0000(\u0000\t\u0001\u0000\u0000\u0000\u0002\u000e\u0001\u0000"+
		"\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006\b\u0003\u0002\u0001"+
		"\u0000\u0007\u0006\u0001\u0000\u0000\u0000\b\u000b\u0001\u0000\u0000\u0000"+
		"\t\u0007\u0001\u0000\u0000\u0000\t\n\u0001\u0000\u0000\u0000\n\f\u0001"+
		"\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\f\r\u0005\u0000\u0000"+
		"\u0001\r\u0001\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0001\u0000\u0000"+
		"\u000f\u0013\u0005\u0006\u0000\u0000\u0010\u0012\u0003\u0004\u0002\u0000"+
		"\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000"+
		"\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000"+
		"\u0014\u0016\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0005\u0007\u0000\u0000\u0017\u0003\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001a\u0005\b\u0000\u0000\u001a"+
		"%\u0005\t\u0000\u0000\u001b\u001c\u0005\u0003\u0000\u0000\u001c\u001d"+
		"\u0005\b\u0000\u0000\u001d%\u0005\t\u0000\u0000\u001e\u001f\u0005\u0004"+
		"\u0000\u0000\u001f \u0005\b\u0000\u0000 %\u0005\n\u0000\u0000!\"\u0005"+
		"\u0005\u0000\u0000\"#\u0005\b\u0000\u0000#%\u0005\t\u0000\u0000$\u0018"+
		"\u0001\u0000\u0000\u0000$\u001b\u0001\u0000\u0000\u0000$\u001e\u0001\u0000"+
		"\u0000\u0000$!\u0001\u0000\u0000\u0000%\u0005\u0001\u0000\u0000\u0000"+
		"\u0003\t\u0013$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}