package poo.asignaturas;

import poo.asignaturas.siguientes.Cola;
import poo.asignaturas.siguientes.Pila;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Asignatura quieroCursar = new Asignatura("Sistemas 5G");
    System.out.println("Qué asignaturas necesito cursar antes de '"+quieroCursar.getNombre()+"'?");

    System.out.println("- Resultados recorriendo el grafo por amplitud (BFS)");
    PlanCarrera bfs = new PlanCarreraIterativo(new Cola());
    generarDatosGrafo(bfs);
    printPlanCarrera(bfs.queCursar(quieroCursar));

    System.out.println("- Resultados recorriendo el grafo por profundidad (DFS)");
    PlanCarrera dfs = new PlanCarreraIterativo(new Pila());
    generarDatosGrafo(dfs);
    printPlanCarrera(dfs.queCursar(quieroCursar));

    System.out.println("- Resultados recorriendo el grafo por profundiad de manera recursiva");
    PlanCarrera rec = new PlanCarreraRecursivo();
    generarDatosGrafo(rec);
    printPlanCarrera(rec.queCursar(quieroCursar));
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
      System.out.println("\t* " + a.getNombre());
    }
  }
}
