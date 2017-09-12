package br.com.alura.solid.ocp;

public class Programa {
    public static void main(String[] args) {
        TabelaDePreco preco = new TabelaDePrecoPadrao();
        Compra compra = new Compra(250, "São Paulo");
        Entrega entrega = new Frete();
        CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco(entrega, preco);

        System.out.println(calculadoraDePreco.calcula(compra));

    }
}
