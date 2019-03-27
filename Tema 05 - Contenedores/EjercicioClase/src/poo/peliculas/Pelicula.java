package poo.peliculas;

public class Pelicula {
  private String titulo;
  private int año;

  public Pelicula(String titulo, int año) {
    this.titulo = titulo;
    this.año = año;
  }
  
  public String toString() {
    return titulo + " (" + año + ")";
  }
}
