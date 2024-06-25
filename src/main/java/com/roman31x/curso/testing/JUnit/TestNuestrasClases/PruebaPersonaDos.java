package com.roman31x.curso.testing.JUnit.TestNuestrasClases;

import java.util.ArrayList;
import java.util.List;

public class PruebaPersonaDos {

    private List<Persona> personas;

    public PruebaPersonaDos() {
        personas = new ArrayList<Persona>();
        personas.add(new Persona("Pedro","Castillo"));
        personas.add(new Persona("Dina","Boularte"));
        personas.add(new Persona("Lucho","Vizcarra"));
    }

    /**
     * Buscar en el array de persons y si encuentra una con el mismo
     * nombre la devuelve, en caso contrario devuelva null
     * @param nombre
     * @return
     * */
    public Persona nombrePersona(String nombre){
        Persona p = null;

        for (Persona persona : personas) {
            if(persona.getNombre().equalsIgnoreCase(nombre)){
                p = persona;
            }
        }

        return p;
    }
}
