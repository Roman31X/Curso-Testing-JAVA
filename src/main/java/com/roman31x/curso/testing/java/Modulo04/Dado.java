package com.roman31x.curso.testing.java.Modulo04;

import org.junit.Test;

import java.util.Random;

public class Dado {
    private int caras;

    public Dado(int caras) {
        this.caras = caras;
    }

    //Método para arrojar numero randon
    public int tirar(){
        return new Random().nextInt(caras) + 1;
    }
}
