package br.com.alura.solid.liskov;

public class ContaComum {


    private final ManipulaSaldo manipulaSaldo;

    public ContaComum(double saldo) {
        this.manipulaSaldo = new ManipulaSaldo();
        this.manipulaSaldo.setSaldo(saldo);
    }

    public void rende() {
        this.manipulaSaldo.setSaldo(this.manipulaSaldo.getSaldo() + this.manipulaSaldo.getSaldo() * 0.01);
    }

    public void deposita(double valor) {
        manipulaSaldo.deposita(valor);
    }

    public void saca(double valor) {
        manipulaSaldo.saca(valor);
    }


    public double getSaldo() {
        return manipulaSaldo.getSaldo();
    }
}