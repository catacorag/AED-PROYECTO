package controller;
public class Persona {
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private char sexo;
    
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
    
    public Persona(String nombre,int edad, char sexo, double d, double e) { 
        this.nombre=nombre; 
        this.edad=edad;
        this.sexo=sexo;
        this.peso= d;
        this.altura= e;
    }
    public Persona(Persona p) {
        this(p.nombre, p.edad, p.sexo, p.peso, p.altura);
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public  String  getNombre() {
        return this.nombre;
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setPeso(float peso) {
        this.peso=peso;
    }
    public float getPeso() {
        return this.edad;
    }
    public void setAltura(float altura) {
        this.altura=altura;
    }
    public  double  getAltura() {
        return this.altura ;
    }
    public void setSexo(char sexo) {
        this.sexo=sexo;
    }
    public  char getSexo() {
        return this.sexo;
    }
    public String IMC() {
        double pesoideal;
        pesoideal=(this.peso/(this.altura*this.altura));
        if (pesoideal < 18.5) {
            return "Bajo  Peso";
        }
        else if (pesoideal > 25) {
            return "SobrePeso";
        }
        return "Peso Ideal";
    }
    public boolean esMayorDeEdad() {
        if(this.edad>=18) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "nombre = " + nombre + ", edad = " + edad + ", peso = " + peso + ", altura = " + altura + ", sexo = " + sexo;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona p = (Persona) o; //
        return this.nombre.contentEquals(p.nombre)&& this.edad==p.edad && this.sexo==p.sexo;

    }
}
