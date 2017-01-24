package ejerciciopropuesto626;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {

		Scanner Teclado;
		Teclado = new Scanner(System.in);

		byte primerNumero, Contador = 0, Contador2 = 0;
		
		System.out.println("Ingrese un numero:");
		primerNumero = Teclado.nextByte();
		Contador = primerNumero;
		do {
			Contador2 = Contador;
			while(Contador2 > 0){
				System.out.print("*");
				Contador2--;
			}
			System.out.println("");
			primerNumero--;
		} while (primerNumero > 0);

	}
}