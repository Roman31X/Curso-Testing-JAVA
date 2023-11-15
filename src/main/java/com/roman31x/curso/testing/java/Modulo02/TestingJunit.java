package com.roman31x.curso.testing.java.Modulo02;

public class TestingJunit {
    public static String pruebaJunit(String cadena,int numero){
        String palabra = "";
        for (int i = 0; i < numero; i++) {
            palabra += cadena;
        }
        return palabra;
    }
}
