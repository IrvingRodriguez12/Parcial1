package paquete;

import java.util.Scanner;

public class Programa06 {

	public Programa06() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		int num;
		System.out.println ("Ingrese un número entero");
		num = leer.nextInt();
		if (num%2 == 0){
			System.out.println ("Par");
		}
		else {
			System.out.println ("Impar");
		}
	}

}
