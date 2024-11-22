package pe.collection.com.prueba;

// Define una clase pública llamada Hiundai
// Indica que la clase Hiundai está implementando la interfaz Automovil. Esto significa que Hiundai debe proporcionar una implementación para todos los métodos abstractos definidos en Automovil.
public class Hiundai implements Automovil {

// Implementa el método de la interfaz Automovil ,
// La anotación @Override indica que el método arrancar está sobrescribiendo un método de la interfaz Automovil.
// Esto ayuda a asegurar que estás implementando correctamente el método requerido por la interfaz.
    @Override
    public void arrancar() {
        // Implementa la funcionalidad específica para arrancar un Hiundai
        System.out.println("Arrancando... Hiundai");
    }
}
