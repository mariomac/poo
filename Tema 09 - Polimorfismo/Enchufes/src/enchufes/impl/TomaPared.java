package enchufes.impl;

import enchufes.ifaces.TomaCorriente;
import enchufes.ifaces.Enchufable;

/**
 * Implementa una toma de pared, que aporta un flujo
 * continuado de corriente.
 * 
 * @author mmacias
 */
public class TomaPared implements TomaCorriente {
    private Enchufable clavija = null;
    public void enchufar(Enchufable clavija) {
        this.clavija = clavija;
    }

    public void proporcionaCorriente() {
        if(clavija != null) {
            clavija.recibeCorriente();      
        }
    }
    
}
