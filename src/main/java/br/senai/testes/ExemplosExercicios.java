package br.senai.testes;

import java.util.Calendar;

public class ExemplosExercicios {

    public String classificarDivida(float valorDivida, int anoDivida, String situacaoDivida){

        String classe = "Não classificada";
        int anoCorrente = Calendar.getInstance().get(Calendar.YEAR);

        if(situacaoDivida == "Inscrita" && valorDivida >= 1000){
            if(anoDivida == anoCorrente){
                classe = "Não cobrar agora";
            }
        } else {
            classe = "Inapta";
        }

        return classe;
    }

}
