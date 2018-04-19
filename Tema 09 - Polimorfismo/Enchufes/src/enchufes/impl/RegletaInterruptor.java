package enchufes.impl;

/**
 * Extiende la clase {@link Regleta} para añadir un interruptor
 * 
 * @author mmacias
 */
public class RegletaInterruptor extends Regleta {
    private boolean activado = false;
    public void setActivado(boolean activado) {
        this.activado = activado;
    }
    
    public void proporcionaCorriente() {
        if(activado) {
            super.proporcionaCorriente();
        }
    }
    
}
