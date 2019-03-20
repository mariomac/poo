package ikea;

import java.util.Objects;

public class Pieza {
   
    private int id;
    private double ancho, alto, profundo;
    private String nombre;
    private int cantidad;
    
    public Pieza(int cantidad, int id,
            double ancho, double alto, double profundo,
            String nombre) {
        this.id = id;
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    public String toString() {
        // Aquí no es necesario un StringBuilder ya que podemos concatenarlo
        // todo en una sola línea (al contrario que en la clase Mueble)
        return cantidad + " x ID: " + id + ". " + nombre
                + ". Dim: " + ancho + "x" + alto + "x" + profundo;
    }

    //////////////////////////////////////////////////////////////////
    // Los métodos a continuación ha sindo generados automáticamente por
    // Netbeans: Source -> Insert code... -> hashCode() and equals()...
    // No es necesario entender la lógica de implementación, pero
    // son necesarios para el correcto y eficiente funcionamiento del
    // contenedor HashSet<Pieza> de la clase Mueble
    ///////////////////////////////////////////////////////////////////
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.ancho) ^ (Double.doubleToLongBits(this.ancho) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.alto) ^ (Double.doubleToLongBits(this.alto) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.profundo) ^ (Double.doubleToLongBits(this.profundo) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + this.cantidad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pieza other = (Pieza) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.ancho) != Double.doubleToLongBits(other.ancho)) {
            return false;
        }
        if (Double.doubleToLongBits(this.alto) != Double.doubleToLongBits(other.alto)) {
            return false;
        }
        if (Double.doubleToLongBits(this.profundo) != Double.doubleToLongBits(other.profundo)) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
    
}
