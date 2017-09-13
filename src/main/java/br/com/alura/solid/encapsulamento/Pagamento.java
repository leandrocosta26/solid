package br.com.alura.solid.encapsulamento;

public class Pagamento {

    private double valor;
    private TipoPagamento tipo;

    public Pagamento(double valor, TipoPagamento tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }
}
