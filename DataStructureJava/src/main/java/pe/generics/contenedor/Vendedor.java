package pe.generics.contenedor;

public class Vendedor extends Usuario{

    private String numVendedor;

    public Vendedor(String nombre, String apellido, String numVendedor){
        super(nombre, apellido);
        this.numVendedor = numVendedor;
    }

    public String getNumVendedor() {
        return numVendedor;
    }

    public void setNumVendedor(String numVendedor) {
        this.numVendedor = numVendedor;
    }
}
