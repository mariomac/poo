package poo.asignaturas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		PlanCarrera plan = new PlanCarreraRecursivo();
		generarDatosGrafo(plan);

		printPlanCarrera(plan.queCursar(new Asignatura("Sistemas 5G")));
	}

	static void generarDatosGrafo(PlanCarrera plan) {
		Asignatura fo = new Asignatura("Fonaments Ordinadors");
		Asignatura poo = new Asignatura("Programacio Orientada a Objectes");
		Asignatura mul = new Asignatura("Multimedia");
		Asignatura elec = new Asignatura("Electronica");
		Asignatura micro = new Asignatura("Microprocesadores");
		Asignatura arq = new Asignatura("Arquitectura de Computadores");
		Asignatura cal = new Asignatura("Calculo");
		Asignatura tra = new Asignatura("Tratamiento del Señal");
		Asignatura s5g = new Asignatura("Sistemas 5G");

		// nodos desde los cuales no puedo navegar a otros
		// conjunto de adyacentes vacío
		plan.creaConexiones(fo, new HashSet<>());
		plan.creaConexiones(cal, new HashSet<>());
		plan.creaConexiones(elec, new HashSet<>());


		plan.creaConexiones(poo, Arrays.asList(fo));
		plan.creaConexiones(mul, Arrays.asList(poo));

		plan.creaConexiones(micro, Arrays.asList(fo, elec));
		plan.creaConexiones(arq, Arrays.asList(micro));
		plan.creaConexiones(tra, Arrays.asList(cal));
		plan.creaConexiones(s5g, Arrays.asList(micro, tra));

	}

	static void printPlanCarrera(List<Asignatura> asigs) {
		for (Asignatura a : asigs) {
			System.out.println("* " + a.getNombre());
		}
	}
}
