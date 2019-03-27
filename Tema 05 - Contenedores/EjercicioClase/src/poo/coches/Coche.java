package poo.coches;

public class Coche {
  private String matricula;
  private String modelo;
  private double deuda;

  public Coche(String matricula, String modelo,
          double deuda) {
    this.matricula = matricula;
    this.modelo = modelo;
    this.deuda = deuda;
  }

  public String getMatricula() {
    return matricula;
  }
  
  public void añadirDeuda(double cantidad) {
    deuda = deuda + cantidad;
  }
  
  public void cancelarDeuda() {
    deuda = 0;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(matricula);
    sb.append(" - ").append(modelo);
    if (deuda > 0) {
      sb.append(". Deuda: ").append(deuda);
    } else {
      sb.append(". Sin deudas");
    }
    return sb.toString();
  }
  
}
