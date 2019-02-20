package enchufes.impl;

import enchufes.ifaces.TomaCorriente;
import enchufes.ifaces.Enchufable;

/**
 * Clase que implementa una toma con un interruptor
 * que activa o desactiva el paso a corriente
 * @author mmacias
 */
public class TomaInterruptor implements TomaCorriente {
    private Enchufable clavija = null;
    private boolean activado = false;

    public void setActivado(boolean activado) {
        this.activado = activado;
    }
    
    public void enchufar(Enchufable clavija) {
        this.clavija = clavija;
    }

    public void proporcionaCorriente() {
        if(activado && clavija != null) {
            clavija.recibeCorriente();
        }
    }
    
    
}
