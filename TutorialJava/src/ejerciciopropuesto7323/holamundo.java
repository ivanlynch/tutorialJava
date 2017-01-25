package ejerciciopropuesto7323;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {
		
		
		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String Usuario = Teclado.nextLine();
		
		StringBuilder texto = new StringBuilder("Don " + Usuario);
		StringBuilder texto2 = new StringBuilder(Usuario);
		texto2.insert(0, "Don ");
		
		System.out.println("Buen dia " + texto.toString());
		System.out.println("Buen dia " + texto2.toString());
		
		
	}
}