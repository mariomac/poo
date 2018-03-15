package ejemplosets;

public class Equipo {
  private String nombre;
  private String siglas;
  
  public Equipo(String nombre,
                String siglas) {
    this.nombre = nombre;
    this.siglas = siglas;
  }

  public String getNombre() {
    return nombre;
  }

  public String getSiglas() {
    return siglas;
  }
  
  public String toString() {
    return nombre + " (" + siglas + ")";
  }
}






