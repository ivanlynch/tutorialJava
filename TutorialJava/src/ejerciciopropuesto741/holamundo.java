package ejerciciopropuesto741;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {
		
		Scanner Teclado = new Scanner(System.in);
		final int ARRAY = 5;
		int Contador = 0;
		
		int[] DatosUsuario = new int[ARRAY];
		
		for(int i = 0; i < DatosUsuario.length; i++){
			
			System.out.println("Ingrese un valor :");
			DatosUsuario[i] = Teclado.nextInt();
			
		}
		
		for(int i = 0; i < DatosUsuario.length; i++){
			Contador = Contador + DatosUsuario[i];
		}
		
		System.out.println("El resultado es :" + Contador / DatosUsuario.length);
	}
}