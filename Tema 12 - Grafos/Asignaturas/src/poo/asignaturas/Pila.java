package poo.asignaturas;

import java.util.ArrayList;
import java.util.List;

public class Pila implements Siguientes {
    private List<Asignatura> elementos = new ArrayList<>();
    
    @Override
    public void introducir(Asignatura a) {
        elementos.add(a);
    }

    @Override
    public boolean isVacia() {
        return elementos.isEmpty();
    }

    @Override
    public Asignatura sacar() {
        return elementos.remove(elementos.size() - 1);
    }
    
}
