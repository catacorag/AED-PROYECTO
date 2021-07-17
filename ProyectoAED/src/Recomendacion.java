
public class Recomendacion {
	private String descripcion;

	public Recomendacion(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public Recomendacion(Recomendacion p) {
		this(p.descripcion);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Recomendacion [descripcion=" + descripcion + "]";
	}
	
}
