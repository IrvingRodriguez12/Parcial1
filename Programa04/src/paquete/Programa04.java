package paquete;

import java.util.Scanner;

public class Programa04 {

	public Programa04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		int ed;
		System.out.println ("Ingrese su edad");
		ed = leer.nextInt();
		if (ed>=18){
			System.out.println ("Mayor de edad");
		}
		else {
			System.out.println ("Menor de edad");
	}

}
}