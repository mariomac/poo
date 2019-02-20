package ejpacman;

public class CocoDelPoder extends Coco {
  
  public CocoDelPoder() {
    // Como la superclase Coco no tiene constructor por defecto,
    // debemos llamarlo explícitamente desde aquí.
    super("Azul");
  }
    
  public void ingesta(Pacman p) {
    super.ingesta(p);
    System.out.println("Pacman se ha vuelto poderoso!!");
    p.setPoderoso(true);
  }  
}
