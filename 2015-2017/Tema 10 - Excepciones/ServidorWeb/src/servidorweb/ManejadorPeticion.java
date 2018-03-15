
package servidorweb;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejadorPeticion
  implements HttpHandler {

  public void handle(HttpExchange he) throws IOException {
    Headers h = he.getResponseHeaders();
    String mensaje = "hola!!";
    PrintWriter pw = new PrintWriter(
                  he.getResponseBody());
    he.sendResponseHeaders(200, mensaje.length());
    pw.println(mensaje);
  }
  
  
  
}
