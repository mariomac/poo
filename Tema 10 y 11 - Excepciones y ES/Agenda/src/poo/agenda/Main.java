
package poo.agenda;

import java.io.FileNotFoundException;


public class Main {
  public static void main(String[] args) {
    try {
      Agenda a = GestorDisco.lee();
      
      a.print();
      
      GestorDisco.guarda(a);
      
    } catch (FileNotFoundException ex) {
      System.out.println("Fichero no encontrado!");
    }
  }
}
