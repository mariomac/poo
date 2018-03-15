package info.macias.poo.es.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mmacias
 */
public class Ej2ScannerConInputStream {
    public static void leeTexto() {
        System.out.println("*** Ejemplo 2: leyendo texto de un FileInputStream");
        try {
            Scanner scanner = new Scanner(new FileInputStream("./texto.txt"));
            while(scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
            scanner.close();
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
