
package poo.reproductor;

import java.util.Scanner;

// Clase que permite al usuario final interactuar con la lista de reproducción
public class InterfazUsuario {
  private static void muestraAyuda() {
    System.out.println("Comandos:");
    System.out.println("\tañadir <fichero>: añade un archivo MP3 a la lista");
    System.out.println("\ttocar: toca la canción actual");
    System.out.println("\tparar: deja de tocar");
    System.out.println("\tsiguiente: ir a la siguiente canción");
    System.out.println("\tlista: muestra la lista de reproducción");
  }
  
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Reproductor reproductor = new Reproductor();
    String comando;
    do {
      System.out.print("Comando> ");
      comando = teclado.nextLine();
      if ("tocar".equals(comando)) {
        reproductor.tocar();
      } else if ("parar".equals(comando)) {
        reproductor.parar();
      } else if ("siguiente".equals(comando)) {
        reproductor.siguiente();
      } else if ("lista".equals(comando)) {
        reproductor.imprimirLista();
      } else if (comando.startsWith("añadir")) {
        // Quitamos el "añadir " para quedarnos con la ruta del archivo
        String nombreArchivo = comando.substring("añadir ".length()).trim();
        Cancion c = new Cancion(nombreArchivo);
        reproductor.agregar(c);
      } else {
        System.out.println("Comando no reconocido!");
        muestraAyuda();
      }
    } while(!comando.equals("salir"));
  }
}
