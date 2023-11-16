package com.roman31x.curso.testing.java.Modulo05;

public class RespuestaPago {

    enum EstadoPago{
        OK, ERROR
    }

    private EstadoPago estado;

    public RespuestaPago(EstadoPago estado) {
        this.estado = estado;
    }

    public EstadoPago getEstado() {
        return estado;
    }

    public void setEstado(EstadoPago estado) {
        this.estado = estado;
    }
}
