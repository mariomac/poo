package servidorweb;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bienvenida implements HttpHandler {

    @Override
    public void handle(HttpExchange he) throws IOException {
        // Leemos el contenido del archivo a mostrar
        // y lo guardamos en un String llamado "mensaje"
        BufferedReader archivo = new BufferedReader(
                new FileReader("index.html"));
        StringBuilder sb = new StringBuilder();
        String linea = archivo.readLine();
        while(linea != null) {
            sb.append(linea);
            linea = archivo.readLine();
        }
        String mensaje = sb.toString();
        
        // Para saber cuántos bytes ocupa un mensaje no podemos
        // usar mensaje.length(), ya que éste devuelve el número
        // de caracteres, y algunos caracteres pueden ocupar más de
        // 1 byte
        // Para que funcione con acentos u otros caracteres no anglosajones,
        // Pasaremos el string a bytes, y enviaremos dichos bytes por el
        // OutputStream de respuesta
        // UTF-8 es la configuración estándar a nivel internacional
        // para caracteres no anglosajones. Es la alternativa "moderna"
        // (20 años) al ASCII que estudiásteis en FO
        byte[] msgBytes = mensaje.getBytes();
        
        // Según el estándar HTTP, devolver un 200 quiere decir que todo ha
        // ido bien. Para más información:
        // https://es.wikipedia.org/wiki/Anexo:C%C3%B3digos_de_estado_HTTP
        // También debemos devolver el número de bytes que ocupará el texto
        // de respuesta       
        // Para que no muestre caracteres raros cuando se encuentre un acento, 
        // diéresis o eñe, ponemos esta cabecera que dice que los caracteres
        // están en UTF-8, la alternativa internacional al ASCII que vimos
        // en FO
        he.getResponseHeaders().add("Content-type", "text/html; charset=utf-8");
        he.sendResponseHeaders(200, msgBytes.length);
        
        // Al enviar bytes a secas, no hace falta que usemos
        // PrintStream, Writer, u otras clases que facilitan
        // la vida a la hora de enviar cadenas de texto
        he.getResponseBody().write(msgBytes);
        
        // Es muy importante "cerrar el grifo" cuando acabemos
        he.getResponseBody().close();
    }
    
}
