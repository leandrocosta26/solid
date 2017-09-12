package br.com.alura.solid.srp;

public class DezOuVintePorcento implements Porcentagem {
    public double calcula(Funcionario funcionario) {
        double salarioBase = funcionario.getSalarioBase();
        return salarioBase > 3000.0 ? salarioBase * 0.8 : salarioBase * 0.9;
    }
}
