package Dominio;

public abstract class Entrada {
	/*Todas las entradas poseen un número único de entrada, nombre del show, día y 
	horario del evento, tiempo aproximado de duración y costo. El costo se calcula de 
	manera diferente según el tipo de entrada*/
	
	private static final int ID =  0;
	private static int cont=ID;
	private int numeroEntrada;
    private String nombreShow;    
    private double duracionAproximada;
    private FechaHora fechaHora;

	// Constructor
    public Entrada(String nombreShow,double duracionAproximada, FechaHora fechaHora) {
        this.nombreShow = nombreShow;
        
        this.duracionAproximada = duracionAproximada;
        this.fechaHora = fechaHora;
        
        cont++;
		this.numeroEntrada = cont;
    }

    public String getFechaHora() {
		return fechaHora.toString();
	}

	public void setFechaHora(FechaHora fechaHora) {
		this.fechaHora = fechaHora;
	}

	// Métodos abstractos que deben ser implementados por las clases que hereden de Evento  
    public abstract void calcularPrecio();

    // Getters y setters
    public int getNumeroEntrada() {
        return numeroEntrada;
    }

    public String getNombreShow() {
        return nombreShow;
    }    

    public double getDuracionAproximada() {
        return duracionAproximada;
    }

	@Override
	public String toString() {
		
		return " Entrada: " + numeroEntrada + ", Nombre Show: " + nombreShow + 
				", Duracion Apx: " + duracionAproximada;
	}	

}
