package enchufes.impl;

import enchufes.ifaces.Enchufable;

/**
 * Implementa un televisor, que obtiene electricidad
 * a través de la clavija.
 * 
 * @author mmacias
 */
public class Televisor implements Enchufable {
   private int canal = 1;

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void recibeCorriente() {
        System.out.println("TV mostrando el canal " + canal);
    }   
   
}
