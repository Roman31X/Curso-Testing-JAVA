package com.roman31x.curso.testing.java.Modulo06;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DescuestosTest {

    @Test
    public void total_cero_cuando_no_hay_precio(){
        Descuestos calcular01 = new Descuestos();
        assertThat(calcular01.getTotal(), is(0.0));
    }

    @Test
    public void total_precio_compras(){
        Descuestos calcular02 = new Descuestos();
        calcular02.agregarCompra(10.0);
        calcular02.agregarCompra(15.7);

        assertThat(calcular02.getTotal(), is(25.7));
    }

    @Test
    public void descuento_aplicado_total_si_compra_exede_40_de_5porciento(){
        Descuestos calcular03 = new Descuestos();
        calcular03.agregarCompra(10.5);
        calcular03.agregarCompra(30.5);
        calcular03.agregarCompra(10.0);

        assertThat(calcular03.Descuento(0.5), is(25.5));

    }
}