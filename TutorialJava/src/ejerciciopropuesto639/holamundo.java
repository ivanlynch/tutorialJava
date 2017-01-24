package ejerciciopropuesto639;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero :");
		double Usuario = Teclado.nextByte();
		int Cont = 0;
		
		for(int i = 0; i < Usuario; i++){
			
			if((Usuario % 1 == 0) && (Usuario % Usuario == 0)){
				Cont++;
			}
		}
		
		if(Cont != 0){
			System.out.println("Numero primo");
		}

	}
}