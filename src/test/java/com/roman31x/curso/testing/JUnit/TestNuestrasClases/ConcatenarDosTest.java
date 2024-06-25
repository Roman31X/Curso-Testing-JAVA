package com.roman31x.curso.testing.JUnit.TestNuestrasClases;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConcatenarDosTest {

    private ConcatenarDos concatenarDos;

    @Before
    public void setUp() throws Exception{
        concatenarDos = new ConcatenarDos();
    }

    @Test
    public void testGestArrayString() throws Exception{
        //Given
        String[] esperado = {"a","b","c"};
        String[] esperado2 = {"uno","dos","tres"};

        //When
        String[] resultado = concatenarDos.getArrayString("a","b","c");
        String[] resultado2 = concatenarDos.getArrayString("uno","dos","tres");

        //Then
        assertEquals(esperado,resultado);
        assertEquals(esperado.length,resultado.length);
        assertEquals(esperado[0],resultado[0]);
        assertEquals(esperado[1],resultado[1]);
        assertEquals(esperado[2],resultado[2]);

        assertEquals(esperado2,resultado2);
        assertEquals(esperado2.length,resultado2.length);
    }

    @Test
    public void testAssrTruer(){
        boolean respuestaTrue = concatenarDos.esMayorQue10(20);
        boolean respuestafalse = concatenarDos.esMayorQue10(5);

        assertTrue("Test de verdadero a fallado",respuestaTrue);
        assertFalse("El test de falso a fallado",respuestafalse);
    }
}
