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

public class Libro extends Regalo {
    private String titulo, autor;

    public Libro(String titulo, String autor, float precio) {
        super(precio);
        this.titulo = titulo;
        this.autor = autor;
    }
    public String toString() {
        return "Libro: " + titulo + ". " + autor
                + ". " + precio +"€";
    }
}
