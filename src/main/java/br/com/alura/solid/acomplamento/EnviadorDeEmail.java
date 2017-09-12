package br.com.alura.solid.acomplamento;

public class EnviadorDeEmail implements AcaoPosGerarNota {

    public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }

}
