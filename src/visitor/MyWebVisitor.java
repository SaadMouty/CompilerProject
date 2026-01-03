package visitor;

import ast.*;
import antlr.ParserFile;
import antlr.ParserFileBaseVisitor;
import symboltable.SymbolTable;
import java.util.HashMap;
import java.util.Map;

public class MyWebVisitor extends ParserFileBaseVisitor<AstNode> {
    private SymbolTable symbolTable = new SymbolTable();

    @Override
    public AstNode visitFile(ParserFile.FileContext ctx) {
        RootNode root = new RootNode();
        if (ctx.elements() != null) {
            for (ParserFile.ElementContext elCtx : ctx.elements().element()) {
                AstNode child = visit(elCtx);
                if (child != null) root.addChild(child);
            }
        }
        return root;
    }

    // --- HTML Handling ---
    @Override
    public AstNode visitHtmlPairTag(ParserFile.HtmlPairTagContext ctx) {
        // نأخذ الاندكس 0 لأنه تاج الفتح
        String tagName = ctx.TAG_NAME(0).getText();
        int line = ctx.getStart().getLine();

        Map<String, String> attrs = new HashMap<>();
        for (ParserFile.AttributeContext attrCtx : ctx.attribute()) {
            if (attrCtx instanceof ParserFile.AttrStringContext) {
                ParserFile.AttrStringContext sAttr = (ParserFile.AttrStringContext) attrCtx;
                attrs.put(sAttr.ATTR_NAME().getText(), sAttr.ATTR_VALUE().getText());
            } else if (attrCtx instanceof ParserFile.AttrJinjaContext) {
                ParserFile.AttrJinjaContext jAttr = (ParserFile.AttrJinjaContext) attrCtx;
                attrs.put(jAttr.ATTR_NAME().getText(), "{{ dynamic }}");
            }
        }

        HtmlElementNode node = new HtmlElementNode(tagName, attrs, line);

        if (ctx.elements() != null) {
            for (ParserFile.ElementContext el : ctx.elements().element()) {
                AstNode child = visit(el);
                if (child != null) node.addChild(child);
            }
        }
        return node;
    }

    @Override
    public AstNode visitHtmlSelfClosingTag(ParserFile.HtmlSelfClosingTagContext ctx) {
        String tagName = ctx.TAG_NAME().getText();
        int line = ctx.getStart().getLine();
        Map<String, String> attrs = new HashMap<>();
        for (ParserFile.AttributeContext attrCtx : ctx.attribute()) {
            if (attrCtx instanceof ParserFile.AttrStringContext) {
                ParserFile.AttrStringContext sAttr = (ParserFile.AttrStringContext) attrCtx;
                attrs.put(sAttr.ATTR_NAME().getText(), sAttr.ATTR_VALUE().getText());
            }
        }
        return new HtmlElementNode(tagName, attrs, line);
    }

    // --- CSS Handling ---
    @Override
    public AstNode visitElementCss(ParserFile.ElementCssContext ctx) {
        return visit(ctx.cssBlock());
    }

    @Override
    public AstNode visitCssBlock(ParserFile.CssBlockContext ctx) {
        CssBlockNode cssNode = new CssBlockNode(ctx.getStart().getLine());

        // المرور على قواعد الـ CSS وإضافتها كأبناء (اختياري لتحسين الطباعة)
        for (ParserFile.CssRuleContext ruleCtx : ctx.cssRule()) {
            AstNode ruleNode = visit(ruleCtx);
            if (ruleNode != null) cssNode.addChild(ruleNode);
        }
        return cssNode;
    }

    @Override
    public AstNode visitCssRule(ParserFile.CssRuleContext ctx) {
        String selector = ctx.cssSelector().getText();
        return new CssRuleNode(selector, ctx.getStart().getLine());
    }

    // --- Jinja Logic Handling ---
    @Override
    public AstNode visitJinjaFor(ParserFile.JinjaForContext ctx) {
        String varName = ctx.ID().getText();
        String iterable = ctx.expression().getText();
        int line = ctx.getStart().getLine();

        symbolTable.addSymbol(varName, "LoopVariable", line);

        JinjaForNode forNode = new JinjaForNode(varName, iterable, line);
        if (ctx.elements() != null) {
            for (ParserFile.ElementContext el : ctx.elements().element()) {
                AstNode child = visit(el);
                if (child != null) forNode.addChild(child);
            }
        }
        return forNode;
    }

    @Override
    public AstNode visitJinjaIf(ParserFile.JinjaIfContext ctx) {
        String condition = ctx.expression().getText();
        int line = ctx.getStart().getLine();
        JinjaIfNode ifNode = new JinjaIfNode(condition, line);

        // معالجة بلوك if (الاندكس 0)
        if (ctx.elements(0) != null) {
            for (ParserFile.ElementContext el : ctx.elements(0).element()) {
                AstNode child = visit(el);
                if (child != null) ifNode.addChild(child);
            }
        }
        // معالجة بلوك else (الاندكس 1) إن وجد
        if (ctx.elements().size() > 1 && ctx.elements(1) != null) {
            // يمكن إنشاء عقدة فرعية للـ else أو إضافتها مباشرة
            // للتبسيط سنضيفها مباشرة
            for (ParserFile.ElementContext el : ctx.elements(1).element()) {
                AstNode child = visit(el);
                if (child != null) ifNode.addChild(child);
            }
        }
        return ifNode;
    }

    @Override
    public AstNode visitElementText(ParserFile.ElementTextContext ctx) {
        String text = ctx.getText();
        // تجاهل المسافات الفارغة تماماً لتنظيف شكل الشجرة
        if (text.trim().isEmpty()) return null;
        return new TextNode(text, ctx.getStart().getLine());
    }

    @Override
    public AstNode visitElementJinjaPrint(ParserFile.ElementJinjaPrintContext ctx) {
        return visit(ctx.jinjaPrint());
    }

    @Override
    public AstNode visitJinjaPrint(ParserFile.JinjaPrintContext ctx) {
        String expr = ctx.expression().getText();
        return new JinjaPrintNode(expr, ctx.getStart().getLine());
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}