package poo.ej;

import poo.ej.ex.FormatoException;
import poo.ej.ex.ReferenciaException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Controlador {
    // palabras clave del archivo de referencias
    private static final String APT_REFERENCIAS = "Referencias";
    private static final String APT_STOCKS = "Stocks";
    // Datos en memoria
    private Map<String, Referencia> refs = new HashMap<>();
    private Set<Stock> stocks = new HashSet<>();

    // Carga los datos del programa, pudiendo lanzar las siguientes excepciones
    // - IOException: si el archivo pasado como parámetro no existe, o no se puede leer
    // - ReferenciaException
    //     - Cuando un identificador de referencia del apartado `Referencias` esté duplicada.
    //     - Cuando un identificador del apartado `Stocks` no esté registrado en la sección `Referencias`.
    // - Lanzará `FormatoException`
    //     - Cuando el archivo no esté en el formato arriba mencionado.
    //     - Cuando las referencias no tengan 2 campos.
    //    - Cuando los stocks no tengan 3 campos.
    //    - Cuando allá donde debe ir un entero (precio y cantidad), haya otro tipo de cadena.
    public void cargar(String nombreArchivo) throws IOException, FormatoException, ReferenciaException {

        BufferedReader archivo = new BufferedReader( new FileReader(nombreArchivo));

        String linea = null;
        try {
            // Lo primero que hacemos es verificar que la primera línea del archivo es correcta
            linea = archivo.readLine();
            if (!APT_REFERENCIAS.equals(linea)) {
                throw new FormatoException( "Me esperaba la palabra '" + APT_REFERENCIAS
                        + "' y me he encontrado: " + linea);
            }

            // Luego leemos las referencias una a una
            linea = archivo.readLine();
            // mientras no llegue al final del archivo o a la sección de stocks
            while (linea != null && !APT_STOCKS.equals(linea)) {
                String[] datos = linea.split(":");
                // Compruebo que el tamaño de los datos de una referncia es correcto
                if (datos.length != 2) {
                    throw new FormatoException( "La linea '" + linea + "' debe tener 2 campos");
                }
                // Compruebo que el identificador de la referencia no esté duplicado
                String id = datos[0];
                if (refs.containsKey(id)) {
                    throw new ReferenciaException(id);
                }
                // Creo la referencia y la guardo en el mapa
                Referencia nuevaRef = new Referencia(id, datos[1]);
                refs.put(id, nuevaRef);

                linea = archivo.readLine();
            }

            // Sección de stocks
            linea = archivo.readLine();

            while (linea != null) {
                String[] datos = linea.split(":");
                // Compruebo que el tamaño de los campos del stock es correcto
                if (datos.length != 3) {
                    throw new FormatoException( "La linea '" + linea + "' debe tener 3 campos");
                }
                String id = datos[0];
                int cantidad = Integer.parseInt(datos[1]); // Puede lanzar NumberFormatException
                int precio = Integer.parseInt(datos[2]);

                // Compruebo que la referencia para la que leemos el identificador, ya exista
                Referencia ref = refs.get(id);
                if (ref == null) {
                    throw new ReferenciaException(id);
                }

                Stock nuevo = new Stock(ref, cantidad, precio);
                stocks.add(nuevo);

                linea = archivo.readLine();
            }

            archivo.close();
        } catch (NumberFormatException e) {
            // Si Integer.parseInt me lanza excepción, la relanzo como error de formato
            throw new FormatoException("error leyendo numeros enteros: " + linea);
        }
    }

    public void muestraStocks() {
        for (Stock s : stocks) {
            System.out.println(s);
        }
    }

}
