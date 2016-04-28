package info.macias.poo.es.ej2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author mmacias
 */
public class Ejemplo2 {
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
