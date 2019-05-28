package poo.asignaturas.pendientes;

import poo.asignaturas.Asignatura;

/**
 * La clase Cola implementa los métodos introducir y sacar de la superclase NodosPendientes
 * de tal manera que implementa una Cola: el primer elemento que se introduce
 * es el primer elemento que se saca (FIFO: First In, First Out).
 * <p>
 * Usada recorriendo el grafo de PlanCarrera, nos permitirá recorrerlo en
 * amplitud (BFS, Breadth First Search)
 */
public class Cola extends NodosPendientes {
  @Override
  public void introducir(Asignatura a) {
    elementos.add(a);
  }

  @Override
  public Asignatura sacar() {
    return elementos.remove(0);
  }
}
