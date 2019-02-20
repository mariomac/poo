
package poo.tema6.sets;

public class Main {
  public static void main(String[] args) {
    Alumno alumno = new Alumno();
    alumno.matricula(new Asignatura("POO", 6));
    alumno.matricula(new Asignatura("FO", 6));
    alumno.matricula(new Asignatura("Macramé", 4.5f));
    
    System.out.println("Total de créditos matriculados: "
            + alumno.getCreditosMatriculados());
  }
}
