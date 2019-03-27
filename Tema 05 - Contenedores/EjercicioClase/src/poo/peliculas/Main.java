
package poo.peliculas;

public class Main {
  public static void main(String[] args) {
    PeliculasFavoritas pelis = new PeliculasFavoritas();
    
    pelis.añadir(new Pelicula(
            "La bella y la bestia", 1994));
    pelis.añadir(new Pelicula(
            "Los increibles", 2004));
    pelis.añadir(0, new Pelicula(
            "Ben-Hur", 1955));
    
    pelis.muestra();
    
  }
}
