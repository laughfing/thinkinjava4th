package polymorphism;

class Glyph {
    void draw(){System.out.println("Glyph.draw()");}
    Glyph(){
        System.out.println("Glyph() before draw()");
        
        System.out.println("Glyph() after draw()");
    }
}

public class PolyConstructor {
    
}