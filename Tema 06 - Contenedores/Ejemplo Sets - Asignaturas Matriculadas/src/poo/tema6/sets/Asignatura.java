package poo.tema6.sets;

public class Asignatura {
  private String nombre;
  private float creditos;

  public Asignatura(String nombre, float creditos) {
    this.nombre = nombre;
    this.creditos = creditos;
  }

  public String getNombre() {
    return nombre;
  }

  public float getCreditos() {
    return creditos;
  }
  public String toString() {
    return nombre + ": " + creditos + " ECTS";
  }
}
