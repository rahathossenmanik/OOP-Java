package chainCalculation;

public class ModNumbers implements Chain{
	@Override
	public void setNextChain(Chain nextChain) {
	}


	@Override
	public double calculate(Numbers requests) {
		if(requests.getCalcutationWanted() == "mod") {
			System.out.println(requests.getNumber1() + "%" + requests.getNumber2()
				+ "=" + requests.getNumber1() % requests.getNumber2() );
		}
		else {
			System.out.println("Request Cannot Be Done!");
		}
		return 0.0;
	}
}
