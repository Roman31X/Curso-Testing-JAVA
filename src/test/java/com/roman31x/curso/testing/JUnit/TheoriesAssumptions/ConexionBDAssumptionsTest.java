package com.roman31x.curso.testing.JUnit.TheoriesAssumptions;

import org.junit.Assume;
import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class ConexionBDAssumptionsTest {

    private ConexionBDAssumptions concexion;

    @Test
    public void TestSuposiciones(){
        concexion = new ConexionBDAssumptions("estudiantes_db","root","admin");
        Connection con = null;
        try{
            con = concexion.getConnection();
        }catch (Exception e){
            Assume.assumeNotNull(con);
            System.out.println("Error de conexión: "+e.getMessage());
        }
    }

    @Test
    public void TestSuposicionesFalla(){
        concexion = new ConexionBDAssumptions("db","root","admin");
        Connection con = null;
        try{
            con = concexion.getConnection();
        }catch (Exception e){
            Assume.assumeNotNull(con);
            System.out.println("Error de conexión: "+e.getMessage());
        }
    }

}