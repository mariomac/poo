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

import java.util.HashMap;

public class Agenda {
    private String hoy;
    private HashMap<String,Dia> dias = new HashMap<String,Dia>();
    
    public void setHoy(String hoy) {
        this.hoy = hoy;
    }
    
    public void añadirDia(Dia d) {
        dias.put(d.getFecha(), d);
    }
    
    public void mostrarHoy() {
        Dia d = dias.get(hoy);
        if(d == null) {
            System.out.println("No hay eventos para hoy");
        } else {
            System.out.println(d.toString());
        }
    }
    
}
