package com.roman31x.curso.testing.JUnit.TestNuestrasClases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PruebaPersona3Test {

    private PruebaPersona3 prueba;

    @Before
    public void setUp() throws Exception{
        prueba = new PruebaPersona3();
    }

    @Test
    public void testSame() throws Exception{
        //Given
        Persona p1 = new Persona("Pedro","Castillo");

        //When
        Persona resultado = prueba.devuelveObjeto(p1);

        //Then
        Assert.assertSame(p1,resultado);
        Assert.assertEquals(p1,resultado);
    }

    @Test
    public void testNotSame() throws Exception{
        //Given
        Persona p1 = new Persona("Dina","Toribio");

        //When
        Persona resultado = prueba.devuelveObjeto(p1);

        //Then
        Assert.assertNotSame(p1,resultado);
        Assert.assertNotEquals(p1,resultado);
    }

    @Test
    public void testNotSame2() throws Exception{
        //Given
        Persona p1 = new Persona("Martin","Vizcarra");

        //When
        Persona resultado = prueba.devuelveObjeto(p1);

        //Then
        Assert.assertNotSame(p1,resultado);
        Assert.assertEquals(p1,resultado);
    }
}
