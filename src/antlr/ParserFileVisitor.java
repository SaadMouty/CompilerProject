// Generated from C:/Users/user/IdeaProjects/Compiler1/src/antlr/ParserFile.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserFile}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserFile#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(ParserFile.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(ParserFile.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementText}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementText(ParserFile.ElementTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementHtmlTag}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementHtmlTag(ParserFile.ElementHtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementCss}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCss(ParserFile.ElementCssContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementJinjaStmt}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementJinjaStmt(ParserFile.ElementJinjaStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementJinjaPrint}
	 * labeled alternative in {@link ParserFile#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementJinjaPrint(ParserFile.ElementJinjaPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlPairTag}
	 * labeled alternative in {@link ParserFile#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlPairTag(ParserFile.HtmlPairTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSelfClosingTag}
	 * labeled alternative in {@link ParserFile#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelfClosingTag(ParserFile.HtmlSelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrString}
	 * labeled alternative in {@link ParserFile#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrString(ParserFile.AttrStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrJinja}
	 * labeled alternative in {@link ParserFile#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrJinja(ParserFile.AttrJinjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#cssBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlock(ParserFile.CssBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(ParserFile.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelector(ParserFile.CssSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(ParserFile.CssDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#jinjaPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaPrint(ParserFile.JinjaPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaFor}
	 * labeled alternative in {@link ParserFile#jinjaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFor(ParserFile.JinjaForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIf}
	 * labeled alternative in {@link ParserFile#jinjaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIf(ParserFile.JinjaIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaExtends}
	 * labeled alternative in {@link ParserFile#jinjaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExtends(ParserFile.JinjaExtendsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaBlock}
	 * labeled alternative in {@link ParserFile#jinjaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlock(ParserFile.JinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(ParserFile.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMemberAccess}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMemberAccess(ParserFile.ExprMemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCompare}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompare(ParserFile.ExprCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumber(ParserFile.ExprNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFilter}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFilter(ParserFile.ExprFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(ParserFile.ExprIdContext ctx);
}