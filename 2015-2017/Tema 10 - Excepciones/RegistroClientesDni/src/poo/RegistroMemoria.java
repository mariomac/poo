
package poo;

import ex.DniDuplicadoException;

import java.util.Map;
import java.util.TreeMap;

/**
 * Implementación sencilla de la interfaz RegistroClientes que implementa
 * dicho registro en un HashMap de memoria.
 */
public class RegistroMemoria implements RegistroClientes {

    // Clase que contiene realmente el registro, pero nosotros la
    // Encapsulamos detrás de los métodos de la interfaz RegistroClientes
    private Map<Dni, Cliente> registro = new TreeMap<>();

    public void guarda(Cliente c) throws DniDuplicadoException {
        if (registro.containsKey(c.getDni())) {
            throw new DniDuplicadoException(c.getDni());
        }
        registro.put(c.getDni(), c);
    }

    public Cliente obten(Dni d) {
        return registro.get(d);
    }
}
