package agendatelefonica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AgendaTelefonica {

    public Set<Contacto> entradas = new TreeSet<Contacto>();
    
    public void addContacto(Contacto c) {
        entradas.add(c);
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Contacto e : entradas) {
            sb.append(e.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public void escribir(Writer out) {
        PrintWriter p = new PrintWriter(out);
        for(Contacto e : entradas) {
            p.println(e.getNombre()+":"+e.getTelefono());
        }   
        p.println("FIN");
    }
    public void leer(Reader in) throws IOException {
        BufferedReader r = new BufferedReader(in);
        String linea = r.readLine();
        while(!linea.equals("FIN")) {
            String[] info = linea.split(":");
            addContacto(new Contacto(info[0],info[1]));
            linea = r.readLine();
        }
    }
}
