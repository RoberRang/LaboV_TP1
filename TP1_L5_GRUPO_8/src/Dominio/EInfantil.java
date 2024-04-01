package Dominio;



public class EInfantil extends Entrada implements IFechaHora{
	
	/*Las entradas de los eventos infantiles tienen un costo fijo de 250$ para menores de 8 
	años y para mayores de 8 años el costo será de 500$. A su vez, los eventos infantiles 
	pueden contener o no, un souvenir del evento*/
	
	private static final int MENOR =  250;
	private static final int MAYOR =  500;
	private int edad;
	private boolean souvenir;
	private double costo;

		
	public EInfantil(String nombreShow,  double duracionAproximada, FechaHora fechaHora, int edad, boolean souvenir) {
		super(nombreShow,  duracionAproximada, fechaHora);
		// TODO Auto-generated constructor stub
		this.edad = edad;
		this.souvenir = souvenir;
		this.calcularPrecio();
	}

	@Override
	public void calcularPrecio() {
		// TODO Auto-generated method stub	
		this.setCosto(MENOR);
		if (edad > 8)
			this.setCosto(MAYOR);
	}

	public boolean isSouvenir() {
		return souvenir;
	}

	public void setSouvenir(boolean souvenir) {
		this.souvenir = souvenir;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		String respuesta = this.souvenir ? "Con Souvenir" : "Sin Souvenir";

		return super.toString() + " Edad: " + String.valueOf(edad)  + ", " + respuesta + 
								  ", costo:" + String.valueOf(costo);
	}

	@Override
	public String DarFechaHora() {
		// TODO Auto-generated method stub
		return super.getFechaHora();
	}	

}
