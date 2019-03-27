
package poo.cestacompra;

import java.util.HashSet;
import java.util.Set;

public class CestaCompra {
  private Set<Producto> productos = new HashSet<>();
  
  public void añadir(Producto p) {
    productos.add(p);
  }
  
  public void printTicket() {
    float total = 0;
    for (Producto p : productos) {
      System.out.println(p.toString());
      total = total + p.getPrecio();
    }
    System.out.println("Total: " + total + "€");
  }
}
