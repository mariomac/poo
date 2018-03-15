package poo.coches;

import poo.coches.fabricante.Coche;
import poo.coches.fabricante.Fabrica;

public class Main {
  public static void main(String[] args) {
    // Hemos de esperar que haya tres fábricas y éstas fabriquen
    // coches con diferentes números de serie para cada fábrica
    // (Pero dos coches de diferente fábrica pueden tener un
    // número de serie igual)
    // Cada coche deberá tener una matrícula distinta
    Fabrica f1 = new Fabrica("SEAT");
    Fabrica f2 = new Fabrica("Toyota");
    Fabrica f3 = new Fabrica("KIA");
    for(int i = 0 ; i < 10 ; i++) {
      Coche c = f1.fabricaCoche();
      System.out.println(c.toString());
      c = f2.fabricaCoche();
      System.out.println(c.toString());
      c = f3.fabricaCoche();
      System.out.println(c.toString());
    }
  }
}
