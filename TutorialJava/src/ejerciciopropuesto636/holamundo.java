package ejerciciopropuesto636;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numero :");
		byte Usuario = Teclado.nextByte();
		
		System.out.println("Ingrese otro :");
		byte Usuario2 = Teclado.nextByte();
		
		for(int i = 0; i < Usuario; i++){
			
			for(int j = 0; j < Usuario2; j++){
				System.out.print("*");
			}
			
			System.out.println("");
			
		}

	}
}