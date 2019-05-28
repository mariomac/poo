package poo.grafos.pendientes;

import poo.grafos.Ruta;

/**
 * La clase Cola implementa los métodos agregar y sacar de la superclase NodosPendientes
 * de tal manera que implementa una Cola: el primer elemento que se introduce
 * es el primer elemento que se saca (FIFO: First In, First Out).
 * <p>
 * Usada recorriendo el grafo de Posibles Rutas, nos permitirá recorrerlo en
 * amplitud (BFS, Breadth First Search)
 */
public class Cola extends NodosPendientes {
  @Override
  public void agregar(Ruta a) {
    elementos.add(a);
  }

  @Override
  public Ruta sacar() {
    return elementos.remove(0);
  }

}
