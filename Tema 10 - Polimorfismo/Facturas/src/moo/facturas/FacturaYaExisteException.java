package moo.facturas;

public class FacturaYaExisteException extends Exception {
    private Factura factura;

    public FacturaYaExisteException(Factura factura) {
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }
    
    
}
