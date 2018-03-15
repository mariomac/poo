package santjordimanager;

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

public class DVD extends Regalo {
    private String titulo;
    private int anyo;

    public DVD(String titulo, int anyo, float precio) {
        super(precio);
        this.titulo = titulo;
        this.anyo = anyo;
    }
    
    public String toString() {
        return "DVD: " + titulo + ". " + anyo + ". " + precio + "€";
    }
    
}
