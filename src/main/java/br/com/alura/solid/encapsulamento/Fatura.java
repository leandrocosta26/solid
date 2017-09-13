package br.com.alura.solid.encapsulamento;

import java.util.Collections;
import java.util.List;

public class Fatura {

    private List<Pagamento> pagamento;

    private double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void adicionarPagamento(Pagamento pagamento){
        this.pagamento.add(pagamento);
    }

    public List<Pagamento> getPagamento() {
        return Collections.unmodifiableList(pagamento);
    }

    public boolean estaPaga() {
        return this.pagamento.stream().mapToDouble(Pagamento::getValor).sum() <= this.valor;
    }

}
