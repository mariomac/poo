
package ejpacman;

public class Coco {

  // Atributo de ejemplo para mostrar cómo se comportan los constructores
  // con las relaciones de herencia (no se heredan)
  private String color;
  
  public Coco(String color) {
    this.color = color;
  }

  public void ingesta(Pacman p) {
    System.out.println("Pacman se ha comido un coco de color " + color);
  }
}
