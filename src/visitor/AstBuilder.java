package visitor;

import antlr.*;
import ast.*;

import java.util.ArrayList;
import java.util.List;

public class AstBuilder extends ParserFileBaseVisitor<AstNode> {

    @Override
    public AstNode visitProgram(ParserFile.ProgramContext ctx) {
        List<ProductNode> products = new ArrayList<>();
        for (ParserFile.ProductContext p : ctx.products) {
            products.add((ProductNode) visit(p));
        }
        return new ProgramNode(ctx.getStart().getLine(), products);
    }

    @Override
    public AstNode visitProduct(ParserFile.ProductContext ctx) {
        List<FieldNode> fields = new ArrayList<>();
        for (ParserFile.FieldContext f : ctx.fields) {
            fields.add((FieldNode) visit(f));
        }
        return new ProductNode(ctx.getStart().getLine(), fields);
    }

    @Override
    public AstNode visitNameField(ParserFile.NameFieldContext ctx) {
        return new NameFieldNode(ctx.getStart().getLine(), stripQuotes(ctx.value.getText()));
    }

    @Override
    public AstNode visitImageField(ParserFile.ImageFieldContext ctx) {
        return new ImageFieldNode(ctx.getStart().getLine(), stripQuotes(ctx.value.getText()));
    }

    @Override
    public AstNode visitPriceField(ParserFile.PriceFieldContext ctx) {
        return new PriceFieldNode(ctx.getStart().getLine(), ctx.value.getText());
    }

    @Override
    public AstNode visitDetailsField(ParserFile.DetailsFieldContext ctx) {
        return new DetailsFieldNode(ctx.getStart().getLine(), stripQuotes(ctx.value.getText()));
    }

    private String stripQuotes(String s) {
        if (s != null && s.length() >= 2 && s.startsWith("\"") && s.endsWith("\"")) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }
}
