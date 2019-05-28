package poo.grafos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Guarda los datos de una ruta. Una lista de ciudades en orden que llevan de
 * una ciudad a otra.
 */
public class Ruta implements Iterable<Ciudad> {

  private List<Ciudad> ciudades = new LinkedList<>();

  /**
   * Añade una ciudad al final de la lista.
   */
  public void agrega(Ciudad c) {
    ciudades.add(c);
  }

  /**
   * Retorna la última ciudad de la ruta.
   */
  public Ciudad ultima() {
    return ciudades.get(ciudades.size() - 1);
  }

  /**
   * Elimina la ciudad al final de la lista.
   */
  public void elimina() {
    ciudades.remove(ciudades.size() - 1);
  }

  /**
   * Añade una ciudad al inicio de la lista.
   */
  public void agregaInicio(Ciudad c) {
    ciudades.add(0, c);
  }

  /**
   * Retorna true si la ruta ya contiene la ciudad que se pasa por argumento.
   */
  public boolean contiene(Ciudad c) {
    return ciudades.contains(c);
  }

  /**
   * Retorna un iterador a la lista de ciudades. Este método (implementación
   * de la interfaz Iterable) permitirá usar un objeto Ruta dentro de un foreach.
   */
  @Override
  public Iterator<Ciudad> iterator() {
    return ciudades.iterator();
  }


  /**
   * Retorna una copia de la ruta sobre la cual se llama a este método.
   */
  public Ruta clonar() {
    Ruta clon = new Ruta();
    clon.ciudades = new LinkedList<>(ciudades);
    return clon;
  }
}
