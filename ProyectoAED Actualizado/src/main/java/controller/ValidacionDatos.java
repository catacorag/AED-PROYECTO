package controller;
import java.util.Scanner;
public class ValidacionDatos {
	Scanner sc;
    public ValidacionDatos() {
        sc = new Scanner(System.in);
    }
    protected String getString(String titulo) {
        String nombre = "";
        while(nombre.equals("")) {
            System.out.println(titulo);
            nombre = sc.nextLine();
        }
        return nombre;
    }
    protected int getEdad(String titulo) {
        int edad = 0;
        while(edad == 0 || edad < 0 ) {
            System.out.println(titulo);
            edad = sc.nextInt();
        }
        return edad;
    }
    protected int getcodigo(String titulo) {
        int codigo = 0;
        while(codigo == 0 ) {
            System.out.println(titulo);
            codigo = sc.nextInt();
        }
        return codigo;
    }
    protected char getGenero(String titulo) {
        char genero = ' ';
        while(genero != 'M' && genero != 'F' && genero != 'm' && genero != 'f') {
            System.out.println(titulo);
            genero = sc.next().charAt(0);
        }
        return genero;
    }
    protected double getPeso(String titulo) {
        double peso = 0;
        while(peso < 0  || peso == 0) {
            System.out.println(titulo);
            peso = sc.nextDouble();
        }
        return peso;
    }
    protected double getAltura(String titulo) {
        double altura = 0;
        while(altura < 0 ||  altura==0) {
            System.out.println(titulo);
            altura = sc.nextDouble();
        }
        return altura;
    }
}
