package Dominio;

import java.util.ArrayList;

public class ERecital extends Entrada {

	private boolean TipoEntradaVIP;
	private Banda Banda; // Objeto del tipo Banda (crear Clase)
	private ArrayList<Banda> BandasSoporte; // 1 o 2 bandas permitidas
	
	
	public ERecital(String nombreShow, String diaEvento, String horario, double duracionAproximada, double costo,
			boolean tipoEntradaVIP, Banda banda, ArrayList<Banda> bandasSoporte) {
		super(nombreShow, diaEvento, horario, duracionAproximada);
		TipoEntradaVIP = tipoEntradaVIP;
		Banda = banda;
		BandasSoporte = bandasSoporte;
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


	@Override
	public void calcularPrecio() {
		// Desarrollar método para calcular precio.
		// Entrada VIP $1500, General $800 		
	} 
		
}
