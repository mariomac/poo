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

public class Rosa extends Regalo {
    private String descripcion;

    public Rosa(String descripcion, float precio) {
        super(precio);
        this.descripcion = descripcion;
    }
    
    public String toString() {
        return "Rosa: " + descripcion + ". " + precio + "€";
    }
    
}
