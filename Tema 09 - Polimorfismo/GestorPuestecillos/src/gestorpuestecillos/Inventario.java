package gestorpuestecillos;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<Integer,Regalo> inventario = new HashMap<>();
    
    public void añade(Regalo r) {
        inventario.put(r.getRef(), r);
    }
    public Regalo get(int ref) {
        return inventario.get(ref);
    }
    public Pedido creaPedido(int[] referencias) {
        Pedido pedido = new Pedido();
        for(int ref : referencias) {
            Regalo rinv = inventario.get(ref);
            if(rinv != null) {
                Regalo rañad = rinv.retirar(1);
                if(rañad != null) {
                    Regalo rped = pedido.get(ref);
                    if(rped == null) {
                        pedido.añade(rañad);
                    } else {
                        rped.setCantidad(
                                rped.getCantidad() + 1
                        );
                        //pedido.añade(rped);
                    }
                }
            }
        }
        return pedido;
    }
}
