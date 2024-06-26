package com.roman31x.curso.testing.JUnit.CoberturaTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

public class PersonaTest {

    private static final String APELLIDO = "Castillo";
    private static final String NOMBRE = "Pedro";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testContructorConParametros(){
        Persona persona = new Persona(NOMBRE,APELLIDO);

        Assert.assertThat(persona,notNullValue());
        Assert.assertThat(persona.getNombre(), is(NOMBRE));
        Assert.assertThat(persona.getApellido(), is(APELLIDO));
    }

    @Test
    public void testContructorSinParametros(){
        Persona persona = new Persona(NOMBRE,APELLIDO);
        persona.setNombre(NOMBRE);
        persona.setApellido(APELLIDO);

        Assert.assertThat(persona.getNombre(),is(NOMBRE));
        Assert.assertThat(persona.getApellido(),is(APELLIDO));
    }
}