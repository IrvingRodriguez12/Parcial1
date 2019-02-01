package paquete;

import java.util.Scanner;

public class Programa05 {

	public Programa05() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		int cal;
		System.out.println ("Ingrese su calificación");
		cal = leer.nextInt();
		if (cal>=80){
			System.out.println ("Aprobado");
		}
		else {
			System.out.println ("Reprobado");
		}
	}

}
