package com.roman31x.curso.testing.JUnit.TheoriesAssumptions;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TestIII {

    @DataPoints
    public static String[] letras = {"a","b","c"};
    public static int i = 1;

    @Theory  // Intentar hacer tantas combinaciones se le séa posibles
    public void testTestClass(String primero, String segundo,String tercero){
        System.out.println("Combinación: "+(i++)+" ["+primero+segundo+tercero+"]");
    }

}