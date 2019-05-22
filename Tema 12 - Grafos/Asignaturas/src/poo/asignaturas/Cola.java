package poo.asignaturas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cola implements Siguientes {
    private List<Asignatura> elementos = new LinkedList<>();
    
    @Override
    public boolean isVacia() {
        return elementos.isEmpty();
    }
    
    @Override
    public void introducir(Asignatura a) {
        elementos.add(a);
    }
    @Override
    public Asignatura sacar() {
        return elementos.remove(0);
    }
}
