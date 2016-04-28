package regsitroclientes;

import java.util.Scanner;

public class InterfazUsuario {

    private Scanner scanner = new Scanner(System.in);
    private Registro registro = new Registro();

    public char menu() {
        char r = 0;
        do {
            System.out.println("a - añadir cliente");
            System.out.println("m - mostrar cliente");
            System.out.println("x - salir");
            r = scanner.nextLine().trim().charAt(0);
        } while (r != 'a' && r != 'm' && r != 'x');
        return r;
    }

    public void buclePrincipal() {
        char comando = 0;
        while (comando != 'x') {
            comando = menu();
            try {
                switch (comando) {
                    case 'a':
                        System.out.print("DNI: ");
                        String dni = scanner.nextLine();
                        System.out.println("Nombre: ");
                        String nombre = scanner.nextLine();
                        registro.añadir(new Cliente(dni, nombre));
                        break;
                    case 'm':
                        System.out.print("DNI: ");
                        String dniMostrar = scanner.nextLine();
                        Cliente c = registro.obtener(dniMostrar);
                        System.out.println(c.toString());
                        break;
                }
            } catch (ClienteNoExisteException e) {
                System.out.flush();
                System.err.println("El cliente con DNI "
                        + e.getDni() + " no existe");
                System.err.flush();
            } catch(ClienteYaExisteException e) {
                System.out.flush();
                System.err.println("Ya existe un cliente con ese dni: "
                        + e.getOriginal());
                System.err.flush();               
            }
        }

    }

    public static final void main(String[] args) {
        new InterfazUsuario().buclePrincipal();
    }
}
