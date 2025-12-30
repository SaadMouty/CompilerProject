package symbol;

public class ProductSymbol {
    public final String name;
    public final String image;
    public final String price;   // خليه String الآن (أو double لاحقًا)
    public final String details;
    public final int lineDeclared;

    public ProductSymbol(String name, String image, String price, String details, int lineDeclared) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.details = details;
        this.lineDeclared = lineDeclared;
    }

    @Override
    public String toString() {
        return "ProductSymbol{name='" + name + "', price=" + price + ", image='" + image
                + "', details='" + details + "', line=" + lineDeclared + "}";
    }
}
