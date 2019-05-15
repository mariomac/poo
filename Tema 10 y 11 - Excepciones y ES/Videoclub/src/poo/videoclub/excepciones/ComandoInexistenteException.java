package poo.videoclub.excepciones;

public class ComandoInexistenteException
        extends Exception {

  public ComandoInexistenteException() {
    super("comando inexistente!");
  }
}
