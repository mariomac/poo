package poo.tema6.sets;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
  private Set<Asignatura> matriculaciones = new HashSet<>();
  
  public void matricula(Asignatura a) {
    matriculaciones.add(a);
  }
  
  public float getCreditosMatriculados() {
    float total = 0;
    for(Asignatura a : matriculaciones) {
      total = total + a.getCreditos();
    }
    return total;
  }
  
}
