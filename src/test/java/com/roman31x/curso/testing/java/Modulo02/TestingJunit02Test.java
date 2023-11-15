package com.roman31x.curso.testing.java.Modulo02;

import com.roman31x.curso.testing.java.Modulo01.TestingEntero;
import org.junit.Assert;
import org.junit.Test;

public class TestingJunit02Test {
    /**Para esta prueba de testing no realizaremos mediante la implemetacion
     * del metodo principal de main sino implementaremos la notacion
     * @test ya que desde este modo nos permitira sus ejecución y mostrar en
     * consola la aprobación de estar correcto*/

    @Test
    public void Prueba01(){
        //Para esta ejecución obtenedremos un resultado de 10 en la multiplicación
        Assert.assertEquals(10,TestingJunit02.Multiplicar(5,2));

    }

    @Test
    public void Prueba02(){
        //De igual manera al realizar la siguiente prueba nos arrojara un error
        //debiso a la respuesta no es la esperada
        //Assert.assertEquals(5,TestingJunit02.Multiplicar(2,5));

        Assert.assertEquals(10,TestingJunit02.Multiplicar(2,5));
    }

    @Test(expected = IllegalAccessError.class)
    public void Peueba03(){
        Assert.assertEquals(5, TestingEntero.division(10,2));

        Assert.assertEquals(5,TestingJunit02.Sumar(0,0));
    }


}