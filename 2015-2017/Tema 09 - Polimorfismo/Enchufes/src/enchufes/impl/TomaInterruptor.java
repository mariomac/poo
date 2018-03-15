package enchufes.impl;

import enchufes.ifaces.Clavija;
import enchufes.ifaces.TomaCorriente;

/**
 * Clase que implementa una toma con un interruptor
 * que activa o desactiva el paso a corriente
 * @author mmacias
 */
public class TomaInterruptor implements TomaCorriente {
    private Clavija clavija = null;
    private boolean activado = false;

    public void setActivado(boolean activado) {
        this.activado = activado;
    }
    
    public void enchufar(Clavija clavija) {
        this.clavija = clavija;
    }

    public void proporcionaCorriente() {
        if(activado && clavija != null) {
            clavija.funcionar();
        }
    }
    
    
}
