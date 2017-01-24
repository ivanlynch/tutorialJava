package ejerciciopropuesto635;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numero :");
		int Usuario = Teclado.nextInt();
		
		for(int i = 0; i <= Usuario; i++){
			if((i % 3 == 0) || (i % 7 == 0)){
				System.out.println(i);
			}
		}

	}
}