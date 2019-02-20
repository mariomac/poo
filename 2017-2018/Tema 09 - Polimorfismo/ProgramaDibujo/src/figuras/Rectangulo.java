package figuras;

import programadibujo.ProgramaDibujo;
import programadibujo.Lienzo;


public class Rectangulo extends Figura{
    private int x,y, ladoH, ladoV;

    public Rectangulo(int x, int y, int ladoH, int ladoV) {
        this.x = x;
        this.y = y;
        this.ladoH = ladoH;
        this.ladoV = ladoV;
    }
    
    
    public void dibuja() {
        Lienzo.INSTANCIA.getBuffer().setColor(color);        
        Lienzo.INSTANCIA.getBuffer().drawRect(x, y, ladoH, ladoV);
    }
    
}
