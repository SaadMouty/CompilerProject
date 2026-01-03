package ast;

public class RootNode extends AstNode {
    public RootNode() {
        super("ROOT", 0);
    }

    @Override
    public String toString() {
        return "File Root";
    }
}