package poo.coches.admin;

/**
 * La clase Gobierno es lo que llamamos un "Singleton", es decir,
 * una clase de la que existe UNA Y SOLO UNA instancia, y esta es
 * accesible desce cualquier punto
 */
public class Gobierno {
  // Al ser public static, hacemos que sea accesible desde cualquier
  // punto del programa
  // Al ser final, evitamos que nadie cambie el valor
  public static final Gobierno INSTANCIA = new Gobierno();
  
  private Matricula ultima;
  
  // Al hacer el constructor privado, hacemos que no se pueda
  // instanciar desde fuera de la clase, así que solo tenemos
  // una instancia de la clase
  private Gobierno() {
    ultima = Matricula.zero();
  }
  
  /**
   * Solicita una nueva matrícula al gobierno, y éste la devuelve
   * según la secuencia pertinente.
   */
  public Matricula solicitaMatricula() {
    ultima = Matricula.siguiente(ultima);
    return ultima;
  }
}
