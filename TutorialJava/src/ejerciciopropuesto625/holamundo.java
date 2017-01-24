package ejerciciopropuesto625;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {

		Scanner Teclado;
		Teclado = new Scanner(System.in);

		int primerNumero, segundoNumero;

		do {

			System.out.println("Ingrese login:");
			primerNumero = Teclado.nextInt();
			System.out.println("Ingrese contraseña:");
			segundoNumero = Teclado.nextInt();
			
			

		} while (primerNumero != 1809 || segundoNumero != 1234);

	}
}