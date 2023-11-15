package com.roman31x.curso.testing.java.Modulo01;

import static org.junit.Assert.*;

public class TestingStringTest {

    /**TESTING MANUAL EN JAVA*/

    public static void main(String[] args) {

        String resultado = TestingString.pruebaN1("Hola",3);
        System.out.println(resultado);

        if(resultado.equals("HolaHolaHola")){
            System.out.println("La respuesta es CORRECTA");
        }else{
            System.out.println("ERROR");
        }

        /**TESTING MANUAL EXECPTION  EN JAVA*/

        String pruebaDos = TestingString.pruebaN1("Hola",3);
        if(pruebaDos.equals("HolaHolaHola")){
            System.out.println("Todo salio bien");
        }else{
            //Con esta linea de codigo podemos mostrar la execpción indicando la
            //linea del codigo donde ocurrio.
            throw new RuntimeException("ERROR");
        }

        /**TESTING MANUAL RESULTADO ACTUAL Y EL ESPERADO EN JAVA*/

        compararIgualdad(pruebaDos,"Hola");

    }

    private static void compararIgualdad(String actual, String esperado){
        if(!actual.equals(esperado)){
            throw new RuntimeException(actual + " No es igual al valor esperado de :  "+esperado);
        }
    }

}