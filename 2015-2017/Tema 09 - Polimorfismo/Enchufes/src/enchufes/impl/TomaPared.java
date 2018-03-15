package enchufes.impl;

import enchufes.ifaces.Clavija;
import enchufes.ifaces.TomaCorriente;

/**
 * Implementa una toma de pared, que aporta un flujo
 * continuado de corriente.
 * 
 * @author mmacias
 */
public class TomaPared implements TomaCorriente {
    private Clavija clavija = null;
    public void enchufar(Clavija clavija) {
        this.clavija = clavija;
    }

    public void proporcionaCorriente() {
        if(clavija != null) {
            clavija.funcionar();      
        }
    }
    
}
