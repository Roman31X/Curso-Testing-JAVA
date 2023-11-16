package com.roman31x.curso.testing.java.Modulo05;

public class CentralPagos {

    private TransferenciasPagos transferenci;

    public CentralPagos(TransferenciasPagos transferenci) {
        this.transferenci = transferenci;
    }

    public boolean realizarPago(double monto){

        RespuestaPago respuesta = transferenci.pedidoPago(new PedidoPago(monto));

        if(respuesta.getEstado() == RespuestaPago.EstadoPago.OK){
            return true;
        }else{
            return false;
        }
    }
}
