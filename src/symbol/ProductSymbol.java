package symbol;

public class ProductSymbol {
    public final String name;
    public final String image;
    public final String price;
    public final String details;
    public final int line;

    public ProductSymbol(String name, String image, String price, String details, int line) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.details = details;
        this.line = line;
    }

    @Override
    public String toString() {
        return String.format("Product: %-10s | Price: %-10s | Line: %d", name, price, line);
    }
}