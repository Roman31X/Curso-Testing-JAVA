package com.roman31x.curso.testing.java.Modulo07.data;

import com.roman31x.curso.testing.java.Modulo07.model.Genero;
import com.roman31x.curso.testing.java.Modulo07.model.Pelicula;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.Collection;
import java.util.Objects;

public class RepositorioPeliculasJDBC implements RepositorioPeliculas {

    private JdbcTemplate jdbcTemplate;

    public RepositorioPeliculasJDBC(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Pelicula buscarID(long id) {

        Object[] argumento = { id };

        return jdbcTemplate.queryForObject("select * from pelicula where id=?",argumento,peliculaMapeada);
    }

    @Override
    public Collection<Pelicula> seleccionTodo() {

        return jdbcTemplate.query("select * from pelicula",peliculaMapeada);
    }

    @Override
    public void guardarActualizacion(Pelicula pelicula) {
        jdbcTemplate.update("insert into pelicula (nombre,minutos,genero) values (?,?,?)",
                pelicula.getNombre(),
                pelicula.getMinutos(),
                pelicula.getGenero().toString());
    }

    //CREAMOS UNA SELECCIÓN GENERAL DE L ABASE DE DATOS PARA IMPLEMENTAR EN EL RESTO DE
    //LOS MÉTODOS
    private static RowMapper<Pelicula> peliculaMapeada = (rs, rowNum) -> new Pelicula(
            rs.getInt("id"),
            rs.getString("nombre"),
            rs.getInt("minutos"),
            Genero.valueOf(rs.getString("genero"))
    );
}
