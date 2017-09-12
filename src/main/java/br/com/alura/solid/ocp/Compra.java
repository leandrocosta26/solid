package br.com.alura.solid.ocp;

public class Compra {

    public Compra(double valor, String cidade) {
        this.valor = valor;
        this.cidade = cidade;
    }

    private double valor;
    private String cidade;

    public double getValor() {
        return valor;
    }

    public String getCidade() {
        return cidade;
    }
}
