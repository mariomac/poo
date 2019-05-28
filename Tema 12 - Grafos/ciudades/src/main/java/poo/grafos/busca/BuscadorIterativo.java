package poo.grafos.busca;

import poo.grafos.Ciudad;
import poo.grafos.MapaCarreteras;
import poo.grafos.Ruta;
import poo.grafos.pendientes.NodosPendientes;

/**
 * Implementación iterativa de la búsqueda de la ruta. Ésta será una búsqueda
 * en profundidad (depth first search) o en amplitud (breadth first search) según si
 * el atributo "pendientes" es una Pila o una Cola, respectivamente.
 */
public class BuscadorIterativo extends Buscador {
	/**
	 * Estructura de datos que guarda los nodos que se deben visitar en el futuro.
	 */
	private NodosPendientes pendientes;

	/**
	 * Construye un buscador Iterativo al que se le debe pasar una subclase de NodosPendientes,
	 * pudiendo ser una Pila o una Cola.
	 */
	public BuscadorIterativo(MapaCarreteras mapa, NodosPendientes pendientes) {
		super(mapa);
		this.pendientes = pendientes;
	}


	@Override
	public Ruta ruta(Ciudad origen, Ciudad destino) {
		// Creamos una primera ruta parcial que sólo contenga la ciudad de origen
		Ruta ruta = new Ruta();
		ruta.agrega(origen);
		pendientes.agregar(ruta.clonar());

		// Mientras queden rutas por calcular
		while (!pendientes.isVacia()) {
			// miramos la siguiente ruta
			Ruta rutaActual = pendientes.sacar();

			// miramos las ciudades vecinas de la última ciudad de la ruta, para
			// intentar ver todas las posibilidades
			for (Ciudad vecina : mapa.getConexiones().get(rutaActual.ultima())) {

				// Creamos los siguientes pasos a partir de la ruta actual. IMPORTANTE
				// clonar la ruta, ya que si no añadiríamos todas las ciudades vecinas
				// a un mismo objeto
				Ruta siguientePaso = rutaActual.clonar();
				siguientePaso.agrega(vecina);

				// Si la ciudad vecina que hemos encontrado es la ciudad destino,
				// retornamos la ruta calculada hasta ahí.
				if (vecina.equals(destino)) {
					return siguientePaso;
				}

				// Si no, añadimos la ruta a la cola de rutas pendientes por seguir
				// buscando.
				if (!rutaActual.contiene(vecina)) {
					pendientes.agregar(siguientePaso);
				}
			}
		}

		// si hemos llegado hasta aquí, es que no se ha encontrado nada
		return null;
	}
}
