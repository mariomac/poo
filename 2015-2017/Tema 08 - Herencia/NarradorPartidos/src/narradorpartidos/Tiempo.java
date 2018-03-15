package narradorpartidos;

public class Tiempo extends Evento {
    private int num;
    private boolean fin;
    public Tiempo(int num, boolean fin) {
        super(0);
        this.num = num;
        this.fin = fin;
    }
    
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        cadena.append("***** ");
        if(fin) {
            cadena.append("FIN");
        } else {
            cadena.append("INICIO");
        }
        cadena.append(" del ");
        if(num == 1) {
            cadena.append("PRIMER");
        } else {
            cadena.append("SEGUNDO");
        }
        cadena.append(" tiempo ****");
        return cadena.toString();
    }
    
}
