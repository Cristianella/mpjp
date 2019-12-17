package ex;

public class S60 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		int i = 0;
		StringBuilder sb = new StringBuilder();

		for (i = s.length() - 1; i >= 0; i--) {

			sb.append(s.charAt(i));
		}

		return sb.toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		boolean polindromo = true;
		for (int i = 0; i <= s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			} else {
			}
			return true;
		}
		return polindromo;
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		if (s.contentEquals(""))
			return "";

		StringBuilder sb = new StringBuilder();

		if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o'
				|| s.charAt(0) == 'u') {
			return removeVowels(s.substring(1));
		} else {

			return s.substring(0, 1) + removeVowels(s.substring(1));
		}

	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		var x = 1;
		for (int i = 0; i < s.length(); i++) {

		}
		return 0;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[0];
		int i = 0;

		StringBuilder sb = new StringBuilder();

		for (i = data.length - 1; i >= 0; i--) {

			sb.append(data.length);
		}

		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		int sum = 0;

		for (int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		return sum / data.length;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		int max = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}
}
