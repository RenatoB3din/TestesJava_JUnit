package br.senai.testes;

import java.util.Calendar;

public class Exercicio2 {
    public String classificarDivida3(int anoDivida, String situacaoDivida, int valorDivida){

        String classe;
        int anoCorrente = Calendar.getInstance().get(Calendar.YEAR);

        if(anoDivida == anoCorrente){
            classe = "Não cobrar agora";
        } else if(anoDivida >= 2018 && anoDivida <= 2019 && situacaoDivida == "Inscrita" && valorDivida >= 1000) {
            classe = "Prioridade 3 de cobrança";
        } else if(anoDivida >= 2016 && anoDivida <= 2017 && situacaoDivida == "Inscrita" && valorDivida >= 1000) {
            classe = "Prioridade 2 de cobrança";
        } else if(anoDivida == 2015 && situacaoDivida == "Inscrita" && valorDivida >= 1000) {
            classe = "Prioridade 1 de cobrança";
        } else {
            classe = "Inaptas";
        }

        return classe;
    }
}
