package ejemploherencia;


public class Pieza {
  private char col;
  private int  fila;
  
  public Pieza(char col, int fila) {
    this.col = col;
    this.fila = fila;
  }
  
  public String toString() {
    return "("+col+","+fila+")";
  }
}
