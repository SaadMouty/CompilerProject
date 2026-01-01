package ast;

import java.util.Collections;
import java.util.List;

public abstract class AstNode {
    public final int line;

    protected AstNode(int line) {
        this.line = line;
    }

    public List<AstNode> children() {
        return Collections.emptyList();
    }
}
