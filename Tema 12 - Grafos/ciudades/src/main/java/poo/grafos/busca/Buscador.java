package poo.grafos.busca;

import poo.grafos.Ciudad;
import poo.grafos.MapaCarreteras;
import poo.grafos.Ruta;

public abstract class Buscador {

  protected MapaCarreteras mapa;

  public Buscador(MapaCarreteras mapa) {
    this.mapa = mapa;
  }

  /**
   * Calcula la ruta desde una ciudad origen hasta el destino, según el mapa de carreteras dado.
   * Retorna el recorrido calculado, o null si no hay ruta posible.
   */
  public abstract Ruta ruta(Ciudad origen, Ciudad destino);
}
