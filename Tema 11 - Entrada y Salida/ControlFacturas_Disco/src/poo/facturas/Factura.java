package poo.facturas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Cuando queramos iterar los pedidos de la factura, tenemos la opción de devolver la lista de
// pedidos, pero estaríamos permitiendo hacer operaciones desde fuera.
//
// Haciendo que la factura implemente la interfaz "Iterable<Pedido>", podemos iterar los pedidos
// metiendo una factura dentro de un "foreach"
//
// La magia de la programación orientada a objetos!!
//
public class Factura implements Iterable<Pedido> {
    private List<Pedido> pedidos = new ArrayList<>();
    private String id;

    public Factura(String id) {
        this.id = id;
    }

    // Implementar la interfaz "Iterable" es tan sencillo como implementar este método, que
    // devuelve un iterador a la lista  de pedidos. Así podremos meter la factura dentro de un for
    // each, tal como:
    // Factura factura = ....
    // for (Pedido p : factura) { ....
    @Override
    public Iterator<Pedido> iterator() {
        return pedidos.iterator();
    }


    public void add(Pedido p) {
        pedidos.add(p);
    }
    public String getId() {
        return id;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Datos de la factura '");
        sb.append(id).append("':\n");
        for (Pedido p:pedidos) {
            sb.append(" - ").append(p).append("\n");
        }
        return sb.toString();
    }

}
