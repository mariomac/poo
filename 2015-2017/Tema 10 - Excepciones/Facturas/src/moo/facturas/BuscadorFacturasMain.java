package moo.facturas;

import java.util.Scanner;

public class BuscadorFacturasMain {

    public static void main(String[] args) {
        RegistroFacturas reg = new RegistroFacturas();
        try {
            reg.addFactura(new Factura("r123",123.0f));
            reg.addFactura(new Factura("x456",23.0f));
            reg.addFactura(new Factura("z789",233.0f));
        } catch (Exception ex) {
            ex.printStackTrace();;
        }

        Scanner teclado = new Scanner(System.in);
        String comando = "";
        while(!comando.equals("salir")) {
            System.out.print("Ref: ");
            comando = teclado.nextLine();
            if(comando.equals("añadir")) {
                System.out.print("Ref nueva: ");
                String ref = teclado.nextLine();
                System.out.print("Precio: ");
                double precio = teclado.nextDouble();
                try {
                    Factura f = new Factura(ref, precio);
                    reg.addFactura(f);
                } catch(FacturaYaExisteException e) {
                    System.out.println("Factura ya existe: " + e.getFactura().getRef());
                } catch(ValorNoValidoException e) {
                    System.out.println("Precio invalido: " + e.getValor());
                }
                // quitamos el \n del teclado que se quedó guardado
                // cuando introdujimos el precio
                teclado.nextLine();
            } else if(!comando.equals("salir")) {
                try { 
                    Factura f = reg.getFactura(comando);
                    System.out.println("Precio: " + f.getPrecio());
                }catch(FacturaNoEncontradaException e) {
                    System.out.println(e.getMessage());
                }
            }
            
        }
    }
    
}
