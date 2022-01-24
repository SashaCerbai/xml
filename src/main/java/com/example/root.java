package com.example;

import java.util.ArrayList;

public class root {

    private String annoDiInizio;
    private aula aula;
    private String classe;
    private String numeroFinestre;
    private String specializzazione;
    private ArrayList<studente> studenti;

    public root() {
    }

    // construttore pieno
    public root(String annoDiInizio, aula aula, String classe, String numeroFinestre, String specializzazione,
            ArrayList<studente> studenti) {
        this.annoDiInizio = annoDiInizio;
        this.aula = aula;
        this.classe = classe;
        this.numeroFinestre = numeroFinestre;
        this.specializzazione = specializzazione;
        this.studenti = studenti;
    }

    public String getAnnoDiInizio() {
        return annoDiInizio;
    }

    public void setAnnoDiInizio(String annoDiInizio) {
        this.annoDiInizio = annoDiInizio;
    }

    public aula getAula() {
        return aula;
    }

    public void setAula(aula aula) {
        this.aula = aula;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getNumeroFinestre() {
        return numeroFinestre;
    }

    public void setNumeroFinestre(String numeroFinestre) {
        this.numeroFinestre = numeroFinestre;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public ArrayList<studente> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<studente> studenti) {
        this.studenti = studenti;
    }

}
