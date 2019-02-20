package figuras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import programadibujo.Lienzo;

public class PlanoDibujo {

    List<Figura> figuras = new ArrayList<Figura>();

    public void dibujarPlano() {
        for(Figura f : figuras) {
            f.dibuja();
        }
    }
    
    public void agregaFigura(Figura f) {
        figuras.add(f);
    }    
}
