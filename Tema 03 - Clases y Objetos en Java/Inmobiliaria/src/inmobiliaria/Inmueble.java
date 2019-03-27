
package inmobiliaria;

public class Inmueble {
  double m2;
  Zona zona;
  
  double calculaPrecio() {
    return m2 * zona.precioMedioM2;
  }
}
