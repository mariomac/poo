package gestorpuestecillos;

public class Rosa extends Regalo {

    public Rosa(int ref, int cantidad, int precio) {
        super(ref, cantidad, precio);
    }
    
    public Regalo retirar(int num) {
        int rosasADevolver;
        if(getCantidad() < num) {
            rosasADevolver = getCantidad();
            setCantidad(0);           
        } else {
            rosasADevolver = num;
            setCantidad(getCantidad() - num);
        }
        if(rosasADevolver == 0) {
            return null;
        } else {
            return new Rosa(getRef(), rosasADevolver,
                    getPrecio());
        }
    }    
    public String toString() {
        return getCantidad() + " x " + getRef()
                + " - Rosa - " + getPrecio()
                + " cts. ud.";
    }
}
