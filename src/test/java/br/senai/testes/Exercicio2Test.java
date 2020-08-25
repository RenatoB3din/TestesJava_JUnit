package br.senai.testes;

import org.junit.Assert;
import org.junit.Test;

public class Exercicio2Test {
    @Test
    public void testarNaoCobrarAgora(){
        String resultadoEsperado = "Não cobrar agora";
        String resultadoReal;

        Exercicio2 exemplo = new Exercicio2();
        resultadoReal = exemplo.classificarDivida3(2020, "Inscrita", 1000);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarPrioridade3(){
        String resultadoEsperado = "Prioridade 3 de cobrança";
        String resultadoReal;

        Exercicio2 exemplo = new Exercicio2();
        resultadoReal = exemplo.classificarDivida3(2018, "Inscrita", 1000);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarPrioridade2(){
        String resultadoEsperado = "Prioridade 2 de cobrança";
        String resultadoReal;

        Exercicio2 exemplo = new Exercicio2();
        resultadoReal = exemplo.classificarDivida3(2017, "Inscrita", 1000);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarPrioridade1(){
        String resultadoEsperado = "Prioridade 1 de cobrança";
        String resultadoReal;

        Exercicio2 exemplo = new Exercicio2();
        resultadoReal = exemplo.classificarDivida3(2015, "Inscrita", 1000);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarInaptas(){
        String resultadoEsperado = "Inaptas";
        String resultadoReal;

        Exercicio2 exemplo = new Exercicio2();
        resultadoReal = exemplo.classificarDivida3(2014, "Quitada", 999);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

}
