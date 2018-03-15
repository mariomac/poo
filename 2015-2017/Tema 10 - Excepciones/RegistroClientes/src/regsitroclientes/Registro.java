package regsitroclientes;

import java.util.HashMap;
import java.util.Map;

public class Registro {
    private Map<String,Cliente> clientes = new HashMap<>();
    
    public void añadir(Cliente c) throws ClienteYaExisteException{
        Cliente original = clientes.get(c.getDni());
        if(original != null) {
            throw new ClienteYaExisteException(original);
        }

        clientes.put(c.getDni(),c);
    }
    
    public Cliente obtener(String dni) throws ClienteNoExisteException {
        Cliente c = clientes.get(dni);
        if(c == null) throw new ClienteNoExisteException(dni);
        
        return c;
    }
}
