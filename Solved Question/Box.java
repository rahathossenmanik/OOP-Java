package main;

public class Box {
	public int weight;
	public static class BoxTest {
		public static void main(String []args) {
			Box x = new Box();
			Box y = new Box();
			Box z = new Box();
			x.weight = 10;
			y.weight = 2;
			z = y;
			z.weight = 100;
			z = x;
			System.out.println(x.weight);
			System.out.println(y.weight);
			System.out.println(z.weight);
		}
	}
}