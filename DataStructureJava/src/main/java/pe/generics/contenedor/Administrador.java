package pe.generics.contenedor;

public class Administrador extends Usuario{

    private String idAdmin;

    public Administrador (String nombre, String apellido, String idAdmin){
        super(nombre, apellido);
        this.idAdmin = idAdmin;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }
}
