package enchufes.ifaces;

/**
 * Implementa una toma a corriente, que proporciona electricidad
 * a objetos que implementen la interfaz {@link Clavija}
 * @author mmacias
 */
public interface TomaCorriente {
    /**
     * Conecta una clavija a la toma de corriente.
     * Si clavija == null, es que no hay nada enchufado
     * @param clavija 
     */
    void enchufar(Clavija clavija);
    
    /**
     * Proporciona corriente a través de la clavija enchufada
     * llamando a su método {@link Clavija#funcionar()}
     */
    void proporcionaCorriente();
}
