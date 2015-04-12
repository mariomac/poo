package agendatelefonica;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AgendaTelefonica {

    public Set<Contacto> entradas = new TreeSet<Contacto>();
    
    public void addContacto(Contacto c) {
        entradas.add(c);
    }
    
    public void leeContactos(InputStream in) throws Exception {  
        Scanner contactos = new Scanner(in);
        String linea = contactos.nextLine();
        while(!linea.equals("FIN")) {
            String[] partes = linea.split(":");
            Contacto c = new Contacto();
            c.setNombre(partes[0]);
            c.setTelefono(partes[1]);
            entradas.add(c);
            
            linea = contactos.nextLine();
        }
    }
    
    public void enviaContactos(PrintStream out) {
        for(Contacto c : entradas) {
            out.println(c.getNombre()+":"+c.getTelefono());
        }
        out.println("FIN");
    }
}
