package com.roman31x.curso.testing.JUnit.TestNuestrasClases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PruebaPersonaDosTest {

    private PruebaPersonaDos prueba;

    @Before
    public void setUp() throws Exception{
        prueba = new PruebaPersonaDos();
    }

    @Test
    public void testNombrePersonas() throws Exception{
        //When
        Persona persona1 = prueba.nombrePersona("Pedro");
        Persona persona2 = prueba.nombrePersona("Carlos");

        //Then
        Assert.assertNull(persona2);
        Assert.assertNotNull(persona1);

        //Con mensaje
        //Assert.assertNull("No es nulo",persona1);
        Assert.assertNotNull("Es nulo",persona1);
    }
}
