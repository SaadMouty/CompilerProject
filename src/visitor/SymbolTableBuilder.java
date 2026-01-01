package visitor;

import ast.*;
import symbol.ProductSymbol;
import symbol.SymbolTable;

public class SymbolTableBuilder {

    private final SymbolTable table = new SymbolTable();

    public SymbolTable build(ProgramNode program) {
        for (ProductNode product : program.products) {
            ProductSymbol sym = toSymbol(product);
            if (sym != null && sym.name != null) {
                table.define(sym);
            }
        }
        return table;
    }

    private ProductSymbol toSymbol(ProductNode product) {
        String name = null, image = null, price = null, details = null;

        for (FieldNode f : product.fields) {
            if (f instanceof NameFieldNode) name = f.value;
            else if (f instanceof ImageFieldNode) image = f.value;
            else if (f instanceof PriceFieldNode) price = f.value;
            else if (f instanceof DetailsFieldNode) details = f.value;
        }

        return new ProductSymbol(name, image, price, details, product.line);
    }
}
