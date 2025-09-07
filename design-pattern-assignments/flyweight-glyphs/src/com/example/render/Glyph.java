package com.example.render;

public class Glyph {
    // Smell: style stored per instance → not memory efficient
//    private final char ch;
//    private final String font;
//    private final int size;
//    private final boolean bold;
//
//    public Glyph(char ch, String font, int size, boolean bold) {
//        this.ch = ch; this.font = font; this.size = size; this.bold = bold;
//    }
//
//    public int drawCost() { return size + (bold ? 10 : 0); }
//    public char getCh() { return ch; }
//    public String getFont() { return font; }
//    public int getSize() { return size; }
//    public boolean isBold() { return bold; }


    private final char ch;              // extrinsic
    private final TextStyle style;      // intrinsic (shared)

    public Glyph(char ch, TextStyle style) {
        this.ch = ch;
        this.style = style;
    }

    public int drawCost() {
        return style.cost();
    }

    public char getCh() { return ch; }
    public TextStyle getStyle() { return style; }
}
