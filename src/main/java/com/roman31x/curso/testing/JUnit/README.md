# JUnit
JUnit implementa __Aserciones__ los cuales son la aparte más importantes de los test
unitario yá que nos permite de que nuestra clase o test devuelvan el resultado esperado.
Validando de esta manera nuestra implementación.

*NOTAS*
- [x] Ningún Asser debe de arrojo una excepción.
- [x] Que no se invoque explícitamente el método de Fail.
- [x] Que no se lance una excepción no controlada.

## Tipos de Aserciones
JUnit pone a nuestra disposición una amplia colección de métodos de la clase Asser, los 
cuales realizan validaciones bajo los parámetros de entrada. De tal modo que si la 
validación se cumple el test pasa, caso contrario si falla no pasa la prueba.

*NOTAS*
- [x] La mayoría de variantes, tienen un parámetro como String donde podemos enviar
mensaje de erro en caso de fallo.
- [x] Se considera buenas prácticas implementar estos mensajes yá que nos permitirá 
identificar el error dentro del test.

*Ejemplo*

```java
import org.junit.Test;

@Test
public void test(){
    String cadenaTest = "Hola Mundo";
    Assert.assertEquals("Las cadenas son diferentes","Hola Mundo",cadenaTest);
}
```

- [x] AsserEquals:
  - Esta clase evalúa si los dos objetos pasados por parámetros son iguales
- [x] AssertTrue:
  - Evalúa si la condición pasada es cierta. Opuesto a assertFalse.
- [x] AssertFalse:
  - Evalúa si la condición pasada es falsa.
- [x] AssertNull:
  - Comprueba si el objeto es nulo.
- [x] AssertNotNull:
  - Comprueba que la condición no sea nula.
- [x] AssertNotSame:
  - Comprueba que dos objetos no sena la misma instancia.
- [x] AssertSame:
  - Opuesto a assertNotSame
- [x] AssertThat:
  - Implementado recientemente en las últimas versiones de JUnit.
  - Permite que las aserciones se parezcan más al lenguaje natural.
- [x] Fail:
  - Se usa para hacer fallar un test explícitamente.


