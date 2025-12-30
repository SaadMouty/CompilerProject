package util;

import ast.AstNode;

public class AstPrinter {

    public static void printTree(AstNode root) {
        printNode(root, 0);
    }

    private static void printNode(AstNode node, int indent) {
        System.out.println("  ".repeat(indent)
                + node.getClass().getSimpleName()
                + " (line=" + node.line + ")");

        for (AstNode child : node.children()) {
            printNode(child, indent + 1);
        }
    }
}
