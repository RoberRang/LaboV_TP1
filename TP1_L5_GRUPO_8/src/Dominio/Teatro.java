package Dominio;

import java.util.ArrayList;

public class Teatro {
	
	private int ID;
	private TipoTeatro tipoteatro;
	private ArrayList<Actor> Actores; // como maximo 3 actores principales
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	public TipoTeatro getTipoteatro() {
		return tipoteatro;
	}
	public void setTipoteatro(TipoTeatro tipoteatro) {
		this.tipoteatro = tipoteatro;
	}
	public ArrayList<Actor> getActores() {
		return Actores;
	}
	public void setActores(ArrayList<Actor> actores) {
		this.Actores = actores;
	}
	
	
}
