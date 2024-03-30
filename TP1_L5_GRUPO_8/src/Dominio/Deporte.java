package Dominio;

public enum Deporte {
	FUTBOL(300), RUGBY(450), HOCKEY(380);
	private double costoDeporte;
	private Deporte (double costo)
	{
		this.setCostoDeporte(costo);
	}
	public double getCostoDeporte() {
		return costoDeporte;
	}
	public void setCostoDeporte(double costoDeporte) {
		this.costoDeporte = costoDeporte;
	}
	
}