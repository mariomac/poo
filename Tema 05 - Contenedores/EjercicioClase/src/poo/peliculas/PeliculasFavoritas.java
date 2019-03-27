
package poo.peliculas;

import java.util.ArrayList;
import java.util.List;

public class PeliculasFavoritas {
  private List<Pelicula> peliculas = new ArrayList<>();
  
  public void añadir(int posicion, Pelicula p) {
    peliculas.add(posicion, p);
  }
  
  // añade al final
  public void añadir(Pelicula p) {
    peliculas.add(p);
  }
  
  public void muestra() {
    System.out.println("Las peliculas de más"
            + " a menos favoritas son:");
    int i = 1;
    for (Pelicula p : peliculas) {
      System.out.println(i + ": " + p);
      i++;
    }
  }
  
}
