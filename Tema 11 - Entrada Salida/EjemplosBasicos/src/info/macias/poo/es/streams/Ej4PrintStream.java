package info.macias.poo.es.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 *
 * @author mmacias
 */
public class Ej4PrintStream {
    public static void ejecuta() {      
        System.out.println("*** EJEMPLO 4: PrintStream");
        try {           
            PrintStream pantalla = System.out;      
            PrintStream disco = new PrintStream("salida.txt");
            disco.println("En un lugar");
            disco.println("de La Mancha...");
            disco.println("\nCervantes");
            pantalla.print("Mensaje por pantalla: ");
            pantalla.println("Abre fichero 'salida.txt'");
            disco.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
