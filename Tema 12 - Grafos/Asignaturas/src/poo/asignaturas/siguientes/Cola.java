package poo.asignaturas.siguientes;

import poo.asignaturas.Asignatura;
import poo.asignaturas.siguientes.Siguientes;

import java.util.LinkedList;
import java.util.List;

/**
 * La clase Cola implementa los métodos introducir y sacar de la superclase Siguientes
 * de tal manera que implementa una Cola: el primer elemento que se introduce
 * es el primer elemento que se saca (FIFO: First In, First Out).
 *
 * Usada recorriendo el grafo de PlanCarrera, nos permitirá recorrerlo en
 * amplitud (BFS, Breadth First Search)
 */
public class Cola extends Siguientes {
	@Override
	public void introducir(Asignatura a) {
		elementos.add(a);
	}

	@Override
	public Asignatura sacar() {
		return elementos.remove(0);
	}
}
