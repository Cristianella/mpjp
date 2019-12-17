package ex;

public class S59 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		long result = 0;
		for (int cur = first; cur <= last; cur++) {
			result += cur;
		}
		if (first > last) {
			return result;
		} else {

		}
		return 0;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {

		long result = 0;

		for (int cur = first; cur < last; cur++) {
			if (first + last % 2 == 0) {
				result += cur;
			}
		}
		return result;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {

		long result = 1;

		for (int cur = value; cur > 1; cur--) {
			result *= cur;
		}
		return result;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {

		if (value == 1) {
			return 1;
		} else if (value == 2) {
			return 1;
		} else {

			for (int cur = 2; cur <= value; cur++) {
				var temp = cur;
				var prev = 1;
				var result = 2;

				result = result + prev;

			}
			return value;
		}
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value][value];

		for (int i = 1; i < value; i++) {
			for (int j = 1; j < value; j++) {
				result[i][j] = (i + 1) * (j + 1);
			}
		}

		return result;
	}
}
