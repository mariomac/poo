package poo.asignaturas.pendientes;


import poo.asignaturas.Asignatura;

import java.util.LinkedList;
import java.util.List;

/**
 * La clase NodosPendientes es utilizada en el recorrido del grafo. Permite introducir
 * y sacar los nodos pendientes por recorrer.
 * <p>
 * Es una clase abstracta cuyas implementaciones se proveen en las clases
 * Cola y Pila.
 */
public abstract class NodosPendientes {

  protected List<Asignatura> elementos = new LinkedList<>();

  /**
   * Retorna cierto si el contenedor de elementos a visitar está vacío
   */
  public boolean isVacia() {
    return elementos.isEmpty();
  }

  /**
   * Introduce un elemento en el contenedor de asignaturas (nodos) pendientes por visitar
   */
  public abstract void introducir(Asignatura a);

  /**
   * Extrae y retorna la siguiente asignatura del grafo que tocaría visitar.
   */
  public abstract Asignatura sacar();

}
