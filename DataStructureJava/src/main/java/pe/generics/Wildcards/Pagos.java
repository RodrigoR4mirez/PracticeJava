package pe.generics.Wildcards;

import java.util.List;


public class Pagos {


    public static Integer pagoMensualPlanilla(List<? extends Empleado> empleados){
        Integer total = 0;
        for(Empleado o : empleados){
            System.out.println(o);
            total += o.getSalario();
          }
        return total;
    }


    /**
     * <p> Esta es una implementacion de tipo unnbounnde wildcard
     * <p> Porque se le pasa un "?" generico como parametros
     * <p>Solo lectura.
     *
     * @param empleados the empleados genérico
     * @return Solo devuelve un print
     */
    public static void  printTestLista(List<?> empleados){
        for(Object o : empleados){
            System.out.println(o);
        }
    }

    public static <T> void printDatos(T t){
        System.out.println(t);
    }

    /**
     * <p> Print datos contenedor.
     * <p> Los objetos que extiendan de la clase Empleado y que el tipo de clase sea Contenedor
     * <p>No se puede editar, solo lectura
     *
     * @param contenedor the contenedor
     */
    public static void printDatosContenedor(Contenedor<? extends Empleado> contenedor){
        System.out.println(contenedor);
    }


    /**
     * <p> Print datos empleado.
     * <p> Aqui se está usando lower bunded wildcard
     * <p> Quiere decir que solo se puede enviar como paramatro
     * la clase o la superclase de esta
     * <p> Además al ser LOWER, se puede modificar agregando
     *
     * @param empleado the empleado
     */
    public static void printDatosEmpleado(List<? super Empleado> empleado){
        empleado.add(new Programador("Julieta", 3000, "Senior"));
        for(Object o : empleado){
            System.out.println(o);
        }
    }


}
