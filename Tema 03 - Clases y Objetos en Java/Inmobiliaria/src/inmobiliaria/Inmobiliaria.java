package inmobiliaria;

public class Inmobiliaria {

  public static void main(String[] args) {
    Inmueble i = new Inmueble();
    i.m2 = 60;
    Zona z = new Zona();
    z.precioMedioM2 = 2000;
    i.zona = z;
    
    Inmueble i2 = new Inmueble();
    i2.m2 = 120;
    i2.zona = z;
    
    System.out.println("Precio: "
            + i.calculaPrecio() );
  }
  
}
