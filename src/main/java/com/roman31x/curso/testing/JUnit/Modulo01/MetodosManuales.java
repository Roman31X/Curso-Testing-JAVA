package com.roman31x.curso.testing.JUnit.Modulo01;

import org.junit.*;

public class MetodosManuales {

    @Before     // Este test se ejecuta antes de cada test
    public void antesDeTest(){
        System.out.println("Test se ejecuta antes de cada test");
    }

    @BeforeClass
    public static void testTipoStaticInicio(){
        System.out.println("Este test se ejecuta una ves antes de cada test pero únicamente de tipo static");
    }

    @Test
    public void testUno(){
        System.out.println("Test de prueba número uno");
    }

    @Test
    public void testDos(){
        System.out.println("Test de prueba número dos");
    }

    @After      // Este test se ejecuta después de cada test
    public void despuesDeTest(){
        System.out.println("Test que se ejecuta al ultimo de cada test\n");
    }

    @AfterClass
    public static void testTipoStaticFinal(){
        System.out.println("Este test se ejecuta una ves después de cada test pero únicamente de tipo static");
    }
}
