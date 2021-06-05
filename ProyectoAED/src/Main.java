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

        System.out.println(p1.IMC()+" "+ p1);

    }
}