package br.com.alura.solid.liskov;

public class ContaDeEstudante {

    private int milhas;
    private ManipulaSaldo manipulaSaldo;

    public ContaDeEstudante() {
        this.manipulaSaldo = new ManipulaSaldo();
    }


    public void deposita(double valor) {
        manipulaSaldo.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }
}