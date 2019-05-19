package poo.videoclub;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        InterfazUsuario iu = new InterfazUsuario();
        try {
            iu.inicializar();

            iu.buclePrincipal();

            iu.cerrar();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR FATAL: no se han podido cargar o guardar los datos.");
            System.out.println("causa: " + e.getMessage());
        }
    }
}
