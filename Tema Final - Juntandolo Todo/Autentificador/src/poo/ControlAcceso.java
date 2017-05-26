
package poo;

/**
 * Interfaz que dice qué metodos deben tener las clases que implementan el control de acceso.
 */
public interface ControlAcceso {
    /**
     * Valida que un usuario y una contraseña sean correctas. Si lo son, no hace nada, si son incorrectas,
     * lanza una excepción.
     *
     * @param usuario
     * @param contraseña
     * @throws AuthException Si el usuario no existe o la contraseña es incorrecta.
     */
    void valida(String usuario, String contraseña) throws AuthException;

    /**
     * Añade un usuario y una contraseña a la base de datos de usuarios.
     *
     * @param usuario
     * @param contraseña
     * @param contraseñaRepetida
     *
     * @throws AuthException Si el usuario ya existe o la contraseña no cumple las normas de seguridad. También
     *                       la lanza si la contraseña no se corresponde con su contraseña repetida.
     */
    void añadir(String usuario, String contraseña, String contraseñaRepetida) throws AuthException;
}
