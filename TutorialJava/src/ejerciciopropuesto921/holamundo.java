package ejerciciopropuesto921;

class holamundo {

	public static void dibujarCuadrado(int param) {

		for (int i = 0; i < param; i++) {
			
			for(int j = 0; j < param; j++){
				System.out.print("*");
			}
			
			System.out.println("\n");
		}

	}

	public static void main(String args[]) {

		dibujarCuadrado(5);

	}
}