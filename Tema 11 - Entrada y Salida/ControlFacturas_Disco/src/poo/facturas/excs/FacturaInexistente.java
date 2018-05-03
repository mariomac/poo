package poo.facturas.excs;

// Excepción que se usa para notificar el intento de acceso a una factura inexistente
public class FacturaInexistente extends Exception {
    public FacturaInexistente(String idFactura) {
        super("Factura no existe: " + idFactura);        
    }    
}
