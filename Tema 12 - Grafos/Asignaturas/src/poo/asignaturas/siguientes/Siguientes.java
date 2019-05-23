package poo.asignaturas.siguientes;


import poo.asignaturas.Asignatura;

import java.util.LinkedList;
import java.util.List;

/**
 * La clase Siguientes es utilizada en el recorrido del grafo. Permite introducir
 * y sacar los siguientes nodos que se van a recorrer.
 * <p>
 * Es una clase abstracta cuyas implementaciones se proveen en las clases
 * Cola y Pila.
 */
public abstract class Siguientes {

  protected List<Asignatura> elementos = new LinkedList<>();

  /**
   * Retorna cierto si el contenedor de elementos a visitar está vacío
   */
  public boolean isVacia() {
    return elementos.isEmpty();
  }

  /**
   * Introduce un elemento en el contenedor de Siguientes asignaturas a visitar
   */
  public abstract void introducir(Asignatura a);

  /**
   * Extray y retorna la siguiente asignatura del grafo que tocaría visitar.
   */
  public abstract Asignatura sacar();

}
