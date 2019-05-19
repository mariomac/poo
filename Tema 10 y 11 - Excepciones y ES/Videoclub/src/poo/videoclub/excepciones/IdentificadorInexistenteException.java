package poo.videoclub.excepciones;

public class IdentificadorInexistenteException extends Exception {
    private String identificador;

    public IdentificadorInexistenteException(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }
}
