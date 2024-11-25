package pe.generics.Wildcards;


public class Programador extends Empleado {

     public Programador(String nombre, Integer salario, String seniority) {
         super(nombre, salario);
         this.seniority = seniority;
     }

    private String seniority;

     public String getSeniority() {
         return seniority;
     }

     public void setSeniority(String seniority) {
         this.seniority = seniority;
     }

    @Override
    public String toString() {
        return "Programsador{" +
                "seniority='" + seniority + ',' + '\'' + super.toString();
    }
 }
