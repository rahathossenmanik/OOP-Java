package chainCalculation;

public class Numbers {
	private int number1;
	private int number2;
	private String calcutationWanted;
	public Numbers(int number1, int number2, String calcutationWanted) {
		this.number1 = number1;
		this.number2 = number2;
		this.calcutationWanted = calcutationWanted;
	}
	public int getNumber1() {
		return number1;
	}
	public int getNumber2() {
		return number2;
	}
	public String getCalcutationWanted() {
		return calcutationWanted;
	}
	
}
