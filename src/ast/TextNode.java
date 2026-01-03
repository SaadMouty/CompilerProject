package ast;

public class TextNode extends AstNode {
    private String textContent;

    public TextNode(String textContent, int lineNumber) {
        super("TEXT", lineNumber);
        this.textContent = textContent.trim();
    }

    @Override
    public String toString() {
        // طباعة محتوى النص (مختصر إذا كان طويلاً)
        String display = textContent.length() > 20 ? textContent.substring(0, 20) + "..." : textContent;
        return "Text Node [Line: " + lineNumber + "]: \"" + display + "\"";
    }
}