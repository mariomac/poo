package poo.facturas;

import poo.facturas.excs.FacturaInexistente;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

// Clase que controla la lógica del programa
public class Controlador {
    private Map<String, Factura> facturas = new HashMap<>();

    // Añadido para guardar una factura en disco, donde cada pedido es guardado como una línea
    // dentro de un fichero de disco en el siguiente formato:
    // id_factura:cantidad:descripción
    public void guarda(String nombreDeArchivo) throws IOException {
        // Un PrintWriter es la manera más fácil de guardar datos de texto
        PrintWriter datosDisco = new PrintWriter(nombreDeArchivo);

        for (Factura factura : facturas.values()) {
            // Como la factura implemente la interfaz "Iterable<Pedido>", podemos iterar los pedidos
            // metiendo la factura dentro de un "foreach". La magia de POO!!
            for (Pedido p : factura) {
                datosDisco.println(factura.getId()
                        + ":" + p.getCantidad()
                        + ":" + p.getNombre());
            }
        }

        datosDisco.close();
    }

    // Añadido para cargar una factura de disco, donde cada pedido es leído según el formato
    // establecido en el método "guarda"
    public void carga(String nombreDeArchivo) throws IOException {
        // Un BufferedReader (o un Scanner) es la manera más fácil de leer líneas de texto
        // pero le tenemos que "empalmar" un FileReader que nos permita el acceso al fichero de
        // texto
        BufferedReader datosDisco = new BufferedReader(new FileReader(nombreDeArchivo));
        String linea = datosDisco.readLine();
        while (linea != null) {
            String[] partes = linea.split(":");
            String idFactura = partes[0];
            int cantidad = Integer.parseInt(partes[1]);
            String nombrePedido = partes[2];

            // Obtenemos la factura en la que añadir el Pedido
            Factura factura = facturas.get(idFactura);

            // Si la factura no existe, la creamos y guardamos en el mapa
            if (factura == null) {
                factura = new Factura(idFactura);
                facturas.put(idFactura, factura);
            }
            factura.add(new Pedido(nombrePedido, cantidad));

            // Leemos la siguiente línea
            linea = datosDisco.readLine();
        }
        datosDisco.close();
    }


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
