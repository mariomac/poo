package primerejemplo;

import info.macias.Ventana;
import java.awt.Color;

public class PrimerEjemplo {
  public static void main(String[] args) {
    Ventana v = new Ventana("Ejemplo");
    Pelota p1 = new Pelota();
    p1.ox = 0; p1.oy = 5;
    p1.r = 1;
    
    Pelota p2 = new Pelota();
    p2.ox = 5; p2.oy = 7;
    p2.r = 2;
    
    while (!v.isPulsadoEscape()) {
      v.dibujaCirculo(11, 7, 3, Color.yellow);
      p1.caer();
      p1.dibujarEn(v);
      p2.caer();
      p2.dibujarEn(v);
      v.actualizaFotograma();
    }
    
    v.cerrar();
  }  
}
