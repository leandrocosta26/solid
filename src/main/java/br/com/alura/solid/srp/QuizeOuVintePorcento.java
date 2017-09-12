package br.com.alura.solid.srp;

public class QuizeOuVintePorcento implements Porcentagem {
    public double calcula(Funcionario funcionario) {
        double salarioBase = funcionario.getSalarioBase();
        return salarioBase > 2000.0 ? salarioBase * 0.75 : salarioBase * 0.85;
    }
}
