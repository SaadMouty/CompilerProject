package ast;

public class CssBlockNode extends AstNode {
    public CssBlockNode(int lineNumber) {
        super("CSS_BLOCK", lineNumber);
    }

    @Override
    public String toString() {
        return "CSS Style Block [Line: " + lineNumber + "]";
    }
}