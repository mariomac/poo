package poo.ej;

public class Referencia {
    private String id;
    private String nombre;

    public Referencia(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return nombre + " (id:" + id + ")";
    }
}
