package pe.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCollection {

    public static void main(String[] args){

        List<Empleado> em = Arrays.asList(new Empleado[]{
                new Empleado("Zara", 1),
                new Empleado("Maria", 13),
                new Empleado("Carl", 5),
                new Empleado("Jack", 15)
        });
        Collections.sort(em);
        em.forEach(e -> System.out.println(e.getEdad()));
    }
}
