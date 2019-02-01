package Paquete;

import java.util.Scanner;

public class Programa02 {

	public Programa02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		System.out.println ("Ingrese su nombre ");
		String nombre;
		nombre = leer.nextLine();
		System.out.println("Hola " + nombre);
	}

}
