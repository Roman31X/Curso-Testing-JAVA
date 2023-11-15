package com.roman31x.curso.testing.java.Modulo03;

import org.junit.Test;

import static com.roman31x.curso.testing.java.Modulo03.TestingContraseñas.NivelSeguridad.*;
import static org.junit.Assert.*;

public class TestingContraseñasTest {

    @Test
    public void prueba01_Contraseña_Debil_numeros(){
        assertEquals(DEBIL,TestingContraseñas.evaluacionPassword("holamundo"));
    }

    @Test
    public void prueba02_Contraseña_Debil_letras(){
        assertEquals(DEBIL,TestingContraseñas.evaluacionPassword("holamundo"));
    }

    @Test
    public void prueba03_Contraseña_Medio_letras_y_numeros(){
        assertEquals(MEDIO,TestingContraseñas.evaluacionPassword("h0l1m2n3o456"));
    }

    @Test
    public void prueba04_Contraseña_Fuerte_letras_numeros_y_simbolos(){
        assertEquals(FUERTE,TestingContraseñas.evaluacionPassword("H0l1m2n3O4@6+"));
    }

}