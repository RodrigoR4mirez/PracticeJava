package pe.generics.Wildcards;

public class Empleado{

     public Empleado (String nombre, Integer salario){
         this.nombre = nombre;
         this.salario = salario;
     }

     private String nombre;
     private Integer salario;

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public Integer getSalario() {
         return salario;
     }

     public void setSalario(Integer salario) {
         this.salario = salario;
     }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
}
