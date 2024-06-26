package com.roman31x.curso.testing.JUnit.GestionandoExcepciones;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.regex.Matcher;

public class ConexionBDTestTryCatch {

    public static final String BD = "estudiantes_db";
    public static final String USER = "root";
    public static final String PASSWORD = "admin";
    public static final String USER_FAIL = "admin";

    private ConexionEstructurada conexionBD;

    @Test
    public void conexionCorrectaTryCatch(){
        conexionBD = new ConexionEstructurada(BD,USER,PASSWORD);
        Connection con = null;

        try{
            con = conexionBD.getConnection();
            System.out.println("Conexión exitosa: "+con);
        }catch (ClassNotFoundException | SQLException e){
            Assert.fail("La conexión a fallado");
            System.out.println("Error de conexión: "+e.getMessage());
        }

        Assert.assertThat(con, Matchers.notNullValue());
    }

    @Test
    public void conexionFallida(){
        conexionBD = new ConexionEstructurada(BD,USER_FAIL,PASSWORD);
        Connection con = null;

        try{
            con = conexionBD.getConnection();
            System.out.println("Conexión exitosa: "+con);
        }catch (SQLException e){
            Assert.assertThat(e,Matchers.isA(SQLException.class));
            Assert.assertThat(e.getMessage(),Matchers.startsWith("Access denied for user"));
            Assert.assertThat(e.getMessage(),Matchers.containsString("Access denied for user"));
            Assert.assertThat(e.getSQLState(),Matchers.is("28000"));
            System.out.println("Error de conexión: "+e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Assert.assertThat(con, Matchers.nullValue());
    }

    @Test(expected = SQLException.class)
    public void conexionFallidaAnotaciones() throws SQLException,ClassNotFoundException{
        conexionBD = new ConexionEstructurada(BD,USER_FAIL,PASSWORD);
        conexionBD.getConnection();
        Assert.fail("La conexión a fallado");
    }
}
