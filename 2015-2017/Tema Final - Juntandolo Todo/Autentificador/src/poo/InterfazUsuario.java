package poo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InterfazUsuario {

    public static void main(String[] args) {
        ControlAcceso control = new ControlAccesoFichero();
        Aplicacion app = new Aplicacion(control);
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        boolean validado = false;
        while (!validado) {
            try {
                System.out.println("Para entrar en la aplicación, debes estar autenticado");
                System.out.println("(Si no sabes qué poner, usa 'manolo' como usuario y 'contraseña1' como contraseña)");
                System.out.print("Usuario: ");
                String usu = teclado.readLine();
                System.out.print("Contraseña: ");
                // Para que no se vieran los caracteres de la contraseña, se podría usar
                // System.console.readPassword(), pero ojo que si se ejecuta
                // desde Netbeans daría NullpointerException
                String cont = teclado.readLine();
                app.entrar(usu, cont);
                validado = true;
            } catch (AuthException e) {
                System.out.println(e.getMessage());
            } catch(Exception e) {
                System.out.println("ERROR no controlado!");
            }
        }
        boolean introducido = false;
        System.out.println("\nNUEVO USUARIO\n");
        while (!introducido) {
            try {
                System.out.print("Usuario: ");
                String usu = teclado.readLine();
                // Para que no se vieran los caracteres de la contraseña, se podría usar
                // System.console.readPassword(), pero ojo que si se ejecuta
                // desde Netbeans daría NullpointerException
                System.out.print("Contraseña: ");
                String cont = teclado.readLine();
                System.out.print("Repite contraseña: ");
                String cont2 = teclado.readLine();
                control.añadir(usu, cont, cont2);
                introducido = true;
            } catch (AuthException e) {
                System.out.println(e.getMessage());
            } catch(Exception e) {
                System.out.println("ERROR no controlado!");
            }
        }
    }
}
