package narradorpartidos;

public class Evento {
    protected int minuto;
    public Evento(int minuto) {
        this.minuto = minuto;
    }
    public String toString() {
        return minuto + "'\t";
    }
}
