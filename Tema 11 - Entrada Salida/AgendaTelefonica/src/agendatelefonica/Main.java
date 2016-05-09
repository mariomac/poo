package agendatelefonica;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static BufferedReader teclado =
            new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws Exception {
        AgendaTelefonica agenda = new AgendaTelefonica();
        
        try {
            FileReader archivoEntrada = new FileReader("contactos.txt");
            agenda.leer(archivoEntrada);
            archivoEntrada.close();
        } catch(IOException e) {
            System.out.println("El archivo de contactos no existe");
        }
        
        
        char comando = menu();
        while(comando != 'x') {
            if(comando == 'a') {
                System.out.print("Nombre: ");
                String nombre = teclado.readLine();
                System.out.println("Telf: ");
                String telf = teclado.readLine();
                agenda.addContacto(new Contacto(nombre, telf));
            } else if(comando == 'm') {
                System.out.println(agenda.toString());
            }
            comando = menu();
        }
        
        try {
            FileWriter archivo = new FileWriter("contactos.txt");
            agenda.escribir(archivo);
            archivo.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public static char menu() {
        
        System.out.println("Opciones:");
        System.out.println("  a - añadir contacto");
        System.out.println("  m - mostrar agenda");
        System.out.println("  x - salir");
        
        System.out.print("Comando: ");
        
        try {
            return teclado.readLine().charAt(0);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return '\0';
    }
    
}
