import java.util.Arrays;

public class ColeccionRecomendaciones <T extends Comparable<T>> {
	private Recomendacion arrRecomendacion[];
	private int ultimo; 
	private int nroRecomendacion;
	public ColeccionRecomendaciones() {
		this.arrRecomendacion = new Recomendacion[10];
		this.nroRecomendacion  = arrRecomendacion.length;
	}
	public ColeccionRecomendaciones(int nrodereco) {
		this.arrRecomendacion = new Recomendacion[nrodereco];
		this.nroRecomendacion  = arrRecomendacion.length;
	}
	
	public String agregarRecomendacion(Recomendacion objrecomendacion) {
		
		for (int i=0; i<this.nroRecomendacion; i++) {
			if (arrRecomendacion[i] == null) {
				arrRecomendacion[i]= new Recomendacion(objrecomendacion);
				return "Se agregó satisfactoriamente a " + objrecomendacion.getDescripcion();
			}
		}
		return  "No se pudo agregar a " + objrecomendacion.getDescripcion();
		
	}
	public String toString() {
		return " Array de las recomendaciones: [" + Arrays.toString(arrRecomendacion) + "]";
	}
}
