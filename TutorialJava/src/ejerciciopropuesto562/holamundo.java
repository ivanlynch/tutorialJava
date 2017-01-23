package ejerciciopropuesto562;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {

		Scanner Teclado;

		Teclado = new Scanner(System.in);

		int primerNumero, par;

		System.out.print("Introduzca un numero: ");
		primerNumero = Teclado.nextInt();

		if(primerNumero % 2 == 0){
			par = primerNumero;
		}else{
			par = 0;
		}
		
		System.out.println("Valor de variable par: " + par + "");
		
		par = primerNumero % 2 == 0 ? primerNumero : 0;
		
		System.out.println("Valor de variable par: " + par + "");
		
	}
}