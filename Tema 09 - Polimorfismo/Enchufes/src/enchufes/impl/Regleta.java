package enchufes.impl;

import enchufes.ifaces.Clavija;
import enchufes.ifaces.TomaCorriente;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementa una regleta que es a la vez {@link Clavija} y
 * {@link TomaCorriente}, y que puede proporcionar energía
 * a 3 clavijas.
 * 
 * @author mmacias
 */
public class Regleta implements Clavija, TomaCorriente {

    public static final int NUM_CLAVIJAS = 3;
    private List<Clavija> clavijas = new ArrayList<>();
    
    public void funcionar() {
        proporcionaCorriente();
    }

    public void enchufar(Clavija clavija) {
        if(clavijas.size() < NUM_CLAVIJAS) {
            clavijas.add(clavija);
        } else {
            clavijas.remove(0);
            clavijas.add(clavija);
        }
    }

    public void proporcionaCorriente() {
        for(Clavija c : clavijas) {
            c.funcionar();
        }
    }
    
    
}
