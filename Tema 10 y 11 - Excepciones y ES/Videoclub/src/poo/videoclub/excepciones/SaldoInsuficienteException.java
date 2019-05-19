package poo.videoclub.excepciones;

import poo.videoclub.Cliente;

public class SaldoInsuficienteException extends Exception {
    private Cliente cliente;

    public SaldoInsuficienteException(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
