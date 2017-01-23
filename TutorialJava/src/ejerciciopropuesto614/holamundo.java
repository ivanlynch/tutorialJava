package ejerciciopropuesto614;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {

		Scanner Teclado;
		Teclado = new Scanner(System.in);
		
		int primerNumero;
		System.out.println("Ingrese un numero:");
		primerNumero = Teclado.nextInt();
		
		while (primerNumero != 0) {
			System.out.println("Su cuadrado es: " + (int)Math.pow(primerNumero, 2) + "");
			System.out.println("Ingrese un numero:");
			primerNumero = Teclado.nextInt();
		}

	}
}