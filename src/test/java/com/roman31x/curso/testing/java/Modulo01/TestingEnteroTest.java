package com.roman31x.curso.testing.java.Modulo01;

import static org.junit.Assert.*;

public class TestingEnteroTest {

    public static void main(String[] args) {
        int multiplicacion = TestingEntero.multiplicar(5,5);

        if(multiplicacion == 25){
            System.out.println("La respuesta es correcta");
        }else{
            System.out.println("La respuesta es incorrecta");
        }

        int division = TestingEntero.division(10,2);

        if(division == 5){
            System.out.println("El numero es par");
        }else{
            throw new RuntimeException("El numero impar");
        }



    }

}