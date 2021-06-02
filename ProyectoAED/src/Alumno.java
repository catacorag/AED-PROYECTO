
public class Alumno extends Persona {
	private int  codigo;

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
