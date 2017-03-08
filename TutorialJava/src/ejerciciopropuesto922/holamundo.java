package ejerciciopropuesto922;

import java.util.Scanner;

class holamundo {
	
	public static void dibujarCuadrado(int alto, int ancho) {
		

		for (int i = 0; i < alto; i++) {
			
			for(int j = 0; j < ancho; j++){
				System.out.print("*");
			}
			
			System.out.println("\n");
		}

	}

	public static void main(String args[]) {
		
		Scanner Teclado = new Scanner(System.in);
		int Alto, Ancho;
		
		System.out.println("Ingrese el Alto del cuadrado: ");
		Alto = Teclado.nextInt();
		
		System.out.println("Ingrese el Ancho del cuadrado: ");
		Ancho = Teclado.nextInt();
		
		Teclado.close();
		
		dibujarCuadrado(Alto, Ancho);

	}
}