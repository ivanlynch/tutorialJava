package ejerciciopropuesto453;

import java.util.Scanner;

class holamundo {
	public static void main(String args[]) {

		Scanner teclado;
		double primerNumero, segundoNumero;

		teclado = new Scanner(System.in);

		System.out.print("Introduzca el primer numero: ");
		primerNumero = teclado.nextDouble();
		System.out.print("Intrduzca el segundo numero");
		segundoNumero = teclado.nextDouble();

		System.out.print("Su division es: ");
		System.out.println(primerNumero / segundoNumero);

	}
}