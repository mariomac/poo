package poo.coches;

import java.util.HashMap;
import java.util.Map;

public class Registro {
  private Map<String, Coche> multas = new HashMap<>();
  
  public void registrar(Coche c) {
    multas.put(c.getMatricula(), c);
  }
  
  public void pagar(String matricula) {
    Coche c = multas.get(matricula);
    if (c != null) {
      c.cancelarDeuda();
    } else {
      System.out.println("Matricula erronea");
    }
  }
  
  public void mostrarRegistro() {
    System.out.println("Registro completo:");
    for (Coche c : multas.values()) {
      System.out.println(c);
    }
  }
}
