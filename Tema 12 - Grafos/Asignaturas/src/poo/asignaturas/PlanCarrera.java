package poo.asignaturas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PlanCarrera {
    protected Map<Asignatura,Set<Asignatura>> grafo = new HashMap<>();
    
    private Siguientes siguientes;

    public PlanCarrera(Siguientes siguientes) {
        this.siguientes = siguientes;
    }    
    
    public void creaConexiones(Asignatura origen,
                               Collection<Asignatura> adyacentes) {
        grafo.put(origen, new HashSet<>(adyacentes));     
    }
    
    public List<Asignatura> queCursar(Asignatura a) {
        List<Asignatura> visitadas = new ArrayList<>();
        siguientes.introducir(a);
        while (!siguientes.isVacia()) {
            Asignatura actual = siguientes.sacar();
            if (!visitadas.contains(actual)) {
                visitadas.add(actual);
                for (Asignatura adyacente : grafo.get(actual)) {
                    siguientes.introducir(adyacente);
                }
            }
        }
        return visitadas;
    }
}
