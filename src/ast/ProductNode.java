package ast;

import java.util.List;

public class ProductNode extends AstNode {
    public final List<FieldNode> fields;

    public ProductNode(int line, List<FieldNode> fields) {
        super(line);
        this.fields = fields;
    }

    @Override
    public List<AstNode> children() {
        return List.copyOf(fields);
    }
}