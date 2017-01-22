package ejerciciopropuesto531;

import java.util.Scanner;

class holamundo {
	public static void main(String args[]) {

		Scanner teclado;
		int primerNumero;

		teclado = new Scanner(System.in);

		System.out.print("Introduzca el numero 12: ");
		primerNumero = teclado.nextInt();
		
		if(primerNumero == 12){
			System.out.print("Correcto ");
		}else{
			System.out.print("Incorrecto");
		}

	}
}