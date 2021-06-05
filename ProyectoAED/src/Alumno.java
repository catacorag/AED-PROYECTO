
public class Alumno extends Persona {
<<<<<<< HEAD
	
	public Alumno(String nombre, int edad, char sexo, double d, double e, int codigo2) {
		super (nombre, edad, sexo, d, e);
		this.codigo = codigo;

	}



	private int  codigo;
=======
	private int codigo;

	public Alumno(int codigo) {
		super();
		this.codigo = codigo;
	}
>>>>>>> 0e18d9a809abca03e609257d97d867332548621b

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Alumno [codigo=" + codigo + "]";
	}
	
}
