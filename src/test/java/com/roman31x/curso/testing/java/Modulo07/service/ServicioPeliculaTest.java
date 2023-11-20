package com.roman31x.curso.testing.java.Modulo07.service;

import com.roman31x.curso.testing.java.Modulo07.data.RepositorioPeliculas;
import com.roman31x.curso.testing.java.Modulo07.model.Genero;
import com.roman31x.curso.testing.java.Modulo07.model.Pelicula;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ServicioPeliculaTest {

    @Test
    public void buscar_pelicula_por_titulo(){

        RepositorioPeliculas repositorioPeliculas = Mockito.mock(RepositorioPeliculas.class);

        Mockito.when(repositorioPeliculas.seleccionTodo()).thenReturn(
                Arrays.asList(new Pelicula(1,"BATMAN",50,Genero.TRILLER),
                new Pelicula(2,"SUPER MAN",40,Genero.ACCION),
                new Pelicula(3,"DRAGON BALL",60,Genero.COMEDIA),
                new Pelicula(4,"NARUTO",30,Genero.TRILLER),
                new Pelicula(5,"ACUA-MAN",40,Genero.DRAMA),
                new Pelicula(6,"SPIDER-MAN",20,Genero.COMEDIA),
                new Pelicula(7,"AVENGER",60,Genero.TRILLER))
        );

        ServicioPelicula serviciopelicula = new ServicioPelicula(repositorioPeliculas);

        Collection<Pelicula> peliculas = serviciopelicula.buscarGeneroPelicula(Genero.COMEDIA);

        List<Integer> peliculaID = peliculas.stream().map(pelicula -> pelicula.getId()).collect(Collectors.toList());

        assertThat(peliculaID, CoreMatchers.is(Arrays.asList(3,6)));

    }

}