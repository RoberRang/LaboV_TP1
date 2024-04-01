package Dominio;
 /*
 *	Las entradas para el teatro tienen un valor fijo de 1350,50$. A su vez, los teatros 
	tienen sus propios géneros y actores principales. Consideraremos que como máximo 
	se puede tener 3 actores principales. Los géneros de los teatros son los siguientes: 
	drama, teatro o comedia.
 * */

public class ETeatro extends Entrada implements IFechaHora{

	public static final double VALORFIJO=1350.50;
	private Teatro teatro;
	private double precio;
	
	// constructores 
	
	public ETeatro(String nombreShow,double duracionAproximada, FechaHora fechaHora,Teatro teatro) {
		
		super(nombreShow, duracionAproximada, fechaHora);
		this.teatro=teatro;
		this.calcularPrecio();
		
	}
	
	// Metodo implementado de la interface 
	
	@Override
	public String DarFechaHora() {
		// TODO Auto-generated method stub
		return super.getFechaHora() + " Para el show: " + this.getNombreShow();
	}
	
	
	//metodo abstractor implementado de Entrada
	
	@Override
	public void calcularPrecio() {
		this.setPrecio(VALORFIJO);
	}

	//Getters and Setters

	public Teatro getTeatro() {
		return teatro;
	}

	public void setTeatro(Teatro teatro) {
		this.teatro = teatro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	@Override
	public String toString() {
		return super.toString() + " Teatro: " + teatro.toString() + ", precio: $" + precio;

	}


	
}
