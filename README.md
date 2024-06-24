# Curso JUnit con Java

## ¿Que es JUnit?
- JUnit es un framework para realizar pruebas unitarias en Java.
- Permite la creación de casos de prueba para verificar el comportamiento
del código.
- Facilita la ejecución y gestión de pruebas automatizadas.

## Integración con Maven
- [x] Agregar la dependencia de JUnit en el archivo ***pom.xml***
```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

## Beneficios de implementar JUnit
- Ayuda a detectar errores en etapas tempranas del desarrollo.
- Mejora la calidad del código mediante la verificación continua.
- Facilita el mantenimiento y refactorización del código.

## Buenas prácticas con JUnit
- Escribir pruebas para cada método público.
- Nombrar los métodos de prueba de manera descriptiva.
- Asegurarse de que las pruebas sean independientes entre sí.
- Utilizar ***@Before*** y ***@After*** para configurar y limpiar los recursos 
necesarios para las pruebas.

## Más datos sobre JUnit
<a  href="">JUnit</a>

# Curso Mockito con Java

## ¿Qué es Mockito?
- Mockito es un framework para la creación de objetos simulados (mocks) en 
pruebas unitarias.
- Permite simular el comportamiento de objetos y verificar interacciones 
entre ellos.
- Es útil para aislar el código bajo prueba de sus dependencias.

## Integración con Maven
- [x] Agregar la dependencia de Mockito en el archivo ***pom.xml***.
```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>4.0.0</version>
    <scope>test</scope>
</dependency>
```

## Beneficios de implementar Mockito
- Permite aislar el código bajo prueba, enfocándose en su comportamiento.
- Facilita la simulación de situaciones difíciles de reproducir en un entorno
real.
- Mejora la cobertura de pruebas al permitir probar casos de borde y fallos 
de dependencias.

## Buenas prácticas con Mockito
- Usar mocks solo para dependencias externas y no para el código que está 
siendo probado.
- Verificar interacciones con los mocks utilizando verify().
- Evitar la sobreutilización de mocks, ya que puede hacer que las pruebas sean 
difíciles de entender y mantener.
- Utilizar @Mock y @InjectMocks para inyección de dependencias en los objetos
simulados.
