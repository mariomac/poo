package enchufes.impl;

import enchufes.ifaces.TomaCorriente;
import enchufes.ifaces.Enchufable;

/**
 * Implementa una toma de corriente con un temporizador,
 * que solo proporcionará corriente cuando la hora actual
 * esté entre dos horas dadas.
 * 
 * @author mmacias
 */
public class TomaTemporizador implements TomaCorriente {
    private int desde, hasta;
    private int horaActual;
    private Enchufable clavija;
    
    public TomaTemporizador(int desde, int hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }

    public void setHoraActual(int horaActual) {
        this.horaActual = horaActual;
    }
    @Override
    public void enchufar(Enchufable clavija) {
        this.clavija = clavija;
    }

    @Override
    public void proporcionaCorriente() {
        if(horaActual >= desde && horaActual < hasta && clavija != null) {
            clavija.recibeCorriente();
        }
    }
    
}
