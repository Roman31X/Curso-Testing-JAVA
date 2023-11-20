package com.roman31x.curso.testing.java.Modulo07.data;

import com.roman31x.curso.testing.java.Modulo07.model.Pelicula;

import java.util.Collection;

public interface RepositorioPeliculas {

    Pelicula buscarID(long id);

    Collection<Pelicula> seleccionTodo();

    void guardarActualizacion(Pelicula pelicula);

}
