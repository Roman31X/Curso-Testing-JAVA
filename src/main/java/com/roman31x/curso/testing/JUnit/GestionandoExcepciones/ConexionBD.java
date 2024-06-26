package com.roman31x.curso.testing.JUnit.GestionandoExcepciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    //Parámetros de conexión
    public final String db = "estudiantes_db";
    public final String url = "jdbc:mysql://localhost:3306/"+db;
    public final String user = "root";
    public final String password = "admin";

    public Connection getConnection(){
        Connection conexion = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url,user,password);
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Ocurrió un error en la conexión: "+e.getMessage());
        }

        return conexion;
    }
}
