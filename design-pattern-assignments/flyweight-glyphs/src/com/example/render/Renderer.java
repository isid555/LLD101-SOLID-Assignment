package com.example.render;

public class Renderer {
    private final TextStyleFactory factory = new TextStyleFactory();

    public int render(String text) {
//        int cost = 0;
//        for (char c : text.toCharArray()) {
//            Glyph g = new Glyph(c, "Inter", 14, (c % 7 == 0)); // TODO: refactor with TextStyle flyweights
//            cost += g.drawCost();
//        }
//        return cost;


        int cost = 0;
        for (char c : text.toCharArray()) {
            boolean bold = (c % 7 == 0);
            TextStyle style = factory.get("Inter", 14, bold);
            Glyph g = new Glyph(c, style);
            cost += g.drawCost();
        }
        return cost;
    }
}
