import antlr.LexerFile;
import antlr.ParserFile;
import ast.AstNode;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.MyWebVisitor;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // قائمة بملفات الاختبار الخارجية التي أنشأناها
        String[] testFiles = {
                "src/test_display.txt",
                "src/test_add.txt",
                "src/test_details.txt"
        };

        for (String fileName : testFiles) {
            try {
                System.out.println("\n" + "=".repeat(30));
                System.out.println("Processing File: " + fileName);
                System.out.println("=".repeat(30));

                // 1. قراءة محتوى الملف الخارجي
                String input = new String(Files.readAllBytes(Paths.get(fileName)));

                // 2. التحليل المعجمي والنحوي (Lexer & Parser)
                LexerFile lexer = new LexerFile(CharStreams.fromString(input));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                ParserFile parser = new ParserFile(tokens);
                ParseTree tree = parser.file();

                // 3. بناء الـ AST باستخدام الـ Visitor
                MyWebVisitor visitor = new MyWebVisitor();
                AstNode astRoot = visitor.visit(tree);

                // 4. طباعة شجرة القواعد المجردة (AST)
                System.out.println("\n=== ABSTRACT SYNTAX TREE (AST) ===");
                if (astRoot != null) {
                    astRoot.printTree(0);
                } else {
                    System.out.println("Error: AST Root is null.");
                }

                // 5. طباعة جدول الرموز (Symbol Table)
                visitor.getSymbolTable().printTable();

            } catch (IOException e) {
                System.err.println("Error reading file " + fileName + ": " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Error processing file " + fileName + ":");
                e.printStackTrace();
            }
        }
    }
}