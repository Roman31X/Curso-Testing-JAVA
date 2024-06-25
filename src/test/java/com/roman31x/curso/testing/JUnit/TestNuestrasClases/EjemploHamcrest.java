package com.roman31x.curso.testing.JUnit.TestNuestrasClases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class EjemploHamcrest {

    @Before
    public
    void setUp(){

    }

    @Test
    public void ejemploClaseHamcrest(){
        String cadena = "HolaMundo";

        //Comparativa
        Assert.assertEquals("HolaMundo",cadena);
        Assert.assertThat(cadena,is("HolaMundo"));
    }
}
