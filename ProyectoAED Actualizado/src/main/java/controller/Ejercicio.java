package controller;
public class Ejercicio {
	private String descripcion;
	private int nrodehoras;
	public Ejercicio(String descripcion, int nrodehoras) {
		super();
		this.descripcion = descripcion;
		this.nrodehoras = nrodehoras;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getNrodehoras() {
		return nrodehoras;
	}
	public void setNrodehoras(int nrodehoras) {
		this.nrodehoras = nrodehoras;
	}
	@Override
	public String toString() {
		return "Ejercicio [descripcion= " + descripcion + ", nrodehoras=" + nrodehoras + "]";
	}
}
