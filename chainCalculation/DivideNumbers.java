package chainCalculation;

public class DivideNumbers implements Chain{
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}


	@Override
	public double calculate(Numbers requests) {
		if(requests.getCalcutationWanted() == "div") {
			System.out.println(requests.getNumber1() + "/" + requests.getNumber2()
				+ "=" + requests.getNumber1() / requests.getNumber2() );
		}
		else {
			nextInChain.calculate(requests);
		}
		return 0.0;
	}
}
