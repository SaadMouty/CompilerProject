package ast;

public class JinjaPrintNode extends AstNode {
    private String expression;

    public JinjaPrintNode(String expression, int lineNumber) {
        super("JINJA_PRINT", lineNumber);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Jinja Print {{ " + expression + " }} [Line: " + lineNumber + "]";
    }
}