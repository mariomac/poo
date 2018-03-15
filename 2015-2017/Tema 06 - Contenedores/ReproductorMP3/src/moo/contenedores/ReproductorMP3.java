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
package moo.contenedores;

import java.util.ArrayList;
import java.util.List;

public class ReproductorMP3 {
    private List<Cancion> canciones = new ArrayList<Cancion>();
    private int cancionActual = 0;
    private boolean tocando = false;
    
    public void agregarCancion(Cancion c) {
        // el método "cuandoSeAcabeNotificarA", que no se ha dado
        // en la solución de clase, permite que cuando una canción
        // se acaba, ésta llame al método "siguienteCancion" del
        // reproductor, para que continue tocando las siguientes canciones
        c.cuandoSeAcabeNotificarA(this);
        canciones.add(c);        
    }
    
    public void siguienteCancion() {
        boolean debeContinuar = tocando;
        parar();
        cancionActual = (cancionActual + 1) % canciones.size();
        if(debeContinuar) tocar();
    }
    public void tocar() {
        tocando = true;
        canciones.get(cancionActual).tocar();      
    }    
    public void parar() {
        tocando = false;
        canciones.get(cancionActual).parar();        
    }
    public String toString() {
        String ret = "";
        int song = 1;
        for(Cancion c : canciones) {
            ret += song + " : " + c.toString() + "\n";
            song++;
        }
        return ret;
    }
}
