package poo.footing;

import info.macias.Ventana;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Footing {
  // Radio de la cámara por defecto (lo hemos medido)
  public static final double RADIO_CAMARA = 14;
  
  public static void main(String[] args) {
    // Iniciamos la ventana donde se mostrará la acción
    Ventana vent = new Ventana("Footing!");
    
    // Representamos un pelotón de corredores como un conjunto de éstos
    // como en un Set no controlamos en orden en que los corredores se dibujarán
    // puede ser que corredores que debieran estar más lejos según su posición
    // con respecto del horizonte se pinten encima de los que debieran estar más
    // cerca
    // Cuando veamos Listas y Herencia/Polimorfismo pondremos un parche para
    // que se muestren bien
    Set<Corredor> peloton = new HashSet<>();
    
    Random rnd = new Random();
    // inicializamos un pelotón aleatorio de 20 corredores
    for(int i = 0 ; i < 20 ; i++) {
      // nextDouble retorna un número aleatorio entre 0 y 1, entonces:
      // La posición 'y' será un número entre -5 y 5
      double y = 5 - rnd.nextDouble() * 10;
      // La velocidad 'v' será un número entre 0.1 y 1
      double v = 0.1 + rnd.nextDouble();

      peloton.add(new Corredor(y,v));
    }    
    
    // Mientras el usuario no pulse escape
    while(!vent.isPulsadoEscape()) {
      // Invocamos a 'correr' a todos los corredores del pelotón
      // que actualizarán su posición y se dibujarán en el nuevo fotograma
      for(Corredor c : peloton) {
        c.corre(vent);
      }
      // Se actualiza el nuevo fotograma mostrando las nuevas posiciones
      // de los corredores
      vent.actualizaFotograma();
    }
    
    // Cerramos la ventana
    vent.cerrar();
  }  
}
