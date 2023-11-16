package com.roman31x.curso.testing.java.Modulo04;

public class JuegoDado {
    private Dado dado;
    private int numeroIntentos;

    public JuegoDado(Dado dado, int numeroIntentos) {
        this.dado = dado;
        this.numeroIntentos = numeroIntentos;
    }

    //Iniciamos un método que nos indicara si ganas
    public boolean iniciar(){
        int numeroRandom = dado.tirar();
        return numeroRandom > numeroIntentos;
    }
}
