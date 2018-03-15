package poo.coches.fabricante;

import poo.coches.admin.Matricula;

/**
 * Este estilo de clase se conoce como "Plain Old Java Object (POJO)".
 * Es una clase que no hace nada más que guardar datos relativos a un
 * coche
 */
public class Coche {
  private String marca;
  private Matricula matricula;
  private int numSerie;

  /**
   * El constructor es protected para que el coche solo se pueda
   * instanciar desde la fábrica, que está en el mismo paquete
   */
  protected Coche(String marca, Matricula matricula, int numSerie) {
    this.marca = marca;
    this.matricula = matricula;
    this.numSerie = numSerie;
  }

  // No queremos que se puedan modificar los atributos del coche,
  // así que, habiéndolos hecho privados, definimos los "getters"
  // para que sí se puedan leer
  
  public String getMarca() {
    return marca;
  }

  public Matricula getMatricula() {
    return matricula;
  }

  public int getNumSerie() {
    return numSerie;
  }
  public String toString() {
    return marca + " " + matricula
            + " nSerie: " + numSerie;
  }
}
