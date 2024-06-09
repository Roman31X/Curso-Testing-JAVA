package com.roman31x.curso.testing.java.Modulo05;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CentralPagosTest {
    //NOMBRAMOS VARIABLE A IMPLEMENTAR EN LOS MÉTODOS DE TEST
    private TransferenciasPagos pagosRealizado;
    private CentralPagos pedidoPago;

    /**ANOTACIÓN PARA INDICAR AL COMPILADOR QUE ESTE MÉTODO SE DEBE EJECUTAR
     * PRIMERO QUE LOS MÉTODOS DE TEST PARA DE ESTA MANERA PODER FUNCIONAR CORRECTAMENTE*/
    @Before
    public void general(){
        /**PREPARACIÓN DE LOS DATOS O OBJETOS PARA LA SIMULACIÓN EN EJECUCIÓN*/

        pagosRealizado = Mockito.mock(TransferenciasPagos.class);
        pedidoPago =  new CentralPagos(pagosRealizado);
    }

    @Test
    public void pago_correcto(){
        Mockito.when(pagosRealizado.pedidoPago(Mockito.any())).thenReturn(new RespuestaPago(RespuestaPago.EstadoPago.OK));

        /**PROBANDO LA EJECUCIÓN DEL MÉTODO*/
        boolean prueba01 = pedidoPago.realizarPago(1000);

        /**FINALMENTE ES LA COMPROBACIÓN DEL RESULTADO*/
        assertTrue(prueba01);
    }

    @Test
    public void pago_incorrecto(){

        /**SIMULACIÓN DE LA RESPUESTA ASIGNADA EN EL MÉTODO*/
        Mockito.when(pagosRealizado.pedidoPago(Mockito.any())).thenReturn(new RespuestaPago(RespuestaPago.EstadoPago.ERROR));

        /**REDUCCIÓN DE CODIGO */
        assertFalse(pedidoPago.realizarPago(1000));
    }

}