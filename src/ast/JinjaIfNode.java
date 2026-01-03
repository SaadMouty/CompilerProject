package ast;

public class JinjaIfNode extends AstNode {
    private String condition;

    public JinjaIfNode(String condition, int lineNumber) {
        super("JINJA_IF", lineNumber);
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Jinja If Condition (" + condition + ") [Line: " + lineNumber + "]";
    }
}