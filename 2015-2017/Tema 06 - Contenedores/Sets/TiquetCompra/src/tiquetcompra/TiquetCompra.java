package tiquetcompra;

import java.util.HashSet;

public class TiquetCompra {
  private HashSet<Producto> items
           = new HashSet<>();
  
  public void añade(Producto p) {
    items.add(p);
  }
  public void imprime() {
    float total = 0;
    for(Producto p : items) {
      float precio = p.getPrecio()
              * p.getCantidad();
      System.out.println(
              p.getCantidad() +"\t"
              + p.getNombre() + "\t"
              + precio
      );
      total = total + precio;
    }
    System.out.println("-----------");
    System.out.println("Total: " + total);
  }
  
}
