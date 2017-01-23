package ejerciciopropuesto542;

import java.util.Scanner;

class holamundo {
	public static void main(String args[]) {

		Scanner teclado;
		int primerNumero, segundoNumero;
		
		teclado = new Scanner(System.in);

		System.out.print("Introduzca un numero: ");
		primerNumero = teclado.nextInt();
		
		System.out.print("Introduzca otro: ");
		segundoNumero = teclado.nextInt();
		
		if((primerNumero >= 0) && (segundoNumero >= 0)){
			System.out.print("Los dos son positivos");
		}
		

	}
}