package br.com.alura.solid.ocp;

public class CalculadoraDePreco {

    private Entrega entrega;
    private TabelaDePreco preco;

    public CalculadoraDePreco(Entrega entrega, TabelaDePreco preco) {
        this.entrega = entrega;
        this.preco = preco;
    }

    public double calcula(Compra produto) {
        double desconto = preco.descontoPara(produto.getValor());
        double frete = entrega.para(produto.getCidade());

        return produto.getValor() * (1 - desconto) + frete;
    }
}
