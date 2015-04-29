package moo.facturas;

public class Factura {
    private String ref;
    private double precio;
    public Factura(String ref, double precio) throws ValorNoValidoException{
        if(precio < 0) {
            throw new ValorNoValidoException(precio);
        }
        this.ref = ref;
        this.precio = precio;
    }
    public void setPrecio(double precio) 
                    throws ValorNoValidoException {
        if(precio < 0) {
            throw new ValorNoValidoException(precio);
        }
        this.precio = precio;
    }
    public String getRef() {
        return ref;
    }
    public double getPrecio() {
        return precio;
    }
}
