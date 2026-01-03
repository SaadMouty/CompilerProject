package ast;

public class CssRuleNode extends AstNode {
    private String selector;

    public CssRuleNode(String selector, int lineNumber) {
        super("CSS_RULE", lineNumber);
        this.selector = selector;
    }

    @Override
    public String toString() {
        return "CSS Rule (Selector: " + selector + ") [Line: " + lineNumber + "]";
    }
}