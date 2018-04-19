package figuras;


import programadibujo.Lienzo;


public class Circulo extends Figura {
    private int ox, oy;
    private int radio;

    public Circulo(int ox, int oy, int radio) {
        this.ox = ox;
        this.oy = oy;
        this.radio = radio;
    }

    public void dibuja() {
        Lienzo.INSTANCIA.
                getBuffer().setColor(color);        
        Lienzo.INSTANCIA.getBuffer().drawOval(ox, oy, radio, radio);
    }
    
    
    
}
