package com.roman31x.curso.testing.java.Modulo07.data;

import com.roman31x.curso.testing.java.Modulo07.model.Genero;
import com.roman31x.curso.testing.java.Modulo07.model.Pelicula;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class RepositorioPeliculasJDBCTest {

    @Test
    public void Obtener_todas_las_peliculas_BaseDato() throws SQLException {

        /**Implementando los dirver de jbdc creamos una base de datos en memoria
         * para realizar las pruebas correspondientes con MODO MYSQL*/

        DataSource dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL","diego","diego");

        /**TENIENDO EL SCRIP CON LA SENTENCIAS EN SQL podemos hacer uso de una clase
         * para que este se implementado en la creacion de la tabla como del contenido
         * dentro de ella*/

        ScriptUtils.executeSqlScript(dataSource.getConnection(),new ClassPathResource("sql-scripts/test-data.sql"));

        //Se crea el jdbc necesario para conexión a la base de datos
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        RepositorioPeliculasJDBC repositorioPeliculasJDBC = new RepositorioPeliculasJDBC(jdbcTemplate);

        //se realiza la selección de todas la peliculas en la tabla de la base de datos
        Collection<Pelicula> peliculas  = repositorioPeliculasJDBC.seleccionTodo();

        //MEDIANTE LA CLASE ASSERT realiso la consulta si las peliculas obtenidas son las correctas en la base de datos
        assertThat(peliculas, is(Arrays.asList(
                new Pelicula(1,"SUPERMAN",152, Genero.ACCION),
                new Pelicula(2,"IRON-MAN",113,Genero.TRILLER),
                new Pelicula(3,"MATRIX",136,Genero.ACCION)
        )));

    }


}