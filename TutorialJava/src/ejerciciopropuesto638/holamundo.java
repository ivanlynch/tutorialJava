package ejerciciopropuesto638;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero :");
		double Usuario = Teclado.nextByte();

		for(int i = 0; i < Usuario; i++){
			if(Usuario % i == 0){
				System.out.println(Usuario + " es divisible por: " + i);
			}
		}

	}
}