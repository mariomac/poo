
package ejemploherencia;

public class Alfil extends Pieza {
  
  public Alfil(char col, int fila) {
    super(col, fila);
  }
  
  public String toString() {
    return "Alfil"+ super.toString();
  }
}
