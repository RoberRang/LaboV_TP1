package Dominio;

public class Actor {
	
    private int ID;
    private String nombre;

    public Actor(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public int getID() {
	return ID;
    }	
    public void setID(int iD) {
	this.ID = iD;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

	@Override
	public String toString() {
		return " ID: " + ID + ", nombre: " + nombre;
	}
    
    

}
