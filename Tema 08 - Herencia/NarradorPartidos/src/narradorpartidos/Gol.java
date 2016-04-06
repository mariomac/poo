package narradorpartidos;

public class Gol extends Evento {
    private String anotador;
    public Gol(int minuto, String anotador) {
        super(minuto);
        this.anotador = anotador;
    }
    public String toString() {
        return super.toString()
                + "GOOOOOL de " + anotador;
    }
    
}
