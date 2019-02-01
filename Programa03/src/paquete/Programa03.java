package paquete;

import java.util.Scanner;

public class Programa03 {

	public Programa03() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		String nombre;
		int edad;
		double estatura;
		System.out.println ("Ingrese su nombre ");
		nombre = leer.nextLine();
		System.out.println ("Ingrese tu edad ");
		edad = leer.nextInt();
		System.out.println ("Ingresa tu estatura ");
		estatura = leer.nextDouble();
		System.out.println("Hola " + nombre + ", tu edad es de " + edad + " años" + " y tu estatura es de " + estatura);
	}

}
