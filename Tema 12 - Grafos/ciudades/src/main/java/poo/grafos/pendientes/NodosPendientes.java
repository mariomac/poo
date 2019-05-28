package poo.grafos.pendientes;


import poo.grafos.Ruta;

import java.util.LinkedList;
import java.util.List;

/**
 * La clase NodosPendientes es utilizada en el recorrido del grafo. Permite agregar
 * y sacar los nodos pendientes por recorrer.
 *
 * En este caso, los nodos no son los nodos propiamente del grafo (ciudades), sino
 * la ruta entera hasta la ciudad en cuestión.
 *
 * Es una clase abstracta cuyas implementaciones se proveen en las clases
 * Cola y Pila.
 */
public abstract class NodosPendientes {

  protected List<Ruta> elementos = new LinkedList<>();

  /**
   * Retorna cierto si el contenedor de elementos a visitar está vacío
   */
  public boolean isVacia() {
    return elementos.isEmpty();
  }

  /**
   * Introduce un elemento en el contenedor de rutas (nodos) pendientes por visitar
   */
  public abstract void agregar(Ruta a);

  /**
   * Extrae y retorna la siguiente ruta del grafo que tocaría visitar.
   */
  public abstract Ruta sacar();

}
