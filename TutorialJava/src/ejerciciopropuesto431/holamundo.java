package ejerciciopropuesto431;

import java.util.Scanner;

class holamundo5 {
	public static void main(String args[]) {
		Scanner teclado;
		int primerNumero, segundoNumero;

		teclado = new Scanner(System.in);

		System.out.print("Introduzca el primer n�mero: ");
		primerNumero = teclado.nextInt();
		System.out.print("Introduzca el segundo n�mero: ");
		segundoNumero = teclado.nextInt();
		System.out.print("El producto es: ");
		System.out.println(primerNumero * segundoNumero);

	}
}