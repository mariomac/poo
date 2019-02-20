package enchufes.ifaces;

/**
 * Implementa una toma a corriente, que proporciona electricidad
 * a objetos que implementen la interfaz {@link Enchufable}
 * @author mmacias
 */
public interface TomaCorriente {
    /**
     * Conecta un enchufable a la toma de corriente.
     * Si enchufable == null, es que no hay nada enchufado
     * @param enchufable 
     */
    void enchufar(Enchufable enchufable);
    
    /**
     * Proporciona corriente a través del enchufable
     * llamando a su método {@link Enchufable#funcionar()}
     */
    void proporcionaCorriente();
}
