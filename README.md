# Proyecto de Ejemplo con Spring

Este proyecto es una demostración de cómo utilizar Spring Framework para la inyección de dependencias y resolución de beans en Java. A continuación se detallan los componentes clave del proyecto y su funcionalidad.

## Descripción

El objetivo de este proyecto es ilustrar el manejo de la inyección de dependencias y la resolución de beans con el mismo tipo en una aplicación Spring. El proyecto está configurado para no usar anotaciones en las clases para la inyección de dependencias, en su lugar se utiliza configuración basada en clases de Spring.

### Componentes del Proyecto

1. **Clase `Main`**

   La clase `Main` es el punto de entrada principal de la aplicación. Esta clase:
   - Declara dependencias a `Animal` y `Automovil` (dos instancias de `Automovil` de diferentes tipos).
   - Utiliza la inyección de dependencias a través del constructor.
   - En el método `main`, configura el contexto de la aplicación utilizando `AnnotationConfigApplicationContext` y obtiene el bean `Main` desde el contexto.

2. **Interfaz `Automovil`**

   La interfaz `Automovil` define un contrato para todos los automóviles, especificando que deben implementar el método `arrancar`. Esta interfaz permite el polimorfismo, donde diferentes implementaciones de automóviles pueden ser tratadas de manera uniforme.

3. **Clases `Hiundai` y `Toyota`**

   - **`Hiundai`**: Implementa la interfaz `Automovil` y proporciona una implementación concreta del método `arrancar`.
   - **`Toyota`**: También implementa la interfaz `Automovil` y proporciona su propia implementación del método `arrancar`.

4. **Clase `AppConfig`**

   La clase `AppConfig` es la configuración de Spring que define los beans de la aplicación. Incluye:
   - La definición de beans para `Main`, `Animal`, `Toyota`, y `Hiundai`.
   - El método `mainBean` define cómo se crea el bean `Main` y cómo se inyectan otros beans en él.
   - Los métodos `toyotaBean` y `hiundaiBean` crean instancias concretas de `Toyota` y `Hiundai`.

## Cómo Ejecutar el Proyecto

1. **Compilar el Proyecto**

   Utiliza Maven para compilar el proyecto:

   ```bash
   mvn clean compile

git 
