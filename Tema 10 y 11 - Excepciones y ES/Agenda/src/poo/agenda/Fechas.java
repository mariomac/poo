package poo.agenda;


/**
 * Clase que implementa algunos métodos auxiliaras para el formato de
 * fechas y horas.
 */
public class Fechas {
  /**
   * Dado un entero en formato "hhmm", retorna un string en formato "hh:mm" 
   */
  public static String hora(int hhmm) {
    return String.format("%02d:%02d",
            hhmm / 100,
            hhmm % 100);
  }
  
  /**
   * Dada un entero en formato "aaaammdd", retorna un string 
   * en formato "dd/mm/aaaa".
   */
  public static String dia(int ymd) {
    return String.format("%02d/%02d/%04d",
            ymd % 100,
            (ymd / 100) % 100,
            ymd / 10000);
  }
}
