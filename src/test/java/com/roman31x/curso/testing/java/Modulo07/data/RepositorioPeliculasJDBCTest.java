package com.roman31x.curso.testing.java.Modulo07.data;

import com.roman31x.curso.testing.java.Modulo07.model.Genero;
import com.roman31x.curso.testing.java.Modulo07.model.Pelicula;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class RepositorioPeliculasJDBCTest {

    private RepositorioPeliculasJDBC repositorioPeliculasJDBC;
    private DataSource dataSource;

    //IMPLEMENTAMOS LA NOTACIÓN @BEFORE para una clase que se implemetara primero
    //antes que las demas clases
    @Before
    public void setUp() throws SQLException {

        /**Implementando los dirver de jbdc creamos una base de datos en memoria
         * para realizar las pruebas correspondientes con MODO MYSQL*/

        dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL","diego","diego");

        /**TENIENDO EL SCRIP CON LA SENTENCIAS EN SQL podemos hacer uso de una clase
         * para que este se implementado en la creacion de la tabla como del contenido
         * dentro de ella*/

        ScriptUtils.executeSqlScript(dataSource.getConnection(),new ClassPathResource("sql-scripts/test-data.sql"));

        //Se crea el jdbc necesario para conexión a la base de datos
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        repositorioPeliculasJDBC = new RepositorioPeliculasJDBC(jdbcTemplate);

    }

    @Test
    public void Obtener_todas_las_peliculas_BaseDato() throws SQLException {

        //se realiza la selección de todas la peliculas en la tabla de la base de datos
        Collection<Pelicula> peliculas  = repositorioPeliculasJDBC.seleccionTodo();

        //MEDIANTE LA CLASE ASSERT realiso la consulta si las peliculas obtenidas son las correctas en la base de datos
        assertThat(peliculas, is(Arrays.asList(
                new Pelicula(1,"SUPERMAN",152, Genero.ACCION),
                new Pelicula(2,"IRON-MAN",113,Genero.TRILLER),
                new Pelicula(3,"MATRIX",136,Genero.ACCION)
        )));

    }

    @Test
    public void busqueda_pelicula_ID(){

        Pelicula peliculaID = repositorioPeliculasJDBC.buscarID(2);

        assertThat(peliculaID, is(new Pelicula(2,"IRON-MAN",113,Genero.TRILLER)
                ));
    }

    //Esta anotación nos permite realizar esta ejecucion despues de cada TEST
    //de este modo elimina la base de datos utilizada en el primer test
    //evitando el sobrecargo de información por test
    @After
    public void tearDown() throws Exception{

        //Sentencia para remover la base de datos creado en memoria H2
        final Statement s = dataSource.getConnection().createStatement();
        s.execute("drop all objects delete files"); //de este modo podemos eliminar informacion de la base de datos en memoria y la que tengamos
    }
}