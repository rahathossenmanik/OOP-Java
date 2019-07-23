package main;

public class ErrorValue {
	static double m(Double v) {
		return v;
	}
	public static void main(String args[]) {
		Double iOa = m(100.0);
		System.out.println(iOa);
		Integer iOb = 100;
		int i = iOb;
		System.out.println(i+ "\n" +iOb);
	}
}
