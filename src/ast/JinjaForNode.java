package ast;

public class JinjaForNode extends AstNode {
    private String loopVar;
    private String iterable;

    public JinjaForNode(String loopVar, String iterable, int lineNumber) {
        super("JINJA_FOR", lineNumber);
        this.loopVar = loopVar;
        this.iterable = iterable;
    }

    @Override
    public String toString() {
        return "Jinja For Loop (var: " + loopVar + " in " + iterable + ") [Line: " + lineNumber + "]";
    }
}