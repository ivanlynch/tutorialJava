package ejerciciopropuesto541;

import java.util.Scanner;

class holamundo {
	public static void main(String args[]) {

		Scanner teclado;
		int primerNumero, segundoNumero;
		
		teclado = new Scanner(System.in);

		System.out.print("Introduzca un numero: ");
		primerNumero = teclado.nextInt();
		
		if(primerNumero % 2 == 0){
			System.out.print("El numero es par");
		}else{
			System.out.print("El numero es impar");
		}
		

	}
}