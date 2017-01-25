package ejerciciopropuesto7312;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {
		
		
		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra");
		String Usuario = Teclado.nextLine();
		
		for(int i = 0; i <Usuario.length(); i++){
			System.out.print(Usuario.charAt(i) + " ");
		}
		
	}
}