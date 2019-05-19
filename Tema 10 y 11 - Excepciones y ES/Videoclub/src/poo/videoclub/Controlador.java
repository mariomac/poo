package poo.videoclub;

import poo.videoclub.excepciones.AlquilerException;
import poo.videoclub.excepciones.IdentificadorInexistenteException;
import poo.videoclub.excepciones.SaldoInsuficienteException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Controlador {

    private static final float PRECIO_ALQUILER = 1.5f;

    private static final String ARCHIVO_PELICULAS = "peliculas.txt";
    private static final String ARCHIVO_CLIENTES = "clientes.txt";

    private Map<String, Pelicula> pelis = new HashMap<>();
    private Map<String, Cliente> clientes = new HashMap<>();

    /**
     * Devuelve una lista de películas cuyo título contienen el texto a buscar.
     */
    public List<Pelicula> buscar(String textoABuscar) {
        List<Pelicula> resuls = new ArrayList<>();
        textoABuscar = textoABuscar.toLowerCase();
        for (Pelicula p : pelis.values()) {
            if (p.getTitulo().toLowerCase().contains(textoABuscar)) {
                resuls.add(p);
            }
        }
        return resuls;
    }

    /**
     * Retorna la película con el identificador pasado por parámetro.
     *
     * @throws IdentificadorInexistenteException Si no existe ninguna película con ese identificador.
     */
    public Pelicula getPelicula(String identificador) throws IdentificadorInexistenteException {
        Pelicula p = pelis.get(identificador);
        if (p == null) {
            throw new IdentificadorInexistenteException(identificador);
        }
        return p;
    }

    /**
     * Retorna el cliente con el DNI pasado por parámetro.
     *
     * @throws IdentificadorInexistenteException Si no existe ningún cliente con ese dni
     */
    public Cliente getCliente(String dni) throws IdentificadorInexistenteException {
        Cliente c = clientes.get(dni);
        if (c == null) {
            throw new IdentificadorInexistenteException(dni);
        }
        return c;
    }

    /**
     * Alquila la película con identificador pasado por argumento al cliente con DNI pasado por argumento.
     * @throws IdentificadorInexistenteException Si el identificador de la película o DNI del cliente son incorrectos.
     * @throws SaldoInsuficienteException Si el cliente no tiene saldo suficiente para alquilar una película.
     * @throws AlquilerException Si la película ya está alquilada a otro cliente.
     */
    public void alquila(String idPelicula, String dniCliente)
            throws IdentificadorInexistenteException, SaldoInsuficienteException, AlquilerException {
        Pelicula p = this.getPelicula(idPelicula);

        if (p.getAlquilada() != null) {
            throw new AlquilerException("película ya alquilada!");
        }

        Cliente c = this.getCliente(dniCliente);

        if (c.getSaldo() < PRECIO_ALQUILER) {
            throw new SaldoInsuficienteException(c);
        }
        c.setSaldo(c.getSaldo() - PRECIO_ALQUILER);

        p.setAlquilada(c);
    }

    /**
     * Devuelve la película ya alquilada, según el identificador de película que se pasa por argumento.
     * @throws IdentificadorInexistenteException Si no existe ninguna película por ese identificador.
     * @throws AlquilerException Si la película no está alquilada a nadie.
     */
    public void devuelve(String idPelicula) throws IdentificadorInexistenteException, AlquilerException {
        Pelicula p = getPelicula(idPelicula);
        if (p.getAlquilada() == null) {
            throw new AlquilerException("esta película no está alquilada");
        }
        p.setAlquilada(null);
    }

    /***********************
     * Funciones de lectura y escritura en disco
     ***********************/

    public void guardarDatos() throws FileNotFoundException {
        guardarClientes();
        guardarPeliculas();
    }

    public void leerDatos() throws FileNotFoundException {
        leerClientes();
        leerPeliculas();
    }

    /*
     * Guarda los clientes en un archivo de texto, en el que cada línea es un cliente, cuyos datos están en el siguiente
     * formato:
     *
     * <dni>:<nombre>:<saldo>
     *
     * Mirar el fichero `clientes.txt` como ejemplo.
     */
    private void guardarClientes() throws FileNotFoundException {
        PrintWriter disco = new PrintWriter(ARCHIVO_CLIENTES);
        for (Cliente c : clientes.values()) {
            disco.println(c.getDni() + ":" + c.getNombre() + ":" + c.getSaldo());
        }
        disco.close();
    }

    /*
     * Guarda las películas en un archivo de texto, en el que cada línea codifica los datos de una película según el
     * siguiente formato:
     *
     * Si la película está alquilada:
     *
     * <id>:<título>:<dni cliente que la alquiló>
     *
     * Si la película no está alquilada:
     *
     * <id>:<título>
     *
     * Mirar el fichero `peliculas.txt` como ejemplo.
     */
    private void guardarPeliculas() throws FileNotFoundException {
        PrintWriter disco = new PrintWriter(ARCHIVO_PELICULAS);
        for (Pelicula p : pelis.values()) {
            disco.print(p.getId() + ':' + p.getTitulo());
            if (p.getAlquilada() != null) {
                disco.print(":" + p.getAlquilada().getDni());
            }
            disco.println();
        }
        disco.close();
    }


    /*
     * Lee los clientes de un archivo de texto, en el que cada línea es un cliente, cuyos datos están en el siguiente
     * formato:
     *
     * <dni>:<nombre>:<saldo>
     *
     * Mirar el fichero `clientes.txt` como ejemplo.
     */
    private void leerClientes() throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream(ARCHIVO_CLIENTES));

        while (sc.hasNextLine()) {
            String linea = sc.nextLine().trim();
            if (linea.isEmpty()) {
                continue; // ignoramos líneas vacías
            }
            String[] partes = linea.split(":");
            Cliente c = new Cliente(partes[0], partes[1], Float.parseFloat(partes[2]));
            clientes.put(c.getDni(), c);
        }
        sc.close();
    }

    /*
     * Lee las películas de un archivo de texto, en el que cada línea codifica los datos de una película según el
     * siguiente formato:
     *
     * Si la película está alquilada:
     *
     * <id>:<título>:<dni cliente que la alquiló>
     *
     * Si la película no está alquilada:
     *
     * <id>:<título>
     *
     * Mirar el fichero `peliculas.txt` como ejemplo.
     */
    private void leerPeliculas() throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream(ARCHIVO_PELICULAS));
        while (sc.hasNextLine()) {
            String linea = sc.nextLine().trim();
            if (linea.isEmpty()) {
                continue; // ignoramos líneas vacías
            }
            String[] partes = linea.split(":");
            Pelicula p = new Pelicula(partes[0], partes[1]);
            if (partes.length == 3) {
                p.setAlquilada(clientes.get(partes[2]));
            }
            pelis.put(p.getId(), p);
        }
        sc.close();
    }

}
