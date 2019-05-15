package poo.videoclub;

import poo.videoclub.excepciones.ArchivoMalFormadoException;
import poo.videoclub.excepciones.IdentificadorInexistenteException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Controlador {

  private static final String ARCHIVO = "datos.txt";

  private Map<String, Pelicula> pelis = new HashMap<>();
  private Map<String, Cliente> clientes = new HashMap<>();
  
  public void cargarDatos() throws ArchivoMalFormadoException, FileNotFoundException {
    Scanner sc = new Scanner(new FileInputStream(ARCHIVO));
    String linea = sc.nextLine();
    if (!linea.startsWith("#### clientes")) {
      throw new ArchivoMalFormadoException("Esperaba una línea empezando por #### clientes");
    }
    // leer clientes
    while (sc.hasNextLine()) {
      linea = sc.nextLine().trim();
      if (linea.isEmpty()) {
        continue; // ignoramos líneas vacías
      }
      if (linea.startsWith("#### peliculas")) { // pasamos a ler las películas
        break;
      }
      String[] partes = linea.split(":");
    }



    sc.close();
  }

  public void guardarDatos() {

  }


  
  public List<Pelicula> buscar(String titulo) {
    List<Pelicula> resuls = new ArrayList<>();
    titulo = titulo.toLowerCase();
    for (Pelicula p : pelis.values()) {
      if(p.getTitulo().toLowerCase().contains(titulo)) {
        resuls.add(p);
      }
    } 
    return resuls;
  }
  
  public Pelicula getPelicula(String codigo)
                                      throws IdentificadorInexistenteException {
    Pelicula p = pelis.get(codigo);
    if (p == null) {
      throw new IdentificadorInexistenteException(codigo);
    }
    return p;
  }
  
  public Cliente getCliente(String dni)
                                      throws IdentificadorInexistenteException {
    Cliente c = clientes.get(dni);
    if (c == null) {
      throw new IdentificadorInexistenteException(dni);
    }
    return c;
  }
}
