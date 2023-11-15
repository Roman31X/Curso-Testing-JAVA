package com.roman31x.curso.testing.java.Modulo02;

public class TestingJunit02 {
    public static int Multiplicar(int a, int b){
        int resultado;

        resultado = a * b;

        return resultado;
    }
    public static int Sumar(int a,int b){
        int resultado = 0;
        if(a == 0 && b == 0){
            throw new IllegalArgumentException("Ingrese valores mayores a 0");
            //System.out.println("Debe enviar por lo menos un números mayores a 0 para realizar suma";
        }else{
            resultado = a + b;
        }
        return resultado;
    }
}
