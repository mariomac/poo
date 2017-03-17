package poo.footing;

import info.macias.Ventana;
import java.awt.Color;

/**
 * Clase que representa un Corredor en pantalla.
 * Gestiona la posición así como el pintado en
 * pantalla
 */
public class Corredor {
  // Dimensiones del corredor, es decir, del rectángulo que lo
  // enmarca
  private static final double ANCHO = 4;
  private static final double ALTO = 6;
  
  // Posición del corredor, dada por la esquina superior derecha del
  // rectángulo que lo enmarca
  private double x, y;
  
  // Velocidad del corredor
  private double v;

  /**
   * Construye un corredor, dada una posición vertical y la velocidad.
   * La posición horizontal se inicializa automáticamente a una posición
   * fuera de la cámar
   * @param y Posición vertical del corredor
   * @param v Velocidad
   */
  public Corredor(double y, double v) {
    // Restamos el ancho a la posición, para que el corredor esté
    // completamente fuera de cámara
    this.x = -Footing.RADIO_CAMARA - ANCHO;
    this.y = y;
    this.v = v;
  }
  
  public void corre(Ventana vent) {
    // Incrementa la posición del corredor según su velocidad
    x = x + v;
    
    // Cuando el corredor sale de cámara por la derecha, vuelve
    // a iniciar su posición a la parte izquierda de la pantalla
    if(x > Footing.RADIO_CAMARA) {
      x = -Footing.RADIO_CAMARA - ANCHO;
    }
    // Dibujar el corredor
    vent.dibujaAnimacion(
            "/animacion.png", // archivo con la animación
            x, y, ANCHO, ALTO, // dimensiones del cuadro
            12, // fotogramas de animación
            100); // tiempo durante el cual se mostrará cada fotograma
  }  
}
