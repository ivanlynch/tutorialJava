package ejerciciopropuesto639b;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero :");
		double Usuario = Teclado.nextByte();
		
		System.out.println("Ingrese otro numero :");
		double Usuario2 = Teclado.nextByte();
		
		int Cont = 0;
		
		for(double i = Usuario; i < Usuario2; i++){
			
			if(((Usuario % 1 == 0) && (Usuario % Usuario == 0) && (Usuario2 % 1 == 0) && (Usuario2 % Usuario2 == 0))){
				Cont++;
			}
		}
		
		if(Cont != 0){
			System.out.println("Numero primo");
		}

	}
}