package main;

public class MyRunner {
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable("Good Morning");
		MyRunnable r2 = new MyRunnable("Good Night");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
