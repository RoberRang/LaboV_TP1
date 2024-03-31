package Dominio;

public class TipoMusical extends Tipo {
    private String descripcion;

    public TipoMusical(int ID, String nombre, String descripcion) {
        super(ID, nombre);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

	@Override
	public String toString() {
		return "TipoMusical [descripcion=" + descripcion + "]";
	}
    
    
}
