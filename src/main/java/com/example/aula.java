package com.example;

public class aula {

    private String nome;
    private String numeroDiBanchi;

    public aula() {
    }

    public aula(String nome, String numeroDiBanchi) {
        this.nome = nome;
        this.numeroDiBanchi = numeroDiBanchi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDiBanchi() {
        return numeroDiBanchi;
    }

    public void setNumeroDiBanchi(String numeroDiBanchi) {
        this.numeroDiBanchi = numeroDiBanchi;
    }

}
