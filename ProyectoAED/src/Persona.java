
public class Persona {
	private String nombre;
	private int edad;
	private float peso;
	private float altura;
	private char sexo;

	public Persona() {
		nombre="";
		edad = 0;
		peso=0;
		altura=0;
		sexo= 'H';		
	}

	public Persona(String nombre,int edad, char sexo) { 
		this.nombre=nombre; 
		this.edad=edad;
		this.sexo=sexo;
		this.peso=0;
		this.altura=0;
	}

	public Persona(String nombre,int edad, char sexo, double d, double e) { 
		this.nombre=nombre; 
		this.edad=edad;
		this.sexo=sexo;
		this.peso=(float) d;
		this.altura=(float) e;
	}

	public  String  getNombre() {
		return this.nombre;
	}
	public  int getEdad() {
		return this.edad;	
	}

	public float getPeso() {
		return this.edad;	
	}
	public  float  getAltura() {
		return this.altura ;
	}
	public  char getSexo() {
		return this.sexo;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public void setSexo(char sexo) {
		this.sexo=sexo;
	}
	public void setAltura(float altura) {
		this.altura=altura;
	}
	public void setPeso(float peso) {
		this.peso=peso;
	}
	public String toString() {
		return "nombre= " + nombre + ", edad= " + edad + ", peso= " + peso + ", altura= " + altura + ", sexo= "
				+ sexo + "]";
	}


}
