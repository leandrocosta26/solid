package br.com.alura.solid.acomplamento;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<AcaoPosGerarNota> acoes = new ArrayList<AcaoPosGerarNota>();

        acoes.add(new EnviadorDeEmail());
        acoes.add(new NotaFiscalDao());

        GeradorDeNotaFiscal geradorDeNotaFiscal = new GeradorDeNotaFiscal(acoes);

        Fatura fatura = new Fatura();
        fatura.setCliente("Leandro");
        fatura.setValorMensal(4000);

        geradorDeNotaFiscal.gera(fatura);
    }
}
