package poo.asignaturas;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación recursiva de la búsqueda del plan de carrera. Ésta será una búsqueda
 * en profundidad (depth first search), ya que las llamadas a funciones funcionan como
 * una pila.
 */
public class PlanCarreraRecursivo extends PlanCarrera {
  private List<Asignatura> visitados = new ArrayList<>();

  /**
   * Funcionamiento del algoritmo recursivo:
   * Si la asignatura "a" no tiene nodos adyacentes, retornar una lista vacía
   * (es decir, no se necesita estudiar ninguna asignatura antes).
   * Si no, para cada nodo adyacente que no hayamos visitado ya, invocamos a
   * queCursar y añadimos a la lista de asignaturas requeridas de "a" las
   * asignaturas requeridas para cursar la propia adyacente.
   */
  @Override
  public List<Asignatura> queCursar(Asignatura a) {
    List<Asignatura> requeridas = new ArrayList<>();

    for (Asignatura adyacente : grafo.get(a)) {
      if (!visitados.contains(adyacente)) {
        visitados.add(adyacente);
        requeridas.add(adyacente);
        requeridas.addAll(queCursar(adyacente));
      }
    }
    return requeridas;
  }


}
