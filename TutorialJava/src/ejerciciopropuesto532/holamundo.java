package ejerciciopropuesto532;

import java.util.Scanner;

class holamundo {
	public static void main(String args[]) {

		Scanner teclado;
		int primerNumero;

		teclado = new Scanner(System.in);

		System.out.print("Introduzca un numero: ");
		primerNumero = teclado.nextInt();
		
		if(primerNumero == 0){
			System.out.print("El numero es 0 ");
		}else{
			if(primerNumero >= 0){
				System.out.print("El numero positivo");
			}else{
				System.out.print("El numero negativo");
			}
		}

	}
}