/*------------------------------------------------------------------------------
 * Este código está distribuido bajo una licencia del tipo BEER-WARE.
 * -----------------------------------------------------------------------------
 * Mario Macías Lloret escribió este archivo. Teniendo esto en cuenta,
 * puedes hacer lo que quieras con él: modificarlo, redistribuirlo, venderlo,
 * etc, aunque siempre deberás indicar la autoría original en tu código.
 * Además, si algún día nos encontramos por la calle y piensas que este código
 * te ha sido de utilidad, estás obligado a invitarme a una cerveza (a ser
 * posible, de las buenas) como recompensa por mi contribución.
 * -----------------------------------------------------------------------------
 */
package santjordimanager;

import java.util.Scanner;

public class SantJordiManager {

    public static void main(String[] args) {
        RegistroStands registro = crearRegistro();
        System.out.print("Introduce un precio: ");
        Scanner lectorTeclado = new Scanner(System.in);
        float precio = lectorTeclado.nextFloat();
        registro.muestraRegalosSegunPrecio(precio);
        
    }
    
    public static RegistroStands crearRegistro() {
        Stand s1 = new Stand("Ca la Mari");
        Stand s2 = new Stand("Libros y rosas Pepe");
        Stand s3 = new Stand("Floristeria Martinez");
        s1.addRegalo(new Libro("Hombres buenos", "Arturo Perez-Reverte",9.00f));
        s1.addRegalo(new Rosa("Rosa roja", 3));
        s1.addRegalo(new Rosa("Rosa violeta", 4));
        s1.addRegalo(new DVD("Los Mercenarios 3",2014, 9.99f));
        s1.addRegalo(new DVD("Casablanca",1942,4.99f));        
        s2.addRegalo(new Libro("El Quijote", "Miguel de Cervantes",7.00f));
        s2.addRegalo(new Rosa("Rosa Deluxe", 30));
        s2.addRegalo(new Libro("La Templanza", "Maria Duenas", 6.00f));
        s3.addRegalo(new Libro("La Celestina", "Fernando de Rojas", 6.00f));
        s3.addRegalo(new Rosa("Rosa amarilla", 5));       
        s3.addRegalo(new Rosa("Rosa con decoracion especial",7));
        RegistroStands registro = new RegistroStands();
        registro.addStand(s1);
        registro.addStand(s2);
        registro.addStand(s3);
        return registro;
    }
    
}














