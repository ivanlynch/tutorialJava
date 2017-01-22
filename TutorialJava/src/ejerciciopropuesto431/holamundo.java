package ejerciciopropuesto431;

import java.util.Scanner;

class holamundo5 {
	public static void main(String args[]) {
		Scanner teclado;
		int primerNumero, segundoNumero;

		teclado = new Scanner(System.in);

		System.out.print("Introduzca el primer número: ");
		primerNumero = teclado.nextInt();
		System.out.print("Introduzca el segundo número: ");
		segundoNumero = teclado.nextInt();
		System.out.print("El producto es: ");
		System.out.println(primerNumero * segundoNumero);

	}
}