package Dominio;

public class EDeporte extends Entrada {
	/*Las entradas de los eventos de deportes tienen un valor fijo según el tipo de deporte, 
	el futbol tiene un valor fijo de $300, el rugby tiene un valor fijo de 450$ y hockey 
	tiene un valor fijo de 380$. El deporte puede ser clasificado de manera nacional o 
	internacional. En el caso de que sea un deporte internacional, el valor de la entrada 
	será con un recargo de un 30%.*/

	private boolean internacional;
	private double costo;
	private Deporte deporte;	
	
	public EDeporte(String nombreShow, String diaEvento, String horario, double duracionAproximada, Deporte deporte, boolean internacional) {
		super(nombreShow, diaEvento, horario, duracionAproximada);
		// TODO Auto-generated constructor stub
		this.setDeporte(deporte);
		this.setInternacional(internacional);
		this.calcularPrecio();
	}

	@Override
	public void calcularPrecio() {
		// TODO Auto-generated method stub
		this.costo = this.deporte.getCostoDeporte();
		if (this.internacional)
			this.costo *= 0.3;		
	}

	public boolean isInternacional() {
		return internacional;
	}

	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	@Override
	public String toString() {
		String respuesta = this.internacional ? " Internacional": " Local";
		return super.toString() + " EDeporte " + respuesta + ", costo=" + costo + ", deporte=" + deporte + "]";
	}	

}
