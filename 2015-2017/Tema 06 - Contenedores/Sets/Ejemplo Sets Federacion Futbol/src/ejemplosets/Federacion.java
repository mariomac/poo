package ejemplosets;

import java.util.HashSet;
import java.util.Iterator;

public class Federacion {
  private HashSet<Equipo> registro
          = new HashSet<Equipo>();  
  public void añade(Equipo e) {
    registro.add(e);
  }
  
  public void muestraTodos() {
    for(Equipo e : registro) {
      System.out.println(e);
    }
  }
  public Equipo busca(String siglas) {
    for(Equipo e : registro) {
      if(siglas.equalsIgnoreCase(
              e.getSiglas())) {
        return e;
      }
    }
    return null;
  }
  
  public Iterator<Equipo> iterador() {
    return registro.iterator();
  }
}
















