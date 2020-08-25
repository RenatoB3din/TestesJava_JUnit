package br.senai.testes;

import java.util.Calendar;

public class Exercicio1 {
    public String classificarDivida2(int anoDivida){

        String situacaoDivida;
        int anoCorrente = Calendar.getInstance().get(Calendar.YEAR);

        if(anoDivida == anoCorrente){
            situacaoDivida = "Não cobrar agora";
        } else if(anoDivida >= 2018 && anoDivida <=2019){
            situacaoDivida = "Prioridade 3 de cobrança";
        } else if(anoDivida >= 2016 && anoDivida <=2017) {
            situacaoDivida = "Prioridade 2 de cobrança";
        } else if(anoDivida == 2015) {
            situacaoDivida = "Prioridade 1 de cobrança";
        } else if(anoDivida < 2015) {
            situacaoDivida = "Inaptas";
        } else {
            situacaoDivida = "Não classificada";
        }

        return situacaoDivida;
    }
}
