package ejerciciopropuesto637;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero :");
		byte Usuario = Teclado.nextByte();

		for (int i = 0; i < Usuario; i++) {

			for (int j = 0; j < Usuario; j++) {

				if ((i > 0) && (i < Usuario - 1)) {

					if ((j > 0) && (j < Usuario - 1)) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}

				} else {

					System.out.print("*");

				}
			}

			System.out.println("");

		}

	}
}