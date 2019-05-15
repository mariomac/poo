package poo.videoclub;

public class Pelicula {
  private String id;
  private String titulo;
  private Cliente alquilada;
  
  public Pelicula(String id, String titulo) {
    this.id = id;
    this.titulo = titulo;
    alquilada = null;
  }

  public String getTitulo() {
    return titulo;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(id).append(": ").append(titulo);
    if (alquilada != null) {
        sb.append(" (alquilada a ");
        sb.append(alquilada).append(")");
    }
    return sb.toString();
  }
  
  
}
