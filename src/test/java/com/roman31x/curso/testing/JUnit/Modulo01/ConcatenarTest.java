package com.roman31x.curso.testing.JUnit.Modulo01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConcatenarTest {

    @Test
    public void testConcatenar(){
        // Instanciar la clase a probar
        Concatenar prueba = new Concatenar();

        //Ejecutar el método a probar
        String resultado = prueba.contactenarPalabras("Hola","Mundo");

        //Validación de respuesta
        Assert.assertEquals("HolaMundo",resultado);

        //Validación de respuesta con mensaje
        /*Assert.assertEquals("La respuesta esperada no es la correcta",
                "Hola Mundo",resultado);*/
    }

    /*
    @Test
    public void testConcatenarFallo(){
        Concatenar prueba = new Concatenar();
        String resultado = prueba.contactenarPalabras("Hola","Mundo");
        Assert.assertEquals("La respuesta no coinciden con lo esperado","Hola Mundo",resultado);
    }

    @Test
    public void testConcatenarError(){
        Concatenar prueba = new Concatenar();
        String resultado = prueba.contactenarPalabras(null,"Mundo");
        Assert.assertEquals(null,resultado);
    }*/

}