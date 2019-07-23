package chainCalculation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChainTest {

	@Test
	public void test() {
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubNumbers();
		Chain chainCalc3 = new MultiplyNumbers();
		Chain chainCalc4 = new DivideNumbers();
		Chain chainCalc5 = new ModNumbers();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		chainCalc4.setNextChain(chainCalc5);
		
		assertEquals(6,chainCalc1.calculate(new Numbers(4,2,"add"),"");
		assertEquals(2,chainCalc2.calculate(new Numbers(4,2,"sub"),"");
		assertEquals(8,chainCalc3.calculate(new Numbers(4,2,"mult"),"");
		assertEquals(2,chainCalc4.calculate(new Numbers(4,2,"div"),"");
		assertEquals(0,chainCalc5.calculate(new Numbers(4,2,"mod"),"");
	}

}
