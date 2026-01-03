// Generated from C:/Users/user/IdeaProjects/Compiler1/src/antlr/ParserFile.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserFile}.
 */
public interface ParserFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserFile#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ParserFile.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ParserFile.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(ParserFile.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(ParserFile.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementText}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 */
	void enterElementText(ParserFile.ElementTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementText}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 */
	void exitElementText(ParserFile.ElementTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementHtmlTag}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 */
	void enterElementHtmlTag(ParserFile.ElementHtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementHtmlTag}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 */
	void exitElementHtmlTag(ParserFile.ElementHtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementCss}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 */
	void enterElementCss(ParserFile.ElementCssContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementCss}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 */
	void exitElementCss(ParserFile.ElementCssContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementJinjaStmt}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 */
	void enterElementJinjaStmt(ParserFile.ElementJinjaStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementJinjaStmt}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 */
	void exitElementJinjaStmt(ParserFile.ElementJinjaStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementJinjaPrint}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 */
	void enterElementJinjaPrint(ParserFile.ElementJinjaPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementJinjaPrint}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 */
	void exitElementJinjaPrint(ParserFile.ElementJinjaPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlPairTag}
	 * labeled alternative in {@link ParserFile#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlPairTag(ParserFile.HtmlPairTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlPairTag}
	 * labeled alternative in {@link ParserFile#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlPairTag(ParserFile.HtmlPairTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlSelfClosingTag}
	 * labeled alternative in {@link ParserFile#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSelfClosingTag(ParserFile.HtmlSelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlSelfClosingTag}
	 * labeled alternative in {@link ParserFile#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSelfClosingTag(ParserFile.HtmlSelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrString}
	 * labeled alternative in {@link ParserFile#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttrString(ParserFile.AttrStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrString}
	 * labeled alternative in {@link ParserFile#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttrString(ParserFile.AttrStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrJinja}
	 * labeled alternative in {@link ParserFile#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttrJinja(ParserFile.AttrJinjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrJinja}
	 * labeled alternative in {@link ParserFile#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttrJinja(ParserFile.AttrJinjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#cssBlock}.
	 * @param ctx the parse tree
	 */
	void enterCssBlock(ParserFile.CssBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#cssBlock}.
	 * @param ctx the parse tree
	 */
	void exitCssBlock(ParserFile.CssBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(ParserFile.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(ParserFile.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelector(ParserFile.CssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelector(ParserFile.CssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(ParserFile.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(ParserFile.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#jinjaPrint}.
	 * @param ctx the parse tree
	 */
	void enterJinjaPrint(ParserFile.JinjaPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#jinjaPrint}.
	 * @param ctx the parse tree
	 */
	void exitJinjaPrint(ParserFile.JinjaPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaFor}
	 * labeled alternative in {@link ParserFile#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFor(ParserFile.JinjaForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaFor}
	 * labeled alternative in {@link ParserFile#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFor(ParserFile.JinjaForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIf}
	 * labeled alternative in {@link ParserFile#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIf(ParserFile.JinjaIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIf}
	 * labeled alternative in {@link ParserFile#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIf(ParserFile.JinjaIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExtends}
	 * labeled alternative in {@link ParserFile#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExtends(ParserFile.JinjaExtendsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExtends}
	 * labeled alternative in {@link ParserFile#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExtends(ParserFile.JinjaExtendsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaBlock}
	 * labeled alternative in {@link ParserFile#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlock(ParserFile.JinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaBlock}
	 * labeled alternative in {@link ParserFile#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlock(ParserFile.JinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprString(ParserFile.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprString(ParserFile.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMemberAccess}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprMemberAccess(ParserFile.ExprMemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMemberAccess}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprMemberAccess(ParserFile.ExprMemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCompare}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprCompare(ParserFile.ExprCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCompare}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprCompare(ParserFile.ExprCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(ParserFile.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(ParserFile.ExprNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFilter}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFilter(ParserFile.ExprFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFilter}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFilter(ParserFile.ExprFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprId(ParserFile.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprId(ParserFile.ExprIdContext ctx);
}