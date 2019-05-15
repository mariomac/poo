package poo.videoclub;

import poo.videoclub.excepciones.ComandoInexistenteException;

public class Main {
  public static void main(String[] args) {
    InterfazUsuario iu = new InterfazUsuario();
    iu.inicializar();
    boolean continuar = true;
    while(continuar) {
      try {
        continuar = iu.leeComando();
      } catch (ComandoInexistenteException ex) {
        System.out.println("Error: " + ex.getMessage());
      }
    }
  }
}
