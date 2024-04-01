package Dominio;

import java.util.ArrayList;

public class ERecital extends Entrada {

	private boolean TipoEntradaVIP;
	private Banda Banda; // Objeto del tipo Banda (crear Clase)
	private ArrayList<Banda> BandasSoporte; // 1 o 2 bandas permitidas
	private double Costo;

	public ERecital(String nombreShow, double duracionAproximada, FechaHora fechaHora, boolean tipoEntrada, Banda banda, 
		ArrayList<Banda> soporte) {
		super(nombreShow, duracionAproximada, fechaHora);
		this.setTipoEntradaVIP(tipoEntrada);
		this.setBanda(banda);
		this.setBandasSoporte(soporte);
		this.calcularPrecio();
	}
	
	@Override
	public void calcularPrecio() {
		// Desarrollar método para calcular precio.
		// Entrada VIP $1500, General $800 
		this.Costo = (this.TipoEntradaVIP) ? 1500 : 800;
	} 
	

	public boolean isTipoEntradaVIP() {
		return TipoEntradaVIP;
	}


	public void setTipoEntradaVIP(boolean tipoEntradaVIP) {
		TipoEntradaVIP = tipoEntradaVIP;
	}


	public Banda getBanda() {
		return Banda;
	}


	public void setBanda(Banda banda) {
		Banda = banda;
	}


	public ArrayList<Banda> getBandasSoporte() {
		return BandasSoporte;
	}


	public void setBandasSoporte(ArrayList<Banda> bandasSoporte) {
		BandasSoporte = bandasSoporte;
	}


	public double getCosto() {
		return Costo;
	}


	public void setCosto(double costo) {
		Costo = costo;
	}

	@Override
	public String toString() {
		String respuesta = this.TipoEntradaVIP ? " VIP": " General";
		return super.toString() + " TipoEntrada: " + respuesta + ", Banda: " 
								+ Banda.getNombre() + ", BandasSoporte: " + BandasSoporte.toString()
								+ ", Costo: " + Costo;
	}

	@Override
	public String DarFechaHora() {
		return super.getFechaHora();
	}
		
}
