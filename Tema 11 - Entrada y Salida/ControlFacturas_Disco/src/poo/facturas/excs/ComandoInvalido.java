package poo.facturas.excs;

// Excepción que se usa para indicar un comando de usuario inválido
public class ComandoInvalido extends Exception {
    public ComandoInvalido(String comando) {
        super("Comando invalido: " + comando);        
    }    
}
