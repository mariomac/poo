package info.macias.poo.es;

import info.macias.poo.es.reader.Ej5Reader;
import info.macias.poo.es.reader.Ej6Writer;
import info.macias.poo.es.streams.Ej1InputStream;
import info.macias.poo.es.streams.Ej2ScannerConInputStream;
import info.macias.poo.es.streams.Ej3OutputStream;
import info.macias.poo.es.streams.Ej4PrintStream;
import java.io.IOException;

/**
 *
 * @author mmacias
 */
public class Main {
    public static final void main(String[] args) throws IOException {
        Ej1InputStream.lecturaBasica();
        Ej1InputStream.lecturaEnBuffer();
        Ej2ScannerConInputStream.leeTexto();
        Ej3OutputStream.escrituraBasica();
        Ej3OutputStream.escrituraBuffer();
        Ej4PrintStream.ejecuta();
        Ej5Reader.BufferedFileReader();
        Ej6Writer.pantallaCharAChar();
    }
}
