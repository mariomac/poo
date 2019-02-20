package poo.reproductor;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona la lista de reproducción de un reproductor de música
 * @author mmacias
 */
public class Reproductor {
  // Lista donde guardamos las canciones
  private List<Cancion> lista = new ArrayList<>();
  
  // El índice en la lista de la canción que se está tocando, o se va a tocar
  private int cancionActual = 0;
  
  // Guarda el estado del reproductor: sonando o parado
  private boolean estaSonando = false;
  
  // Añade una canción al final de la lista
  public void agregar(Cancion c) {
    lista.add(c);
  }
  
  // Imprime la lista de reproducción, marcando la canción que va a sonar
  public void imprimirLista() {
    int nc = 0;
    for(Cancion c : lista) {
      if( nc == cancionActual) {
        System.out.print("--> "); // esta flecha indica la canción actual
      }
      System.out.println(c);
      nc++;
    }
  }
  // Toca la canción actual, siempre que no esté fuera de los
  // límites de la lista
  public void tocar() {
    if (cancionActual >= 0 && cancionActual < lista.size()) {
      lista.get(cancionActual).tocar();
      estaSonando = true;
    }
  }
  // Para la canción actual, siempre que no esté fuera de los límites
  // de la lista
  public void parar() {
    if (cancionActual >= 0 && cancionActual < lista.size()) {
      lista.get(cancionActual).parar();
      estaSonando = false;
    }
  }
  // Pasamos a la siguiente canción, o a la primera si hemos llegado al final
  // de la lista. Además, si hay alguna canción sonando, para la canción
  // actual y empieza a tocar la siguiente
  public void siguiente() {
    boolean estabaSonando = estaSonando;
    parar();
    cancionActual = (cancionActual + 1) % lista.size();
    
    if (estabaSonando) {
      // Tocamos la siguiente canción, si había alguna sonando.
      tocar();
    }
  }
}
