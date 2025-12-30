// Generated from C:/Users/ASUSD/CompilerCourse/tryingggggggggggg/src/main/antlr/ProductParser.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProductParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProductParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProductParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ProductParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProductParser#product}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduct(ProductParser.ProductContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImageField}
	 * labeled alternative in {@link ProductParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageField(ProductParser.ImageFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameField}
	 * labeled alternative in {@link ProductParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameField(ProductParser.NameFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PriceField}
	 * labeled alternative in {@link ProductParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriceField(ProductParser.PriceFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DetailsField}
	 * labeled alternative in {@link ProductParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetailsField(ProductParser.DetailsFieldContext ctx);
}