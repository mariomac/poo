package poo.grafos;

public class Ciudad {

  private String nombre;

  public Ciudad(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  /**
   * IMPORTANTE! Para que hashmaps y hashsets funcionen bien, la clase Ciudad ha
   * de implementar equals() y hashCode()
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ciudad ciudad = (Ciudad) o;
    return nombre.equals(ciudad.nombre);
  }

  @Override
  public int hashCode() {
    return nombre.hashCode();
  }
}
