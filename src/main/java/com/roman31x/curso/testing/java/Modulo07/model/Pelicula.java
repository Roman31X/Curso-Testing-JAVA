package com.roman31x.curso.testing.java.Modulo07.model;

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
}
