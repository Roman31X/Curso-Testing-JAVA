package com.roman31x.curso.testing.java.Modulo07.model;

import java.util.Objects;

public class Pelicula {
    private Integer id;
    private String nombre;
    private int minutos;
    private Genero genero;

    //CREAMOS UN CONSTRUCTOR QUE LLAME AL SEGUNDO CONSTRUCTOR MEDIANTE EL THIS
    //YA QUE EL SEGUNDO IMPLEMENTA EL USO DEL ID DE SER NECESARIO
    public Pelicula(String nombre, int minutos, Genero genero) {
        this(null,nombre,minutos,genero);
    }

    public Pelicula(Integer id, String nombre, int minutos, Genero genero) {
        this.id = id;
        this.nombre = nombre;
        this.minutos = minutos;
        this.genero = genero;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    //MÉTODO IMPLEMTADOS PARA HACER LA COMPARACIÓN A TRAVES DE LOS OBJETOS CREADOS DE LA CLASE
    //IMPLEMETADOS EN LA CLASE TEST

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return minutos == pelicula.minutos &&
                Objects.equals(id, pelicula.id) &&
                Objects.equals(nombre, pelicula.nombre) &&
                genero == pelicula.genero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, minutos, genero);
    }
}
