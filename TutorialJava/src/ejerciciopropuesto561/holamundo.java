package ejerciciopropuesto561;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {

		Scanner Teclado;

		Teclado = new Scanner(System.in);

		byte primerNumero, segundoNumero, menor;

		System.out.print("Introduzca un numero: ");
		primerNumero = Teclado.nextByte();

		System.out.print("Introduzca otro numero: ");
		segundoNumero = Teclado.nextByte();
		
		if(primerNumero > segundoNumero){
			menor = segundoNumero;
		}else{
			menor = primerNumero;
		}
		
		System.out.println("El menor es: " + menor +"");
		
		menor = primerNumero > segundoNumero ? segundoNumero : primerNumero;
		
		System.out.println("El menor es: " + menor +"");
		
	}
}