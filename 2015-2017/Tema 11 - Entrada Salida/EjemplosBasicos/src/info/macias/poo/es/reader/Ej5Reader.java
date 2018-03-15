package info.macias.poo.es.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mmacias
 */
public class Ej5Reader {
    public static void BufferedFileReader() {
        System.out.println("*** EJEMPLO 5: BufferedReader con FileReader");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./texto.txt"));
            String linea = reader.readLine();
            while(linea != null) {
                System.out.println(linea);
                linea = reader.readLine();
            }
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
       
    }
}
