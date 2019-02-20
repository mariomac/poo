
package primerejemplo;

import info.macias.Ventana;
import java.awt.Color;

public class Pelota {
  // atributos
  double ox, oy; // centro de gravedad
  double r;      // radio
  double vy;     // velocidad vertical
  
  void caer() {
    oy = oy + vy;
    if (oy <= r) {
      rebotar();
    } else {
      vy = vy - 0.1;
    }
  }
  
  void rebotar() {
    vy = vy * -0.9;
  }
  
  void dibujarEn(Ventana v) {
    v.dibujaCirculo(ox, oy, r, Color.blue);
  }
}
