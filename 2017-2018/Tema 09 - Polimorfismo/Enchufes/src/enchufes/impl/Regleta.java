package enchufes.impl;

import enchufes.ifaces.TomaCorriente;
import java.util.ArrayList;
import java.util.List;
import enchufes.ifaces.Enchufable;

/**
 * Implementa una regleta que es a la vez {@link Enchufable} y
 * {@link TomaCorriente}, y que puede proporcionar energía
 * a 3 enchufables.
 * 
 * @author mmacias
 */
public class Regleta implements Enchufable, TomaCorriente {

    public static final int NUM_CLAVIJAS = 3;
    private List<Enchufable> enchufables = new ArrayList<>();
    
    public void recibeCorriente() {
        proporcionaCorriente();
    }

    /**
     * Enchufa una clavija. Si ya había 3 clavijas,
     * desenchufa la más antigua.
     * @param clavija 
     */
    public void enchufar(Enchufable clavija) {
        if(enchufables.size() < NUM_CLAVIJAS) {
            enchufables.add(clavija);
        } else {
            enchufables.remove(0);
            enchufables.add(clavija);
        }
    }

    public void proporcionaCorriente() {
        for(Enchufable c : enchufables) {
            c.recibeCorriente();
        }
    }
    
    
}
