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
package agenda;

import java.util.ArrayList;
import java.util.List;

public class Dia {
    private String fecha;
    private ArrayList<Evento> eventos = new ArrayList<Evento>();

    public Dia(String fecha) {
        this.fecha = fecha;
    }
    
    public void añadirEvento(Evento e) {
        eventos.add(e);
    }
    public String getFecha() {
        return fecha;
    }
    public String toString() {
        String desc = fecha +"\n=======";
        for(Evento e : eventos) {
            desc += "\n"+e.toString();
        }
        return desc;
    }
}







     
