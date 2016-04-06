package narradorpartidos;

public class Main {
    public static void main(String[] args) {
        Partido p = new Partido("Barça", "Madrid");
        p.añadirEvento(new Tiempo(1, false));
        p.añadirEvento(new Tarjeta(25, "AMARILLA", "Piqué"));
        p.añadirEvento(new Tarjeta(35, "ROJA", "Cristiano Ronaldo"));
        p.añadirEvento(new Tiempo(1, true));
        
        p.añadirEvento(new Tiempo(2, false));
        p.añadirEvento(new Gol(53,"Piqué"));
        p.añadirEvento(new Gol(65,"Benzema"));        
        p.añadirEvento(new Tarjeta(79, "ROJA", "Ramos"));
        p.añadirEvento(new Gol(80,"El BICHOOOO"));
        p.añadirEvento(new Tiempo(2, true));
        
        System.out.println(p.toString());
    }
}
