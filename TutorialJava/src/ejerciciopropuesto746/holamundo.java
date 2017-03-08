package ejerciciopropuesto746;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {

		Scanner Teclado = new Scanner(System.in);
		
		
		double[] DatosUsuario = new double[10];

		for (int i = 0; i < DatosUsuario.length; i++) {
			System.out.println("Ingrese un valor :");
			DatosUsuario[i] = Teclado.nextInt();
		}
		
		
		System.out.println("¿Qué número desea buscar?");
		int Usuario = Teclado.nextInt();
		int flag = 0;
		
		while(Usuario != -1){
			
			for(int i = 0; i < DatosUsuario.length; i++){
				
				if(Usuario == DatosUsuario[i]){
					flag = 1;
				}
			}
			
			if(flag == 1){
				System.out.println("El número se encuentra entre los diez primeros.");
			}else{
				System.out.println("El número no se encuentra entre los diez primeros.");
			}
			
			
			System.out.println("\n¿Qué número desea buscar?");
			Usuario = Teclado.nextInt();
		}

	}
}