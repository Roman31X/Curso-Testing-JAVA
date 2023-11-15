package com.roman31x.curso.testing.java.Modulo01;

public class TestingString {
    /**
     * Seleccionar el nombre de la clase [alt + enter] y seleccionar
     * create Test y seleccionar la libreria JUNIT-4 posteriormente
     * se creara una carpeta en la cual se podran realizar los test */

    public static String pruebaN1(String cadena, int numero){

        String palabra = "";

        for (int i = 0; i < numero; i++) {
            palabra += cadena;
        }

        return palabra;
    }

}
