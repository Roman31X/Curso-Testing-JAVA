package com.roman31x.curso.testing.java.Modulo06;

public class DataUtil {
    public static boolean anioBisiesto(int anio){
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
