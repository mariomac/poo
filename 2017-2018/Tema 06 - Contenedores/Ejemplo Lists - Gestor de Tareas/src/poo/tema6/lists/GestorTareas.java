
package poo.tema6.lists;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
  private List<Tarea> tareas = new ArrayList<>();
  
  public void marcaHecha(int pos) {
    tareas.get(pos).setHecha(true);
  }
  public void añadePrioritaria(Tarea t) {
    tareas.add(0, t);
  }
  public void añadeNoPrioritaria(Tarea t) {
    tareas.add(t);
  }
  public void limpiaHechas() {
    for(Tarea t : tareas) {
      if (t.isHecha()) {
        tareas.remove(t);
      }
    }
  }
  public void muestraTareas() {
    for(Tarea t : tareas) {
      System.out.println(t);
    }
  }
}
