package ejerciciopropuesto616;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {

		Scanner Teclado;
		Teclado = new Scanner(System.in);
		
		int primerNumero, segundoNumero, contador = 0;
		System.out.println("Ingrese usuario:");
		primerNumero = Teclado.nextInt();
		
		System.out.println("Ingrese contraseña:");
		segundoNumero = Teclado.nextInt();
		
		while ((primerNumero != 1809 || segundoNumero != 1234) || contador != 3) {
			
			contador++;
			System.out.println("Ingrese usuario:");
			primerNumero = Teclado.nextInt();
			
			System.out.println("Ingrese contraseña:");
			segundoNumero = Teclado.nextInt();
			
		}

	}
}