package ejerciciopropuesto7322;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {
		
		
		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String Usuario = Teclado.nextLine();
		
		StringBuilder texto = new StringBuilder(Usuario);
		if(texto.charAt(0) == 'A'){
			texto.setCharAt(0, 'B');
		}else{
			texto.setCharAt(0, 'A');
		}
		
		Usuario = texto.toString();
		
		System.out.println(Usuario);
		
	}
}