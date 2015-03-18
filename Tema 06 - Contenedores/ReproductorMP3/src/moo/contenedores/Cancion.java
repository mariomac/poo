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

import java.util.Map;
import javafx.application.Application;
import javafx.collections.MapChangeListener;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.AudioTrack;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Cancion {
    private String archivo;
    private Media media;
    private MediaPlayer mediaPlayer;
    private ReproductorMP3 reproductor;
    private static JFXPanel panel = null;
    
    public Cancion(String archivo) {
        if(panel == null) {
            panel = new JFXPanel();            
        }
        archivo=archivo.replace(" ", "%20");
        this.archivo = archivo;
        
        media = new Media("file://"+archivo);
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setOnEndOfMedia(new Runnable() {
            @Override
            public void run() {
                if(reproductor != null) {
                    reproductor.siguienteCancion();
                }
            }
        });
    }
    public void tocar() {
        mediaPlayer.play();
    }
    public void parar() {
        mediaPlayer.stop();
    }
    public String toString() {
        Map<String,Object> meta = media.getMetadata();
        return meta.get("artist") + " - " + meta.get("title");
    }
    
    public void cuandoSeAcabeNotificarA(ReproductorMP3 reproductor) {
        this.reproductor = reproductor;
    }
    
    
}
