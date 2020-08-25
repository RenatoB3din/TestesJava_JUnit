package br.senai.testes;

import org.junit.Assert;
import org.junit.Test;

public class ExemploExerciciosTest {

    @Test
    public void testarNaoCobrarAgora(){
        String resultadoEsperado = "Não cobrar agora";
        String resultadoReal;

        ExemplosExercicios exemplo = new ExemplosExercicios();
        resultadoReal = exemplo.classificarDivida(1000, 2020, "Inscrita");

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarInapta(){
        String resultadoEsperado = "Inapta";
        String resultadoReal;

        ExemplosExercicios exemplo = new ExemplosExercicios();
        resultadoReal = exemplo.classificarDivida(999, 2020, "Inscrita");

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarInapta2(){
        String resultadoEsperado = "Inapta";
        String resultadoReal;

        ExemplosExercicios exemplo = new ExemplosExercicios();
        resultadoReal = exemplo.classificarDivida(999, 2020, "Quitada");

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarNaoClassificada(){
        String resultadoEsperado = "Não classificada";
        String resultadoReal;

        ExemplosExercicios exemplo = new ExemplosExercicios();
        resultadoReal = exemplo.classificarDivida(1000, 2019, "Inscrita");

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
