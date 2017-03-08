package ejerciciopropuesto742;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {
		
		Scanner Teclado = new Scanner(System.in);
				
		int[] DatosUsuario = new int[8];
		int Mayor = DatosUsuario[0];
		int Menor = DatosUsuario[0];
		
		for(int i = 0; i < DatosUsuario.length; i++){
			
			System.out.println("Ingrese un valor :");
			DatosUsuario[i] = Teclado.nextInt();
			
		}
		
		for(int i = 0; i < DatosUsuario.length; i++){
			if(DatosUsuario[i] > Mayor){
				Mayor = DatosUsuario[i];
			}
			
			if(DatosUsuario[i] < Menor){
				Menor = DatosUsuario[i];
			}
		}
		
		System.out.println("El menor es :" + Menor + " - El mayor es :" + Mayor);
	}
}