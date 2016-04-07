package agendatelefonica;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws Exception {
        AgendaTelefonica agenda = new AgendaTelefonica();
        
        InputStream archivosIn = new FileInputStream("contactos.txt");
        agenda.leeContactos(archivosIn);
        archivosIn.close();
        
        System.out.println("Introduce nuevos contactos...");                
        agenda.leeContactos(System.in);
        
        System.out.println("Tus contactos son...");
        agenda.enviaContactos(System.out);
                
        PrintStream archivoOut = new PrintStream("contactos.txt");
        agenda.enviaContactos(archivoOut);
        archivoOut.close();
        
    }
    
}
