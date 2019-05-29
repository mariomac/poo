package poo.agenda;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * La clase Dia guarda los eventos para una fecha dada.
 * 
 * Al implementar la interfaz Iterable<Evento>, podemos usar un objeto Dia
 * directamente en un for-each (gracias al método iterator()) para recorrer
 * los eventos que éste día contiene.
 * 
 */
public class Dia implements Iterable<Evento> {
  private Set<Evento> eventos = new TreeSet<>();
  
  private int fecha;

  public Dia(int fecha) {
    this.fecha = fecha;
  }
  
  public int getFecha() {
    return fecha;
  }
  
  public void add(Evento e) {
    eventos.add(e);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(Fechas.dia(fecha));
    sb.append("\n==========\n");
    for(Evento e : eventos) {
      sb.append(e).append("\n");
    }
    return sb.toString();
  }

  // Retorna un iterador a los eventos. Este método implementa la interfaz
  // Iterable<Evento> y gracias a éste podemos usar un objeto Dia en un
  // for-each directamente.
  @Override
  public Iterator<Evento> iterator() {
    return eventos.iterator();
  }
  
}
