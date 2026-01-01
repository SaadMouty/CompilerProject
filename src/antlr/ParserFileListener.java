// Generated from C:/Users/user/IdeaProjects/CompilerProject-main/src/antlr/ParserFile.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserFile}.
 */
public interface ParserFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserFile#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserFile.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserFile.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(ParserFile.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(ParserFile.ProductContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImageField}
	 * labeled alternative in {@link ParserFile#field}.
	 * @param ctx the parse tree
	 */
	void enterImageField(ParserFile.ImageFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImageField}
	 * labeled alternative in {@link ParserFile#field}.
	 * @param ctx the parse tree
	 */
	void exitImageField(ParserFile.ImageFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameField}
	 * labeled alternative in {@link ParserFile#field}.
	 * @param ctx the parse tree
	 */
	void enterNameField(ParserFile.NameFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameField}
	 * labeled alternative in {@link ParserFile#field}.
	 * @param ctx the parse tree
	 */
	void exitNameField(ParserFile.NameFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PriceField}
	 * labeled alternative in {@link ParserFile#field}.
	 * @param ctx the parse tree
	 */
	void enterPriceField(ParserFile.PriceFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PriceField}
	 * labeled alternative in {@link ParserFile#field}.
	 * @param ctx the parse tree
	 */
	void exitPriceField(ParserFile.PriceFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DetailsField}
	 * labeled alternative in {@link ParserFile#field}.
	 * @param ctx the parse tree
	 */
	void enterDetailsField(ParserFile.DetailsFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DetailsField}
	 * labeled alternative in {@link ParserFile#field}.
	 * @param ctx the parse tree
	 */
	void exitDetailsField(ParserFile.DetailsFieldContext ctx);
}