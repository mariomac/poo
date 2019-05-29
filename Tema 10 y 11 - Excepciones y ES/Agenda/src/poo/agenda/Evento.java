package poo.agenda;

/**
 * Guarda un evento de la agenda, caracterizado por una hora de inicio y fin,
 * y una descripción.
 * 
 * Al implementar la interfaz Comparable, podemos guardar los eventos en un
 * TreeSet, y éste los ordenará automáticamente según su hora de inicio
 * (tal y como especificamos en el método compareTo)
 */
public class Evento implements Comparable<Evento> {
  private int inicio;
  private int fin;
  private String descripcion;

  public Evento(int inicio, int fin, String descripcion) {
    this.inicio = inicio;
    this.fin = fin;
    this.descripcion = descripcion;
  }

  public int getInicio() {
    return inicio;
  }

  public int getFin() {
    return fin;
  }

  public String getDescripcion() {
    return descripcion;
  }
  
  public String toString() {
    return Fechas.hora(inicio)
            + " -> " + Fechas.hora(fin)
            + " : " + descripcion;
  }

  /**
   * este método comparará dos eventos (this y o) según el criterio de
   * ordenación (en este caso, la hora de inicio).
   * 
   * Retorna un número negativo si "this" es anterior a "o"
   * Retorna un número positivo si "this" es posterior a "o"
   * Retorna 0 si "this" va en el mismo orden que "o"
   */
  @Override
  public int compareTo(Evento o) {
    return this.inicio - o.inicio;
  }
}
