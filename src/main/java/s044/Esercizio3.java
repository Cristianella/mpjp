package s044;

public class Esercizio3 {
	public static void main(String[] args) {
		int[] array = { 7, 3, 1, 2, 4, 8 };
		int even = 0;
		int somma_odd = 0;
		int odd = 0;
		int somma_even = 0;

		for (int i = 0; i < array.length; i++) {

			

			if (array[i] % 2 == 0) {
				even = even + 1;
				somma_even = somma_even + array[i];

			} else if (array[i] % 2 == 1) {
				odd = odd + 1;
				somma_odd = somma_odd + array[i];

			}

		}

		System.out.println(" I numeri pari nel mio array sono: " + even);
		System.out.println(" I numeri dispari nel mio array sono: " + odd);
		System.out.println(" La somma dei numeri dispari nel mio array è: " + somma_odd);
		System.out.println(" La somma dei numeri pari nel mio array è: " + somma_even);

	}
}