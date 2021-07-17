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
	public Persona[] mayoresDeEdad() {
		int j=0;	
		Persona [] arrMayoresDeEdad = new Persona[nropersonas];
		for (int i=0; i<nropersonas && arrPersona[i]!=null; i++) {
		       if(arrPersona[i].esMayorDeEdad()) {
					arrMayoresDeEdad[j]=new Persona(arrPersona[i]);
					j=j+1;
				}
		}
		return arrMayoresDeEdad;
	}
	
	//
	Persona [] arrPesoIdeal;
	Persona [] arrDesnutricion;
	Persona [] arrSobrepeso;
	int z=0;
	int a=0;
	int v=0;
	public void condicionDePeso() {
		for (int i=0; i<nropersonas; i++) {
			if (arrPersona[i].IMC().equals("Peso Ideal")) {
					arrPesoIdeal[z]=arrPersona[i];
					z=z+1;
					
			}
			else if (arrPersona[i].IMC().equals("SobrePeso")) {
				arrSobrepeso[a]=arrPersona[i];
				a=a+1;
				
			}
			else if (arrPersona[i].IMC().equals("Bajo Peso")) {
				arrDesnutricion[v]=arrPersona[i];
				v=v+1;
			}
		}
		System.out.println("Personas con su peso ideal");
		System.out.println(arrPesoIdeal);
		System.out.println("Personas con desnutrición");
		System.out.println(arrDesnutricion);
		System.out.println("Personas con sobrepeso");
		System.out.println(arrSobrepeso);
	}
	
	Persona [] alturaMayor = new Persona [nropersonas];
	int o=0;
	public Persona  [] alturaMayor(double alturaingresada) {
		for (int i=0; i<arrPersona.length; i++) {
			if (arrPersona[i].getAltura() == alturaingresada) {
					alturaMayor[o]=arrPersona[i];
					o=o+1;
			}
		}
		return 	(alturaMayor);
	}
	public String toString() {
		return " Array de las recomendaciones: [" + Arrays.toString(arrPersona) + "]";
	}
	
}
	