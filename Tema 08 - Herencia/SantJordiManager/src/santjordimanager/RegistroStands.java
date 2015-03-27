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

import java.util.HashSet;
import java.util.Iterator;


public class RegistroStands {
    private HashSet<Stand> stands = new HashSet<Stand>();
    public void addStand(Stand s) {
        stands.add(s);
    }
    public void muestraRegalosSegunPrecio(float precio) {
        for(Stand s : stands) {
            // variable para evitar que se muestre el nombre del stand
            // si no contiene regalos que cumplan el precio
            boolean mostrarNombreRegistro = true;
            Iterator<Regalo> it = s.getRegalosIterator();
            while(it.hasNext()) {
                Regalo r = it.next();
                if(r.getPrecio() <= precio) {
                    if(mostrarNombreRegistro) {
                        System.out.println("**** " + s.getNombre() + " ****"); 
                        mostrarNombreRegistro = false;
                    }
                    System.out.println(r.toString());
                }
            }
        
        }
    }
}
