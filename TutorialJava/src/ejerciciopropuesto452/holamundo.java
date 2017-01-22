package ejerciciopropuesto452;

import java.util.Scanner;

class holamundo {
	public static void main(String args[]) {

		Scanner teclado;
		short primerNumero, segundoNumero;

		teclado = new Scanner(System.in);

		System.out.print("Introduzca su año de nacimiento: ");
		primerNumero = teclado.nextShort();
		System.out.print("Intrduzca el año actual: ");
		segundoNumero = teclado.nextShort();

		System.out.print("Su edad es: ");
		System.out.println(segundoNumero - primerNumero);

	}
}