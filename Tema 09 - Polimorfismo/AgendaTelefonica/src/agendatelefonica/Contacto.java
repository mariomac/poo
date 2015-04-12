package agendatelefonica;

public class Contacto implements Comparable<Contacto> {
    private String nombre;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int compareTo(Contacto t) {
        return nombre.compareTo(t.nombre);
    }
  
    public String toString() {
        return nombre + " - " + telefono;
    }
}
