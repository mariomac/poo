
package ejemploherencia;

public class Peon extends Pieza {

  public Peon(char col, int fila) {
    super(col, fila);
  }
  
  public String toString() {
    return "Peon"+ super.toString();
  }
}
