package ejerciciopropuesto436;

import java.util.Scanner;

class holamundo {
	public static void main(String args[]) {
		Scanner teclado;
		int primerNumero, segundoNumero, tercerNumero;

		teclado = new Scanner(System.in);

		System.out.println("Introduzca la base y altura de un triangulo: ");
		System.out.print("Base: ");
		primerNumero = teclado.nextInt();
		System.out.print("Altura: ");
		segundoNumero = teclado.nextInt();
		System.out.print("Superficie: ");
		System.out.println(primerNumero * segundoNumero / 2);

	}
}