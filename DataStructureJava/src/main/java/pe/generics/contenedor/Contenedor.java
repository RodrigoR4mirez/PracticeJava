package pe.generics.contenedor;

public class Contenedor <T>{

    private T t;

    public Contenedor(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
