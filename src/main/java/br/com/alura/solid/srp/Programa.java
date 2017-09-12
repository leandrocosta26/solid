package br.com.alura.solid.srp;

import java.util.Calendar;

public class Programa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(10, "Leandro", Cargo.DESENVOLVEDOR, Calendar.getInstance(), 9500.0);

        System.out.println(new Calculadora().calcula(funcionario));
    }
}
