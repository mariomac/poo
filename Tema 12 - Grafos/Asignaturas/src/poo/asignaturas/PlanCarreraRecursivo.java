package poo.asignaturas;

import java.util.ArrayList;
import java.util.List;

public class PlanCarreraRecursivo extends PlanCarrera {
    private List<Asignatura> visitados = new ArrayList<>();

    public PlanCarreraRecursivo() {
        super(null);
    }

    @Override
    public List<Asignatura> queCursar(Asignatura a) {
        List<Asignatura> requeridas = new ArrayList<>();
        for (Asignatura adyacente : grafo.get(a)) {
            if (!visitados.contains(adyacente)) {
                visitados.add(adyacente);
                requeridas.add(adyacente);
                requeridas.addAll(queCursar(adyacente));
            }
        }        
        return requeridas;
    }

    
    
    
    
}
