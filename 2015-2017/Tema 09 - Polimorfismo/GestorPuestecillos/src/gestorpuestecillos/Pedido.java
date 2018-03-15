package gestorpuestecillos;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private Map<Integer,Regalo> elementos = new HashMap<>();
    
    public void añade(Regalo r) {
        elementos.put(r.getRef(), r);
    }
    public Regalo get(int ref) {
        return elementos.get(ref);
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Detalles del pedido:\n");
        int costeTotal = 0;
        for(Regalo r : elementos.values()) {
            sb.append(r.toString());
            sb.append('\n');
            costeTotal += r.getCantidad() * r.getPrecio();
        }
        sb.append("Coste total: " + costeTotal + " cts.");
        return sb.toString();
    }
}
