package pe.collection.com.prueba;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    // La clase AppConfig es una clase de configuración para el contexto de Spring.
    // Anotada con @Configuration para indicar que esta clase contiene la configuración de beans.

    /**
     * mainBean
     * Se recomienda usar los mismos nombres en metodos, constructor y asi tambien en la clase que implementa
     * Los beans se les asigna un nombre en el contenedor de spring
     * @param toyotaBean debe de coincidir con el nombre del método toyotaBean()
     * @param hiundaiBean debe de coincidir con el nombre del método hiundaiBean()
     * @return Un objeto del tipo `Main`, creado con los beans `toyotaBean` y `hiundaiBean`.
     *  *         Este bean `Main` se inyectará en el contexto de Spring y podrá ser utilizado
     *  *         en otras partes de la aplicación.
     */


    /**
     * Los métodos `toyotaBean` y `hyundaiBean` definen beans en la configuración de Spring.
     * Aunque `toyotaBean` y `hyundaiBean` retornan instancias de tipo `Animal`, en realidad
     * son implementaciones concretas de la interfaz `Animal`. La interfaz `Animal` es
     * una abstracción que permite que Spring maneje múltiples implementaciones
     * (como `Toyota` y `Hyundai`) de manera flexible y desacoplada.
     *
     * @return Un objeto de tipo `Animal`, que es una interfaz. Las implementaciones concretas
     *         (como `Toyota` y `Hyundai`) son proporcionadas en tiempo de ejecución y
     *         se inyectan en las dependencias según sea necesario.
     */


        // Define el bean Main, inyectando los beans Animal (miAnimal), Automovil (toyotaBean) y Automovil (hiundaiBean)
        @Bean
        public Main mainBean(Animal miAnimal, Automovil toyotaBean, Automovil hiundaiBean) {
            // Crea una instancia de Main y le inyecta los beans correspondientes
            return new Main(miAnimal, toyotaBean, hiundaiBean);
        }

        // Define el bean Animal con el nombre "aminalBean"
        @Bean
        public Animal aminalBean() {
            // Retorna una instancia de Perro como un bean de tipo Animal
            return new Perro();
        }

        // Define el bean Automovil con el nombre "toyotaBean"
        @Bean
        public Automovil toyotaBean() {
            // Retorna una instancia de Toyota como un bean de tipo Automovil
            return new Toyota();
        }

        // Define el bean Automovil con el nombre "hiundaiBean"
        @Bean
        public Automovil hiundaiBean() {
            // Retorna una instancia de Hiundai como un bean de tipo Automovil
            return new Hiundai();
        }


    /**
     * Resumen del Término "Bean"
     *
     * Definición de Bean:
     * Un "bean" es un objeto en Java y en frameworks como Spring que es instanciado, gestionado y controlado por un contenedor de inversión de control (IoC). Los beans son componentes clave en aplicaciones Java EE y Spring, responsables de encapsular la lógica de negocio, realizar operaciones específicas y gestionar dependencias.
     *
     * Origen del Término:
     *
     * JavaBeans: El término "bean" proviene de JavaBeans, una especificación en Java para crear componentes reutilizables. Los JavaBeans siguen convenciones como tener un constructor sin argumentos y métodos getters y setters para sus propiedades.
     * En Spring: En el contexto de Spring, un "bean" es cualquier objeto gestionado por el contenedor de Spring, sin necesidad de seguir las convenciones de JavaBeans.
     * Gestión de Beans en Spring:
     *
     * Contenedor IoC: El contenedor IoC de Spring se encarga de instanciar, inyectar dependencias y gestionar el ciclo de vida de los beans.
     * Definición y Uso: Los beans se definen en la configuración de Spring y se utilizan para manejar la lógica de negocio y las dependencias en una aplicación.
     * Ejemplo:
     * En una aplicación Spring, puedes definir beans en una clase de configuración y luego utilizar estos beans en otras partes de la aplicación, con el contenedor de Spring gestionando su ciclo de vida y dependencias.
     */

}
