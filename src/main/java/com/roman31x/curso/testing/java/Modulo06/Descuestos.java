package com.roman31x.curso.testing.java.Modulo06;

import java.util.ArrayList;
import java.util.List;

public class Descuestos {

    private List<Double> precios = new ArrayList<>();
    private double descuento = 0;

    public double getTotal() {
        double total = 0;
        for (Double precio : precios) {
            total += precio;
        }
        return total;
    }

    public void agregarCompra(double precio) {
        precios.add(precio);
    }

    public Double Descuento(double descuento) {
        double totalDescuesto = getTotal()*descuento;
        return totalDescuesto;
    }
}
