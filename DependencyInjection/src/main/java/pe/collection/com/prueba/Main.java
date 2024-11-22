package pe.collection.com.prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    /**
     * Cómo Spring Maneja la Inyección de Dependencias y Resolución de Beans con el Mismo Tipo en Configuración
     *
     * Este título abarca los puntos clave:
     * Inyección de Dependencias: El proceso por el cual Spring inyecta beans en otros beans.
     * Resolución de Beans: Cómo Spring determina cuál bean usar cuando se tienen múltiples beans del mismo tipo.
     * Configuración de Beans: Cómo definir y ordenar beans en la configuración de Spring.
     *
     * No se está usando anotaciones @ en ninguna clase para las inyecciones
     */

// Declara una variable de instancia para un objeto de tipo Animal
    private final Animal miAnimal;

    // Declara variables de instancia para dos objetos de tipo Automovil
    private final Automovil variableInstanciaToyota;
    private final Automovil variableInstanciaHiundai;

    // Constructor de la clase Main, utilizado para la inyección de dependencias
    //Sale error porque son varios beans con el mismo tipo de bean debe usae @Qualifier y poner a cada uno un alias u nombre que los diferencie
    @Autowired
    public Main(Animal miAnimal, Automovil paramBeanToyota, Automovil paramBeanHiundai) {
        // Asigna el bean Animal inyectado al campo miAnimal
        this.miAnimal = miAnimal;
        // Asigna el bean Automovil (Toyota) inyectado al campo variableInstanciaToyota
        this.variableInstanciaToyota = paramBeanToyota;
        // Asigna el bean Automovil (Hyundai) inyectado al campo variableInstanciaHiundai
        this.variableInstanciaHiundai = paramBeanHiundai;
    }

    // Método principal de la aplicación
    public static void main(String[] args) {

        Animal a = new Perro();
        Automovil volvo = new Toyota();
        Automovil hiundai = new Hiundai();


//        Crea y configura el contexto de la aplicación utilizando la configuración definida en AppConfig
//        ApplicationContext: Es una interfaz en Spring que proporciona el contexto de la aplicación y
//        maneja la configuración de los beans y la inyección de dependencias. Es el corazón del contenedor
//        Spring y se encarga de la administración de los beans.
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Obtiene el bean Main desde el contexto de la aplicación
        Main main = context.getBean(Main.class);

        // Llama al método hacerSonido del bean Animal (inyectado en el constructor)
        main.miAnimal.hacerSonido();

        // Llama al método arrancar del bean Automovil (Toyota) (inyectado en el constructor)
        main.variableInstanciaToyota.arrancar();

        // Llama al método arrancar del bean Automovil (Hyundai) (inyectado en el constructor)
        main.variableInstanciaHiundai.arrancar();
    }

}
