package poo.videoclub;

public class Pelicula {
    /**
     * Identificador único de la película
     */
    private String id;

    /**
     * Título de la película
     */
    private String titulo;

    /**
     * Cliente al cual está alquilada. Si es null, la película está sin alquilar.
     */
    private Cliente alquilada;

    public Pelicula(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        alquilada = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Cliente getAlquilada() {
        return alquilada;
    }

    public void setAlquilada(Cliente alquilada) {
        this.alquilada = alquilada;
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
