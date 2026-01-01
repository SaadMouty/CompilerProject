package symbol;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private final Map<String, ProductSymbol> table = new HashMap<>();

    public void define(ProductSymbol symbol) {
        table.put(symbol.name, symbol);
    }

    public void print() {
        // تعريف أطوال الأعمدة
        String format = "║ %-20s │ %-15s │ %-10s │ %-30s │ %-5s ║%n";
        String lineSeparator = "╟──────────────────────┼─────────────────┼────────────┼────────────────────────────────┼───────╢%n";
        String topBorder     = "╔══════════════════════╤═════════════════╤════════════╤════════════════════════════════╤═══════╗%n";
        String bottomBorder  = "╚══════════════════════╧═════════════════╧════════════╧════════════════════════════════╧═══════╝%n";

        System.out.println("\n=== SYMBOL TABLE OUTPUT ===");
        System.out.printf(topBorder);
        System.out.printf(format, "PRODUCT NAME", "IMAGE", "PRICE", "DETAILS", "LINE");
        System.out.printf(lineSeparator);

        for (ProductSymbol sym : table.values()) {
            System.out.printf(format,
                    truncate(sym.name, 20),      // قص الاسم إذا كان طويلاً
                    truncate(sym.image, 15),
                    truncate(sym.price, 10),
                    truncate(sym.details, 30),
                    sym.line
            );
        }
        System.out.printf(bottomBorder);
    }

    // دالة مساعدة لقص النصوص الطويلة وإضافة "..." في نهايتها للحفاظ على شكل الجدول
    private String truncate(String value, int width) {
        if (value == null) return "N/A";
        if (value.length() > width) {
            return value.substring(0, width - 3) + "...";
        }
        return value;
    }
}