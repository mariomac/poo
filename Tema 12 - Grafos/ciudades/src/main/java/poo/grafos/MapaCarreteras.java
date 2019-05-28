package poo.grafos;

import java.util.*;

/**
 * MapaCarreteras representa un mapa de carreteras como un grafo de ciudades
 */
public class MapaCarreteras {
  // Clave una ciudad Nodo, valor: lista de adyacentes para el nodo
  private Map<Ciudad, Set<Ciudad>> conexiones = new HashMap<>();

  /**
   * Conecta dos ciudades en el mapa en la dirección origen --> destino
   */
  public void conecta(Ciudad origen, Ciudad destino) {
    Set<Ciudad> adyacentes = conexiones.get(origen);
    // Si no hay ciudades adyacentes aún, creamos el conjunto
    if (adyacentes == null) {
      adyacentes = new HashSet<>();
      conexiones.put(origen, adyacentes);
    }
    adyacentes.add(destino);
  }

  /**
   * Conecta dos ciudades en el mapa, en ambas direcciones.
   */
  public void conectaBidireccion(Ciudad c1, Ciudad c2) {
    conecta(c1, c2);
    conecta(c2, c1);
  }

  public Map<Ciudad, Set<Ciudad>> getConexiones() {
    return conexiones;
  }
}
