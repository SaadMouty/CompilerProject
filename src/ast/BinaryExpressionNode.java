package ast;

// تمثل العمليات مثل (price * quantity) أو (status == 'active')
public class BinaryExpressionNode extends AstNode {
    private String operator;
    private AstNode left;
    private AstNode right;

    public BinaryExpressionNode(AstNode left, String operator, AstNode right, int lineNumber) {
        super("BINARY_EXPRESSION", lineNumber);
        this.left = left;
        this.operator = operator;
        this.right = right;
        this.addChild(left);
        this.addChild(right);
    }

    @Override
    public String toString() {
        return "Binary Expression (Op: " + operator + ") [Line: " + lineNumber + "]";
    }
}