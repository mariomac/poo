package poo.tema6.lists;

public class Main {

  public static void main(String[] args) {
    GestorTareas gt = new GestorTareas();
    gt.añadeNoPrioritaria(new Tarea("Sacar al perro"));
    gt.añadeNoPrioritaria(new Tarea("Comprar leche"));
    gt.añadePrioritaria(new Tarea("Estudiar POO"));
    gt.añadePrioritaria(new Tarea("Fregar el cuarto"));

    gt.marcaHecha(2);

    gt.muestraTareas();

    System.out.println("******** Limpiando tareas hechas");
    gt.limpiaHechas();
    gt.muestraTareas();
  }
}

