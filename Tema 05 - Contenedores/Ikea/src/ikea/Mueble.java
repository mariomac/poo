package ikea;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Clase que representa la composición de un mueble, que puede estar compuesto
// por un número indeterminado de piezas
public class Mueble {
    
    private String nombre;
    private Set<Pieza> piezas = new HashSet<>();
    
    public Mueble(String nombre) {
        this.nombre = nombre;
    }
    
    // Encapsulamos la complejidad de Set haciéndolo privado y permitiendo sólo
    // añadir piezas a partir de este método
    public void addPieza(Pieza p) {
        piezas.add(p);
    }
    
    public String toString() {
        // Usamos la clase StringBuilder por cuestiones de rendimiento
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("\n");
        for (Pieza p : piezas) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}
