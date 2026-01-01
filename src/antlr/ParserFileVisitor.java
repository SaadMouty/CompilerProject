// Generated from C:/Users/user/IdeaProjects/CompilerProject-main/src/antlr/ParserFile.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link ParserFile#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserFile.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#product}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduct(ParserFile.ProductContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImageField}
	 * labeled alternative in {@link ParserFile#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageField(ParserFile.ImageFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameField}
	 * labeled alternative in {@link ParserFile#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameField(ParserFile.NameFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PriceField}
	 * labeled alternative in {@link ParserFile#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriceField(ParserFile.PriceFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DetailsField}
	 * labeled alternative in {@link ParserFile#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetailsField(ParserFile.DetailsFieldContext ctx);
}