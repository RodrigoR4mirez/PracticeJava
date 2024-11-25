package app.com;

import jdk.jfr.Name;
import org.junit.Assert;
import org.junit.Test;
import pe.generics.Wildcards.Contenedor;
import pe.generics.Wildcards.Empleado;
import pe.generics.Wildcards.Manager;
import pe.generics.Wildcards.Pagos;
import pe.generics.Wildcards.Programador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class WildcardsTest
{

    /**
     * <p>? (Wildcard o comodín genérico)
     * <p>Es un símbolo que representa cualquier tipo desconocido.
     * <p>Se utiliza en métodos o estructuras cuando no importa el tipo exacto, y generalmente solo quieres leer datos, no escribir.
     * <p>Es flexible porque acepta cualquier tipo.
     * Indica claramente que no necesitas conocer el tipo exacto, lo que hace que el código sea más intuitivo en ciertos contextos.
     */
    @Test
    @Name("unBoundedWildcard-lista4")
    public void pagos4 (){
        List<Empleado> empleados = new ArrayList<>();
        Empleado pr = new Programador("Rodrigo1", 1001, "Junior");
        Empleado ma =  new Manager("Rodrigo2", 1002, "Jefe");
        empleados.add(pr);
        empleados.add(ma);
        Pagos.printTestLista(empleados);

    }

    @Test
    @Name("UpperBoundedWildcard-lista3")
    public void pagos (){
        List<Empleado> empleados = new ArrayList<>();
        Empleado pr = new Programador("Rodrigo", 1000, "Junior");
        Empleado ma =  new Manager("Rodrigo", 1000, "Jefe");
        empleados.add(pr);
        empleados.add(ma);
        Integer pagTot = Pagos.pagoMensualPlanilla(empleados);

        Assert.assertTrue("La suma del pago total de empleados no corresponde a 2000: ", (2000 == pagTot ));
    }

    @Test
    @Name("UpperBoundedWildcard-lista2")
    public void pagosProgramadores (){
        List<Programador> programadors =  Arrays.asList(
                new Programador("Rodrigo", 1000, "Junior"),
                new Programador("Rodrigo", 1000, "Junior"),
                new Programador("Rodrigo", 1000, "Junior"));

        Integer pagTot = Pagos.pagoMensualPlanilla(programadors);

        Assert.assertTrue("La suma del pago total de empleados no corresponde a 2000: ", (3000 == pagTot ));
    }

    @Test
    @Name("UpperBoundedWildcard-lista1")
    public void pagosManagers (){
        List<Manager> programadors =  Arrays.asList(
                new Manager("Rodrigo", 1000, "Jefe"),
                new Manager("Rodrigo", 1000, "Admin"),
                new Manager("Rodrigo", 1000, "Admin"));

        Integer pagTot = Pagos.pagoMensualPlanilla(programadors);

        Assert.assertTrue("La suma del pago total de empleados no corresponde a 2000: ", (3000 == pagTot ));
    }

    @Test
    @Name("metodosGenericos")
    public void printManagers (){
        List<Empleado> managers =  Arrays.asList(
                new Manager("Rodrigo", 1000, "Jefe"),
                new Manager("Rodrigo", 1000, "Admin"),
                new Manager("Rodrigo", 1000, "Admin"));
        Pagos.printDatos(managers);
    }


    /**
     * <p>Upper-Bounded Wildcard (? extends)
     * <p>Cuando usas ? extends ClaseBase, estás diciendo que el tipo permitido puede ser ClaseBase o cualquier subclase de ClaseBase. Esto se llama "bounded" porque hay un límite superior: ClaseBase.
     * <p>Por qué se llama "upper":
     * <p>El límite superior (upper bound) de los tipos permitidos está definido por la clase ClaseBase. Las subclases se consideran "dentro" de este rango permitido.
     * <p> Representa el límite superior del rango: Clase y cualquier clase "por debajo" (es decir, sus subclases) son válidas.
     */
    @Test
    @Name("upperBoundedWildcard-nolista")
    public void printManagersContenedor (){

        Contenedor<Empleado> con = new Contenedor<>(
                new Manager("Juan", 1000, "Jefe")
        );
        Pagos.printDatosContenedor(con);
    }

    /**
     * <p>Lower-Bounded Wildcard (? super)
     * <p>Cuando usas ? super ClaseHija, estás diciendo que el tipo permitido puede ser ClaseHija o cualquier superclase de ClaseHija. Esto se llama "bounded" porque hay un límite inferior: ClaseHija.
     *
     * <p>Por qué se llama "lower":
     * <p>El límite inferior (lower bound) de los tipos permitidos está definido por la clase ClaseHija. Las superclases se consideran "dentro" del rango permitido.
     * <p>Representa el límite inferior del rango: Clase y cualquier clase "por encima" (es decir, sus superclases) son válidas.
     */
    @Test
    @Name("lowerBoundedWildcard-lista3")
    public void printEmpleadosTest (){
        List<Empleado> empleados = new ArrayList<>();
        Empleado pr = new Programador("Juan", 1000, "Junior");
        Empleado ma =  new Manager("Rodrigo", 1000, "Jefe");
        empleados.add(pr);
        empleados.add(ma);

       Pagos.printDatosEmpleado(empleados);
    }

}
