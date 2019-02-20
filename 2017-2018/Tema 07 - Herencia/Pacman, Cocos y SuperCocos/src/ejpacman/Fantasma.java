
package ejpacman;

public class Fantasma {
  private final String nombre;

  // Este atributo muestra la relación de asociación con Pacman
  private final Pacman pacman;
  
  // Como Pacman solo habrá uno, habrá que pasarlo mediante el constructor
  public Fantasma(String nombre, Pacman pacman) {
    this.pacman = pacman;
    this.nombre = nombre;
  }
  private boolean vestido = true;

  // El resultado de este método será diferente según el estado de Pacman
  // y el estado del propio Fantasma
  public void mueve() {
    if (vestido) {
      if (pacman.isPoderoso()) {
        System.out.println(nombre + " huye de Pacman!");
      } else {
        System.out.println(nombre + " persigue a Pacman");
      }
    } else {
      System.out.println(nombre + " se va a por una sábana");
    }
  }

  // El resultado de este método será diferente según el estado de Pacman
  // y el estado del propio Fantasma
  public void colisiona() {
    if (vestido) {
      if (pacman.isPoderoso()) {
        System.out.println(nombre + " pierde su ropa!");
        vestido = false;
      } else {
        pacman.matar();
      }
    }
  }
}
