package com.roman31x.curso.testing.JUnit.TestNuestrasClases;

public class MetodosAutomaticos {
    public static void main(String[] args) {

        //Primitivos
        int a = 5;
        int b = 5;

        System.out.println("Son iguales: "+(a==b));

        System.out.println("La suma de ambos valores da 10: "+(10 == (a+b)));

        //Objetos
        Persona persona1 = new Persona("Padro","Cstillo");
        Persona persona2 = new Persona("Dina","Boularte");
        Persona persona3 = new Persona("Dina","Boularte");

        System.out.println("persona1 y persona2 son iguales: "+(persona1 == persona2));
        System.out.println("persona2 y persona3 son iguales: "+(persona2.equals(persona3)));


    }
}
