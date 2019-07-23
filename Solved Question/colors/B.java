package main.colors;

public class B extends A implements Red, Blue {
	public void one(int x) {
		System.out.println("B.1"+x);
	}
	public void two() {
		System.out.println("B.2");
	}
	@Override
	public void turnBlue() {
		System.out.println("Aie!!");
	}
}
