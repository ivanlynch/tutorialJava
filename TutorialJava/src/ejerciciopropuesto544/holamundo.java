package ejerciciopropuesto544;

import java.util.Scanner;

class holamundo {
	public static void main(String args[]) {

		Scanner teclado;
		int primerNumero, segundoNumero, tercerNumero;
		
		teclado = new Scanner(System.in);

		System.out.print("Introduzca un numero: ");
		primerNumero = teclado.nextInt();
		
		System.out.print("Introduzca otro: ");
		segundoNumero = teclado.nextInt();
		
		System.out.print("Introduzca otro: ");
		tercerNumero = teclado.nextInt();
		
		if((primerNumero > segundoNumero) && (primerNumero > tercerNumero)){
			System.out.print("El primer numero es el mayor");
		}else{
			if((segundoNumero > primerNumero) && (segundoNumero > tercerNumero)){
				System.out.print("El segundo numero es el mayor");
			}else{
				System.out.print("El tercer numero es el mayor");
			}
		}
		

	}
}