package com.roman31x.curso.testing.java.Modulo07.service;

import com.roman31x.curso.testing.java.Modulo07.data.RepositorioPeliculas;
import com.roman31x.curso.testing.java.Modulo07.model.Genero;
import com.roman31x.curso.testing.java.Modulo07.model.Pelicula;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ServicioPeliculaTest {

    private ServicioPelicula serviciopelicula;

    /**IMPLEMENTAMOS LA NOTACIÓN  [@Before] PARA PODER USAR ESTE METODO EN EL LLAMADO DE
     * LOS DEMAS @TEST QUE NECESITAS LA IMPLEMENTACIÓN DE LA LISTA CREADA DENTRO DEL MÉTODO*/
    @Before
    public void setUp() throws Exception {
        RepositorioPeliculas repositorioPeliculas = Mockito.mock(RepositorioPeliculas.class);

        Mockito.when(repositorioPeliculas.seleccionTodo()).thenReturn(
                Arrays.asList(new Pelicula(1,"BATMAN",152,Genero.ACCION),
                        new Pelicula(2,"SUPER MAN",113,Genero.TRILLER),
                        new Pelicula(3,"DRAGON BALL",119,Genero.COMEDIA),
                        new Pelicula(4,"NARUTO",112,Genero.TRILLER),
                        new Pelicula(5,"LA MONJA",111,Genero.HORROR),
                        new Pelicula(6,"SPIDER-MAN",103,Genero.COMEDIA),
                        new Pelicula(7,"AVENGER",136,Genero.ACCION))
        );

        serviciopelicula = new ServicioPelicula(repositorioPeliculas);
    }

    @Test
    public void buscar_pelicula_por_titulo(){

        Collection<Pelicula> peliculas = serviciopelicula.buscarGeneroPelicula(Genero.COMEDIA);

        List<Integer> peliculaID = peliculas.stream().map(pelicula -> pelicula.getId()).collect(Collectors.toList());

        assertThat(peliculaID, CoreMatchers.is(Arrays.asList(3,6)));

    }

    @Test
    public void retornar_pelicula_por_Duracion(){

        Collection<Pelicula> peliculas = serviciopelicula.buscarPeliculaDuracion(120);

        List<Integer> peliculaID = peliculas.stream().map(pelicula -> pelicula.getId()).collect(Collectors.toList());

        assertThat(peliculaID, CoreMatchers.is(Arrays.asList(2,3,4,5,6)));

    }

}