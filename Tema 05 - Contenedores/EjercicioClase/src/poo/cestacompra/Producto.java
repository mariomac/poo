package poo.cestacompra;

public class Producto {
  private int codigo;
  private String nombre;
  private float precio;

  public Producto(int codigo, String nombre, float precio) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.precio = precio;
  }
  
  public float getPrecio() {
    return precio;
  }
  
  public String toString() {
    return nombre + " (cod: " + codigo + ") "
        + precio + "€";
  }
}
