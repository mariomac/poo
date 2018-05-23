package poo.ej;

public class Stock {
    private Referencia ref;
    private int cantidad;
    private int precio;

    public Stock(Referencia ref, int cantidad, int precio) {
        this.ref = ref;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String toString() {
        return cantidad + " x " + ref + ". Precio: " + precio;
    }
}
