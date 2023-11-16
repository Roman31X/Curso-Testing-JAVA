package com.roman31x.curso.testing.java.Modulo04;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class JuegoDadoTest {

    @Test
    public void primer_intento_Pierde_numero_menor(){
        /**Simulamos el lanzamiento del dado con las libreria de MOCKITO*/

        Dado dado01 = Mockito.mock(Dado.class);

        /**Simulamos un resultado con el valor asignado en thenReturn*/
        Mockito.when(dado01.tirar()).thenReturn(6);

        JuegoDado jugador1 = new JuegoDado(dado01,3);
        assertFalse(jugador1.iniciar());
    }

    @Test
    public void segundo_intento_Gana_numero_random(){
        /**Simulamos el lanzamiento del dado con las libreria de MOCKITO*/

        Dado dado02 = Mockito.mock(Dado.class);

        Mockito.when(dado02.tirar()).thenReturn(2);

        JuegoDado jugador1 = new JuegoDado(dado02,5);
        assertTrue(jugador1.iniciar());
    }

}