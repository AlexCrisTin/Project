package com.mycompany.app.EX_Tuan_3.Code_1;

public class Gly {
    public class RoundGlyph extends Gly{
        int radius ;
    
        //set radius
        public RoundGlyph(int r){
            this.radius = r;
    
    
        }
        public void draw (){
            System.out.println("Round Glyph draw method "+ this.radius);
        }
        
    }
    public static void main(String[] args) {
        Gly print = new Gly();
        RoundGlyph roundGlyph = print.new RoundGlyph(10); 
        roundGlyph.draw();
    }
}
