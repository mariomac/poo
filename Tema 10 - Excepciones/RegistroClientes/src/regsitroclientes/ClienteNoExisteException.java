package regsitroclientes;

public class ClienteNoExisteException extends Exception {
    private String dni;

    public ClienteNoExisteException(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }
    
    
    
    
    
}
