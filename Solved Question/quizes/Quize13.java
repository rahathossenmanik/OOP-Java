package main.quizes;

public class Quize13 {
	public static void main(String[] args) {
		int balance = 100;
		int amount = 200;
		if(amount>balance) {
			throw new IllegalArgumentException("Amount exceeds");
		}
		balance -= amount;
		System.out.println("balance= " + balance);
	}
}
