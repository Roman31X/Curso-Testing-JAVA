package com.roman31x.curso.testing.JUnit.TestNuestrasClases;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PruebaPersonaTest {

    private PruebaPersona prueba;

    @Before
    public void setUp() throws Exception{
        prueba = new PruebaPersona();
    }

    @Test
    public void testGetPedro() throws Exception{
        //Given - Dado: en que situación queremos probar la función.

        //When - Cuando: qué acciones del usuario queremos probar.
        Persona pedro = prueba.getPedro();
        //Then - Entonces: Cuál es el resultado esperado
        assertEquals("Pedro",pedro.getNombre());
        assertEquals("Castillo",pedro.getApellido());
    }

    @Test
    public void testGetDina() throws Exception{
        // Dado:

        // Cuando:
        Persona dina = prueba.getDina();
        // Entonces:
        assertEquals("Dina",dina.getNombre());
        assertEquals("Boularte",dina.getApellido());
    }

    @Test
    public void testPersonaDiferentes(){
        Persona pedro = prueba.getPedro();
        Persona dina = prueba.getDina();

        assertNotEquals(dina,pedro);
    }
}

