
package poo.agenda;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Funciones para la lectura y escritura de una Agenda en disco.
 */
public class GestorDisco {
  private static final String ARCHIVO = "datos.txt";
  
  /**
   * Guarda una agenda en disco, en el formato:
   * - para cada día:
   *   1. escribe una línea con la fecha de ese día, en formato aaaammdd
   *   2. para cada evento del día:
   *      2.1 escribe una línea en formato: hhmm_inicio:hhmm_fin:descripción
   */
  public static void guarda(Agenda agenda) throws FileNotFoundException {
    PrintWriter disco = new PrintWriter(ARCHIVO);
    for (Dia d : agenda) {
      disco.println(d.getFecha());
      for (Evento e : d) {
        disco.print(e.getInicio());
        disco.print(":");
        disco.print(e.getFin());
        disco.print(":");                
        disco.println(e.getDescripcion());
      }
    }
    disco.close();
  }
  
  /**
   * Lee los datos de disco según el formato en que se ha guardado en el método
   * guarda()
   */
  public static Agenda lee() throws FileNotFoundException {
    FileInputStream fis = new FileInputStream(ARCHIVO);
    Scanner scanner = new Scanner(fis);
    Agenda agenda = new Agenda();
    Dia diaLeyendo = null;
    
    while(scanner.hasNextLine()) {
      String linea = scanner.nextLine().trim();
      if (linea.isEmpty()) {
        // ignoramos las líneas en blancos
        continue;
      }
      String[] partes = linea.split(":");
      if (partes.length == 1) {
        // Dia
        int fecha = Integer.parseInt(partes[0]);
        diaLeyendo = new Dia(fecha);
        agenda.add(diaLeyendo);
      } else {
        int inicio = Integer.parseInt(partes[0]);
        int fin = Integer.parseInt(partes[1]);
        String descripcion = partes[2];
        Evento e = new Evento(inicio, fin, descripcion);
        diaLeyendo.add(e);
      }
    }
   
    scanner.close();
    return agenda;
  }

}
