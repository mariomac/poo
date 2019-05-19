package poo.grafos.busca;

import poo.grafos.Ciudad;
import poo.grafos.MapaCarreteras;

import java.util.*;

public class DepthFirstRecursivo implements Buscador {
  private Set<Ciudad> visitadas = new HashSet<>();

  @Override
  public List<Ciudad> ruta(Ciudad origen, Ciudad destino, MapaCarreteras mapa) {
    if (origen.equals(destino)) {
      List<Ciudad> camino = new LinkedList<>();
      camino.add(origen);
      return camino;
    }

    visitadas.add(origen);

    for (Ciudad adyacente : mapa.getConexiones().get(origen)) {
      if (!visitadas.contains(adyacente)) {
        List<Ciudad> subCamino = ruta(adyacente, destino, mapa);
        // Si se ha llegado desde una adyacente al destino, es que hay un camino! Añadimos
        // la ciudad actual al inicio de dicho camino y lo retornamos
        if (subCamino != null) {
          subCamino.add(0, origen);
          return subCamino;
        }
      }
    }

    return null;
  }
}
