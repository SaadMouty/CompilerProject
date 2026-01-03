package ast;

import java.util.ArrayList;
import java.util.List;

public abstract class AstNode {
    //  تفاصيل العقدة: الاسم ورقم السطر
    protected String nodeName;
    protected int lineNumber;

    // [cite: 17, 21] قائمة الأبناء لتخزين الشجرة وطباعتها
    protected List<AstNode> children;

    public AstNode(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.children = new ArrayList<>();
    }

    public void addChild(AstNode child) {
        if (child != null) {
            this.children.add(child);
        }
    }

    public List<AstNode> getChildren() {
        return children;
    }

    // دالة مساعدة لطباعة المسافات البادئة (Indentation) لتحقيق طباعة مقروءة [cite: 21]
    protected String getIndent(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append("|-- ");
        }
        return sb.toString();
    }

    // [cite: 20] تابع لطباعة العقدة ثم استدعاء طباعة الأبناء (Recursion)
    public void printTree(int level) {
        // طباعة معلومات العقدة الحالية
        System.out.println(getIndent(level) + this.toString());

        // تطبيق Polymorphism: طباعة الأبناء تلقائياً بغض النظر عن نوعهم
        for (AstNode child : children) {
            child.printTree(level + 1);
        }
    }

    // دالة تجريدية يجب على كل ابن تنفيذها لعرض تفاصيله الخاصة
    @Override
    public abstract String toString();
}