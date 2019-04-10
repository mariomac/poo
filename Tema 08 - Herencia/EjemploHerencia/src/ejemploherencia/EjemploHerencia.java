package ejemploherencia;

import java.util.ArrayList;
import java.util.List;

public class EjemploHerencia {

  public static void main(String[] args) {
    List<Pieza> piezas = new ArrayList<>();
    char col = 'A';
    for (int i = 1; i <= 4; i++) {
      Pieza p = new Pieza(col, i);
      col++;
      piezas.add(p);
    }
    
    Alfil a = new Alfil('H', 6);
    piezas.add(a);
    Peon pe = new Peon('F', 3);
    piezas.add(pe);
    
    System.out.println("Todas las piezas:");
    for(Pieza p : piezas) {
      System.out.println(p);
    }
  }
}
