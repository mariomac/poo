package ikea;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Mueble {
    private String nombre;
    private Set<Pieza> piezas = new HashSet<>();
    public Mueble(String nombre) {
        this.nombre = nombre;
    }
    
    public void addPieza(Pieza p) {
        piezas.add(p);
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("\n");
        for (Pieza p : piezas) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}
