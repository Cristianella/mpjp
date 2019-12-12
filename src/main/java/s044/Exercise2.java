package s044;

public class Exercise2 {
	public static void main(String[] args) {
		int[] array = { 3, 5, 1, 7, -3 };
		
		int minimo;
		minimo = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] < minimo) {
				minimo = array[i];
			}
		}

		System.out.println(" Il numero minore è " + minimo);

	} 
	}
