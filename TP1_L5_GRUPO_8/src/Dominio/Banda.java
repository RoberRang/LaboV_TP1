package Dominio;

public class Banda {
    private int ID;
    private String nombre;
    private TipoMusical tipoMusical;

    public Banda(int ID, String nombre, TipoMusical tipoMusical) {
        this.ID = ID;
        this.nombre = nombre;
        this.tipoMusical = tipoMusical;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoMusical getTipoMusical() {
        return tipoMusical;
    }

    public void setTipoMusical(TipoMusical tipoMusical) {
        this.tipoMusical = tipoMusical;
    }

	@Override
	public String toString() {
		return "ID Banda: " + ID + ", nombre: " + nombre + ", TipoMusical: " + tipoMusical;
	}
    
    
}
