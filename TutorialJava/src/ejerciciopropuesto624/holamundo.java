package ejerciciopropuesto624;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {

		Scanner Teclado;
		Teclado = new Scanner(System.in);

		int primerNumero, segundoNumero;

		do {

			System.out.println("Ingrese un numero:");
			primerNumero = Teclado.nextInt();
			System.out.println("Ingrese otro numero:");
			segundoNumero = Teclado.nextInt();
			System.out.println("Suma: " + (primerNumero + segundoNumero));
			

		} while (primerNumero != 0 || segundoNumero != 0);

	}
}