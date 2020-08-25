package br.senai.testes;

import org.junit.Assert;
import org.junit.Test;

public class CalculosTest {

    @Test
    public void SomarTest(){
        int resultadoEsperado = 7;
        int resultadoReal;
        Calculos calculos = new Calculos();
        resultadoReal = calculos.Somar(4,3);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void SubtrairTest(){
        int resultadoEsperado = 7;
        int resultadoReal;
        Calculos calculos = new Calculos();
        resultadoReal = calculos.Subtrair(10,3);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void MultiplicarTest(){
        int resultadoEsperado = 10;
        int resultadoReal;
        Calculos calculos = new Calculos();
        resultadoReal = calculos.Multiplicar(2, 5);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void DividirTest(){
        int resultadoEsperado = 5;
        int resultadoReal;
        Calculos calculos = new Calculos();
        resultadoReal = calculos.Dividir(10, 2);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
