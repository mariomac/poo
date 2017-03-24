package tiquetcompra;

public class MainClass {

  public static void main(String[] args) {
    TiquetCompra compra = new TiquetCompra();
    
    compra.añade(
      new Producto("Cola", 0.75f, 3));
    compra.añade(
      new Producto("Servilletas", 1.45f, 1));
    compra.añade(
      new Producto("Cerveza", 0.79f, 12));
    compra.añade(
      new Producto("Quicos", 0.45f, 4));
    
    compra.imprime();
  }
  
}
