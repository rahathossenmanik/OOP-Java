package main;

public class LambdaDemo {
	public static void main(String[] args) {
		int a, b;
		String factorOrNot = "";
		
		a = Integer.parseInt("10");
		b = Integer.parseInt("2");
		NumericTest isFactor = (n, d) -> (n % d) == 0;
		if(isFactor.test(a, b))factorOrNot = "a factor";
		else factorOrNot = "not a factor";
		System.out.println(b + " is " + factorOrNot + " of " + a);
		
		a = Integer.parseInt("10");
		b = Integer.parseInt("3");
		isFactor = (n, d) -> (n % d) == 0;
		if(isFactor.test(a, b))factorOrNot = "a factor";
		else factorOrNot = "not a factor";
		System.out.println(b + " is " + factorOrNot + " of " + a);
	}
	
	interface NumericTest{
		boolean test(int n, int d);
	}
}
