package Dominio;

public class Teatro {
	
	private String nombreTeatro;
	private TipoTeatro tipoteatro;
	private Obra obra;
	
	
	public Teatro(String nombreTeatro, TipoTeatro tipoteatro, Obra obra) {
		this.nombreTeatro = nombreTeatro;
		this.tipoteatro = tipoteatro;
		this.obra = obra;
	}
	
	public String getNombreTeatro() {
		return nombreTeatro;
	}
	public void setNombreTeatro(String nombreTeatro) {
		this.nombreTeatro = nombreTeatro;
	}

	public TipoTeatro getTipoteatro() {
		return tipoteatro;
	}
	public void setTipoteatro(TipoTeatro tipoteatro) {
		this.tipoteatro = tipoteatro;
	}
	
	public Obra getObra() {
		return obra;
	}
	public void setObra(Obra obra) {
		this.obra = obra;
	}

	@Override
	public String toString() {
		return " Nombre: " + nombreTeatro + ", Tipo teatro: " 
				+ tipoteatro.toString() + ", obra:" + obra.toString();
	}

	
	
	
}
