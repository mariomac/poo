
package ejpacman;

public class Pacman {
  private boolean poderoso = false;

  public boolean isPoderoso() {
    return poderoso;
  }

  public void setPoderoso(boolean poderoso) {
    this.poderoso = poderoso;
  }
  
  public void matar() {
    System.out.println("Pacman muere!!!");
  }
}
