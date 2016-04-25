package gestorpuestecillos;

public class GestorPuestecillos {
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        inv.añade(new Rosa(1,10,295));
        inv.añade(new Libro("El Quijote", 2, 2, 1000));
        inv.añade(new Libro("La Biblia", 3, 6, 1500));
        
        int[] refs = {1,1,1,2,2,2,4};
        Pedido pedido = inv.creaPedido(refs);
        System.out.println(pedido.toString());
    }  
}
