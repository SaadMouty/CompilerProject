import ast.AstNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.ProductLexer;
import parser.ProductParser;
import util.AstPrinter;
import visitor.AstBuilder;
import ast.ProgramNode;
import symbol.SymbolTable;
import visitor.SymbolTableBuilder;


public class Main {
    public static void main(String[] args) throws Exception {
        // اقرأ الإدخال من ملف (غيّر الاسم إذا بدك)
        CharStream input = CharStreams.fromFileName("input.txt");

        // Lexer -> Tokens
        ProductLexer lexer = new ProductLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Parser
        ProductParser parser = new ProductParser(tokens);
        ParseTree tree = parser.program();

        // Build AST (Visitor)
        AstBuilder builder = new AstBuilder();
        AstNode ast = (AstNode) builder.visit(tree);

        // Print AST
        AstPrinter.printTree(ast);
        SymbolTable table = new SymbolTableBuilder().build((ProgramNode) ast);
        table.print();

    }
}
