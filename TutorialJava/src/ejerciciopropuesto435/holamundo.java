package ejerciciopropuesto435;

import java.util.Scanner;

class holamundo {
	public static void main(String args[]) {
		Scanner teclado;
		int primerNumero;

		teclado = new Scanner(System.in);

		System.out.print("Introduzca la temperatura en Grados Centigrados para calcular a cuantos grados Fahrenheit equivale: ");
		primerNumero = teclado.nextInt();
		System.out.print("Grados Fahrenheit: ");
		System.out.println(9 * primerNumero / 5 + 32);

	}
}