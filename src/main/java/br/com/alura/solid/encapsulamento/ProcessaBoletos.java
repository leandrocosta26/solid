package br.com.alura.solid.encapsulamento;

import java.util.List;

public class ProcessaBoletos {
    public void processa(List<Boleto> boletos, Fatura fatura) {
        boletos.forEach(p -> fatura.adicionarPagamento(new Pagamento(p.getValor(), TipoPagamento.BOLETO)));
    }
}
