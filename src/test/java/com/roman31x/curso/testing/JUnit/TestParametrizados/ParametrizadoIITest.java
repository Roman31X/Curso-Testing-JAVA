package com.roman31x.curso.testing.JUnit.TestParametrizados;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParametrizadoIITest {

    @Parameters
    public static Collection<Object[]> datos(){
        return Arrays.asList(new Object[][]{
                {"a","b","c"},{"d","e","f"},{"g","h","i"}
        });
    }

    @Parameter(0)
    public String valor1;

    @Parameter(1)
    public String valor2;

    @Parameter(2)
    public String valor3;

    private ParametrizadoII  parametrizado =  new ParametrizadoII();

    @Test
    public void testConcatenar(){
        System.out.print("Se va concatenar [valor1 = "+valor1+" + Valor2 = " +
                valor2+" + valor3 = "+valor3+"] = ");
        String respuesta = parametrizado.concatenar(valor1,valor2,valor3);
        System.out.println(respuesta);
        Assert.assertEquals(valor1+" "+valor2+" "+valor3,respuesta);
    }

}