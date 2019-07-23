package main.quizes;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Quize14 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("input.txt"));
			int value = in.nextInt();
			System.out.println(value);
		}catch(IOException exception) {
			System.out.println("Error opening file.");
		}
	}
}
