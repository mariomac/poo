package poo.tema3;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    RelojDespertador reloj = new RelojDespertador(15, 00, 00, 15, 00, 20);
    while (true) {      
      reloj.tickSegundo();
      System.out.println(reloj);
      // Dormimos el sistema durante un segundo antes de llamar al siguiente tick
      Thread.sleep(1000);
    }
  }  
}
