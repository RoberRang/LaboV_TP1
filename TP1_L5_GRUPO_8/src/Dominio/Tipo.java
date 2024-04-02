package Dominio;

public abstract class Tipo {
	
	private int ID;
	private String Nombre;
	
	public Tipo () {
		
	}

	public Tipo(int iD, String nombre) {
		super();
		ID = iD;
		Nombre = nombre;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nombre: " + Nombre;
	}
	

}
