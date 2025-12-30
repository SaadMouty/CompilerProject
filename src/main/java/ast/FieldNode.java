package ast;

public abstract class FieldNode extends AstNode {
    public final String value;

    protected FieldNode(int line, String value) {
        super(line);
        this.value = value;
    }
}
