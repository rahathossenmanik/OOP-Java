package main.colors;

public class A implements Red {
	public void one() {
		System.out.println("A.1");
	}
	public void two() {
		one();
		System.out.println("A.2");
	}
	@Override
	public void turnRed() {
		System.out.println("Noo!!");
	}
}
