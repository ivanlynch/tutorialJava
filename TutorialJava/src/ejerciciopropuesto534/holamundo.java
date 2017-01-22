package ejerciciopropuesto534;

import java.util.Scanner;

class holamundo {
	public static void main(String args[]) {

		Scanner teclado;
		int primerNumero;
		
		teclado = new Scanner(System.in);

		System.out.print("Introduzca un numero: ");
		primerNumero = teclado.nextInt();
		
		if(primerNumero % 3 == 0){
			System.out.print("El numero es multiplo de 3");
		}
		

	}
}