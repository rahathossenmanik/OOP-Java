package main.quizes;
import java.util.Scanner;

public class Quize12 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Give charecters: ");
		double x1 = in.nextDouble();
//		double x2 = in.nextDouble();		InputMismatchException
		String x2 = in.next();
		System.out.println("x1 = " + x1 + "\n"
				+ "x2 = " + x2);
	}
}
