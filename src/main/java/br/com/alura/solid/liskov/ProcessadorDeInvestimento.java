package br.com.alura.solid.liskov;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimento {
    public static void main(String[] args) {

        for (ContaComum conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

    private static List<ContaComum> contasDoBanco() {
        return Arrays.asList(new ContaComum(100), new ContaComum(150), new ContaComum(200));
    }

    private static ContaDeEstudante contaDeEstudanteCom(double amount) {
        ContaDeEstudante c = new ContaDeEstudante();
        c.deposita(amount);
        return c;
    }

    private static ContaComum umaContaCom(double valor) {
        ContaComum c = new ContaComum(10);
        c.deposita(valor);
        return c;
    }
}
