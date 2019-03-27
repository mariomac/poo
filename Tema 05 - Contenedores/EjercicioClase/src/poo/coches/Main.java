package poo.coches;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   
    Registro reg = new Registro();
    
    reg.registrar( new Coche(
            "1234XDF", "Seat Toledo", 150));
    reg.registrar( new Coche(
            "3321AAB", "Porsche Cayenne", 250));
    reg.registrar( new Coche(
            "5463CDC", "Audi A3", 50));
    reg.registrar( new Coche(
            "4444DDD", "Skoda Fabia", 75));
    
    reg.mostrarRegistro();
    
    System.out.print("Introduce matricula a cancelar deuda:");
    Scanner sc = new Scanner(System.in);
    String matricula = sc.nextLine();
    reg.pagar(matricula);
    
    reg.mostrarRegistro();
  }
}
