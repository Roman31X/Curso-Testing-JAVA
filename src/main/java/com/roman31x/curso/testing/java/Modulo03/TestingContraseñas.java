package com.roman31x.curso.testing.java.Modulo03;

public class TestingContraseñas {

    public enum NivelSeguridad{
        DEBIL,MEDIO,FUERTE
    }

    /**Para la implementacion de evaluacion del novel de caracteres implementaremos
     * la evaluación de una cadena con la clase matches para poder medir su rando de letras
     * a si como el número que esta se repetira*/

    public static NivelSeguridad evaluacionPassword(String contraseña){

        //en esta condición se evaluara el rango y veces de repetición de un carácter
        //evaluamos contraseña sebil de letras
        if(contraseña.matches("[a-zA-Z]+")) {
            return NivelSeguridad.DEBIL;
        }

        if(contraseña.matches("[a-zA-Z0-9]+")){
            return NivelSeguridad.MEDIO;
        }

        return NivelSeguridad.FUERTE;
    }

}
