package br.com.alura.solid.acomplamento;

import java.util.List;

public class GeradorDeNotaFiscal {

    private final List<AcaoPosGerarNota> acoes;

    public GeradorDeNotaFiscal(List<AcaoPosGerarNota> acaoes) {
        this.acoes = acaoes;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();
        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));


        for(AcaoPosGerarNota acao : acoes){
            acao.executa(nf);
        }

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}
