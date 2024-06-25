package com.roman31x.curso.testing.JUnit.TestNuestrasClases;

public class ConcatenarDos {

    /**
     * Concatena y devuelve dos String pasados por parametros
     * @param uno -> primer String a concatenar
     * @param dos -> Segundo String a concatenar
     * @return uno + dos
     */
    public String concatenar(String uno, String dos){
        if(uno != null && dos != null){
            return uno.concat(" ").concat(dos);
        }
        return null;
    }

    /**
     * Ejemplo "a", "b" , "c" -> String[] array = {"a", "b", "c"};
     * array[0] = "a";
     * array[1] = "b";
     * array[2] = "c";
     * @param cadena
     * return String [cadena.length]
     */
    public String[] getArrayString(String... cadena){
        String[] array = new String[cadena.length];

        for (int i = 0; i < cadena.length; i++) {
            array[i] = cadena[i];
        }

        return array;
    }

    /**
     * Devuelve true para números mayores de 10
     * Devuelve false para números menores de 10
     * @param num número a validar
     * @return boolean de la comparación
     */
    public boolean esMayorQue10(int num){
        return num > 10 ;
    }
}
