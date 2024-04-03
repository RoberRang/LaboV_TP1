package Dominio;

import java.util.ArrayList;

public class Obra {
	private static final int CantMaxActoresP=3;
	
	private ArrayList<Actor> actoresPrincipales;
	private ArrayList<Actor> actoresReparto;
	private String nombre;
	private int duracion;
	
	public Obra(String nombre, int duracion) {
		actoresPrincipales = new ArrayList<Actor>();
		actoresReparto = new ArrayList<Actor>();
		
		this.nombre=nombre;
		this.duracion=duracion;
	}
	
	
	public ArrayList<Actor> getActoresPrincipales() {
		return actoresPrincipales;
	}
	
	public String addActorPrincipal(Actor actorP) {
		if(actoresPrincipales.size()>=CantMaxActoresP) {
			return "No se puede add mas actores principales Max3";
		}
		
		actoresPrincipales.add(actorP);
		return "Actor principal: "+ actorP.getNombre() +", con exito";
		
	}
	
	public String addActorReparto(Actor actorR) {
		
		actoresReparto.add(actorR);
		return "Actor reparto: "+ actorR.getNombre() +", con exito";
		
	}
	
	public ArrayList<Actor> getActoresReparto() {
		return actoresReparto;
	}
	

	public String getNombreObra() {
		return nombre;
	}
	public void setNombreObra(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	} 
	
	private String DarActoresToString(ArrayList<Actor> actores,boolean principal) {
	
		String resp=" Actores Reparto: ";
		if(principal)
			resp=" Actores Principales: ";
		
		for (Actor act : actores ) {
			resp+=act.toString();
			
		}
		return resp;
	}


	@Override
	public String toString() {
		return  " "+nombre + ", Duracion: " + duracion + ", " + 
				DarActoresToString(this.actoresPrincipales,true) + 
				DarActoresToString(this.actoresReparto,false);
	}
	
	
	

}
