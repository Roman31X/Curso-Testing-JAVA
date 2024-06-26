package com.roman31x.curso.testing.JUnit.GestionandoExcepciones;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexionBDTestTryCatchRules {

    public static final String BD = "estudiantes_db";
    public static final String USER = "root";
    public static final String PASSWORD = "admin";
    public static final String USER_FAIL = "admin";

    @Rule
    public ExpectedException exception = ExpectedException.none();  // Se encarga de analizar la excepción

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
    public void conexionFallida() throws SQLException,ClassNotFoundException{
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
        }

        Assert.assertThat(con, Matchers.nullValue());
    }

    @Test(expected = SQLException.class)
    public void conexionFallidaAnotaciones() throws SQLException,ClassNotFoundException{
        conexionBD = new ConexionEstructurada(BD,USER_FAIL,PASSWORD);
        conexionBD.getConnection();
        Assert.fail("La conexión a fallado");
    }

    @Test
    public void conexionFallidaConRegla() throws SQLException,ClassNotFoundException{

        exception.expect(SQLException.class);
        exception.expectMessage("Access denied for user 'admin'@'localhost' (using password: YES)");
        exception.expectMessage("'admin'@'localhost'");
        exception.expectMessage("Access denied ");
        exception.expectMessage(Matchers.equalTo("Access denied for user 'admin'@'localhost' (using password: YES)"));  //Verificar todo la cadena sea igual
        exception.expectMessage(Matchers.containsString("denied for user"));  //Verificar contenido dentro de la cadena
        exception.expectMessage(Matchers.startsWith("Access denied"));       //Verificar contenido inicial dentro de la cadena
        exception.expectMessage(Matchers.endsWith("(using password: YES)")); //Verificar contenido final dentro de la cadena

        conexionBD = new ConexionEstructurada(BD,USER_FAIL,PASSWORD);
        conexionBD.getConnection();
    }
}
