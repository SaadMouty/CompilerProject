// Generated from C:/Users/ASUSD/CompilerCourse/tryingggggggggggg/src/main/antlr/ProductParser.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProductParser}.
 */
public interface ProductParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProductParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProductParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProductParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProductParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProductParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(ProductParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProductParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(ProductParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImageField}
	 * labeled alternative in {@link ProductParser#field}.
	 * @param ctx the parse tree
	 */
	void enterImageField(ProductParser.ImageFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImageField}
	 * labeled alternative in {@link ProductParser#field}.
	 * @param ctx the parse tree
	 */
	void exitImageField(ProductParser.ImageFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameField}
	 * labeled alternative in {@link ProductParser#field}.
	 * @param ctx the parse tree
	 */
	void enterNameField(ProductParser.NameFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameField}
	 * labeled alternative in {@link ProductParser#field}.
	 * @param ctx the parse tree
	 */
	void exitNameField(ProductParser.NameFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PriceField}
	 * labeled alternative in {@link ProductParser#field}.
	 * @param ctx the parse tree
	 */
	void enterPriceField(ProductParser.PriceFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PriceField}
	 * labeled alternative in {@link ProductParser#field}.
	 * @param ctx the parse tree
	 */
	void exitPriceField(ProductParser.PriceFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DetailsField}
	 * labeled alternative in {@link ProductParser#field}.
	 * @param ctx the parse tree
	 */
	void enterDetailsField(ProductParser.DetailsFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DetailsField}
	 * labeled alternative in {@link ProductParser#field}.
	 * @param ctx the parse tree
	 */
	void exitDetailsField(ProductParser.DetailsFieldContext ctx);
}