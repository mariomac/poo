package moo.facturas;

public class ValorNoValidoException extends Exception {
    double valor;

    public ValorNoValidoException(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    
}
