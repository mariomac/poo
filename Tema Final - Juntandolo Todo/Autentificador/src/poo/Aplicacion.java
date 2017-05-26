
package poo;

public class Aplicacion {

    private ControlAcceso acceso;

    public Aplicacion(ControlAcceso acceso) {
        this.acceso = acceso;
    }

    public void entrar(String usuario, String contraseña) throws AuthException {

        acceso.valida(usuario, contraseña);
        System.out.println("Aplicación funcionando");
    }

}
