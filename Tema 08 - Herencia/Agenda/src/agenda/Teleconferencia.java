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

public class Teleconferencia extends Cita {
    private String direccionWeb;

    public Teleconferencia(String url, int hh, int mm, int duracionMins, String descripcion) {
        super(hh, mm, duracionMins, descripcion);
        this.direccionWeb = url;
    }
    
    public String toString() {
        return super.toString() + ". Dirección web: " + direccionWeb;
    }
    
}
