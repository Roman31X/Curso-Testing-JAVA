package com.roman31x.curso.testing.JUnit.TestNuestrasClases;

import java.util.ArrayList;
import java.util.List;

public class PruebaPersona3 {

    private List<Persona> personas;

    public PruebaPersona3() {
        personas = new ArrayList<Persona>();
        personas.add(new Persona("Pedro","Castillo"));
        personas.add(new Persona("Dina","Boularte"));
    }

    public Persona devuelveObjeto(Persona persona){
        if(personas.contains(persona)){
            return persona;
        }else{
            return new Persona("Martin","Vizcarra");
        }
    }
}
