package Dominio;

public class FechaHora {
	private int dia;
	private int mes;
	private int anio;
	private int hora;
	private int min;
	private int seg;
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}

	public FechaHora(int dia, int mes, int anio, int hora, int min) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.hora = hora;
		this.min = min;
		this.seg = 0;
	}

	@Override
	public String toString() {
		return " Fecha: " + dia + "/" + mes + "/" + anio + " , hora: " + hora + ":" + min
				+ ":" + seg;
	}
	

}
