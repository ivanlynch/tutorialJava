package ejerciciopropuesto7324;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {
		
		
		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String Usuario = Teclado.nextLine();
		
		StringBuilder texto = new StringBuilder(Usuario);
		
		for(int i = 0; i < texto.length(); i++){
			if(i % 2 == 0){
				texto.setCharAt(i, Usuario.toLowerCase().charAt(i));
			}else{
				texto.setCharAt(i, Usuario.toUpperCase().charAt(i));
			}
		}
		
		Usuario = texto.toString();
		
		System.out.println(Usuario);
		
		
		
	}
}