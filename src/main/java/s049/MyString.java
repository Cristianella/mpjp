package s049;

public class MyString {
	static int compareTo(String s, String t) {

		int S = s.length();
		int T = t.length();
		int valueMin = 0;

		for (int i = 0; i < valueMin; i++) {

			if (s.charAt(i) < t.charAt(i)) {
				return -1;
			} else if (t.charAt(i) > s.charAt(i)) {
				return +1;
			} else {
				return 0;
			}
		}
		
		if( S == T ) {
			return 0;
		} else if ( S < T) {
			return -1;
		} else {
			return +1;
		}
		
	}

	public static void main(String[] args) {
		String s1 = "hello";
		String t1 = "world";
		int result1 = compareTo(s1, t1);
		System.out.println(" Hello vs world, result is: " + result1);

		String s2 = "hello";
		String t2 = "hello";

		int result2 = compareTo(s2, t2);
		System.out.println(" Hello vs world, result is: " + result2);

		String s3 = "hello";
		String t3 = "hell";

		int result3 = compareTo(s3, t3);
		System.out.println(" Hello vs wold, result is: " + result3);
	}

}
