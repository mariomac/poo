package gestorpuestecillos;
public abstract class Regalo {
    private int ref;
    private int cantidad;
    private int precio;

    public Regalo(int ref, int cantidad, int precio) {
        this.ref = ref;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public abstract Regalo retirar(int num);
    
    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
