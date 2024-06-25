package com.roman31x.curso.testing.JUnit.TestNuestrasClases;

public class PruebaPersona {
    private Persona pedro;
    private Persona dina;

    public PruebaPersona() {
        pedro = new Persona("Pedro","Castillo");
        dina = new Persona("Dina","Boularte");
    }

    public Persona getPedro() {
        return pedro;
    }

    public Persona getDina() {
        return dina;
    }

    /** AssertArrayEquals */
    public Persona[] getArrauyPersona(){
        Persona[] personas = {pedro,dina};
        return personas;
    }
}
