package com.roman31x.curso.testing.java.Modulo07.data;

import com.roman31x.curso.testing.java.Modulo07.model.Pelicula;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class RepositorioPeliculasJDBC implements RepositorioPeliculas {

    private JdbcTemplate jdbcTemplate;

    public RepositorioPeliculasJDBC(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Pelicula buscarID(long id) {
        return null;
    }

    @Override
    public Collection<Pelicula> seleccionTodo() {
        RowMapper<Pelicula> peliculaMapeada = new RowMapper<Pelicula>() {
            @Override
            public Pelicula mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Pelicula();
            }
        }
        return null;
    }

    @Override
    public void guardarActualizacion(Pelicula pelicula) {

    }
}
