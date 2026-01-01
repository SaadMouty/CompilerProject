package util;

import ast.AstNode;

public class AstPrinter {

    public static void printTree(AstNode root) {
        printNode(root, 0);
    }

    private static void printNode(AstNode node, int indent) {
        String extraInfo = "";
        // إذا كانت العقدة عبارة عن حقل (مثل الاسم أو السعر)، قم بطباعة قيمتها
        if (node instanceof ast.FieldNode) {
            extraInfo = " : " + ((ast.FieldNode) node).value;
        }

        System.out.println("  ".repeat(indent)
                + node.getClass().getSimpleName()
                + extraInfo  // إضافة القيمة هنا
                + " (line=" + node.line + ")");

        for (AstNode child : node.children()) {
            printNode(child, indent + 1);
        }
    }
}
