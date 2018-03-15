package info.macias.poo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Set;
import java.util.TreeSet;

public class Equipo {
    private String nombre;
    private Set<Titulo> títulos = new TreeSet<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    
    public void añadir(Titulo t) {
        títulos.add(t);               
    }
    
    public void mostrarEnPantalla() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Títulos:");
        for(Titulo t : títulos) {
            System.out.println("\t"+t);
        }        
    }
    
    // Lo hacemos como método estático porque antes de cargar un equipo
    // no tenemos realmente la instancia del equipo.
    //
    // Relanzamos la IOException porque desde este punto no sabríamos cómo
    // gestionar el error
    public static Equipo cargar(Reader r) throws IOException {
        BufferedReader lector = new BufferedReader(r);
        Equipo e = new Equipo(lector.readLine());
        int titulos = new Integer(lector.readLine());
        while(titulos > 0) {
            String[] campos = lector.readLine().split(":");
            e.añadir(new Titulo(new Integer(campos[0]), campos[1]));  
            titulos--;
        }
        lector.close();
        return e;
    }
    
    public void grabar(Writer w) {
        PrintWriter salida = new PrintWriter(w);
        salida.println(nombre);
        salida.println(títulos.size());
        for(Titulo t : títulos) {
            salida.println(t.getAño()+":"+t.getNombre());
        }
        salida.close();
    }
    
}
