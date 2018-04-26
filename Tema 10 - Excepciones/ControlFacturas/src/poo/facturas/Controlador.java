package poo.facturas;

import poo.facturas.excs.FacturaInexistente;

import java.util.HashMap;
import java.util.Map;

// Clase que controla la lógica del programa
public class Controlador {
    private Map<String, Factura> facturas = new HashMap<>();

    // Devuelve una factura almacenada segúnun ID.
    // Si no hay ninguna factura registrada para ese ID, lanza la excepción "FacturaInexistente"
    public Factura getFactura(String id) throws FacturaInexistente {
        Factura f = facturas.get(id);
        if (f == null) {
            throw new FacturaInexistente(id);
        }
        return f;
    }

    // Registra una nueva factura a partir de un ID
    public void nuevaFactura(String id) {
        facturas.put(id, new Factura(id));
    }

    // Crea un nuevo pedido y lo añade a una factura identificada por una cadena.
    // Si no hay una factura registrada para esa cadena, lanza la excepción "FacturaInexistente"
    public void nuevoPedido(String facturaId, int cantidad, String descripcion) throws FacturaInexistente {
        // Si la factura no existiera, en vez de un NullPointerException se lanzaría una excepción
        // FacturaInexistente desde 'getFactura', y sería relanzada por este método
        getFactura(facturaId).add(new Pedido(descripcion, cantidad));
    }

}
