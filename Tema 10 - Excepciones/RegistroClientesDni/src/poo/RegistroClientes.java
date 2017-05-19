package poo;

import ex.DniDuplicadoException;

/**
 * Además de montar una clase, es una buena práctica definir primero una interfaz
 * y luego programar una clase que la implemente. Y que las clases que la usen,
 * programen directamente contra la interfaz.
 *
 * Esto es una buena práctica y nos da ventajas porque:
 * - Podemos crear muchas clases que implementen la misma interfaz e intercambiarlas
 *   fácilmente: RegistroMemoria, RegistroDisco, RegistroBaseDatos, RegistroInternet...
 * - Ayuda a probar el código mediante immplementaciones sencillas y simplificadas
 *   (si tenéis interés, buscad en un buscador los términos:
 *              - "Unit Testing"
 *              - "Mocks, Subs, Fakes"
 */
public interface RegistroClientes {
    void guarda(Cliente c) throws DniDuplicadoException;

    Cliente obten(Dni d);
}
