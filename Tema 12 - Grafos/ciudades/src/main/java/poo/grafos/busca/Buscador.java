package poo.grafos.busca;

import poo.grafos.Ciudad;
import poo.grafos.MapaCarreteras;
import poo.grafos.Ruta;

public interface Buscador {

  /**
   * Calcula la ruta desde una ciudad origen hasta el destino, según el mapa de carreteras dado.
   * Retorna el recorrido calculado, o null si no hay ruta posible.
   */
  Ruta ruta(Ciudad origen, Ciudad destino, MapaCarreteras mapa);
}
