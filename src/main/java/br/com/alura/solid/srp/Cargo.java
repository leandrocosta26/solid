package br.com.alura.solid.srp;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new QuizeOuVintePorcento()),
    TESTER(new QuizeOuVintePorcento());

    private Porcentagem porcentagem;

    Cargo(Porcentagem porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Porcentagem getPorcentagem() {
        return porcentagem;
    }
}
