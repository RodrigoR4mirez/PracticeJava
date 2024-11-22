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



    }
}
