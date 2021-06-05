import java.util.Arrays;

public class Coleccion <T extends Comparable<T>>{
	private Persona arrPersona [];
	private int ultimo; //n posicion del ultimo elemento
	private int nropersonas;
	public Coleccion() {
		this.arrPersona = new Persona [10];
		this.nropersonas= arrPersona.length;
	}
	public Coleccion(int nrodeper) {
		this.arrPersona =new Persona[nrodeper];
		this.nropersonas= arrPersona.length;
	}
	
	public String agregarPersona(Persona objetopersona) {
		
		for (int i=0; i<this.nropersonas; i++) {
			if (arrPersona[i] == null) {
				arrPersona[i]= new Persona(objetopersona);
				return "Se agregó satisfactoriamente a " + objetopersona.getNombre();
			}
		}
		return  "No se pudo agregar a " + objetopersona.getNombre();
		
	}
	
	public int buscarPersona(Persona objetopersona) {
		for (int j= 0; j<this.nropersonas;j++) {
			if((objetopersona.getNombre().equals(arrPersona[j].getNombre()))) {
						return j;
			}
				
		}
	return -1;
	}
	
	public void eliminarPersona(Persona objetopersona) {
		if( buscarPersona(objetopersona)==-1) {	
			System.out.println("No se puede eliminar persona porque no existe");
		}else {	
			arrPersona[buscarPersona(objetopersona)]=this.arrPersona[nropersonas-1];
			arrPersona[nropersonas-1]=null;
			nropersonas--; 
		}
		
	}