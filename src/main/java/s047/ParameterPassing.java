package s047;

import java.util.Objects;

public class ParameterPassing {
	static void primitive(int parameter) {
		parameter += 1;
		System.out.println("parameter is " + parameter);
	}

	static int square(int value) {
		value *= value;
		System.out.println(" Value is " + value);
		return value;

	}

	static int triple(int value) {
		value *= 3;
		System.out.println(" Value is: " + value);
		return value;

	}

	static void immutableReference(String parameter) {
		if (parameter == null) {
			System.out.println("Nothing to do here");
			return;
		}

		// alternatively: if parameter is null throws a NullPointerException
		Objects.requireNonNull(parameter, "Parameter should not be null");

		System.out.println("parameter id was " + System.identityHashCode(parameter));
		parameter += " there";
		System.out.println("Now parameter id is " + System.identityHashCode(parameter));
		System.out.println("parameter value is " + parameter);
	}

	static void reference(StringBuilder parameter) {
		if (parameter == null) {
			System.out.println("Nothing to do here");
			return;
		}

		// alternatively: if parameter is null throws a NullPointerException
		Objects.requireNonNull(parameter, "Parameter should not be null");

		parameter.append(" there");
		System.out.println("parameter value is " + parameter);
	}

	static void reference(int[] data) {
		if (data == null || data.length == 0) {
			System.out.println("Nothing to do here");
			return;
		}
		
		

		// alternatively: if parameter is null throws a NullPointerException
		Objects.requireNonNull(data, "Parameter should not be null");

		data[0] += 1;
		System.out.println("data[0] is " + data[0]);
	}

	public static void main(String[] args) {
		int primitiveValue = 12;

		System.out.println("primitiveValue has been initialized to " + primitiveValue);
		primitive(primitiveValue);

		int result = square(primitiveValue);
		System.out.println(" primitiveValue squared is: " + result);

		result = triple(primitiveValue);
		System.out.println(" primitive tripled is: " + result);
		System.out.println("primitiveValue is still " + primitiveValue);

		String string = "Hi";

		System.out.println("string has been initialized to " + string);
		immutableReference(string);
		System.out.println("string is still " + string);

		StringBuilder referenceValue = new StringBuilder("Hi");

		System.out.println("referenceValue has been initialized to " + referenceValue);
		reference(referenceValue);
		System.out.println("referenceValue now is " + referenceValue);

		int[] array= { 42 };

		System.out.println("array[0] is " + array[0]);
		reference(array);
		System.out.println("array[0] now is " + array[0]);
	}
}
