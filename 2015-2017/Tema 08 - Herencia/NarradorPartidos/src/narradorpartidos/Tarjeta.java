package narradorpartidos;

public class Tarjeta extends Evento {
    private String tipo, sancionado;
    public Tarjeta(int minuto, String tipo, String sancionado) {
        super(minuto);
        this.tipo = tipo;
        this.sancionado = sancionado;
    }
    public String toString() {
        return super.toString()
                + "Tarjeta " + tipo + " para " + sancionado;
    }
    
}
