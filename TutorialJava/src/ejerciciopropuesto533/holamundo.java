package ejerciciopropuesto533;

import java.util.Scanner;

class holamundo {
	public static void main(String args[]) {

		Scanner teclado;
		double primerNumero, segundoNumero;
		
		teclado = new Scanner(System.in);

		System.out.print("Introduzca el primer numero: ");
		primerNumero = teclado.nextDouble();
		
		System.out.print("Introduzca el segundo numero: ");
		segundoNumero = teclado.nextDouble();
		
		if(primerNumero > segundoNumero){
			System.out.print("El primero numero es mayor");
		}else{
			System.out.print("El segundo numero es mayor");
		}

	}
}