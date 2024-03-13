package com.mycompany.app.EX_Tuan_3.Code_1;

public class GlyphTest {
    public abstract class Glyph {
        abstract void draw();  //method abstract
        Glyph(){
            System.out.println("before draw()");
            draw();
            System.out.println("after draw()");
        }
    }
}
