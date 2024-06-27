package com.roman31x.curso.testing.JUnit.TheoriesAssumptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDAssumptions {

    private final String db;
    private final String url;
    private final String user;
    private final String password;

    public ConexionBDAssumptions(String db, String user, String password) {
        this.db = db;
        this.url = "jdbc:mysql://localhost:3306/"+db;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url,user,password);
    }

    public String getDb() {
        return db;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
