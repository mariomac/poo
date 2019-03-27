package poo.cestacompra;

public class Main {
  public static void main(String[] args) {
    CestaCompra cesta = new CestaCompra();
    cesta.añadir(new Producto(1, "Cerveza", 3));
    cesta.añadir(new Producto(3, "pan", 1.25f));
    cesta.añadir(new Producto(7, "carne", 3.45f));
    
    cesta.printTicket();
  }
}
