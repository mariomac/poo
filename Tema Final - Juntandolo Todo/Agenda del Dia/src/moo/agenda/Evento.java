package moo.agenda;

import java.util.Scanner;
import java.util.regex.Pattern;
import moo.agenda.fecha.Fecha;
import moo.agenda.fecha.FechaException;

public class Evento implements Comparable<Evento> {
    private Fecha fecha;
    private String descripcion;
    
    public Evento(Fecha fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }    
    
    public int compareTo(Evento t) {
        return fecha.compareTo(t.fecha);
    }
    
    public String toString() {
        return fecha.toString() + " : " + descripcion;
    }        
    
    
    /*
        Este método es un poco complicado. Asumid que se os da hecho
    */
    public static Evento fromString(String str) throws FechaException {
        Scanner scanner = new Scanner(str);       
        scanner.useDelimiter(Pattern.compile("[\\s/:]"));
        int dd = scanner.nextInt();
        int MM = scanner.nextInt();
        int aaaa = scanner.nextInt();
        int hh = scanner.nextInt();
        int mm = scanner.nextInt();
        scanner.useDelimiter(" : ");
        String descripcion = scanner.next();
        return new Evento(new Fecha(dd,MM,aaaa,hh,mm),descripcion);
    }
}
