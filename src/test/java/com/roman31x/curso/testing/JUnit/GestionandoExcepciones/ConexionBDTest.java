package com.roman31x.curso.testing.JUnit.GestionandoExcepciones;

import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.Matchers;

import java.sql.Connection;
import java.util.regex.Matcher;

public class ConexionBDTest {

    private ConexionBD conexion;

    @Test
    public void testFail(){
        //Assert.fail("Prueba fallida");
    }

    @Test
    public void testFalConexionBD(){
        conexion = new ConexionBD();

        Connection con = conexion.getConnection();

        Assert.assertThat(con, Matchers.notNullValue());
    }
}
