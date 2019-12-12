package s044;

public class ExerciseArgs {

	public static void main(String[] args) {
		System.out.println(args.length);

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		for (String arg : args) {
			System.out.println(arg);
		}

		int i = 0;
		while (i < args.length) {
			System.out.println(args[i]);
			i++; 
		}
	}
}
