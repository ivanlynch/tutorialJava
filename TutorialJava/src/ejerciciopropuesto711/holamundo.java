package ejerciciopropuesto711;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {
		
		
		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		int Usuario = Teclado.nextInt();
		boolean esPar;
		
		esPar = Usuario % 2 == 0;
		
		if(esPar){
			System.out.println("Es par");
		}else{
			System.out.println("Es impar");
		}
		
	}
}