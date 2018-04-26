package poo.facturas;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<Pedido> pedidos = new ArrayList<>();
    private String id;

    public Factura(String id) {
        this.id = id;
    }
    
    public void add(Pedido p) {
        pedidos.add(p);
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
