package ejerciciopropuesto7321;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {
		
		
		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String Usuario = Teclado.nextLine();
		
		StringBuilder texto = new StringBuilder(Usuario);
		Usuario = texto.reverse().toString();
		
		System.out.println(Usuario);
		
	}
}