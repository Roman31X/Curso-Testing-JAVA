package com.roman31x.curso.testing.JUnit.TestParametrizados;

public class ParametrizadoIII {

    /**
     * Concatenar y devuelve dos String pasados por parámetros
     * @param uno -> primer String a concatenar
     * @param dos -> segundo String a concatenar
     * @param tres -> tercer String a concatenar
     * @return uno + dos
     */

    public String concatenar(String uno, String dos, String tres){
        if(uno != null && dos != null && tres != null){
            return uno.concat(" ").concat(dos).concat(" ").concat(tres);
        }
        return null;
    }

    /**
     * Devuelve la suma de los parametros
     * @param a
     * @param b
     * @return
     */
    public int sumaNumeros(int a, int b){
        return a + b;
    }
}
