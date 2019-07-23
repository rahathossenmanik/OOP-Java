package main.quizes;
import java.util.Scanner;

public class Quize11 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = 0;
		System.out.print("Give charecters: ");
		if(in.hasNextInt()) {
			number  = in.nextInt();
		}
		String input = in.next();
		System.out.println("number = " + number
				+ "\n" + "input = " + input);
	}
}
