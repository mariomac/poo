package enchufes.impl;

import enchufes.ifaces.Enchufable;

/**
 * Implementa un calentador de agua
 * @author mmacias
 */
public class CalentadorAgua implements Enchufable {

    public void recibeCorriente() {
        System.out.println("Calentando el agua");
    }
        
}
