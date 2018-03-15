/*------------------------------------------------------------------------------
 * Este código está distribuido bajo una licencia del tipo BEER-WARE.
 * -----------------------------------------------------------------------------
 * Mario Macías Lloret escribió este archivo. Teniendo esto en cuenta,
 * puedes hacer lo que quieras con él: modificarlo, redistribuirlo, venderlo,
 * etc, aunque siempre deberás indicar la autoría original en tu código.
 * Además, si algún día nos encontramos por la calle y piensas que este código
 * te ha sido de utilidad, estás obligado a invitarme a una cerveza (a ser
 * posible, de las buenas) como recompensa por mi contribución.
 * -----------------------------------------------------------------------------
 */
package moo.contenedores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // la clase Scanner lee líneas que se introducen por teclado (System.in)
        Scanner scanner = new Scanner(System.in);
        ReproductorMP3 reproductor = new ReproductorMP3();
        String comando;
        do {
            System.out.print("Comando: ");
            comando = scanner.nextLine();
            if(comando.startsWith("ayuda")) {
                System.out.println("COMANDOS DISPONIBLES");
                System.out.println("\t - añadir \"ruta del fichero MP3 a añadir, entre comillas\"");
                System.out.println("\t - tocar");
                System.out.println("\t - parar");
                System.out.println("\t - siguiente");
                System.out.println("\t - lista");
                System.out.println("\t - salir");
            } else if(comando.startsWith("añadir")) {                
                String nombreDeFichero = comando.split("\"")[1];               
                reproductor.agregarCancion(new Cancion(nombreDeFichero));
            } else if(comando.startsWith("tocar")) {
                reproductor.tocar();
            } else if(comando.startsWith("parar")) {
                reproductor.parar();
            } else if(comando.startsWith("siguiente")) {
                reproductor.siguienteCancion();
            } else if(comando.startsWith("lista")) {
                System.out.println(reproductor.toString());
            } else if(!comando.startsWith("salir")){
                System.out.println("Error! Comando no reconocido.");
                System.out.println("(Escribe 'ayuda' para ver opciones)");
            }
        } while(!comando.startsWith("salir"));
        reproductor.parar();
    }
}
