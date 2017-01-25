package ejerciciopropuesto7313;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {
		
		
		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra");
		String Usuario = Teclado.nextLine();
		
		for(int i = Usuario.length() - 1; i >= 0; i--){
			System.out.print(Usuario.charAt(i));
		}
		
	}
}