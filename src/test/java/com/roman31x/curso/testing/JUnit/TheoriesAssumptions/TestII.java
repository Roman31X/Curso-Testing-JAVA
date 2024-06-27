package com.roman31x.curso.testing.JUnit.TheoriesAssumptions;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TestII {

    @DataPoint  //valores públicos y estáticos
    public static String a = "a";

    @DataPoint
    public static String b = "b";

    @Theory  // Intentar hacer tantas combinaciones se le séa posibles
    public void testTestClass(String primero, String segundo){
        System.out.println("Combinación: "+primero+" con "+segundo);
    }

}