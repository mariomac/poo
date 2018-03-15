package moo.agenda;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Pattern;
import moo.agenda.fecha.Fecha;
import moo.agenda.fecha.FechaException;

public class Evento implements Comparable<Evento>, Serializable {
    private Fecha fecha;
    private String descripcion;
    
    public Evento(Fecha fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }    
    
    public int compareTo(Evento t) {
        return fecha.compareTo(t.fecha);
    }
    
    public Fecha getFecha() {
        return fecha;
    }
    
    public String toString() {
        return fecha.toString() + " : " + descripcion;
    }        
}
