import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String nombre;
		char genero;
		int edad;
		double peso;
		double altura;
		System.out.print("Ingrese su Nombre: ");nombre = sc.nextLine();
		System.out.print("Ingrese su Genero: ");genero = sc.next().charAt(0);
		System.out.print("Ingrese su Edad: ");edad = sc.nextInt();
		System.out.print("Ingrese su Peso: "); peso = sc.nextDouble();
		System.out.print("Ingrese su Altura: "); altura = sc.nextDouble();
		
		Persona p1= new Persona(nombre,edad,genero,peso,altura);
		System.out.println("Persona: "+ p1);
		

		
	}

}
