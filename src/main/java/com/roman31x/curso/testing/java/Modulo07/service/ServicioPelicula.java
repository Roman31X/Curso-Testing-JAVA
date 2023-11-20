package com.roman31x.curso.testing.java.Modulo07.service;

import com.roman31x.curso.testing.java.Modulo07.data.RepositorioPeliculas;
import com.roman31x.curso.testing.java.Modulo07.model.Genero;
import com.roman31x.curso.testing.java.Modulo07.model.Pelicula;

import java.util.Collection;
import java.util.stream.Collectors;

public class ServicioPelicula {

    private RepositorioPeliculas repositorioPelicula;

    public ServicioPelicula(RepositorioPeliculas repositorioPelicula) {
        this.repositorioPelicula = repositorioPelicula;
    }

    public Collection<Pelicula> buscarGeneroPelicula(Genero genero){

        return repositorioPelicula.seleccionTodo().stream().
                filter(pelicula -> pelicula.getGenero() == genero).collect(Collectors.toList());
    }

}
