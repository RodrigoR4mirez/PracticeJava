package pe.collection.com.prueba;

/**
 * Definición de la Interfaz Automovil:
 *
 * Qué es: Defines una interfaz llamada Automovil con un método abstracto arrancar.
 * Por qué es polimorfismo: Una interfaz es un mecanismo que permite definir métodos que deben ser implementados por cualquier
 * clase que lo implemente. En el contexto del polimorfismo, una interfaz permite que diferentes clases proporcionen su propia
 * implementación de los métodos de la interfaz.
 * Polimorfismo en Acción:
 *
 * Qué es: El polimorfismo se refiere a la capacidad de un objeto para tomar muchas formas. En Java, esto se logra mediante el uso de interfaces y herencia.
 * Cómo se aplica aquí: Al definir la interfaz Automovil, estás especificando un contrato que todas las clases que implementen esta interfaz deben cumplir.
 * Esto permite que diferentes clases (Toyota, Hiundai, etc.) puedan ser tratadas de manera uniforme a través de la interfaz Automovil, aunque cada una tenga su propia implementación del método arrancar.
 * Ejemplo de Polimorfismo con la Interfaz Automovil
 * Si tienes varias implementaciones de la interfaz Automovil, como Toyota y Hiundai, puedes usar una variable de tipo Automovil para referenciar cualquier objeto que implemente la interfaz:
 */
public interface Automovil {
    public void arrancar();
}

