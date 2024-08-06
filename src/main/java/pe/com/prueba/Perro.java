package pe.com.prueba;

import org.springframework.stereotype.Component;


public class Perro implements Animal {
    @Override
    public void hacerSonido(){
        System.out.println("Perro ladra");
    }

}
