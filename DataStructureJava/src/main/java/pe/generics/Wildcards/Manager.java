package pe.generics.Wildcards;

public class Manager extends Empleado {

     public Manager (String nombre, Integer salario, String cargo){
         super (nombre, salario);
         this.cargo = cargo;
     }

     private String cargo;

     public String getCargo() {
         return cargo;
     }

     public void setCargo(String cargo) {
         this.cargo = cargo;
     }

    @Override
    public String toString() {
        return "Manager{" +
                "cargo='" + cargo + ',' + '\'' + super.toString();
    }


}
