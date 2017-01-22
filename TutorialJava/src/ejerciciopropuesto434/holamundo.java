package ejerciciopropuesto434;

import java.util.Scanner;

class holamundo {
	public static void main(String args[]) {
		Scanner teclado;
		int primerNumero;

		teclado = new Scanner(System.in);

		System.out.print("Introduzca la cantidad de millas para calcular los metros: ");
		primerNumero = teclado.nextInt();
		System.out.print("Los metros son: ");
		System.out.println(primerNumero * 1609);

	}
}