package pe.generics.contenedor;

public class Cliente extends Usuario{
    private String idClient;

    public Cliente(String nombre, String apellido, String idClient) {
        super(nombre, apellido);
        this.idClient = idClient;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }
}
