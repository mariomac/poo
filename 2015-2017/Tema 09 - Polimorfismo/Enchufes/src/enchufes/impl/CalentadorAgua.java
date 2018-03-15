package enchufes.impl;

import enchufes.ifaces.Clavija;

/**
 * Implementa un calentador de agua
 * @author mmacias
 */
public class CalentadorAgua implements Clavija {

    public void funcionar() {
        System.out.println("Calentando el agua");
    }
        
}
