package moo.facturas;

import java.util.HashMap;
import java.util.Map;

public class RegistroFacturas {
    private Map<String,Factura> registro = new HashMap<String, Factura>();
    
    public void addFactura(Factura f) throws FacturaYaExisteException {
        if(registro.containsKey(f.getRef())) {
            throw new FacturaYaExisteException(f);
        }
        registro.put(f.getRef(),f);
    }
    public Factura getFactura(String ref)
            throws FacturaNoEncontradaException {
        Factura f = registro.get(ref);
        if(f == null) {
            throw new FacturaNoEncontradaException(ref, "Factura " + ref + " no encontrada");
        }
        return f;
    }
}
















