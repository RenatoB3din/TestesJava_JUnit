package br.senai.testes;

import org.junit.Assert;
import org.junit.Test;

public class Exercicio1Test {

    @Test
    public void testarNaoCobrarAgora(){
        String resultadoEsperado = "Não cobrar agora";
        String resultadoReal;

        Exercicio1 exemplo = new Exercicio1();
        resultadoReal = exemplo.classificarDivida2(2020);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarPrioridade3(){
        String resultadoEsperado = "Prioridade 3 de cobrança";
        String resultadoReal;

        Exercicio1 exemplo2 = new Exercicio1();
        resultadoReal = exemplo2.classificarDivida2(2019);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarPrioridade2(){
        String resultadoEsperado = "Prioridade 2 de cobrança";
        String resultadoReal;

        Exercicio1 exemplo = new Exercicio1();
        resultadoReal = exemplo.classificarDivida2(2017);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarPrioridade1(){
        String resultadoEsperado = "Prioridade 1 de cobrança";
        String resultadoReal;

        Exercicio1 exemplo = new Exercicio1();
        resultadoReal = exemplo.classificarDivida2(2015);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarInaptas(){
        String resultadoEsperado = "Inaptas";
        String resultadoReal;

        Exercicio1 exemplo = new Exercicio1();
        resultadoReal = exemplo.classificarDivida2(2014);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarNaoClassificada(){
        String resultadoEsperado = "Não classificada";
        String resultadoReal;

        Exercicio1 exemplo = new Exercicio1();
        resultadoReal = exemplo.classificarDivida2(2021);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
