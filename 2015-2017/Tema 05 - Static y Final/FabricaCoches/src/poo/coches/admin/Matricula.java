package poo.coches.admin;

import java.util.Arrays;

public class Matricula {
  private int num;
  private char[] letras;

  /**
   * Hacemos el constructor privado para que esta clase se pueda
   * instanciar desde los métodos estáticos de la propia clase,
   * y nadie pueda crear matrículas alegremente
   */
  private Matricula(int num, char[] letras) {
    this.num = num;
    this.letras = letras;
  }
  
  /**
   * Método estático que retorna la matrícula "cero", es decir la
   * primera de la serie.
   * 
   * En teoría este método solo se debería llamar una vez.
   * 
   * Es un método "protected" para que solo se pueda llamar desde
   * la clase "Gobierno", que está en este mismo paquete (sólo
   * el gobierno puede crear matrículas).
   */
  protected static Matricula zero() {
    return new Matricula(0,
      new char[] {'A', 'A', 'A'});
  }
  
  /**
   * Método estático que retorna la matrícula siguiente en la serie
   * a la matrícula que se le pasa por parámetro.
   * 
   * Es un método "protected" para que solo se pueda llamar desde
   * la clase "Gobierno", que está en este mismo paquete (sólo
   * el gobierno puede crear matrículas).
   */
  protected static Matricula siguiente(Matricula m) {
    // Copia un array
    char[] nl = Arrays.copyOf(m.letras, 3);
    
    int num = m.num + 1;
    if(num > 9999) {
      num = 0;
      nl[2] = (char)(m.letras[2] + 1);
      if(nl[2] > 'Z') {
        nl[2] = 'A';
        nl[1] = (char)(m.letras[1] + 1);
        if(nl[1] > 'Z') {
          nl[1] = 'A';
          nl[0] = (char)(m.letras[0] + 1);
        }
      }
    }
    return new Matricula(num, nl);
  }
  
  public String toString() {
    return String.format("%04d", num) 
            + String.valueOf(letras);
  }
  
}
