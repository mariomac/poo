package poo.grafos.busca;

import poo.grafos.Ciudad;
import poo.grafos.MapaCarreteras;
import poo.grafos.Ruta;

import java.util.*;

public class DepthFirstRecursivo implements Buscador {
  private Set<Ciudad> visitadas = new HashSet<>();

  @Override
  public Ruta ruta(Ciudad origen, Ciudad destino, MapaCarreteras mapa) {
    if (origen.equals(destino)) {
      Ruta camino = new Ruta();
      camino.add(origen);
      return camino;
    }

    visitadas.add(origen);

    for (Ciudad adyacente : mapa.getConexiones().get(origen)) {
      if (!visitadas.contains(adyacente)) {
        Ruta subCamino = ruta(adyacente, destino, mapa);
        // Si se ha llegado desde una adyacente al destino, es que hay un camino! Añadimos
        // la ciudad actual al inicio de dicho camino y lo retornamos
        if (subCamino != null) {
          subCamino.addInicio(origen);
          return subCamino;
        }
      }
    }

    return null;
  }
}
