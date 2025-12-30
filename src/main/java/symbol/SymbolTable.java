package symbol;

import java.util.*;

public class SymbolTable {
    // المفتاح: اسم المنتج
    private final Map<String, ProductSymbol> productsByName = new LinkedHashMap<>();

    // add / define
    public void define(ProductSymbol symbol) {
        productsByName.put(symbol.name, symbol);
    }

    // lookup
    public ProductSymbol lookup(String name) {
        return productsByName.get(name);
    }

    public boolean exists(String name) {
        return productsByName.containsKey(name);
    }

    public List<ProductSymbol> all() {
        return new ArrayList<>(productsByName.values());
    }

    // optional delete feature
    public boolean remove(String name) {
        return productsByName.remove(name) != null;
    }

    public void print() {
        System.out.println("=== SYMBOL TABLE (Products) ===");
        if (productsByName.isEmpty()) {
            System.out.println("(empty)");
            return;
        }
        for (ProductSymbol s : productsByName.values()) {
            System.out.println("- " + s);
        }
    }
}
