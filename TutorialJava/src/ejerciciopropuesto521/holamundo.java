package ejerciciopropuesto521;

import java.util.Scanner;

class holamundo {
	public static void main(String args[]) {

		Scanner teclado;
		int primerNumero;

		teclado = new Scanner(System.in);

		System.out.print("Introduzca un numero para saber si es positivo: ");
		primerNumero = teclado.nextInt();
		
		if(primerNumero >= 0){
			System.out.print("El numero es positivo ");
		}else{
			System.out.print("El numero no es positivo ");
		}

	}
}