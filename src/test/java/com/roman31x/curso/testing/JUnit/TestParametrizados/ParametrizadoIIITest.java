package com.roman31x.curso.testing.JUnit.TestParametrizados;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametrizadoIIITest {

    @Parameters
    public static Object[] datos(){
        return new Object[] {"a","b","c"};
    }

    @Parameter(0)
    public String valor1;

    @Test
    public void test(){
        System.out.println("Ejecución valor1: "+valor1);
        Assert.assertEquals(valor1,valor1);
    }

}