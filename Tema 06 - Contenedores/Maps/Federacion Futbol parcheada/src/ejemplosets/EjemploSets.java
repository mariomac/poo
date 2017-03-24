package ejemplosets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjemploSets {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Federacion rfef = new Federacion();
    rfef.añade(new Equipo("FC Barcelona",
                          "FCB"));
    rfef.añade(new Equipo("Real Madrid",
                          "RMA"));
    rfef.añade(new Equipo("Atletico Madrid",
                          "ATM"));
    rfef.añade(new Equipo("Athletic Bilbao",
                          "ATB"));
    rfef.muestraTodos();
    
    System.out.print("Dime las siglas"
            + " de un equipo:");
    String siglas = teclado.next();
    Equipo e = rfef.busca(siglas);
    if(e == null) {
      System.out.println("El equipo '"
         + siglas + "' no existe");
    } else {
      System.out.println("El equipo es: ");
      System.out.println(e.toString());
    }
  }

}
