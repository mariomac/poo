/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorweb;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

/**
 *
 * @author mmacias
 */
public class ServidorWeb {

  private HttpServer server;
  public ServidorWeb() throws Exception {
    server = HttpServer.create(
            new InetSocketAddress(8080),
            0);
    server.createContext("/hola",
            new ManejadorPeticion());
  }
  
  public void start() {
     server.start();
  }
  public static void main(String[] args) {
    try {
      ServidorWeb servidor = new ServidorWeb();
      servidor.start();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
  
}
