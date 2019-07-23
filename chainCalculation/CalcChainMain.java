package chainCalculation;

public class CalcChainMain {

	public static void main(String[] args) {
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubNumbers();
		Chain chainCalc3 = new MultiplyNumbers();
		Chain chainCalc4 = new DivideNumbers();
		Chain chainCalc5 = new ModNumbers();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		chainCalc4.setNextChain(chainCalc5);
		
		Numbers request = new Numbers(4,2,"add");
		chainCalc1.calculate(request);
	}
}
