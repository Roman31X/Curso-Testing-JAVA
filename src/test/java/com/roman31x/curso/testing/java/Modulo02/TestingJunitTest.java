package com.roman31x.curso.testing.java.Modulo02;

import org.junit.Assert;

public class TestingJunitTest {

    /**Ahora implementando la librería de JUnit podemos hacer uso de las
     * clases de Assert.asserEquals: la cual nos permitirá realizar un testing
     * mucho más eficiente con el método creado en la clase del modulo02
     * Ya que este método nos proporciona si hay igualdad entre el valor esperado con
     * relación con el método asignado a evaluar*/

    public static void main(String[] args) {

        //En esta primera ejecución no marcará ningún error debido a que el valor esperado
        //si es la respuesta esperada de la ejecución del método
        Assert.assertEquals("HolaHola",TestingJunit.pruebaJunit("Hola",2));

        //Caso contrario en esta ejecución si nos arrojara un error debido a que este
        //va a devolver un valor diferente al que ya estaba previsto
        Assert.assertEquals("Hola",TestingJunit.pruebaJunit("Hola",2));

    }
}