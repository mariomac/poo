package ejemplosets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Federacion {
  private HashMap<String, Equipo>
          registro = new HashMap<>();

  public void añade(Equipo e) {
    registro.put(
            e.getSiglas().toUpperCase()
            , e);
  }
  
  public void muestraTodos() {
    for(Equipo e : registro.values()) {
      System.out.println(e);
    }
  }
  public Equipo busca(String siglas) {
    return registro.get(siglas.toUpperCase());
  }
 
}
















