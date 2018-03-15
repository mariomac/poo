
package poo.coches.fabricante;

import poo.coches.admin.Gobierno;
import poo.coches.admin.Matricula;

public class Fabrica {
  private String marca;
  private int contadorCoches = 0;

  public Fabrica(String marca) {
    this.marca = marca;
  }
  
  /**
   * Fabrica un coche, pidiendo al gobierno una nueva matrícula.
   */
  public Coche fabricaCoche() {
    Matricula m = Gobierno.INSTANCIA.solicitaMatricula();
    int nSerie = contadorCoches;
    contadorCoches++;
    return new Coche(marca, m, nSerie);
  }
}
