package poo.grafos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ruta implements Iterable<Ciudad> {
  private List<Ciudad> ciudades = new LinkedList<>();


  public void add(Ciudad c) {
    ciudades.add(c);
  }

  public void addInicio(Ciudad c) {
    ciudades.add(0, c);
  }

  @Override
  public Iterator<Ciudad> iterator() {
    return ciudades.iterator();
  }

  public Ruta clonar() {
    Ruta clon = new Ruta();
    clon.ciudades = new LinkedList<>(ciudades);
    return clon;
  }
}
