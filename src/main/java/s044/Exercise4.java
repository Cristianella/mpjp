package s044;

public class Exercise4 {
	public static void main(String[] args) {
		
		int[] array = {5, 7, 1, 3, 4};
		boolean seven = false; 
		boolean one = false;
		int posizione = 0;
		for(int i = 0; i < array.length; i++) {
			System.out.print(" [ " + array[i] + " ] : ");
			
			
			
			if( array[i] == 7) {
				seven =true;
				posizione = i;
				System.out.println(" Il valore 7 è presente nell'array" + i);
				
			} else if ( array[i] == 1) {
				posizione = i;
				one = true;
				System.out.println(" Il valore 1 è presente nell'array " + i);
				
			} else {
				System.out.println(" Il valore non  è presente nell'array ");
			}
		}

	}
}
