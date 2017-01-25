package ejerciciopropuesto651;

class holamundo {

	public static void main(String args[]) {
		
		
		etiqueta:
			
		for(int i = 1; i <= 20; i++){
			System.out.println(i);
			if(i == 10)
				break etiqueta;
			
		}
	
		System.out.println( "Terminado" ); 
		
	}
}