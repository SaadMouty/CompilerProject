package ast;

public class AssignmentNode extends AstNode {
    private String variableName;
    private AstNode value;

    public AssignmentNode(String variableName, AstNode value, int lineNumber) {
        super("ASSIGNMENT", lineNumber);
        this.variableName = variableName;
        this.value = value;
        this.addChild(value);
    }

    @Override
    public String toString() {
        return "Assignment: " + variableName + " [Line: " + lineNumber + "]";
    }
}