package info.macias.poo.es.reader;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

/**
 *
 * @author mmacias
 */
public class Ej6Writer {
    public static void pantallaCharAChar() throws IOException {
        System.out.println("*** Ejemplo 6: pantalla char a char");
        Writer osw = new OutputStreamWriter(System.out);
        osw.write('a');
        osw.write('b');
        osw.write('c');
        osw.write('\n');
        osw.close();
    }
    
}
