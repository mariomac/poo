package info.macias.poo;

public class Titulo implements Comparable<Titulo> {
    private int año;
    private String nombre;

    public Titulo(int año, String nombre) {
        this.año = año;
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String toString() {
        return año + " - " + nombre;
    }

    @Override
    public int compareTo(Titulo o) {
        if(año == o.año) {
            return nombre.compareTo(o.nombre);                   
        } else {
            return o.año - año;
        }
    }
    
}
