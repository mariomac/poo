package poo.asignaturas;

import java.util.Objects;

/**
 * La clase asignatura representa un nodo en el grafo del plan de carrera.
 */
public class Asignatura {
	private String nombre;

	public Asignatura(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	/**
	 * Para poder usar la Asignatura como clave de un mapa, debemos
	 * implementar los métodos hashCode y equals
	 */
	@Override
	public int hashCode() {
		return nombre.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Asignatura other = (Asignatura) obj;
		if (!Objects.equals(this.nombre, other.nombre)) {
			return false;
		}
		return true;
	}

}
