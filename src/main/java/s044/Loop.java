package s044;

public class Loop {
	public static void main(String[] args) {
		System.out.println(" FOR ");
		System.out.print(" [ ");
		int[] data = { 5, 7, 1, 3, 4 };
		for (int i = 0; i < data.length; i++) {

			System.out.print(data[i]);
			if(i < data.length - 1) {
				System.out.print(" , ");
			}

		}
		System.out.print(" ] ");
		{

			System.out.println();
			System.out.println(" WHILE ");
			System.out.print(" [ ");
			int i = 0;

			while (i < data.length) {
				System.out.print(data[i]);
				if( i < data.length -1) {
					System.out.print(" , ");
				}

				i += 1;
			}
			System.out.print(" ] ");

		}

		{
			System.out.println();
			System.out.println(" FOR EACH ");
			System.out.print(" [ ");
			String[] array = new String[] { "5 , ", "7 , ", "1 , ", "3 , ", "4" };
			for (String item : array) {

				System.out.print(item);
		

			}
			System.out.print(" ] ");

		}
	}
}
