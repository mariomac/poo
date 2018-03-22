package poo.tema6;

import java.util.HashMap;
import java.util.Map;

public class RegistroClientes {
  private Map<String,Cliente> clientes
          = new HashMap<>();
  
  public void registrar(Cliente c) {
    clientes.put(c.getNif(), c);
  }
  public void baja(String nif) {
    clientes.remove(nif);
  }
  public Cliente busca(String nif) {
    return clientes.get(nif);
  }
  public void printListadoClientes() {
    for(Cliente c : clientes.values()) {
      System.out.println(c);
    }
  }
}
