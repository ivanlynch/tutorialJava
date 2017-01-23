package ejerciciopropuesto543;

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
		
		if((primerNumero % 2 == 0) && (segundoNumero % 2 == 0)){
			System.out.print("Los dos son pares");
		}else{
			if((primerNumero % 2 == 0) || (segundoNumero % 2 == 0)){
				System.out.print("Alguno es par");
			}else{
				System.out.print("Ninguno de ellos es par");
			}
		}
		

	}
}