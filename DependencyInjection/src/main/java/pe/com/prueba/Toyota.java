package pe.com.prueba;

/**
 * El polimorfismo permite que una interfaz o clase base sea utilizada para referirse a objetos de diferentes clases derivadas, y que estos objetos puedan ser tratados de manera uniforme aunque tengan implementaciones diferentes. Aquí está un resumen de por qué el código muestra polimorfismo:
 *
 * Interfaz Automovil: Define un contrato con el método arrancar que todas las clases deben implementar.
 * Clase Toyota: Implementa la interfaz Automovil y proporciona su propia versión del método arrancar.
 * Polimorfismo en Acción: Puedes usar una variable de tipo Automovil para referenciar una instancia de Toyota. Aunque la variable es del tipo Automovil, la implementación específica del método arrancar para Toyota se ejecutará.
 * Resumen: El polimorfismo permite que diferentes clases (Toyota, Hiundai) implementen el mismo método (arrancar) de maneras distintas, y que se puedan tratar a través de una interfaz común (Automovil).
 */

// Define la clase Toyota que implementa la interfaz Automovil
public class Toyota implements Automovil {

    // Implementa el método arrancar de la interfaz Automovil
    @Override
    public void arrancar() {
        // Mensaje específico para Toyota al arrancar
        System.out.println("Arrancando automovil Toyota");
    }
}
