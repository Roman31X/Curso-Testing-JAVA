package com.roman31x.curso.testing.JUnit.TestParametrizados;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParametrizadoTest {

    @Parameters
    public static Collection<Object[]> datos(){
        return Arrays.asList(new Object[][]{
                {1,2},{3,5},{0,4},{8,4},{1,3}
        });
    }

    private int v1;
    private int v2;
    private Parametrizado parametrizado = new Parametrizado();

    public ParametrizadoTest(int valor1, int valor2) {
        v1 = valor1;
        v2 = valor2;
    }

    @Test
    public void testSuma(){
        System.out.print("Los parámetros son: v1="+v1+"+ V2="+v2+" = ");
        int resultado = parametrizado.sumaNumeros(v1,v2);
        System.out.println(resultado);

        Assert.assertEquals(v1 + v2,resultado);
    }
}