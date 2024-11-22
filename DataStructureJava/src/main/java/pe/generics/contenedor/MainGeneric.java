package pe.generics.contenedor;

import java.util.ArrayList;
import java.util.Collections;

public class MainGeneric {

    public static void main(String[] args) {

        Contenedor<Usuario> ven = new Contenedor<>(new Vendedor("Rodrigo", "Ramirez", "ven-123"));
        Contenedor<Usuario> cli = new Contenedor<>(new Cliente("Julia", "Carrasco", "cli-123"));
        Contenedor<Usuario> admi = new Contenedor<>(new Administrador("Josefa", "Gracial", "admi-123"));

        ArrayList<Usuario> usuList = new ArrayList<>();
        usuList.add(ven.getT());
        usuList.add(cli.getT());
        usuList.add(admi.getT());

        Collections.sort(usuList);

        usuList.forEach(usu -> System.out.println(usu.getNombre() + " " + usu.getApellido()));

        ven.print("jaimito");
        ven.print(12345);


        String[] str = {"a", "b", "c"};
        Integer[] ints = {1, 2, 3};
        Double[] dob = {1.1, 3.3, 4.4};

        showArrays(dob);
        System.out.println(returnSomething(str));
    }


    /**
     * @param array El parámetro de tipo <T> tiene que declararse antes del tipo de retorno
     * porque el compilador necesita saber que el método es genérico antes de analizar su firma completa
     *  es parte de la sintaxis de Java.
     * @Sin la T anntes de void, el compilador no sabría que T es un parámetro genérico y pensaría que T es un tipo concreto no definido.
     */
    public static <T> void showArrays(T[] array){
        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }

    /**
     * @param array parametro de entrada
     * @return retorna un valor de tipo T
     */
    public static <T> T  returnSomething(T[] array){
        return array[1];
    }
}
