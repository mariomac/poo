package enchufes.impl;

import enchufes.ifaces.Clavija;

/**
 * Implementa un televisor, que obtiene electricidad
 * a través de la clavija.
 * 
 * @author mmacias
 */
public class Televisor implements Clavija {
   private int canal = 1;

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void funcionar() {
        System.out.println("TV mostrando el canal " + canal);
    }   
   
}
