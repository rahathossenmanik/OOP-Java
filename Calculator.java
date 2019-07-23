package main;

/**
 * <h1>Simple Calculator</h1>
 *<P> This program has two initialized variable.
 * There are four methods to calculate the
 * sum, difference, product and dividand.</p>
 * @author Manik Hosen
 * @version 1.0.0
 * @since 29th October 2018
 */
public class Calculator {
	/**
	 * This method is used to find the sum of two numbers.
	 * @param a - This is the first parameter of Addition method.
	 * @param b - This is the second parameter of Addition method.
	 * @return int - This is the sum of a and b.
	 */
	public static int addition(int a, int b) {
		return a+b;
	}
	
	/**
	 * This method is used to find the difference of two numbers.
	 * @param a - This is the first parameter of Subtraction method.
	 * @param b - This is the second parameter of Subtraction method.
	 * @return int - This is the difference of a and b.
	 */
	public static int subtraction(int a, int b) {
		return a-b;
	}
	
	/**
	 * This method is used to find the product of two numbers.
	 * @param a - This is the first parameter of Multiplication method.
	 * @param b - This is the second parameter of Multiplication method.
	 * @return int - This is the product of a and b.
	 */
	public static int multiplication(int a, int b) {
		return a*b;
	}
	
	/**
	 * This method is used to find the dividand of two numbers.
	 * @param a - This is the first parameter of Division method.
	 * @param b - This is the second parameter of Division method.
	 * @return int - This is the dividand of a and b.
	 */
	public static int division(int a, int b) {
		return a/b;
	}
	
	/**
	 * This is main method to control the whole program.
	 * This take two initialized variable.
	 * This method prints the sum, difference, product and
	 * dividand of the two values.
	 * @param args - This is an unused parameter to main.
	 */
	public static void main(String args[]) {
		int x=10;
		int y=5;
		System.out.println(addition(x,y));
		System.out.println(subtraction(x,y));
		System.out.println(multiplication(x,y));
		System.out.println(division(x,y));
	}
}
