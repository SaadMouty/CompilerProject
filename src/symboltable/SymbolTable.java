package symboltable;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    // تخزين الرمز مع معلوماته (النوع، القيمة، أو مجرد وجوده)
    private Map<String, SymbolInfo> symbols = new HashMap<>();

    public void addSymbol(String name, String type, int line) {
        symbols.put(name, new SymbolInfo(name, type, line));
    }

    public boolean exists(String name) {
        return symbols.containsKey(name);
    }

    public void printTable() {
        System.out.println("\n--- Symbol Table ---");
        System.out.printf("%-15s | %-10s | %-5s\n", "Name", "Type", "Line");
        symbols.values().forEach(s ->
                System.out.printf("%-15s | %-10s | %-5s\n", s.name, s.type, s.line));
    }

    private static class SymbolInfo {
        String name, type;
        int line;
        SymbolInfo(String n, String t, int l) { name = n; type = t; line = l; }
    }
}