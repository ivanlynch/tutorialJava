package ejerciciopropuesto744;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {
		
		Scanner Teclado = new Scanner(System.in);
				
		String[] DatosUsuario = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
				"Septiembre","Octubre","Noviembre","Diciembre"};
		
		System.out.println("Ingrese un valor :");
		int Usuario = Teclado.nextInt();
		
		while((Usuario >= 1) && (Usuario <= 12)){
			
			for(int i = 0; i < DatosUsuario.length; i++){
				if(Usuario == i+1){
					System.out.println("El mes es : " + DatosUsuario[i]);
				}
			}
			
			System.out.println("Ingrese un valor :");
			Usuario = Teclado.nextInt();
			
		}
	}
}