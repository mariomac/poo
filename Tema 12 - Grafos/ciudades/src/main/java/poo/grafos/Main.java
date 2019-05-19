package poo.grafos;

import poo.grafos.busca.BreadthFirst;
import poo.grafos.busca.DepthFirst;
import poo.grafos.busca.DepthFirstRecursivo;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Ciudad gi = new Ciudad("Girona");
    Ciudad le = new Ciudad("Lleida");
    Ciudad b = new Ciudad("Barcelona");
    Ciudad t = new Ciudad("Tarragona");
    Ciudad ca = new Ciudad("Castellón");
    Ciudad v = new Ciudad("Valencia");
    Ciudad hu = new Ciudad("Huesca");
    Ciudad bi = new Ciudad("Bilbao");
    Ciudad z = new Ciudad("Zaragoza");
    Ciudad sa = new Ciudad("Santander");
    Ciudad m = new Ciudad("Madrid");
    Ciudad al = new Ciudad("Albacete");
    Ciudad to = new Ciudad("Toledo");

    MapaCarreteras map = new MapaCarreteras();
    map.conectaBidireccion(gi, le);
    map.conectaBidireccion(gi, b);
    map.conectaBidireccion(le, b);
    map.conectaBidireccion(le, hu);
    map.conectaBidireccion(b, t);
    map.conectaBidireccion(t, ca);
    map.conectaBidireccion(ca, v);
    map.conectaBidireccion(v, z);
    map.conectaBidireccion(v, al);
    map.conectaBidireccion(hu, z);
    map.conectaBidireccion(hu, bi);
    map.conectaBidireccion(bi, sa);
    map.conectaBidireccion(z, m);
    map.conectaBidireccion(al, to);
    map.conectaBidireccion(to, m);

    System.out.println("Desde Girona a Toledo con BreadFirst");
    printCamino(new BreadthFirst().ruta(gi, to, map));

    System.out.println("Desde Girona a Toledo con DepthFirst");
    printCamino(new DepthFirst().ruta(gi, to, map));

    System.out.println("Desde Girona a Toledo con DepthFirstRecursivo");
    printCamino(new DepthFirstRecursivo().ruta(gi, to, map));
  }

  public static void printCamino(Ruta ciudades) {
    boolean primera = true;
    for (Ciudad c : ciudades) {
      if (primera) {
        primera = false;
      } else {
        System.out.print(" -> ");
      }
      System.out.print(c.getNombre());
    }
    System.out.println();
  }
}
