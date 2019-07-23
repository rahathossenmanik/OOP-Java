package main;

public class JavaOperator {
	public static void main(String[] args) {
		logical();
		bitwise();
	}
	private static void logical() {
		int a=3;
		int b=6;
		int c=a|b;
		int d=a&b;
		int e=a^b;
		int f=(~a&b)|(a&~b);
		int g=~a& 0x0f;
		System.out.println(c+" "+d+" "+e+" "+f+" "+g);
	}
	@SuppressWarnings("unused")
	private static void bitwise(){
		int a=1;
		int b=2;
		int c=3;
		int d=7;
		a |=4;
		b>>=1;
		c<<=1;
		a^=c;
		d>>>=1;
		System.out.println(a+" "+b+" "+c);
	}
}
