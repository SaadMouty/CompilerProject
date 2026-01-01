import ast.AstNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import antlr.LexerFile;
import antlr.ParserFile;
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
        LexerFile lexer = new LexerFile(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Parser
        ParserFile parser = new ParserFile(tokens);
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
