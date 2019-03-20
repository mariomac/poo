package ikea;

public class Ikea {

    public static void main(String[] args) {
        
        Mueble m = new Mueble("Strongfals");
        m.addPieza(new Pieza(3, 1, 2, 3, 4,
                "trozo de madera"));
        m.addPieza(new Pieza(3, 1, 2, 3, 4,
                "trozo de madera"));
        m.addPieza(new Pieza(2, 2, 3, 4, 6, "tornillo gordo"));
        m.addPieza(new Pieza(5, 3, 1, 1, 1, "tornillo chico"));
        
        System.out.println("Descripción del mueble: ");
        System.out.println(m);
    }    
}
