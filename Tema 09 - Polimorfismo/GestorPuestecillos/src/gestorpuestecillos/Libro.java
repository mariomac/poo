package gestorpuestecillos;

public class Libro extends Regalo {
    private String titulo;

    public Libro(String titulo, int ref, int cantidad, int precio) {
        super(ref, cantidad, precio);
        this.titulo = titulo;
    }

    public Regalo retirar(int num) {
        int librosADevolver;
        if(getCantidad() < num) {
            librosADevolver = getCantidad();
            setCantidad(0);           
        } else {
            librosADevolver = num;
            setCantidad(getCantidad() - num);
        }
        if(librosADevolver == 0) {
            return null;
        } else {
            return new Libro(titulo, getRef(),
                    getCantidad(), getPrecio());
        }
    }
    
    public String toString() {
        return getCantidad() + " x " +
                getRef() + " - " + titulo
                + " - " + getPrecio() + " cts. ud.";
    }
}
