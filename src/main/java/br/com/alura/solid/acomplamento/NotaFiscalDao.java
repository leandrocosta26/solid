package br.com.alura.solid.acomplamento;

public class NotaFiscalDao implements AcaoPosGerarNota {

    public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }

}
