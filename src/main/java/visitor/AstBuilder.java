package visitor;

import ast.*;
import parser.*;
import parser.*;

import java.util.ArrayList;
import java.util.List;

public class AstBuilder extends parser.ProductParserBaseVisitor<AstNode> {

    @Override
    public AstNode visitProgram(parser.ProductParser.ProgramContext ctx) {
        List<ProductNode> products = new ArrayList<>();
        for (parser.ProductParser.ProductContext p : ctx.products) {
            products.add((ProductNode) visit(p));
        }
        return new ProgramNode(ctx.getStart().getLine(), products);
    }

    @Override
    public AstNode visitProduct(parser.ProductParser.ProductContext ctx) {
        List<FieldNode> fields = new ArrayList<>();
        for (parser.ProductParser.FieldContext f : ctx.fields) {
            fields.add((FieldNode) visit(f));
        }
        return new ProductNode(ctx.getStart().getLine(), fields);
    }

    @Override
    public AstNode visitNameField(parser.ProductParser.NameFieldContext ctx) {
        return new NameFieldNode(ctx.getStart().getLine(), stripQuotes(ctx.value.getText()));
    }

    @Override
    public AstNode visitImageField(parser.ProductParser.ImageFieldContext ctx) {
        return new ImageFieldNode(ctx.getStart().getLine(), stripQuotes(ctx.value.getText()));
    }

    @Override
    public AstNode visitPriceField(parser.ProductParser.PriceFieldContext ctx) {
        return new PriceFieldNode(ctx.getStart().getLine(), ctx.value.getText());
    }

    @Override
    public AstNode visitDetailsField(parser.ProductParser.DetailsFieldContext ctx) {
        return new DetailsFieldNode(ctx.getStart().getLine(), stripQuotes(ctx.value.getText()));
    }

    private String stripQuotes(String s) {
        if (s != null && s.length() >= 2 && s.startsWith("\"") && s.endsWith("\"")) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }
}
