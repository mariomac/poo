package poo.asignaturas;

import java.util.*;

/**
 * PlanCarrera representa un grafo de dependencias entre asignaturas. Es una
 * clase abstracta, y deja a sus subclases la responsabilidad de recorrer
 * el grafo.
 * <p>
 * Las subclases son PlanCarreraIterativo y PlanCarreraRecursivo
 */
public abstract class PlanCarrera {

  // Grafo de conexiones
  // - clave: una asignatura
  // - valor: las asignaturas que se deben cursar antes de la asignatura clave
  protected Map<Asignatura, Set<Asignatura>> grafo = new HashMap<>();

  // establece las conexiones desde una asignatura origen a un conjunto de
  // asignaturas adyacentes. Esto significará que para cursar la asignatura
  // origen, primero habría que cursar todas las asignaturas adyacentes.
  public void creaConexiones(Asignatura origen,
                             Collection<Asignatura> adyacentes) {
    grafo.put(origen, new HashSet<>(adyacentes));
  }

  /**
   * Retorna la lista de asignaturas que deberían estudiarse antes de estudiar la asignatura
   * que se pasa como argumento.
   * <p>
   * Mirar las clases PlanCarreraIterativo y PlanCarreraRecursivo para ver las diferentes
   * implementaciones del algoritmo de recorrido de grafos.
   */
  public abstract List<Asignatura> queCursar(Asignatura a);
}
