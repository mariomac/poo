package moo.facturas;

public class FacturaNoEncontradaException 
                        extends Exception {
    private String idBuscado;

    public FacturaNoEncontradaException(String id) {
        this.idBuscado = id;
    }

    public FacturaNoEncontradaException(String id, String message) {
        super(message);
        this.idBuscado = id;
    }

    public String getIdBuscado() {
        return idBuscado;
    }
    
}
