package poo.reproductor;

import java.util.Map;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * Clase que carga un archivo mp3 y lo reproduce.
 * 
 * @author mmacias
 */
public class Cancion {
    private final Media media;
    private final MediaPlayer mediaPlayer;
    private static JFXPanel panel = null;
    
    /**
     * Construye un objeto Canción a partir de la ruta completa de un archivo.
     * @param archivo Ruta completa del archivo. Por ejemplo:
     *        /home/usuario/Music/micancion.mp3
     */
    public Cancion(String archivo) {
        if(panel == null) {
            panel = new JFXPanel();            
        }
        archivo=archivo.replace(" ", "%20");
        
        media = new Media("file://"+archivo);
        mediaPlayer = new MediaPlayer(media);
    }
    /**
     * Toca la canción. Es decir, la hace sonar.
     */
    public void tocar() {
        mediaPlayer.play();
    }
    /**
     * Para la canción. Es decir, deja de sonar.
     */
    public void parar() {
        mediaPlayer.stop();
    }
    
    /**
     * Retorna un string con el artista y el título de la canción.
     * @return el artista y el título de la canción.
     */
    public String toString() {
        Map<String,Object> meta = media.getMetadata();
        return meta.get("artist") + " - " + meta.get("title");
    }
}