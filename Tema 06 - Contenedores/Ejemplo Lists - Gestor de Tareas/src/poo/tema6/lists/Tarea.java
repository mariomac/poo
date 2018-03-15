
package poo.tema6.lists;

public class Tarea {
  private String descripcion;
  private boolean hecha;

  public Tarea(String nombre) {
    this.descripcion = nombre;
    this.hecha = false;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String nombre) {
    this.descripcion = nombre;
  }

  public boolean isHecha() {
    return hecha;
  }

  public void setHecha(boolean hecha) {
    this.hecha = hecha;
  }
  
  public String toString() {
    String cad;
    if(hecha) {
      cad = "(V) ";
    } else {
      cad = "    ";
    }
    return cad + descripcion;
  }
  
}
