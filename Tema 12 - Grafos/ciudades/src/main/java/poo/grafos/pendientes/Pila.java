package poo.grafos.pendientes;


import poo.grafos.Ruta;

/*
 * La clase Pila implementa los métodos agregar y sacar de la superclase NodosPendientes
 * de tal manera que implementa una Pila: el último elemento que se introduce
 * es el primer elemento que se saca (LIFO: Last In, First Out).
 *
 * Usada recorriendo el grafo de posibles rutas, nos permitirá recorrerlo en
 * profundidad (DFS, Depth First Search)
 */
public class Pila extends NodosPendientes {

	@Override
	public void agregar(Ruta a) {
		elementos.add(a);
	}

	@Override
	public Ruta sacar() {
		return elementos.remove(elementos.size() - 1);
	}

}
