package poo.ej;

import poo.ej.ex.FormatoException;
import poo.ej.ex.ReferenciaException;

public class Main {

    public static void main(String[] args) {
        Controlador contr = new Controlador();
        try {

            contr.cargar("inventario.txt");
            contr.muestraStocks();

        } catch (FormatoException e) {
            System.out.println("Ha habido un error en el formato del archivo");
            System.out.println(e.getMessage());
        } catch (ReferenciaException e) {
            System.out.println("Referencia inválida:" + e.getIdReferencia());
        } catch (Exception e) {
            System.out.println("Ha habido un error inesperado:");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

    }

}
