package homework1;

import java.util.Random;

public class Array {
	public static void main(String[] args) {
		final int LENGTH=20;
		final int MAX=6;
		final int MIN=1;
		final int ONE=1;
		final int ZERO=0;
		int Check=ZERO;
		int[] numbers= new int[LENGTH];
		int i;
		Random rand = new Random(LENGTH);
		for(i=ZERO;i<LENGTH;i++) {
			numbers[i] = rand.nextInt((MAX - MIN) + ONE) + MIN;
		}
		for(i=ZERO;i<LENGTH;i++) {
			if(i<(LENGTH-ONE) && numbers[i]==numbers[i+ONE] && Check==ZERO) {
				System.out.print("(");
				Check=ONE;
			}
			System.out.print(numbers[i]);
			if(i<(LENGTH-ONE) && numbers[i]!=numbers[i+ONE] && Check!=ZERO) {
				System.out.print(")");
				Check=ZERO;
			}
			System.out.print(" ");
		}
	}
}
