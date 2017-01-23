package ejerciciopropuesto617;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {

		Scanner Teclado;
		Teclado = new Scanner(System.in);
		
		int primerNumero;
		System.out.println("Ingrese un numero:");
		primerNumero = Teclado.nextInt();
		
		
		while (primerNumero != 0) {
			System.out.print("*");
			primerNumero--;
			
		}

	}
}