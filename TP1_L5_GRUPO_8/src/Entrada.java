
public abstract class Entrada {
	/*Todas las entradas poseen un número único de entrada, nombre del show, día y 
	horario del evento, tiempo aproximado de duración y costo. El costo se calcula de 
	manera diferente según el tipo de entrada*/
	
	private int numeroEntrada;
    private String nombreShow;
    private String diaEvento;
    private String horario;
    private double duracionAproximada;
    private double costo;

    // Constructor
    public Entrada(int numeroEntrada, String nombreShow, String diaEvento, String horario,
                  double duracionAproximada, double costo) {
        this.numeroEntrada = numeroEntrada;
        this.nombreShow = nombreShow;
        this.diaEvento = diaEvento;
        this.horario = horario;
        this.duracionAproximada = duracionAproximada;
        this.costo = costo;
    }

    // Métodos abstractos que deben ser implementados por las clases que hereden de Evento
    public abstract void mostrarDetalles();

    public abstract void calcularPrecio();

    // Getters y setters
    public int getNumeroEntrada() {
        return numeroEntrada;
    }

    public String getNombreShow() {
        return nombreShow;
    }

    public String getDiaEvento() {
        return diaEvento;
    }

    public String getHorario() {
        return horario;
    }

    public double getDuracionAproximada() {
        return duracionAproximada;
    }

    public double getCosto() {
        return costo;
    }

	@Override
	public String toString() {
		return "Entrada [numeroEntrada=" + numeroEntrada + ", nombreShow=" + nombreShow + ", diaEvento=" + diaEvento
				+ ", horario=" + horario + ", duracionAproximada=" + duracionAproximada + ", costo=" + costo + "]";
	}
	
}
