package poo.ej.ex;

public class ReferenciaException extends Exception {

    private String idReferencia;

    public ReferenciaException(String idReferencia) {
        this.idReferencia = idReferencia;
    }

    public String getIdReferencia() {
        return idReferencia;
    }
}
