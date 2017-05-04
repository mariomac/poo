package figuras;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import programadibujo.ProgramaDibujo;
import programadibujo.Lienzo;


public abstract class Figura {
    protected int grosor = 3;
    protected Color color = Color.black;
    
    public Figura() {
        ((Graphics2D)Lienzo.INSTANCIA.getBuffer()).setStroke(new BasicStroke(grosor));        
    }
    
    public abstract void dibuja();
}
