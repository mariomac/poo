package narradorpartidos;

import java.util.ArrayList;
import java.util.List;

public class Partido {
    private String local, visitante;
    private List<Evento> eventos = new ArrayList<>();

    public Partido(String local, String visitante) {
        this.local = local;
        this.visitante = visitante;
    }
    
    public void añadirEvento(Evento evento) {
        eventos.add(evento);
    }
    
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        cadena.append(local).append(" vs. ")
                .append(visitante).append('\n');
        for(Evento e : eventos) {
            cadena.append(e.toString())
                    .append('\n');
        }
        return cadena.toString();
    }
    
}









