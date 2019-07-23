package main;

public class MultipleCatches {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			try {
				int a = args.length;
				System.out.println("a = " +a);
				int b = 42/a;
				int c[] = { 1 };
				c[42] = 99;
			}catch(Exception e) {
				System.out.println("Exception Catch.");
			}
		}catch(ArithmeticException e) {
			System.out.println("Divide by 0: " + e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array ioob: " + e);
		}catch(ArrayStoreException | ClassCastException e) {
			System.out.println("Array Related: " + e);
		}
	}
}
