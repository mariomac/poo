package poo.agenda;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * La clase Agenda guarda los datos de unos días, accesibles por su fecha
 * en formato numérico AAAAMMDD.
 * 
 * Al implementar la interfaz Iterable<Dia>, podemos usar un objeto Agenda
 * directamente en un for-each (gracias al método iterator()) para recorrer 
 * los días de la Agenda.
 */
public class Agenda implements Iterable<Dia> {
  
  // Días en la Agenda, accesibles por una fecha.
  private Map<Integer, Dia> dias = new TreeMap<>();
  
  // Añade un día a la agenda.
  public void add(Dia d) {
    dias.put(d.getFecha(), d);
  }
  
  // Añade un evento al día correspondiente a la fecha dada, en formato
  // AAAAMMDD. Si el día no existe, lo añade.
  public void añade(int fecha, Evento e) {
    Dia d = dias.get(fecha);
    if (d == null) {
      d = new Dia(fecha);
      dias.put(fecha, d);
    }
    d.add(e);
  }
  
  // Muestra por pantalla los datos referentes a todos los días.
  public void print() {
    for (Dia d : dias.values()) {
      System.out.println(d);
    }
  }

  // Retorna un iterador a los días. Este método implementa la interfaz
  // Iterable<Dia> y gracias a éste podemos usar un objeto Agenda en un
  // for-each directamente.
  @Override
  public Iterator<Dia> iterator() {
    return dias.values().iterator();
  }
  
  
}
