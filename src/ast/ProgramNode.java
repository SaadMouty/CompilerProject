package ast;

import java.util.List;

public class ProgramNode extends AstNode {
    public final List<ProductNode> products;

    public ProgramNode(int line, List<ProductNode> products) {
        super(line);
        this.products = products;
    }

    @Override
    public List<AstNode> children() {
        return List.copyOf(products);
    }
}
