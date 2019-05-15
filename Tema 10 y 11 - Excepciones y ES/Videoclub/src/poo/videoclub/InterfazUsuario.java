package poo.videoclub;

import poo.videoclub.excepciones.ComandoInexistenteException;
import java.util.List;
import java.util.Scanner;

public class InterfazUsuario {
  private Controlador catalogo = new Controlador();
  private Scanner teclado = new Scanner(System.in);
  
  public void inicializar() {
    catalogo.cargar();
  }
  
  public void buscar(String titulo) {
    List<Pelicula> pelis = catalogo.buscar(titulo);
    if (pelis.size() == 0) {
      System.out.println("No se han encontrado peliculas");
    } else {
      System.out.println("-- Películas encontradas");
      for(Pelicula p : pelis) {
        System.out.println(p);
      }
    } 
  }
  
  // si retorna false, el programa acaba
  public boolean leeComando()
          throws ComandoInexistenteException {
    System.out.print("comando: ");
    String comando = teclado.nextLine();
    switch(comando) {
      case "buscar":
        System.out.print("titulo? ");
        String titulo = teclado.nextLine();
        buscar(titulo);
        break;
      case "salir":
        return false;
      default:
        throw new ComandoInexistenteException();
    }
    return true;
  }
}
