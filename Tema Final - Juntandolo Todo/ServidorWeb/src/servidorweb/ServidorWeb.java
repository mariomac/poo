package servidorweb;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class ServidorWeb {

    public static void main(String[] args) {
        try {
            // Puerto a través del cuál el servidor escuchará (8080)
            // Para conectarnos desde el navegador de nuestra máquina
            // deberemos escribir en la barra de direcciones:
            // http://localhost:8080
            InetSocketAddress puerto = new InetSocketAddress(8080);
            HttpServer servidor = HttpServer.create(puerto, 0);
            // Registramos el "handler" que recogerá todas las peticiones
            // al servidor
            servidor.createContext("/", new Bienvenida());
            servidor.start();
        } catch(IOException e) {
            System.err.println("Error iniciando servidor: " + e.getMessage());
        }
        
    }
    
}
