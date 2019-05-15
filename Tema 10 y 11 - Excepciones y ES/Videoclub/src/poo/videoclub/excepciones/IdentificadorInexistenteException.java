package poo.videoclub.excepciones;

public class IdentificadorInexistenteException extends Exception {
  
  public IdentificadorInexistenteException(String identificador) {
    super("Identificador inexistente: " + identificador);
  }

}
