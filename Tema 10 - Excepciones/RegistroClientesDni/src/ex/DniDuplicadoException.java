package ex;

import poo.Dni;

public class DniDuplicadoException extends Exception {
    private Dni dni;

    public DniDuplicadoException(Dni dni) {
        this.dni = dni;
    }

    public Dni getDni() {
        return dni;
    }
}
