package moo.agenda;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import moo.agenda.fecha.Fecha;

public class ControladorEventos {
    private Set<Evento> eventos = new TreeSet<Evento>();
    
    public void add(Evento e) {
        eventos.add(e);
    }
    
    public List<Evento> eventosDelDia(Fecha dia) {
        List<Evento> eventosDia = new ArrayList<Evento>();
        for(Evento e : eventos) {
            Fecha f = e.getFecha();
            if(f.getDia() == dia.getDia() && f.getMes() == dia.getMes()
                    && f.getAnyo() == dia.getAnyo()) {
                eventosDia.add(e);
            }
        }
        return eventosDia;
    }
    
    public void cargarEventos(InputStream is) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(is);
        eventos = (Set<Evento>) ois.readObject();
    }
    
    public void guardarEventos(OutputStream os) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(eventos);
    } 
}
