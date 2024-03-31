package Dominio;

public class TipoTeatro extends Tipo {
    
    private String descripcion; // comedia, drama, etc

    public TipoTeatro(int ID, String nombre, String descripcion) {
        super(ID, nombre);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
