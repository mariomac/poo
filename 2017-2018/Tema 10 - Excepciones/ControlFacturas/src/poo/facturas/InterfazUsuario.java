package poo.facturas;

import poo.facturas.excs.ComandoInvalido;
import poo.facturas.excs.FacturaInexistente;

import java.util.*;

public class InterfazUsuario {

    private static final String CMD_MOSTRAR = "mostrar";
    private static final String CMD_NUEVO_PEDIDO = "pedido";
    private static final String CMD_SALIR = "salir";

    // Truco! Creamos un set con todos los comandos, así será más fácil comprobar si un comando
    // es incorrecto. Mirar su uso en "leeComando()"
    private static final Set<String> COMANDOS = new HashSet<>(
            Arrays.asList(CMD_MOSTRAR, CMD_NUEVO_PEDIDO, CMD_SALIR));

    private Scanner scanner = new Scanner(System.in);

    private Controlador controlador = new Controlador();

    public void mostrarFactura() throws FacturaInexistente {
        System.out.print("ID? ");
        String id = scanner.nextLine();
        System.out.println(controlador.getFactura(id));
    }

    public void nuevoPedido() {
        System.out.print("ID Factura? ");
        String idFactura = scanner.nextLine();
        System.out.print("Cantidad? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Descripción? ");
        String descripcion = scanner.nextLine();

        // aquí, en vez de relanzar la "FacturaInexistenteException", vamos a cazar la
        // excepción para darle al usuario una solución más allá de mostrar un mensaje de error.
        try {
            controlador.nuevoPedido(idFactura, cantidad, descripcion);
        } catch (FacturaInexistente e) {
            System.out.println("La factura con ID '" + idFactura + "' no existe.");
            System.out.print("Deseas crearla y añadir el pedido? [s/n]");
            String sn = scanner.nextLine();
            if ("s".equalsIgnoreCase(sn)) {
                controlador.nuevaFactura(idFactura);
                try {
                    controlador.nuevoPedido(idFactura, cantidad, descripcion);
                } catch (FacturaInexistente ex) {
                    // Esto nunca debería pasar, pero Java nos obliga a poner el catch.
                    // Me limito a poner un printstacktrace por si hubiera algun fallo de programación
                    // por mi parte
                    ex.printStackTrace();
                }
            } else {
                System.out.println("Abortando comando");
                return;
            }
        }
        System.out.println("Factura añadida con éxito");

    }

    public String leeComando() throws ComandoInvalido {
        System.out.print("Comando: ");
        String cmd = scanner.nextLine();
        // Falla si el comando introducido no está contenido en el set con todos los comandos
        if (!COMANDOS.contains(cmd.toLowerCase())) {
            throw new ComandoInvalido(cmd);
        }
        return cmd;
    }

    public void empezar() {
        String comando = null;
        do {
            try {
                comando = leeComando().toLowerCase();
                switch (comando) {
                    case CMD_NUEVO_PEDIDO:
                        nuevoPedido();
                        break;
                    case CMD_MOSTRAR:
                        mostrarFactura();
                        break;
                }
            } catch (FacturaInexistente e) {
                System.out.println(e.getMessage());
            } catch (ComandoInvalido e) {
                System.out.println(e.getMessage());
                System.out.println("Los comandos válidos son:"
                        + String.join(", ", COMANDOS));
            }
        } while (!CMD_SALIR.equalsIgnoreCase(comando));

    }

}
