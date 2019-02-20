
package ejpacman;

public class CocoVenenoso extends Coco{

  public CocoVenenoso() {
    // Como la superclase Coco no tiene constructor por defecto,
    // debemos llamarlo explícitamente desde aquí.
    super("Caca");
  }

  @Override
  public void ingesta(Pacman p) {
    super.ingesta(p);
    p.matar();
  }
  

}
