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

public class Stand {
    private String nombre;
    private HashSet<Regalo> stock = new HashSet<Regalo>();

    public Stand(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void addRegalo(Regalo r) {
        stock.add(r);
    }

    public Iterator<Regalo> getRegalosIterator() {
        return stock.iterator();
    }
    
    
}
