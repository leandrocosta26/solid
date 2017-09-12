package br.com.alura.solid.ocp;

public class Frete implements Entrega {

    static final String SAO_PAULO = "SAO PAULO";

    public double para(String cidade) {
        if (SAO_PAULO.equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
