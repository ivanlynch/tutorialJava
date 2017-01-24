package ejerciciopropuesto622;

import java.util.Scanner;

class holamundo {

	public static void main(String args[]) {

		int primerNumero = 20;

		do {
			if(primerNumero % 2 == 0){
				System.out.println(primerNumero);
			}
			primerNumero--;
		} while (primerNumero >= 0);

	}
}