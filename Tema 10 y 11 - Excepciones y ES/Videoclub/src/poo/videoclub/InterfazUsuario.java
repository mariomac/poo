package poo.videoclub;

import poo.videoclub.excepciones.AlquilerException;
import poo.videoclub.excepciones.ComandoInexistenteException;
import poo.videoclub.excepciones.IdentificadorInexistenteException;
import poo.videoclub.excepciones.SaldoInsuficienteException;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class InterfazUsuario {
    private Controlador controlador = new Controlador();
    private Scanner teclado = new Scanner(System.in);

    public void inicializar() throws FileNotFoundException {
        controlador.leerDatos();
    }

    public void cerrar() throws FileNotFoundException {
        controlador.guardarDatos();
    }

    public void buclePrincipal() {
        boolean continua;
        do {
            continua = leeComando();
        } while (continua);
    }

    // si retorna false, el programa debe acabar
    public boolean leeComando() {
        try {
            System.out.print("comando: ");
            String comando = teclado.nextLine();
            switch (comando) {
                case "buscar":
                    buscar();
                    break;
                case "alquilar":
                    alquilar();
                    break;
                case "devolver":
                    devolver();
                    break;
                case "ayuda":
                    ayuda();
                    break;
                case "salir":
                    return false;
                default:
                    throw new ComandoInexistenteException();
            }

        } catch (ComandoInexistenteException e) {
            System.out.println("ERROR: comando inexistente! Escribe 'ayuda' para lista de comandos");

        } catch (IdentificadorInexistenteException e) {
            System.out.println("ERROR: el identificador " + e.getIdentificador() + " no existe.");

        } catch (SaldoInsuficienteException e) {
            // En este caso, vemos un ejemplo en el que una excepción no se limita a mostrar un mensaje de error.
            // Aquí se habilita un "flujo" alternativo del programa. Se le da una solución alternativa al usuario.
            Cliente c = e.getCliente();
            System.out.println("ERROR: el saldo del cliente " + c.getNombre() + " es insuficiente (" + c.getSaldo() + ")");
            System.out.print("Deseas añadir 10€? [S/N] ");
            if (teclado.nextLine().equalsIgnoreCase("s")) {
                c.setSaldo(c.getSaldo() + 10);
            }

        } catch (Exception e) {
            // Aquí cazamos cualquier otra excepción que se nos haya escapado
            System.out.println("ERROR: " + e.getMessage());
        }
        return true;
    }


    private void buscar() {
        System.out.print("titulo? ");
        String titulo = teclado.nextLine();
        List<Pelicula> pelis = controlador.buscar(titulo);
        if (pelis.size() == 0) {
            System.out.println("No se han encontrado peliculas");
        } else {
            System.out.println("-- Películas encontradas");
            for (Pelicula p : pelis) {
                System.out.println(p);
            }
        }
    }

    private void ayuda() {
        System.out.println("Comandos:\n=========");
        System.out.println("- buscar: busca una película");
        System.out.println("- alquilar: alquila una película");
        System.out.println("- devolver: devuelve una película");
        System.out.println("- salir: finalizar el programa");
    }

    private void alquilar() throws IdentificadorInexistenteException, SaldoInsuficienteException, AlquilerException {
        System.out.print("Identificador de película? ");
        String idPelicula = teclado.nextLine();
        System.out.print("DNI cliente? ");
        String dni = teclado.nextLine();
        controlador.alquila(idPelicula, dni);
    }

    private void devolver() throws AlquilerException, IdentificadorInexistenteException {
        System.out.print("Identificador de película? ");
        String idPelicula = teclado.nextLine();
        controlador.devuelve(idPelicula);
    }
}
