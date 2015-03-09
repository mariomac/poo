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
        Scanner scanner = new Scanner(System.in);
        ReproductorMP3 reproductor = new ReproductorMP3();
        String comando;
        do {
            System.out.print("Comando: ");
            comando = scanner.nextLine();
            if(comando.startsWith("añadir")) {
                String nombreFichero = comando.split(" ")[1];
                reproductor.agregarCancion(new Cancion(nombreFichero));
            } else if(comando.startsWith("tocar")) {
                reproductor.tocar();
            } else if(comando.startsWith("parar")) {
                reproductor.parar();
            } else if(comando.startsWith("siguiente")) {
                reproductor.siguienteCancion();
            } else if(comando.startsWith("lista")) {
                System.out.println(reproductor.toString());
            } else if(!comando.startsWith("salir")){
                System.out.println("Error! Comando no reconocido");
            }
        } while(!comando.startsWith("salir"));
        reproductor.parar();
    }
}
