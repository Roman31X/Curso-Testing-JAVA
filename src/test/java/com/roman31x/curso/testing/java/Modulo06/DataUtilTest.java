package com.roman31x.curso.testing.java.Modulo06;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DataUtilTest {
    /*REQUERIMIENTO PARA  SABE SI UN AÑO ES BISIESTO
    * [1] : Todos los años divisibles por 400 son bisiestos (1600, 2000, 2400)
    * [2] : Todos los años divisibles por 100 y no por 400 son bisiestos (1700, 1800, 1900)
    * [3] : Todos los años divisibles por 4 y o por 100 son bisiestos (1996, 2004, 2008)
    * [4] : Todos los años no divisibles por 4 no son bisiestos (2017, 2018, 2019)
    * */

    @Test
    public void prueba01_anio_divisible_por_400(){

        assertThat(DataUtil.anioBisiesto(1600), is(true));
        assertThat(DataUtil.anioBisiesto(2000), is(true));
        assertThat(DataUtil.anioBisiesto(2400), is(true));

    }

    @Test
    public void prueba02_anio_dvisible_por_100_pero_no_por_400(){

        assertThat(DataUtil.anioBisiesto(1700), is(false));
        assertThat(DataUtil.anioBisiesto(1800), is(false));
        assertThat(DataUtil.anioBisiesto(2900), is(false));

    }

    @Test
    public void prueba03_anio_divisible_por_4_pero_no_por_100(){

        assertThat(DataUtil.anioBisiesto(1996), is(true));
        assertThat(DataUtil.anioBisiesto(2004), is(true));
        assertThat(DataUtil.anioBisiesto(2008), is(true));

    }

    @Test
    public void prueba04_anio_no_divisible_por_4_es_bisiesto(){

        assertThat(DataUtil.anioBisiesto(2017), is(false));
        assertThat(DataUtil.anioBisiesto(2018), is(false));
        assertThat(DataUtil.anioBisiesto(2019), is(false));

    }

}