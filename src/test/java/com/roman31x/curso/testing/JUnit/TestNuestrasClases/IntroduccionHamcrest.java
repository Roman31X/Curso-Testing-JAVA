package com.roman31x.curso.testing.JUnit.TestNuestrasClases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;

public class IntroduccionHamcrest {

    @Before
    public void setUp(){

    }

    @Test
    public void ejemplosInicialesHamcrest(){
        String cadena = "HolaMundo";

        //Comparativa
        Assert.assertEquals("HolaMundo",cadena);
        Assert.assertThat(cadena, is(equalTo("HolaMundo")));

        //Equals notequal
        Assert.assertThat(cadena,equalTo("HolaMundo"));
        Assert.assertThat(cadena,is(equalTo("HolaMundo")));
        Assert.assertThat(cadena,not(equalTo("Adios")));
        Assert.assertThat(cadena,is(not(equalTo("Adios"))));

        //Null
        Assert.assertThat(cadena,notNullValue());
        Assert.assertThat(cadena,is(notNullValue()));
        Assert.assertThat(cadena,is(not(nullValue())));
    }
}
