package info.macias.poo.es.ej1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author mmacias
 */
public class Ejemplo1 {
    public static void lecturaBasica() {
        System.out.println("*** EJEMPLO 1: InputStream básico");
        byte[] arrayEntrada = { 1, 2, 3, 4 };
        InputStream is = new ByteArrayInputStream(arrayEntrada);
        try {
            
            int leido = is.read();
            while(leido != -1) {
                System.out.println("leido = " + leido);
                leido = is.read();
            }     
            is.close();
        } catch(IOException e) {
            e.printStackTrace();
        }   
    }
    /**
     * Esta operación es más eficiente, puesto que hace menos operaciones de
     * lectura (lee de una tacada hasta 256 bytes, o el tamaño que le diéramos
     * al buffer)
     */
    public static void lecturaEnBuffer() {
        System.out.println("*** EJEMPLO 1: InputStream básico con 'buffer'");
        byte[] arrayEntrada = { 1, 2, 3, 4 };
        byte[] buffer = new byte[256];
        InputStream is = new ByteArrayInputStream(arrayEntrada);
        try {
            int leidos = is.read(buffer);
            while(leidos != -1) {
                for(int i = 0 ; i < leidos ; i++) {
                    System.out.println("leido = " + buffer[i]);                    
                }
                // Como el array de entrada es pequeño, esto devolverá -1
                // en la próxima operación
                leidos = is.read(buffer);
            }     
            is.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
