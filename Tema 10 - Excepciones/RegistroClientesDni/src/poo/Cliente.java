package poo;

public class Cliente {
    private Dni dni;
    private String nombre;

    public Cliente(Dni dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public Dni getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return nombre + ". DNI: " + dni;
    }

}
