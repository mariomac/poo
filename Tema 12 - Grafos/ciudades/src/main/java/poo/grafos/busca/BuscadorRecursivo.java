package poo.grafos.busca;

import poo.grafos.Ciudad;
import poo.grafos.MapaCarreteras;
import poo.grafos.Ruta;

import java.util.HashSet;
import java.util.Set;

/**
 * Buscador de rutas recursivo. Buscará el grafo en profundidad (depth first
 * search)
 */
public class BuscadorRecursivo extends Buscador {

	// ciudades ya visitadas
	private Set<Ciudad> visitadas = new HashSet<>();

	public BuscadorRecursivo(MapaCarreteras mapa) {
		super(mapa);
	}

	@Override
	public Ruta ruta(Ciudad origen, Ciudad destino) {
		// Si ya he visitado esta ciudad, la ignoro.
		if (visitadas.contains(origen)) {
			return null;
		}
		visitadas.add(origen);

		// Caso trivial: si el origen es igual que el destino, la ruta tendrá
		// una sola ciudad: el destino.
		if (origen.equals(destino)) {
			Ruta r = new Ruta();
			r.agrega(destino);
			return r;
		}

		// Caso no trivial (recursivo): si existe la ruta desde algún nodo adyacente
		// al origen hasta el destino, entonces la ruta a retornar será:
		// origen -> adyacente -> ... -> destino
		Set<Ciudad> adyacentes = mapa.getConexiones().get(origen);
		for (Ciudad adyacente : adyacentes) {
			Ruta rutaAdyacente = ruta(adyacente, destino);
			if (rutaAdyacente != null) {
				rutaAdyacente.agregaInicio(origen);
				return rutaAdyacente;
			}
		}

		// si he llegado hasta aquí, es que no se ha encontrado ninguna ruta
		// entre el origen y el destino
		return null;
	}
}
