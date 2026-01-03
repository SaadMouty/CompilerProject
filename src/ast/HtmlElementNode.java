package ast;

import java.util.Map;

public class HtmlElementNode extends AstNode {
    private String tagName;
    private Map<String, String> attributes; // لتخزين الخصائص مثل src, class

    public HtmlElementNode(String tagName, Map<String, String> attributes, int lineNumber) {
        super("HTML_TAG", lineNumber);
        this.tagName = tagName;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder attrs = new StringBuilder();
        if (attributes != null && !attributes.isEmpty()) {
            attrs.append(" Attributes: ").append(attributes.toString());
        }
        return "HTML Element <" + tagName + "> [Line: " + lineNumber + "]" + attrs;
    }
}