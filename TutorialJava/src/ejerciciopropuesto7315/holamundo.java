package ejerciciopropuesto7315;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {
		
		
		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String Usuario = Teclado.nextLine();
		String nombre = "pedro";
		
		while(!Usuario.toLowerCase().equals(nombre)){
			System.out.println("Ingrese su nombre: ");
			Usuario = Teclado.nextLine();
		}
		
		System.out.println("Bienvenido " + Usuario);
		
	}
}