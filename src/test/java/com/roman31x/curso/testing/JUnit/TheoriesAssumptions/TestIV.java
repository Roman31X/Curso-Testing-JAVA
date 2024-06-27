package com.roman31x.curso.testing.JUnit.TheoriesAssumptions;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TestIV {

    @DataPoints
    public static int[] numeros = {1,2,3,4};
    public static int i = 1;

    @Theory  // Intentar hacer tantas combinaciones se le séa posibles
    public void testTestClass(int num1, int num2){
        System.out.println("Combinación: "+(i++)+" ["+num1+num2+"]");
        Assert.assertEquals(num1+num2,num1+num2);
    }

}