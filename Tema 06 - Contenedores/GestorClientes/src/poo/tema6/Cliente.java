package poo.tema6;

// POJO: Plain-Old Java Object
// Simplemente guarda los datos de un cliente.
public class Cliente {

  private String nif, nombre;
  private double deuda;

  public Cliente(String nif, String nombre,
          double deuda) {
    this.nif = nif;
    this.nombre = nombre;
    this.deuda = deuda;
  }

  public double getDeuda() {
    return deuda;
  }
  public void setDeuda(double deuda) {
    this.deuda = deuda;
  }

  public String getNif() {
    return nif;
  }

  public String getNombre() {
    return nombre;
  }
  
  public String toString() {
    return "(NIF: "+ nif + ") " + nombre
            + ". Deuda: " + deuda;
  }
  
}
