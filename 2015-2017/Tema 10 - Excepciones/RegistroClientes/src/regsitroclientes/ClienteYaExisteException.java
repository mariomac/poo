package regsitroclientes;

/**
 *
 * @author mmacias
 */
public class ClienteYaExisteException extends Exception {
    private Cliente original;

    public ClienteYaExisteException(Cliente original) {
        this.original = original;
    }

    public Cliente getOriginal() {
        return original;
    }
    
    
}
