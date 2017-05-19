package poo;

import ex.DniDuplicadoException;
import ex.DniIncorrectoException;

public class Main {

    /**
     * Idealmente, esto sería un programa que pide algumos comandos al usuario, del estilo:
     * - Introducir cliente
     * - Listar cliente
     * - Buscar cliente
     * - etc...
     * Nosotros hacemos algunas llamadas a métodos solo para probar que la clase
     * RegistroClientes funciona.
     */
    public static void main(String[] args) {
        RegistroClientes reg = new RegistroMemoria();
        try {
            Dni d = new Dni(12345678, 'Z');
            Cliente c = new Cliente(d, "Pepe Garcia");
            reg.guarda(c);

            d = new Dni(12345678, 'Z');
            c = new Cliente(d, "Manolo Sanchez");
            reg.guarda(c);

        } catch (DniDuplicadoException dd) {

            System.out.println("Dni duplicado! " + dd.getDni());

        } catch (DniIncorrectoException di) {

            System.out.println("La letra " + di.getLetra() + " no corresponde" + " al número " + di.getNum());
        }
        System.out.println("Saliendo...");
    }

}
