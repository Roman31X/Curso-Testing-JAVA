package com.roman31x.curso.testing.JUnit.TestParametrizados;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class ParametrizadoIVTest {

    @Test
    @Parameters({"AAA,1","BBB,2"})
    public void parametrosConAnotaciones(String cadena, Integer numero){
        System.out.println("El valor de la cadena es: "+ cadena + " el numero es: "+numero);
    }

}