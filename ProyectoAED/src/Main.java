import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidacionDatos in = new ValidacionDatos();

		String nombre = in.getString("Ingresa Nombre: ");
		char genero = in.getGenero("Ingrese su sexo: ");
		int edad = in.getEdad("Ingresa edad: ");
		double peso = in.getPeso("Ingrese su Peso: ");
		double altura = in.getAltura("Ingrese su altura: ");
		int codigo = in.getEdad("Ingrese su codigo de estudiante: ");
		
		Alumno p1= new Alumno(nombre,edad,genero,peso,altura,codigo);
		
		String nombre2 = in.getString("Ingresa Nombre: ");
		char genero2 = in.getGenero("Ingrese su sexo: ");
		int edad2 = in.getEdad("Ingresa edad: ");
		double peso2 = in.getPeso("Ingrese su Peso: ");
		double altura2 = in.getAltura("Ingrese su altura: ");
		int codigo2 = in.getEdad("Ingrese su codigo de estudiante: ");
		
		Alumno p2 = new Alumno(nombre2,edad2,genero2,peso2,altura2,codigo2);
		
		Coleccion c1 = new Coleccion(2);
		
		String descripcion = in.getString("Ingrese la descripcion de la recomendacion :");
		Recomendacion r1 = new Recomendacion(descripcion);
		String descripcion2 = in.getString("Ingrese la descripcion de la recomendacion :");
		Recomendacion r2  =  new Recomendacion(descripcion2);
		ColeccionRecomendaciones c2 = new ColeccionRecomendaciones(2);
		
		System.out.println(c1.agregarPersona(p1));
		System.out.println(c1.agregarPersona(p2));
		System.out.println(c2.agregarRecomendacion(r1));
		System.out.println(c2.agregarRecomendacion(r2));

		
		if(p1.IMC().equals("Bajo Peso")) {
			System.out.println( c1.toString() + p1.IMC() + "\n" + r1);
		}
		else{
			if(p1.IMC().equals("Peso Ideal")) {
				System.out.println(c1.toString()+ p2.IMC()  + "\n" + r2);
			}
		}


	}
}