package poo.tema6;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Gestor de Clientes v1.0");
    System.out.println("=======================");
    
    Scanner teclado = new Scanner(System.in);
    RegistroClientes registro = new RegistroClientes();
            
    String comando;
    do {
      // Leer un comando del teclado
      System.out.print("comando> ");
      comando = teclado.nextLine();
      
      switch(comando) {
        case "añadir":
          // Añadir cliente: leemos los datos del cliente por teclado
          System.out.print("Nombre? ");
          String nombre = teclado.nextLine();
          System.out.print("NIF? ");
          String nif = teclado.nextLine();
          System.out.print("Deuda? ");
          double deuda = teclado.nextDouble();
          // Y creamos el cliente con los datos leídos, incorporándolo al registro
          Cliente c = new Cliente(nif, nombre, deuda);
          registro.registrar(c);
          
          teclado.nextLine(); // "vaciar el buffer" porque hemos leído un "double"
          break;
        case "cancelar":
          // Cancelar deuda: buscar el cliente por NIF y cancelar su deuda
          System.out.print("NIF? ");
          String nif2 = teclado.nextLine();
          Cliente cl = registro.busca(nif2);
          if (cl == null) { // Evitamos que el programa pete con un "NullPointerException"
            System.out.println("Cliente inexistente");
          } else {
            cl.setDeuda(0);
            System.out.println("Datos actualizados: " + cl);
          }
          break;
        case "lista":
          registro.printListadoClientes();
          break;
        case "salir":
          // no hace nada, es para evitar que muestre "Comando erróneo!" al salir
          break;
        default:
          System.out.println("Comando erróneo!");
      } 
       
    } while (!"salir".equals(comando));
  }
}
