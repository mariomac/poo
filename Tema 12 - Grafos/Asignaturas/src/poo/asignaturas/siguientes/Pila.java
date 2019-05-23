package poo.asignaturas.siguientes;

import poo.asignaturas.Asignatura;

/*
 * La clase Pila implementa los métodos introducir y sacar de la superclase Siguientes
 * de tal manera que implementa una Pila: el último elemento que se introduce
 * es el primer elemento que se saca (LIFO: Last In, First Out).
 *
 * Usada recorriendo el grafo de PlanCarrera, nos permitirá recorrerlo en
 * profundidad (DFS, Depth First Search)
 */
public class Pila extends Siguientes {

  @Override
  public void introducir(Asignatura a) {
    elementos.add(a);
  }

  @Override
  public Asignatura sacar() {
    return elementos.remove(elementos.size() - 1);
  }

}
