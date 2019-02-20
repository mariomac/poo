package ejpacman;

public class Ejpacman {

  public static void main(String[] args) {
    Pacman p = new Pacman();
    Coco c = new Coco("rojo");
    
    CocoDelPoder cp = new CocoDelPoder();
    
    Fantasma f1 = new Fantasma("Manuel", p);
    Fantasma f2 = new Fantasma("Laia", p);   

    c.ingesta(p);
    f1.mueve();
    f2.mueve();

    cp.ingesta(p);    
    f1.mueve();
    f2.mueve();

    f1.colisiona();
    f1.mueve();
    f2.mueve();
    
    CocoVenenoso cv = new CocoVenenoso();
    cv.ingesta(p);
  }
  
}
