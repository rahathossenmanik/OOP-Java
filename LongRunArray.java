package homework1;

import java.util.Random;

public class LongRunArray {
	public static void main(String[] args) {
		final int LENGTH=20;
		final int MAX=6;
		final int MIN=1;
		final int ONE=1;
		final int ZERO=0;
		int Check=ZERO;
		int Count=ZERO;
		int PreviousCount=ZERO;
		int Position=ZERO;
		int[] numbers= new int[LENGTH];
		int i;
		Random rand = new Random(LENGTH);
		for(i=ZERO;i<LENGTH;i++) {
			numbers[i] = rand.nextInt((MAX - MIN) + ONE) + MIN;
		}
		for(i=ZERO;i<LENGTH;i++) {
			if(i<(LENGTH-ONE) && numbers[i]==numbers[i+ONE] && Check==ZERO) {
				Count=Count+ONE;
				Check=ONE;
			}
			else {
				if(Count<PreviousCount) {
					PreviousCount=Count;
					Position=i-PreviousCount;
				}
			}
			if(i==Position+ONE+ONE) {
				System.out.print("(");
			}
			System.out.print(numbers[i]);
			if(i<(LENGTH-ONE) && numbers[i]!=numbers[i+ONE] && Check!=ZERO) {
				Check=Count;
				Check=Check-ONE;
				if(Check==ZERO) {
					System.out.print(")");
				}
			}
			System.out.print(" ");
		}
	}
}
